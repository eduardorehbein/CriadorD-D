package xao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.XMLEvent;

import classesAuxiliares.GuardaMagias;
import modelos.Magia;
import modelos.Personagem;

public class MagiasXAO {
	public void addPorClasse(Personagem personagem) throws XMLStreamException {
		Magia magia = null;
		StringBuilder descricao = new StringBuilder();
		
		Class<?> classe = personagem.getClasse().getClass();
		String nomeDaClasse = classe.getSimpleName();
		
		boolean ehValido = false;
		
		XMLEventReader eventos = this.getEventReader();
		
		while(eventos.hasNext()) {
			XMLEvent evento = eventos.nextEvent();
		
			if(tagOpener(evento, "magia")) {
				Attribute nivel = evento.asStartElement().getAttributeByName(new QName("nivel"));
				Attribute classes = evento.asStartElement().getAttributeByName(new QName("classes"));
				if(classes.getValue().contains(nomeDaClasse) && Integer.parseInt(nivel.getValue()) <= personagem.getNivel()) {
					ehValido = true;
					magia = new Magia();
					magia.setNivel(Integer.parseInt(nivel.getValue()));
					Attribute tipo = evento.asStartElement().getAttributeByName(new QName("tipo"));
					magia.setTipo(tipo.getValue());
				}
			}
			if(ehValido) {
				if(tagOpener(evento, "nome")) {
					evento = eventos.nextEvent();
					magia.setNome(evento.asCharacters().getData());
				}
				trataTagsAbertasAbaixoDeNome(personagem, magia, descricao, eventos, evento);
				if(tagCloser(evento, "magia")) {
					magia.setDescricao(descricao.toString());
					GuardaMagias.add(magia);
					descricao.delete(0, descricao.length());
					ehValido = false;
				}
			}
		}
	}

	public void addPorNomes(String[] nomes, Personagem personagem) throws XMLStreamException {
		Magia magia = new Magia();
		StringBuilder descricao = new StringBuilder();
		
		boolean ehValido = false;
		
		XMLEventReader eventos = this.getEventReader();
		
		for(String nome : nomes) {
			while(eventos.hasNext()) {
				XMLEvent evento = eventos.nextEvent();
				Attribute nivel = null;
				Attribute tipo = null;
				
				if(tagOpener(evento, "magia")) {
					nivel = evento.asStartElement().getAttributeByName(new QName("nivel"));
					tipo = evento.asStartElement().getAttributeByName(new QName("tipo"));
				}
				if(tagOpener(evento, "nome")) {
					evento = eventos.nextEvent();
					String nomeNoXML = evento.asCharacters().getData();
					if(nome.toLowerCase() == nomeNoXML.toLowerCase()) {
						ehValido = true;
						magia = new Magia();
						magia.setNivel(Integer.parseInt(nivel.getValue()));
						magia.setTipo(tipo.getValue());
					}
				}
				
				if(ehValido) {
					trataTagsAbertasAbaixoDeNome(personagem, magia, descricao, eventos, evento);
					if(tagCloser(evento, "magia")) {
						magia.setDescricao(descricao.toString());
						GuardaMagias.add(magia);
						descricao.delete(0, descricao.length());
						ehValido = false;
						break;
					}
				}
			}
		}
	}
	
	private XMLEventReader getEventReader(){
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLEventReader eventos = null;
		try {
			eventos = factory.createXMLEventReader(new FileInputStream("xml/Magias.xml"));
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
		return eventos;
	}
	
	private boolean tagOpener(XMLEvent evento, String nomeDaTag) {
		return evento.isStartElement() && evento.asStartElement().getName().getLocalPart().equals(nomeDaTag);
	}
	
	private void trataTagsAbertasAbaixoDeNome(Personagem personagem, Magia magia, StringBuilder descricao,
			XMLEventReader eventos, XMLEvent evento) throws XMLStreamException {
		if(tagOpener(evento, "tempoDeConjuracao")) {
			evento = eventos.nextEvent();
			magia.setTempoDeConjuracao(evento.asCharacters().getData());
		}
		if(tagOpener(evento, "alcance")) {
			evento = eventos.nextEvent();
			magia.setAlcance(evento.asCharacters().getData());
		}
		if(tagOpener(evento, "componentes")) {
			evento = eventos.nextEvent();
			magia.setComponentes(evento.asCharacters().getData());
		}
		if(tagOpener(evento, "duracao")) {
			evento = eventos.nextEvent();
			magia.setDuracao(evento.asCharacters().getData());
		}
		if(tagOpener(evento, "paragrafo")) {
			evento = eventos.nextEvent();
			descricao.append("\t" + evento.asCharacters().getData() + "\n");
		}
		
	}

	private boolean tagCloser(XMLEvent evento, String nomeDaTag) {
		return evento.isEndElement() && evento.asEndElement().getName().getLocalPart().equals(nomeDaTag);
	}
}
