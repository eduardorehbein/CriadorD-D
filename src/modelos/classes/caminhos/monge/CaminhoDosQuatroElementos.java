package modelos.classes.caminhos.monge;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Monge;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class CaminhoDosQuatroElementos implements Caminho<Monge>, Magica {
	@Override
	public String toString() {
		return "Caminho dos Quatro Elementos";
	}
	
	@Override
	public void setHabilidades(Monge classe) {
		classe.habilidadesAdd(new Habilidade("Disc�pulo dos elementos", "\tQuando voc� escolhe essa tradi��o, no 3� n�vel, voc� aprende disciplinas m�gicas que manipulam o poder dos quatro elementos. Uma disciplina requer que voc� gaste pontos de chi cada vez que voc� a usa.\n" +
				"\tVoc� conhece a disciplina Sintonia Elemental e uma outra disciplina, � sua escolha, que s�o detalhadas na se��o �Disciplinas Elementais� abaixo. Voc� aprende uma disciplina adicional, � sua escolha, no 6�, 11� e 17� n�vel.\n" +
				"\tToda vez que voc� aprende uma nova disciplina elemental, voc� pode substituir uma disciplina elemental que voc� j� conhecia por uma disciplina diferente.\n" +
				"\tConjurando Magias Elementais. Algumas disciplinas elementais permitem que voc� conjure magias. Veja o cap�tulo 10 para as regras gerais de conjura��o. Para conjurar uma dessas magias, voc� usa o tempo de conjura��o da mesma e suas outra regras, mas voc� n�o precisa fornecer os componentes materiais dela.\n" +
				"\tQuando voc� alcan�a o 5� n�vel nessa classe, voc� pode gastar pontos de chi adicionais para aumentar o n�vel da magia de disciplina elemental que voc� conjurar, considerando que a magia tenha um efeito de aprimoramento para um n�vel superior, como m�os flamejantes, por exemplo. O n�vel da magia aumenta em 1 para cada ponto de chi adicional que voc� gastar. Por exemplo, se voc� for um monge de 5� n�vel e usar Golpe de Varredura Cauterizante para conjurar m�os flamejantes, voc� pode gastar 3 pontos de chi para conjur�-la como uma magia de 2� n�vel (o custo base da disciplina de 2 pontos mais 1).\n" +
				"\tO n�mero m�ximo de pontos de chi que voc� pode gastar para conjurar uma magia dessa forma (incluindo seu custo de chi base e quaisquer pontos de chi adicionais que voc� gastar para elevar seu n�vel) � determinado pelo seu n�vel de monge, como mostrado na tabela Magias e Pontos de Chi.\n" +
				"\tMagias e Pontos de Chi\n" +
				"\tN�vel de Monge	Pontos de Chi M�ximos para uma Magia\n" +
				"\t5��8�			3\n" +
				"\t9��12�			4\n" +
				"\t13��16� 			5\n" +
				"\t17��20�			6\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Disciplinas elementais", "\tAs disciplinas elementais ser�o apresentadas em ordem alfab�tica. Se a disciplina tiver um n�vel como pr�-requisito, voc� deve ter aquele n�vel na classe para aprend�-la.\n" +
				"\tCavalgar o Vento (11� n�vel Requerido). Voc� pode gastar 4 pontos de chi para conjurar voo em si mesmo.\n" +
				"\tChamas da F�nix (11� n�vel Requerido). Voc� pode gastar 4 pontos de chi para conjurar bola de fogo.\n" +
				"\tChicote de �gua. Voc� pode gastar 2 pontos de chi, com uma a��o, para criar um chicote de �gua que empurra e puxa uma criatura para desequilibr�-la. Uma criatura que voc� possa ver a at� 9 metros deve realizar um teste de resist�ncia de Destreza. Se falhar, a criatura sofre 3d10 de dano de concuss�o, mais 1d10 de dano de concuss�o extra para cada ponto de chi adicional que voc� gastar e voc� pode tanto derrubar a criatura no ch�o, quanto pux�-la 7,5 metros para perto de voc�. Em um sucesso, a criatura sofre metade do dano e voc� n�o a puxa ou derruba.\n" +
				"\tDefesa Eterna da Montanha (17� n�vel Requerido). Voc� pode gastar 5 pontos de chi para conjurar pele de pedra em si mesmo.\n" +
				"\tGolpe de Varredura Cauterizante Voc� pode gastar 2 pontos de chi para conjurar m�os flamejantes.\n" +
				"\tGongo do Pico (6� n�vel Requerido). Voc� pode gastar 3 pontos de chi para conjurar despeda�ar.\n" +
				"\tInvestida dos Esp�ritos da Ventania. Voc� pode gastar 2 pontos de chi para conjurar lufada de vento.\n" +
				"\tMoldar o Rio Corrente. Com uma a��o, voc� pode gastar 1 ponto de chi para escolher uma �rea de gelo ou �gua, n�o maior que 9 metros quadrados a at� 36 metros de voc�. Voc� pode transformar �gua em gelo dentro da �rea, e vice-versa e pode remodelar o gelo na �rea da maneira que desejar. Voc� pode levantar ou baixar a eleva��o do gelo, criar encher uma vala, erguer ou achatar uma parede ou formar um pilar. A extens�o dessas mudan�as n�o podem exceder metade da maior dimens�o da �rea. Por exemplo, se voc� afetou 9 metros quadrados, voc� pode criar um pilar de at� 4,5 metros de altura, erguer ou rebaixar a eleva��o do quadrado em 4,5 metros, escavar uma vala de 4,5 metros de profundidade e assim por diante. Voc� n�o pode moldar o gelo para aprisionar ou ferir uma criatura na �rea.\n" +
				"\tOnda de Pedras Rolantes (17� n�vel Requerido). Voc� pode gastar 6 pontos de chi para conjurar muralha de pedra.\n" +
				"\tPostura da Neblina (11� n�vel Requerido). Voc� pode gastar 4 pontos de chi para conjurar forma gasosa.\n" +
				"\tPresas da Serpente de Fogo. Quando voc� usa a a��o de Ataque no seu turno, voc� pode gastar 1 ponto de chi para fazer com que gavinhas de chamas estiquem-se dos seus punho e p�s. Seu alcance com seus ataques desarmados aumenta em 3 metros durante essa a��o e tamb�m pelo resto do seu turno. Um acerto com tal ataque causa dano de fogo, ao inv�s de dano de concuss�o e, se voc� gastar 1 ponto de chi quando atingir o ataque, ele tamb�m causar� 1d10 de fogo adicional.\n" +
				"\tPunho do Ar Continuo. Voc� pode criar uma explos�o de ar comprimido que atinge como um poderoso soco. Com uma a��o, voc� pode gastar 2 pontos de chi e escolher uma criatura a at� 9 metros. A criatura deve realizar um teste de resist�ncia de For�a. Se falhar, a criatura sofrer� 3d10 de dano de concuss�o, mais 1d10 de dano de concuss�o extra para cada ponto de chi adicional que voc� gastar e voc� pode empurrar a criatura para at� 6 metros longe de voc� e derrub�-la no ch�o. Em um sucesso, a criatura sofre metade do dano e voc� n�o a empurra ou derruba.\n" +
				"\tPunho dos Quatro Trov�es. Voc� pode gastar 2 pontos de chi para conjurar onda trovejante.\n" +
				"\tRio de Chamas Famintas (17� n�vel Requerido). Voc� pode gastar 5 pontos de chi para conjurar muralha de fogo.\n" +
				"\tSerragem do Vento do Norte (6� n�vel Requerido). Voc� pode gastar 3 pontos de chi para conjurar imobilizar pessoa.\n" +
				"\tSintonia Elemental. Voc� pode usar sua a��o para, momentaneamente, controlar as for�as elementais pr�ximas, causando um dos seguintes efeitos, � sua escolha:\n" +
				"\t*Criar, instantaneamente, um efeito sensorial inofensivo relacionado � �gua, ar, fogo ou terra, como uma chuva de fa�scas, um sopro de vento, uma leve rajada de n�voa ou um suave estrondo de pedra.\n" +
				"\t*Acender ou apagar, instantaneamente, uma vela, tocha ou pequena fogueira.\n" +
				"\t*Esfriar ou esquentar 0,5 quilo de material inorg�nico por at� 1 hora.\n" +
				"\t*Fazer com que terra, fogo, ar ou n�voa que possa caber dentro de 30 cent�metros c�bicos se molde em uma forma bruta que voc� esculpiu por 1 minuto.\n" +
				"\tSopro do Inverno (17� n�vel Requerido). Voc� pode gastar 6 pontos de chi para conjurar cone de frio.\n\n", 3));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);	
	}

	@Override
	public String getDescricao() {
		return "\tVoc� segue uma tradi��o mon�stica que ensina voc� a dominar os elementos. Quando voc� foca seu chi, voc� pode se alinhar com as for�as da cria��o e moldar os elementos a sua vontade, usando-os como uma extens�o do seu corpo. Alguns membros dessa tradi��o se dedicam a um �nico elemento, mas outros tecem os elementos juntos.\n" +
				"\tMuitos monges dessa tradi��o tatuam seus corpos com representa��es dos seus poderes de chi, normalmente representadas atrav�s de drag�es enrolados, mas tamb�m como f�nix, peixes, plantas, montanhas e ondas coroantes.\n";
	}
}
