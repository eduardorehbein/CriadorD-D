package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Elfo extends Raca {
	@Override
	public String toString() {
		return "�lfo";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setDestreza(personagem.getDestreza() + 2);
		personagem.atualizaModificadores();
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(9);
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Vis�o no escuro", "\tAcostumado �s florestas crepusculares e ao c�u noturno, voc� possui uma vis�o superior em condi��es de escurid�o e na penumbra. Voc� pode enxergar na penumbra a at� 18 metros como se fosse na luz plena, e no escuro como se fosse na penumbra. Voc� n�o pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Sentidos agu�ados", "\tProfici�ncia em testes de percep��o\n"));
		super.beneficiosAdd(new Beneficio("Ancestral fe�rico", "\tVoc� tem vantagem nos testes de resist�ncia para resistir a ser enfeiti�ado e magias n�o podem coloc�-lo para dormir.\n"));
		super.beneficiosAdd(new Beneficio("Transe", "\tElfos n�o precisam dormir. Ao inv�s disso, eles meditam profundamente, permanecendo semiconscientes, durante 4 horas por dia. (A palavra em idioma comum para tal medita��o � \"transe\".) Enquanto medita, um elfo � capaz de sonhar de certo modo. Esses sonhos na verdade s�o exerc�cios mentais que se tornam reflexos atrav�s de anos de pr�tica. Depois de descansar dessa forma, voc� ganha os mesmos benef�cios que um humano depois de 8 horas de sono.\n"));
	}
}
