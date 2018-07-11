package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Draconato extends Raca {
	@Override
	public String toString() {
		return "Draconato";
	}
	
	//fazer tabela do ancestral draconico no swing
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setForca(personagem.getForca() + 2);
		personagem.setCarisma(personagem.getCarisma() + 1);
		personagem.atualizaModificadores();
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(9);
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Ancestral drac�nico", "Voc� possui um ancestral drac�nico. Escolha um tipo de drag�o da tabela Ancestral Drac�nico. Sua arma de sopro e resist�ncia a dano s�o determinadas pelo tipo de drag�o, como mostrado na tabela."));
		super.beneficiosAdd(new Beneficio("Arma de sopro", "\tVoc� pode usar uma a��o para exalar energia destrutiva. Seu ancestral drac�nico determina o tamanho, formado e tipo de dano que voc� expele.\n" +
				"\tQuando voc� usa sua arma de sopro, cada criatura na �rea exalada deve realizar um teste de resist�ncia, o tipo do teste � determinado pelo seu ancestral drac�nico. A CD do teste de resist�ncia � 9 + seu modificador de Constitui��o + seu b�nus de profici�ncia. Uma criatura sofre 2d6 de dano num fracasso e metade desse dano num sucesso. O dano aumenta para 3d6 no 6� n�vel, 4d6 no 11� n�vel e 5d6 no 16� n�vel.\n" +
				"\tDepois de usar sua arma de sopro, voc� n�o poder� utiliz�-la novamente at� completar um descanso curto ou longo.\n"));
		super.beneficiosAdd(new Beneficio("Resistencia a dano", "Voc� possui resist�ncia ao tipo de dano associado ao seu ancestral drac�nico.\n"));
	}
}