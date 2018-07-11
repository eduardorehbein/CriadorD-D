package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class MeioElfo extends Raca {
	@Override
	public String toString() {
		return "Meio-Élfo";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setCarisma(personagem.getCarisma() + 2);
		personagem.atualizaModificadores();	
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(9);	
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Visão no escuro", "\tGraças ao seu sangue élfico, você tem uma visão superior no escuro e na penumbra. Você enxerga na penumbra a até 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Você não pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Ancestral feérico", "\tVocê possui vantagem em testes de resistência contra encantamento e magia não pode colocar você pra dormir.\n"));
		super.beneficiosAdd(new Beneficio("Versatilidade em perícia", "\tVocê ganha proficiência em duas perícias, à sua escolha.\n"));
	}
}
