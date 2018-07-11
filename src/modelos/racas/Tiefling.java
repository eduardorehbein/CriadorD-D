package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Tiefling extends Raca {
	@Override
	public String toString() {
		return "Tiefling";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setInteligencia(personagem.getInteligencia() + 1);
		personagem.setCarisma(personagem.getCarisma() + 2);
		personagem.atualizaModificadores();	
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(9);	
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Visão no escuro", "\tGraças a sua herança infernal, você tem uma visão superior no escuro e na penumbra. Você enxerga na penumbra a até 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Você não pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Resistência infernal", "\tVocê possui resistência a dano de fogo.\n"));
		super.beneficiosAdd(new Beneficio("Legado infernal", "\tVocê conhece o truque taumaturgia. Quando você atingir o 3° nível, você poderá conjurar a magia repreensão infernal uma vez por dia como uma magia de 2° nível. Quando você atingir o 5° nível, você também poderá conjurar a magia escuridão. Você precisa terminar um descanso longo para poder usar as magias desse traço novamente. Sua habilidade de conjuração para essas magias é Carisma.\n"));
	}
}
