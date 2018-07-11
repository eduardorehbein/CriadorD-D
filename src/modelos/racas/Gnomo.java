package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Gnomo extends Raca {
	@Override
	public String toString() {
		return "Gnomo";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setInteligencia(personagem.getInteligencia() + 2);
		personagem.atualizaModificadores();	
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(7.5);	
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Vis�o no escuro", "\tAcostumado � vida subterr�nea, voc� tem uma vis�o superior no escuro e na penumbra. Voc� enxerga na penumbra a at� 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Voc� n�o pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Esperteza gn�mica", "\tVoc� possui vantagem em todos os testes de resist�ncia de Intelig�ncia, Sabedoria e Carisma contra magia.\n"));
	}
}
