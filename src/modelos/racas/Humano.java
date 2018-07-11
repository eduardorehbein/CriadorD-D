package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Humano extends Raca {
	@Override
	public String toString() {
		return "Humano";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setForca(personagem.getForca() + 1);
		personagem.setConstituicao(personagem.getConstituicao() + 1);
		personagem.setDestreza(personagem.getDestreza() + 1);
		personagem.setInteligencia(personagem.getInteligencia() + 1);
		personagem.setSabedoria(personagem.getSabedoria() + 1);
		personagem.setCarisma(personagem.getCarisma() + 1);
		personagem.atualizaModificadores();	
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(9);
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Perícias", "\tVocê ganha proficiência em duas perícias a sua escolha.\n"));
	}
}