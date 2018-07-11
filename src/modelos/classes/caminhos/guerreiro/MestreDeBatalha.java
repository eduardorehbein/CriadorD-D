package modelos.classes.caminhos.guerreiro;

import modelos.Habilidade;
import modelos.classes.Guerreiro;
import modelos.classes.caminhos.Caminho;

public class MestreDeBatalha implements Caminho<Guerreiro> {
	@Override
	public String toString() {
		return "Mestre de Batalha";
	}
	
	@Override
	public void setHabilidades(Guerreiro classe) {
		classe.habilidadesAdd(new Habilidade("Superioridade em combate", "\tQuando você escolhe esse arquétipo, no 3° nível, você aprende manobras que são abastecidas com dados especiais chamados dados de superioridade.\n" +
				"\tManobras. Você aprende três manobras, à sua escolha, que são detalhadas em “Manobras”, a seguir. Muitas manobras aprimoram um ataque de várias formas. Você só pode usar uma manobra por ataque.\n" +
				"\tVocê aprende duas manobras adicionais, à sua escolha, no 7°, 10° e 15° nível. A cada vez que você aprende uma nova manobra, você pode substituir uma manobra conhecida por uma diferente.\n" +
				"\tDados de Superioridade. Você tem quatro dados de superioridade, que são d8s. Um dado de superioridade é gasto quando você usa-o. Você recupera todos os dados de superioridade gastos quando terminar um descanso curto ou longo.\n" +
				"\tVocê adquire outro dado de superioridade no 7° nível e mais um no 15° nível.\n" +
				"\tTeste de Resistência. Algumas das suas manobras exigem que o alvo realize um teste de resistência contra o efeito da manobra. A CD do teste de resistência é calculada a seguir:\n" +
				"\tCD para suas manobras = 8 + bônus de proficiência + seu modificador de Força ou Destreza (à sua escolha)\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Estudioso da guerra", "\tNo 3° nível, você ganha proficiência com um tipo de ferramenta de artesão, à sua escolha.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Conheça seu inimigo", "\tA partir do 7° nível, se você gastar, pelo menos, 1 minuto observando ou interagindo com outra criatura fora de combate, você pode aprender certas informações sobre as capacidades dela comparadas as suas. O Mestre conta a você se a criatura é igual, superior ou inferior a você a respeito de duas das seguintes características, à sua escolha:\n" +
				"\t* Valor de Força\n" +
				"\t* Valor de Destreza\n" +
				"\t* Valor de Constituição\n" +
				"\t* Classe de Armadura\n" +
				"\t* Pontos de Vida atuais\n" +
				"\t* Nível total de classe (se possuir)\n" +
				"\t* Níveis da classe guerreiro (se possuir)\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Superioridade em combate aprimorada", "\tNo 10° nível, seus dados de superioridade se tornam d10s. No 18° nível, eles se tornam d12s.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Implacável", "\tNo 15° nível, quando você rolar iniciativa e não tiver nenhum dado de superioridade restante, você recupera um dado de superioridade.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Manobras", "\tAparar. Quando outra criatura causar dano a você com um ataque corpo-a-corpo, você pode usar sua reação e gastar um dado de superioridade para reduzir o dano pelo número rolado no dado de superioridade + seu modificador de Destreza.\n " + 
				"\tAtaque Ameaçador. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para tentar amedrontar o alvo. Você adiciona seu dado de superioridade a jogada de dano do ataque e o alvo deve realizar um teste de resistência de Sabedoria. Se falhar, ele ficará com medo de você até o final do seu próximo turno.\n " +
				"\tAtaque de Encontrão. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para tentar empurrar o alvo para trás. Você adiciona seu dado de superioridade a jogada de dano do ataque e, se o alvo for Grande ou menor, ele deve realizar um teste de resistência de Força. Se falhar, você empurra o alvo para até 4,5 metros de você.\n " +
				"\tAtaque de Finta. Você pode gastar um dado de superioridade e usar uma ação bônus, no seu turno, para fintar, escolhendo uma criatura a 1,5 metro de você como alvo. Você tem vantagem na sua próxima jogada de ataque contra essa criatura, nesse turno. Se o ataque atingir, você adiciona seu dado de superioridade ao dano do ataque.\n " +
				"\tAtaque de Manobra. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para tentar manobrar um de seus companheiros para uma posição mais vantajosa. Você adiciona seu dado de superioridade a jogada de dano do ataque e escolhe uma criatura amigável que possa ver ou ouvir você. Aquela criatura pode usar sua reação para se mover até metade do seu deslocamento, sem provocar ataques de oportunidade do alvo do seu ataque.\n " +
				"\tAtaque de Precisão. Quando você realizar uma jogada de ataque com arma contra uma criatura, você pode gastar um dado de superioridade para adicioná-lo a jogada. Você pode usar essa manobra antes ou depois de realizar a jogada de ataque, mas deve usá-la antes de qualquer efeito do ataque ser aplicado.\n " +
				"\tAtaque Desarmante. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para tentar desarmar o alvo, forçando-o a derrubar um item, à sua escolha, que ele esteja empunhando. Você adiciona o dado de superioridade a jogada de dano do ataque e o alvo deve realizar um teste de resistência de Força. Se fracassar, ele derrubará o objeto escolhido. O objeto cai aos pés dele.\n " +
				"\tAtaque Estendido. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para aumentar o alcance do seu ataque em 1,5 metro. Se você atingir, você adiciona o seu dado de superioridade ao dano causado pelo ataque.\n " +
				"\tAtaque Provocante. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para tentar incitar a alvo a atacar você. Você adiciona seu dado de superioridade a jogada de dano do ataque e o alvo deve realizar um teste de resistência de Sabedoria. Se falhar, o alvo terá desvantagem em todas as jogadas de ataque contra alvos diferentes de você, até o fim do seu próximo turno.\n " +
				"\tAtaque Trespassante. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para tentar causar dano a outra criatura com o mesmo ataque. Escolha uma criatura a 1,5 metro do alvo original e que esteja no seu alcance. Se a jogada de ataque original atingiria a segunda criatura, ela sofre dano igual ao número rolado no dado de superioridade. O dano é do mesmo tipo que o causado pelo ataque original.\n " +
				"\tContra-Atacar. Quando uma criatura atacar você com um ataque corpo-a-corpo e errar, você pode usar sua reação e gastar um dado de superioridade para realizar um ataque corpo-a-corpo com arma contra essa criatura. Se você atingir, você adiciona seu dado de superioridade a jogada de dano do ataque.\n " +
				"\tGolpe Distrativo. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para tentar distrair a criatura, abrindo uma brecha para um de seus aliados. Você adiciona seu dado de superioridade a jogada de dano do ataque. A próxima jogada de ataque realizada contra o alvo por uma criatura diferente de você, tem vantagem, se o ataque for realizado antes do começo do seu próximo turno.\n " +
				"\tGolpe do Comandante. Quando você realiza a ação de Ataque, no seu turno, você pode desistir de um dos seus ataques e usar uma ação bônus para direcionar o ataque de um dos seus companheiros. Quando você faz isso, escolha uma criatura amigável que possa ver ou ouvir você e gaste um dado de superioridade. Essa criatura pode, imediatamente, usar sua reação para realizar um ataque com arma, adicionando seu dado de superioridade a jogada de dano do ataque.\n " +
				"\tInspirar. No seu turno, você pode usar uma ação bônus e gastar um dado de superioridade para reforçar a determinação dos seus companheiros. Quando o fizer, escolha uma criatura amigável que possa ver ou ouvir você. Essa criatura ganha uma quantidade de pontos de vida temporários igual a sua rolagem de dado de superioridade + seu modificador de Carisma.\n " +
				"\tPasso Evasivo. Quando você se mover, você pode gastar um dado de superioridade, role o dado e adicione o número rolado a sua CA até você terminar seu deslocamento.\n " +
				"\tRasteira. Quando você atingir uma criatura com um ataque com arma, você pode gastar um dado de superioridade para tentar derrubar o alvo no chão. Você adiciona seu dado de superioridade a jogada de dano do ataque e, se o alvo for Grande ou menor, ele deve realizar um teste de resistência de Força. Se falhar, você derrubará o alvo no chão.\n\n", 3));
	}

	@Override
	public String getDescricao() {
		return "\tAqueles que emulam o arquétipo de Mestre de Batalha empregam técnicas marciais passadas de geração em geração. Para um Mestre de Batalha, o combate é um campo acadêmico, as vezes, incluindo assuntos além da batalha, como forjaria e caligrafia. Nem todo guerreiro absorve as lições de história, teoria e arte que são refletidas no arquétipo de Mestre de Batalha, mas aqueles que conseguem, tornam-se guerreiros bem-supridos de grande perícia e conhecimento.\n";
	}
}
