package modelos.classes.caminhos.bruxo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Bruxo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class OCorruptor implements Caminho<Bruxo>, Magica {
	@Override
	public String toString() {
		return "O Corruptor";
	}

	@Override
	public void setHabilidades(Bruxo classe) {
		classe.habilidadesAdd(new Habilidade("Lista de magia expandida", "\tAs magias referentes ao seu pacto s�o adicionadas automaticamente na sua lista de magias.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("B�n��o do obscuro", "\tA partir do 1� n�vel, quando voc� reduzir uma criatura hostil a 0 pontos de vida, voc� ganha uma quantidade de pontos de vida tempor�rios igual ao seu modificador de Carisma + seu n�vel de bruxo (m�nimo 1).\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Sorte do pr�prio obscuro", "\tA partir do 6� n�vel, voc� pode pedir ao seu patrono para alterar o destino em seu favor. Quando voc� realizar um teste de habilidade ou um teste de resist�ncia, voc� pode usar essa caracter�stica para adicionar 1d10 a sua jogada. Voc� pode fazer isso ap�s ver sua jogada inicial, mas antes que qualquer efeito da jogada ocorra.\n" +
				"\tAp�s usar essa caracter�sticas, voc� n�o poder� utiliz�-la novamente at� terminar um descanso curto ou longo.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Resist�ncia demon�aca", "\tA partir do 10� n�vel, voc� pode escolher um tipo de dano quando voc� terminar um descanso curto ou longo. Voc� adquire resist�ncia contra esse tipo de dano at� voc� escolher um tipo de dano diferente com essa caracter�stica. Dano causado por armas m�gicas ou armas de prata ignoram essa resist�ncia.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Lan�ar do inferno", "\tA partir do 14� n�vel, quando voc� atingir uma criatura com um ataque, voc� pode usar essa caracter�stica para, instantaneamente, transportar o alvo para os planos inferiores. A criatura desaparece e � jogada para um lugar similar a um pesadelo.\n" +
				"\tNo final do seu turno, o alvo retorna ao lugar que ela ocupava anteriormente, ou para o espa�o desocupado mais pr�ximo. Se o alvo n�o for um corruptor, ele sofre 10d10 de dano ps�quico � medida que toma conta da experi�ncia traum�tica.\n" +
				"\tAp�s usar essa caracter�sticas, voc� n�o poder� utiliz�-la novamente at� terminar um descanso curto ou longo.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tVoc� realizou um pacto com um corruptor dos planos de exist�ncia inferiores, um ser cujos objetivos s�o o mal, mesmo se voc� se opor a esses objetivos. Tais seres desejam corromper ou destruir todas as coisas, em �ltima an�lise, at� mesmo voc�. Corruptores poderosos o bastante para forjar pactos incluem senhores demon�acos como Demogorgon, Orcus, Fraz�Urb-luu e Bafom�; arquidiabos como Asmodeus, Dispater, Mefist�feles e Belial; senhores das profundezas e balors que sejam excepcionalmente poderosos; e ultraloths e outros senhores dos yugoloths.\n";
	}
}