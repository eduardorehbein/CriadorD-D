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
		super.beneficiosAdd(new Beneficio("Ancestral dracônico", "Você possui um ancestral dracônico. Escolha um tipo de dragão da tabela Ancestral Dracônico. Sua arma de sopro e resistência a dano são determinadas pelo tipo de dragão, como mostrado na tabela."));
		super.beneficiosAdd(new Beneficio("Arma de sopro", "\tVocê pode usar uma ação para exalar energia destrutiva. Seu ancestral dracônico determina o tamanho, formado e tipo de dano que você expele.\n" +
				"\tQuando você usa sua arma de sopro, cada criatura na área exalada deve realizar um teste de resistência, o tipo do teste é determinado pelo seu ancestral dracônico. A CD do teste de resistência é 9 + seu modificador de Constituição + seu bônus de proficiência. Uma criatura sofre 2d6 de dano num fracasso e metade desse dano num sucesso. O dano aumenta para 3d6 no 6° nível, 4d6 no 11° nível e 5d6 no 16° nível.\n" +
				"\tDepois de usar sua arma de sopro, você não poderá utilizá-la novamente até completar um descanso curto ou longo.\n"));
		super.beneficiosAdd(new Beneficio("Resistencia a dano", "Você possui resistência ao tipo de dano associado ao seu ancestral dracônico.\n"));
	}
}