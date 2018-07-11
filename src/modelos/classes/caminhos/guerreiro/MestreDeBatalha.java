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
		classe.habilidadesAdd(new Habilidade("Superioridade em combate", "\tQuando voc� escolhe esse arqu�tipo, no 3� n�vel, voc� aprende manobras que s�o abastecidas com dados especiais chamados dados de superioridade.\n" +
				"\tManobras. Voc� aprende tr�s manobras, � sua escolha, que s�o detalhadas em �Manobras�, a seguir. Muitas manobras aprimoram um ataque de v�rias formas. Voc� s� pode usar uma manobra por ataque.\n" +
				"\tVoc� aprende duas manobras adicionais, � sua escolha, no 7�, 10� e 15� n�vel. A cada vez que voc� aprende uma nova manobra, voc� pode substituir uma manobra conhecida por uma diferente.\n" +
				"\tDados de Superioridade. Voc� tem quatro dados de superioridade, que s�o d8s. Um dado de superioridade � gasto quando voc� usa-o. Voc� recupera todos os dados de superioridade gastos quando terminar um descanso curto ou longo.\n" +
				"\tVoc� adquire outro dado de superioridade no 7� n�vel e mais um no 15� n�vel.\n" +
				"\tTeste de Resist�ncia. Algumas das suas manobras exigem que o alvo realize um teste de resist�ncia contra o efeito da manobra. A CD do teste de resist�ncia � calculada a seguir:\n" +
				"\tCD para suas manobras = 8 + b�nus de profici�ncia + seu modificador de For�a ou Destreza (� sua escolha)\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Estudioso da guerra", "\tNo 3� n�vel, voc� ganha profici�ncia com um tipo de ferramenta de artes�o, � sua escolha.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Conhe�a seu inimigo", "\tA partir do 7� n�vel, se voc� gastar, pelo menos, 1 minuto observando ou interagindo com outra criatura fora de combate, voc� pode aprender certas informa��es sobre as capacidades dela comparadas as suas. O Mestre conta a voc� se a criatura � igual, superior ou inferior a voc� a respeito de duas das seguintes caracter�sticas, � sua escolha:\n" +
				"\t* Valor de For�a\n" +
				"\t* Valor de Destreza\n" +
				"\t* Valor de Constitui��o\n" +
				"\t* Classe de Armadura\n" +
				"\t* Pontos de Vida atuais\n" +
				"\t* N�vel total de classe (se possuir)\n" +
				"\t* N�veis da classe guerreiro (se possuir)\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Superioridade em combate aprimorada", "\tNo 10� n�vel, seus dados de superioridade se tornam d10s. No 18� n�vel, eles se tornam d12s.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Implac�vel", "\tNo 15� n�vel, quando voc� rolar iniciativa e n�o tiver nenhum dado de superioridade restante, voc� recupera um dado de superioridade.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Manobras", "\tAparar. Quando outra criatura causar dano a voc� com um ataque corpo-a-corpo, voc� pode usar sua rea��o e gastar um dado de superioridade para reduzir o dano pelo n�mero rolado no dado de superioridade + seu modificador de Destreza.\n " + 
				"\tAtaque Amea�ador. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para tentar amedrontar o alvo. Voc� adiciona seu dado de superioridade a jogada de dano do ataque e o alvo deve realizar um teste de resist�ncia de Sabedoria. Se falhar, ele ficar� com medo de voc� at� o final do seu pr�ximo turno.\n " +
				"\tAtaque de Encontr�o. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para tentar empurrar o alvo para tr�s. Voc� adiciona seu dado de superioridade a jogada de dano do ataque e, se o alvo for Grande ou menor, ele deve realizar um teste de resist�ncia de For�a. Se falhar, voc� empurra o alvo para at� 4,5 metros de voc�.\n " +
				"\tAtaque de Finta. Voc� pode gastar um dado de superioridade e usar uma a��o b�nus, no seu turno, para fintar, escolhendo uma criatura a 1,5 metro de voc� como alvo. Voc� tem vantagem na sua pr�xima jogada de ataque contra essa criatura, nesse turno. Se o ataque atingir, voc� adiciona seu dado de superioridade ao dano do ataque.\n " +
				"\tAtaque de Manobra. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para tentar manobrar um de seus companheiros para uma posi��o mais vantajosa. Voc� adiciona seu dado de superioridade a jogada de dano do ataque e escolhe uma criatura amig�vel que possa ver ou ouvir voc�. Aquela criatura pode usar sua rea��o para se mover at� metade do seu deslocamento, sem provocar ataques de oportunidade do alvo do seu ataque.\n " +
				"\tAtaque de Precis�o. Quando voc� realizar uma jogada de ataque com arma contra uma criatura, voc� pode gastar um dado de superioridade para adicion�-lo a jogada. Voc� pode usar essa manobra antes ou depois de realizar a jogada de ataque, mas deve us�-la antes de qualquer efeito do ataque ser aplicado.\n " +
				"\tAtaque Desarmante. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para tentar desarmar o alvo, for�ando-o a derrubar um item, � sua escolha, que ele esteja empunhando. Voc� adiciona o dado de superioridade a jogada de dano do ataque e o alvo deve realizar um teste de resist�ncia de For�a. Se fracassar, ele derrubar� o objeto escolhido. O objeto cai aos p�s dele.\n " +
				"\tAtaque Estendido. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para aumentar o alcance do seu ataque em 1,5 metro. Se voc� atingir, voc� adiciona o seu dado de superioridade ao dano causado pelo ataque.\n " +
				"\tAtaque Provocante. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para tentar incitar a alvo a atacar voc�. Voc� adiciona seu dado de superioridade a jogada de dano do ataque e o alvo deve realizar um teste de resist�ncia de Sabedoria. Se falhar, o alvo ter� desvantagem em todas as jogadas de ataque contra alvos diferentes de voc�, at� o fim do seu pr�ximo turno.\n " +
				"\tAtaque Trespassante. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para tentar causar dano a outra criatura com o mesmo ataque. Escolha uma criatura a 1,5 metro do alvo original e que esteja no seu alcance. Se a jogada de ataque original atingiria a segunda criatura, ela sofre dano igual ao n�mero rolado no dado de superioridade. O dano � do mesmo tipo que o causado pelo ataque original.\n " +
				"\tContra-Atacar. Quando uma criatura atacar voc� com um ataque corpo-a-corpo e errar, voc� pode usar sua rea��o e gastar um dado de superioridade para realizar um ataque corpo-a-corpo com arma contra essa criatura. Se voc� atingir, voc� adiciona seu dado de superioridade a jogada de dano do ataque.\n " +
				"\tGolpe Distrativo. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para tentar distrair a criatura, abrindo uma brecha para um de seus aliados. Voc� adiciona seu dado de superioridade a jogada de dano do ataque. A pr�xima jogada de ataque realizada contra o alvo por uma criatura diferente de voc�, tem vantagem, se o ataque for realizado antes do come�o do seu pr�ximo turno.\n " +
				"\tGolpe do Comandante. Quando voc� realiza a a��o de Ataque, no seu turno, voc� pode desistir de um dos seus ataques e usar uma a��o b�nus para direcionar o ataque de um dos seus companheiros. Quando voc� faz isso, escolha uma criatura amig�vel que possa ver ou ouvir voc� e gaste um dado de superioridade. Essa criatura pode, imediatamente, usar sua rea��o para realizar um ataque com arma, adicionando seu dado de superioridade a jogada de dano do ataque.\n " +
				"\tInspirar. No seu turno, voc� pode usar uma a��o b�nus e gastar um dado de superioridade para refor�ar a determina��o dos seus companheiros. Quando o fizer, escolha uma criatura amig�vel que possa ver ou ouvir voc�. Essa criatura ganha uma quantidade de pontos de vida tempor�rios igual a sua rolagem de dado de superioridade + seu modificador de Carisma.\n " +
				"\tPasso Evasivo. Quando voc� se mover, voc� pode gastar um dado de superioridade, role o dado e adicione o n�mero rolado a sua CA at� voc� terminar seu deslocamento.\n " +
				"\tRasteira. Quando voc� atingir uma criatura com um ataque com arma, voc� pode gastar um dado de superioridade para tentar derrubar o alvo no ch�o. Voc� adiciona seu dado de superioridade a jogada de dano do ataque e, se o alvo for Grande ou menor, ele deve realizar um teste de resist�ncia de For�a. Se falhar, voc� derrubar� o alvo no ch�o.\n\n", 3));
	}

	@Override
	public String getDescricao() {
		return "\tAqueles que emulam o arqu�tipo de Mestre de Batalha empregam t�cnicas marciais passadas de gera��o em gera��o. Para um Mestre de Batalha, o combate � um campo acad�mico, as vezes, incluindo assuntos al�m da batalha, como forjaria e caligrafia. Nem todo guerreiro absorve as li��es de hist�ria, teoria e arte que s�o refletidas no arqu�tipo de Mestre de Batalha, mas aqueles que conseguem, tornam-se guerreiros bem-supridos de grande per�cia e conhecimento.\n";
	}
}
