package modelos.classes.caminhos.patrulheiro;

import modelos.Habilidade;
import modelos.classes.Patrulheiro;
import modelos.classes.caminhos.Caminho;

public class Cacador implements Caminho<Patrulheiro> {
	@Override
	public String toString() {
		return "Ca�ador";
	}

	@Override
	public void setHabilidades(Patrulheiro classe) {
		classe.habilidadesAdd(new Habilidade("Presa do ca�ador", "\tNo 3� n�vel, voc� ganha uma das seguintes caracter�sticas, � sua escolha.\n" +
				"\tAssassino de Colossos. Sua tenacidade pode derrubar os mais poderosos oponentes. Quando voc� atinge uma criatura com um ataque com arma, a criatura sofre 1d8 de dano extra, se ela estiver abaixo do seu m�ximo de pontos de vida. Voc� s� pode causar esse dano extra uma vez por turno.\n" +
				"\tMatador de Gigantes. Quando uma criatura Grande ou maior a at� 1,5 metro de voc� atingir ou errar um ataque contra voc�, voc� pode usar sua rea��o para atacar a criatura, imediatamente ap�s o ataque dela, considerando que voc� possa ver a criatura.\n" +
				"\tDestruidor de Hordas. Uma vez em cada um dos seus turnos, quando voc� fizer um ataque com arma, voc� pode realizar outro ataque com a mesma arma contra uma criatura diferente que esteja a at� 1,5 metro do alvo original e esteja no alcance da sua arma.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("T�ticas defensivas", "\tNo 7� n�vel, voc� ganha uma das seguintes caracter�sticas, � sua escolha.\n" +
				"\tEscapar da Horda. Ataques de oportunidade contra voc� s�o feitos com desvantagem.\n" +
				"\tDefesa Contra M�ltiplos Ataques. Quando uma criatura atinge voc� com um ataque, voc� recebe +4 de b�nus na CA contra todos os ataques subsequentes feitos por essa criatura no resto do turno.\n" +
				"\tVontade de A�o. Voc� tem vantagem em testes de resist�ncia para evitar ser amedrontado.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Ataque m�ltiplo", "\tNo 11� n�vel, voc� ganha uma das seguintes caracter�sticas, � sua escolha.\n" +
				"\tSaraivada. Voc� pode usar sua a��o para realizar um ataque � dist�ncia contra qualquer n�mero de criatura a at� 3 metros de um ponto que voc� possa ver, no alcance da sua arma. Voc� deve ter muni��o para cada alvo, como normal, e voc� realiza uma jogada de ataque separada para cada alvo.\n" +
				"\tAtaque Girat�rio. Voc� pode usar sua a��o para realizar um ataque corpo-a-corpo contra qualquer n�mero de criaturas a at� 1,5 metro de voc�, realizando uma jogada de ataque separada para cada alvo.\n\n", 11));
		classe.habilidadesAdd(new Habilidade("Defesa de ca�ador superior", "\tNo 15� n�vel, voc� ganha uma das seguintes caracter�sticas, � sua escolha.\n" +
				"\tEvas�o. Voc� pode esquivar-se agilmente de certos efeitos em �rea, como o sopro de fogo de um drag�o vermelho ou uma magia rel�mpago. Quando voc� for alvo de um efeito que exige um teste de resist�ncia de Destreza para sofrer metade do dano, voc� n�o sofre dano algum se passar, e somente metade do dano se falhar.\n" +
				"\tManter-se Contra a Mar�. Quando uma criatura hostil errar voc� com um ataque corpo-a-corpo, voc� pode usar sua rea��o para for�ar a criatura a repetir o mesmo ataque contra outra criatura (que n�o ela mesma), � sua escolha.\n" +
				"\tEsquiva Sobrenatural. Quando um atacante que voc� possa ver, atinge voc� com um ataque, voc� pode usar sua rea��o para reduzir o dano causado pelo ataque � metade.\n\n", 15));
		
	}

	@Override
	public String getDescricao() {
		return "\tEmular o arqu�tipo Ca�ador significa aceitar seu lugar como um baluarte entre a civiliza��o e os terrores das terras selvagens. � medida que voc� trilha o caminho do Ca�ador, voc� aprende t�cnicas especializadas para lutar contra as amea�as que voc� confronta, desde ogros enfurecidos e hordas de orcs at� enormes gigantes e terr�veis drag�es.\n";
	}
}
