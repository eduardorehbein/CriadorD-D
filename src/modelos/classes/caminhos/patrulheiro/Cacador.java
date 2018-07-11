package modelos.classes.caminhos.patrulheiro;

import modelos.Habilidade;
import modelos.classes.Patrulheiro;
import modelos.classes.caminhos.Caminho;

public class Cacador implements Caminho<Patrulheiro> {
	@Override
	public String toString() {
		return "Caçador";
	}

	@Override
	public void setHabilidades(Patrulheiro classe) {
		classe.habilidadesAdd(new Habilidade("Presa do caçador", "\tNo 3° nível, você ganha uma das seguintes características, à sua escolha.\n" +
				"\tAssassino de Colossos. Sua tenacidade pode derrubar os mais poderosos oponentes. Quando você atinge uma criatura com um ataque com arma, a criatura sofre 1d8 de dano extra, se ela estiver abaixo do seu máximo de pontos de vida. Você só pode causar esse dano extra uma vez por turno.\n" +
				"\tMatador de Gigantes. Quando uma criatura Grande ou maior a até 1,5 metro de você atingir ou errar um ataque contra você, você pode usar sua reação para atacar a criatura, imediatamente após o ataque dela, considerando que você possa ver a criatura.\n" +
				"\tDestruidor de Hordas. Uma vez em cada um dos seus turnos, quando você fizer um ataque com arma, você pode realizar outro ataque com a mesma arma contra uma criatura diferente que esteja a até 1,5 metro do alvo original e esteja no alcance da sua arma.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Táticas defensivas", "\tNo 7° nível, você ganha uma das seguintes características, à sua escolha.\n" +
				"\tEscapar da Horda. Ataques de oportunidade contra você são feitos com desvantagem.\n" +
				"\tDefesa Contra Múltiplos Ataques. Quando uma criatura atinge você com um ataque, você recebe +4 de bônus na CA contra todos os ataques subsequentes feitos por essa criatura no resto do turno.\n" +
				"\tVontade de Aço. Você tem vantagem em testes de resistência para evitar ser amedrontado.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Ataque múltiplo", "\tNo 11° nível, você ganha uma das seguintes características, à sua escolha.\n" +
				"\tSaraivada. Você pode usar sua ação para realizar um ataque à distância contra qualquer número de criatura a até 3 metros de um ponto que você possa ver, no alcance da sua arma. Você deve ter munição para cada alvo, como normal, e você realiza uma jogada de ataque separada para cada alvo.\n" +
				"\tAtaque Giratório. Você pode usar sua ação para realizar um ataque corpo-a-corpo contra qualquer número de criaturas a até 1,5 metro de você, realizando uma jogada de ataque separada para cada alvo.\n\n", 11));
		classe.habilidadesAdd(new Habilidade("Defesa de caçador superior", "\tNo 15° nível, você ganha uma das seguintes características, à sua escolha.\n" +
				"\tEvasão. Você pode esquivar-se agilmente de certos efeitos em área, como o sopro de fogo de um dragão vermelho ou uma magia relâmpago. Quando você for alvo de um efeito que exige um teste de resistência de Destreza para sofrer metade do dano, você não sofre dano algum se passar, e somente metade do dano se falhar.\n" +
				"\tManter-se Contra a Maré. Quando uma criatura hostil errar você com um ataque corpo-a-corpo, você pode usar sua reação para forçar a criatura a repetir o mesmo ataque contra outra criatura (que não ela mesma), à sua escolha.\n" +
				"\tEsquiva Sobrenatural. Quando um atacante que você possa ver, atinge você com um ataque, você pode usar sua reação para reduzir o dano causado pelo ataque à metade.\n\n", 15));
		
	}

	@Override
	public String getDescricao() {
		return "\tEmular o arquétipo Caçador significa aceitar seu lugar como um baluarte entre a civilização e os terrores das terras selvagens. À medida que você trilha o caminho do Caçador, você aprende técnicas especializadas para lutar contra as ameaças que você confronta, desde ogros enfurecidos e hordas de orcs até enormes gigantes e terríveis dragões.\n";
	}
}
