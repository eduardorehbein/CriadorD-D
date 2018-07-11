package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class MeioElfo extends Raca {
	@Override
	public String toString() {
		return "Meio-�lfo";
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
		super.beneficiosAdd(new Beneficio("Vis�o no escuro", "\tGra�as ao seu sangue �lfico, voc� tem uma vis�o superior no escuro e na penumbra. Voc� enxerga na penumbra a at� 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Voc� n�o pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Ancestral fe�rico", "\tVoc� possui vantagem em testes de resist�ncia contra encantamento e magia n�o pode colocar voc� pra dormir.\n"));
		super.beneficiosAdd(new Beneficio("Versatilidade em per�cia", "\tVoc� ganha profici�ncia em duas per�cias, � sua escolha.\n"));
	}
}
