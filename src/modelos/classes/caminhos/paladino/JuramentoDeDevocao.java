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
		return "Juramento de Devo��o";
	}
	
	@Override
	public void setHabilidades(Paladino classe) {
		classe.habilidadesAdd(new Habilidade("Dogmas de devo��o", "\tEmbora as palavras exatas e restri��es do Juramento de Devo��o variem, os paladinos que fazem esse juramento partilha desses dogmas.\n" +
				"\tHonestidade. N�o minta nem trapaceie. Deixe sua palavra ser sua garantia.\n" +
				"\tCoragem. Nunca tenha medo de agir, apesar de a cautela ser sensata.\n" +
				"\tCompaix�o. Ajude os outros, proteja os fracos, puna aqueles que os amea�arem. Mostre miseric�rdia aos seus advers�rios, mas tempere isso com sabedoria.\n" +
				"\tHonra. Trate os outros com equidade e deixe seus feitos honor�veis serem exemplos para eles. Fa�a o m�ximo de bem poss�vel causando a menor quantidade de mazelas.\n" +
				"\tDever. Seja respons�vel pelos seus atos e por suas consequ�ncias, proteja aqueles confiados aos vossos cuidados e obede�a aqueles que tiverem autoridade sobre voc�.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade", "\tQuando voc� faz esse juramento, no 3� n�vel, voc� ganha as duas op��es seguintes de Canalizar Divindade.\n" +
				"\tArma Sagrada. Com uma a��o, voc� pode imbuir uma arma que voc� esteja empunhando com energia positiva, usando seu Canalizar Divindade. Por 1 minuto, voc� adiciona seu modificador de Carisma as jogadas de ataque feitas com essa arma (b�nus m�nimo de +1). A arma tamb�m emite luz plena num raio de 6 metros e penumbra mais 6 metros al�m. Se a arma ainda n�o for m�gica, ela se torna m�gica por essa dura��o.\n" +
				"\tVoc� pode terminar o efeito no seu turno, como parte de qualquer a��o. Se voc� n�o estiver mais segurando ou portando a arma, ou estiver inconsciente, esse efeito termina.\n" +
				"\tExpulsar o Profano. Com uma a��o, voc� apresenta seu s�mbolo sagrado e faz uma ora��o censurando corruptores e mortos-vivos, usando seu Canalizar Divindade. Cada corruptor ou morto-vivo que puder ver ou ouvir voc� e esteja a at� 9 metros, deve realizar um teste de resist�ncia de Sabedoria. Se a criatura falhar no teste de resist�ncia, ela ser� expulsa por 1 minuto ou at� sofrer dano.\n" +
				"\tUma criatura expulsa deve gastar seu turno tentando se mover para longe de voc� da melhor forma poss�vel e n�o pode, voluntariamente, se mover para um espa�o a menos de 9 metros de voc�. Ela tamb�m n�o pode realizar rea��es. Nas a��es delas, elas s� poder�o realizar a a��o de Disparada ou tentar escapar de um efeito que as impe�a de se mover. Se n�o houver lugar para se mover, a criatura pode usar a a��o de Esquivar.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Aura de devo��o", "\tA partir do 7� n�vel, voc� e as criaturas amistosas a at� 3 metros n�o podem ser enfeiti�adas enquanto voc� estiver consciente.\n" +
				"\tNo 18� n�vel, o alcance dessa aura aumenta para 9 metros.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Pureza de esp�rito", "\tA partir do 15� n�vel, voc� estar� sempre sob efeito da magia prote��o contra o bem e mal.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Halo sagrado", "\tNo 20� n�vel, com uma a��o, voc� pode emanar uma aura de luz solar. Por 1 minuto, luz plena emana de voc� num raio de 9 metros, penumbra brilha mais 9 metros al�m.\n" +
				"\tSempre que uma criatura inimiga come�ar seu turno na luz plena, a criatura sofrer� 10 de dano radiante.\n" +
				"\tAl�m disso, por essa dura��o, voc� tem vantagem em testes de resist�ncia contra magias conjuradas por corruptores ou mortos-vivos.\n" +
				"\tUma vez que voc� use essa caracter�stica, n�o poder� faz�-lo novamente at� ter terminado um descanso longo.\n\n", 20));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}
	
	@Override
	public String getDescricao() {
		return "\tO Juramento de Devo��o vincula um paladino aos mais sublimes ideias de justi�a, virtude e ordem. Algumas vezes chamados de campe�es, cavaleiros brancos ou guerreiros sagrados, esses paladinos atendem o ideal do cavaleiro na armadura brilhante, agindo com honra em busca de justi�a e do bem maior. Eles se agarram aos mais altos padr�es de conduta, e alguns, para o melhor ou para o pior, consideram que o resto do mundo deve ter os mesmos padr�es. Muitos dos que fazem esse juramento s�o devotados aos deuses da lei e do bem e usam os dogmas de seus deuses como medida de sua devo��o. Eles consideram os anjos � os perfeitos servos do bem � como seus ideais e incorporam imagens de asas angelicais em seus elmos ou bras�es.\n";
	}
}
