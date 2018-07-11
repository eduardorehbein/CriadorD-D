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
		super.beneficiosAdd(new Beneficio("Vis�o no escuro", "\tGra�as a sua heran�a infernal, voc� tem uma vis�o superior no escuro e na penumbra. Voc� enxerga na penumbra a at� 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Voc� n�o pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Resist�ncia infernal", "\tVoc� possui resist�ncia a dano de fogo.\n"));
		super.beneficiosAdd(new Beneficio("Legado infernal", "\tVoc� conhece o truque taumaturgia. Quando voc� atingir o 3� n�vel, voc� poder� conjurar a magia repreens�o infernal uma vez por dia como uma magia de 2� n�vel. Quando voc� atingir o 5� n�vel, voc� tamb�m poder� conjurar a magia escurid�o. Voc� precisa terminar um descanso longo para poder usar as magias desse tra�o novamente. Sua habilidade de conjura��o para essas magias � Carisma.\n"));
	}
}
