package janelas;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import classesAuxiliares.GuardaMagias;
import classesAuxiliares.Magica;
import modelos.Personagem;
import modelos.classes.Barbaro;
import modelos.classes.Bruxo;
import modelos.classes.caminhos.bruxo.Arquifada;
import tipos.TipoClasse;
import xao.MagiasXAO;

public class Testes {

	public static void main(String[] args) {
		List<String> idiomas = new ArrayList<>();
		idiomas.add("élfico");
		Personagem personagem = new Personagem("zé", 22, 1.80, 75.0, "azul", "verde", 2, "bom", idiomas, "birrrl", 16, 14, 14, 12, 12, 10);
		personagem.setClasse(new Bruxo());
		
		JanelaTeste janela = new JanelaTeste(personagem);
		janela.setVisible(true);
		
		//System.out.println("pv final: " + personagem.getPv());
		//System.out.println("riqueza " + personagem.getRiqueza());
		
		MagiasXAO magiasXAO = new MagiasXAO();
		try {
			magiasXAO.addPorClasse(personagem);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		
		System.out.println(personagem.getClasse() instanceof Magica);
		System.out.println(TipoClasse.BARBARO);
	}

}
