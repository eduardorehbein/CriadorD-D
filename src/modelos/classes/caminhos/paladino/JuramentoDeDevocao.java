package modelos.classes.caminhos.paladino;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Paladino;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class JuramentoDeDevocao implements Caminho<Paladino>,  Magica {
	@Override
	public String toString() {
		return "Juramento de Devoção";
	}
	
	@Override
	public void setHabilidades(Paladino classe) {
		classe.habilidadesAdd(new Habilidade("Dogmas de devoção", "\tEmbora as palavras exatas e restrições do Juramento de Devoção variem, os paladinos que fazem esse juramento partilha desses dogmas.\n" +
				"\tHonestidade. Não minta nem trapaceie. Deixe sua palavra ser sua garantia.\n" +
				"\tCoragem. Nunca tenha medo de agir, apesar de a cautela ser sensata.\n" +
				"\tCompaixão. Ajude os outros, proteja os fracos, puna aqueles que os ameaçarem. Mostre misericórdia aos seus adversários, mas tempere isso com sabedoria.\n" +
				"\tHonra. Trate os outros com equidade e deixe seus feitos honoráveis serem exemplos para eles. Faça o máximo de bem possível causando a menor quantidade de mazelas.\n" +
				"\tDever. Seja responsável pelos seus atos e por suas consequências, proteja aqueles confiados aos vossos cuidados e obedeça aqueles que tiverem autoridade sobre você.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade", "\tQuando você faz esse juramento, no 3° nível, você ganha as duas opções seguintes de Canalizar Divindade.\n" +
				"\tArma Sagrada. Com uma ação, você pode imbuir uma arma que você esteja empunhando com energia positiva, usando seu Canalizar Divindade. Por 1 minuto, você adiciona seu modificador de Carisma as jogadas de ataque feitas com essa arma (bônus mínimo de +1). A arma também emite luz plena num raio de 6 metros e penumbra mais 6 metros além. Se a arma ainda não for mágica, ela se torna mágica por essa duração.\n" +
				"\tVocê pode terminar o efeito no seu turno, como parte de qualquer ação. Se você não estiver mais segurando ou portando a arma, ou estiver inconsciente, esse efeito termina.\n" +
				"\tExpulsar o Profano. Com uma ação, você apresenta seu símbolo sagrado e faz uma oração censurando corruptores e mortos-vivos, usando seu Canalizar Divindade. Cada corruptor ou morto-vivo que puder ver ou ouvir você e esteja a até 9 metros, deve realizar um teste de resistência de Sabedoria. Se a criatura falhar no teste de resistência, ela será expulsa por 1 minuto ou até sofrer dano.\n" +
				"\tUma criatura expulsa deve gastar seu turno tentando se mover para longe de você da melhor forma possível e não pode, voluntariamente, se mover para um espaço a menos de 9 metros de você. Ela também não pode realizar reações. Nas ações delas, elas só poderão realizar a ação de Disparada ou tentar escapar de um efeito que as impeça de se mover. Se não houver lugar para se mover, a criatura pode usar a ação de Esquivar.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Aura de devoção", "\tA partir do 7° nível, você e as criaturas amistosas a até 3 metros não podem ser enfeitiçadas enquanto você estiver consciente.\n" +
				"\tNo 18° nível, o alcance dessa aura aumenta para 9 metros.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Pureza de espírito", "\tA partir do 15° nível, você estará sempre sob efeito da magia proteção contra o bem e mal.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Halo sagrado", "\tNo 20° nível, com uma ação, você pode emanar uma aura de luz solar. Por 1 minuto, luz plena emana de você num raio de 9 metros, penumbra brilha mais 9 metros além.\n" +
				"\tSempre que uma criatura inimiga começar seu turno na luz plena, a criatura sofrerá 10 de dano radiante.\n" +
				"\tAlém disso, por essa duração, você tem vantagem em testes de resistência contra magias conjuradas por corruptores ou mortos-vivos.\n" +
				"\tUma vez que você use essa característica, não poderá fazê-lo novamente até ter terminado um descanso longo.\n\n", 20));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}
	
	@Override
	public String getDescricao() {
		return "\tO Juramento de Devoção vincula um paladino aos mais sublimes ideias de justiça, virtude e ordem. Algumas vezes chamados de campeões, cavaleiros brancos ou guerreiros sagrados, esses paladinos atendem o ideal do cavaleiro na armadura brilhante, agindo com honra em busca de justiça e do bem maior. Eles se agarram aos mais altos padrões de conduta, e alguns, para o melhor ou para o pior, consideram que o resto do mundo deve ter os mesmos padrões. Muitos dos que fazem esse juramento são devotados aos deuses da lei e do bem e usam os dogmas de seus deuses como medida de sua devoção. Eles consideram os anjos – os perfeitos servos do bem – como seus ideais e incorporam imagens de asas angelicais em seus elmos ou brasões.\n";
	}
}
