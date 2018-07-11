package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class MeioOrc extends Raca {
	@Override
	public String toString() {
		return "Meio-Orc";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setForca(personagem.getForca() + 2);
		personagem.atualizaModificadores();	
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(9);	
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Vis�o no escuro", "\tGra�as ao seu sangue orc, voc� tem uma vis�o superior no escuro e na penumbra. Voc� enxerga na penumbra a at� 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Voc� n�o pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Amea�ador", "\tVoc� adquire profici�ncia na per�cia Intimida��o.\n"));
		super.beneficiosAdd(new Beneficio("Resist�ncia implac�vel", "\tQuando voc� � reduzido a 0 pontos de vida mas n�o � completamente morto, voc� pode voltar para 1 ponto de vida. Voc� n�o pode usar essa caracter�stica novamente at� completar um descanso longo.\n"));
		super.beneficiosAdd(new Beneficio("Ataques selvagens", "\tQuando voc� atinge um ataque cr�tico com uma arma corpo-a-corpo, voc� pode rolar um dos dados de dano da arma mais uma vez e adicion�-lo ao dano extra causado pelo acerto cr�tico.\n"));
	}
}
