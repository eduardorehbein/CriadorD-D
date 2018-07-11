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
		classe.habilidadesAdd(new Habilidade("Discípulo dos elementos", "\tQuando você escolhe essa tradição, no 3° nível, você aprende disciplinas mágicas que manipulam o poder dos quatro elementos. Uma disciplina requer que você gaste pontos de chi cada vez que você a usa.\n" +
				"\tVocê conhece a disciplina Sintonia Elemental e uma outra disciplina, à sua escolha, que são detalhadas na seção “Disciplinas Elementais” abaixo. Você aprende uma disciplina adicional, à sua escolha, no 6°, 11° e 17° nível.\n" +
				"\tToda vez que você aprende uma nova disciplina elemental, você pode substituir uma disciplina elemental que você já conhecia por uma disciplina diferente.\n" +
				"\tConjurando Magias Elementais. Algumas disciplinas elementais permitem que você conjure magias. Veja o capítulo 10 para as regras gerais de conjuração. Para conjurar uma dessas magias, você usa o tempo de conjuração da mesma e suas outra regras, mas você não precisa fornecer os componentes materiais dela.\n" +
				"\tQuando você alcança o 5° nível nessa classe, você pode gastar pontos de chi adicionais para aumentar o nível da magia de disciplina elemental que você conjurar, considerando que a magia tenha um efeito de aprimoramento para um nível superior, como mãos flamejantes, por exemplo. O nível da magia aumenta em 1 para cada ponto de chi adicional que você gastar. Por exemplo, se você for um monge de 5° nível e usar Golpe de Varredura Cauterizante para conjurar mãos flamejantes, você pode gastar 3 pontos de chi para conjurá-la como uma magia de 2° nível (o custo base da disciplina de 2 pontos mais 1).\n" +
				"\tO número máximo de pontos de chi que você pode gastar para conjurar uma magia dessa forma (incluindo seu custo de chi base e quaisquer pontos de chi adicionais que você gastar para elevar seu nível) é determinado pelo seu nível de monge, como mostrado na tabela Magias e Pontos de Chi.\n" +
				"\tMagias e Pontos de Chi\n" +
				"\tNível de Monge	Pontos de Chi Máximos para uma Magia\n" +
				"\t5°–8°			3\n" +
				"\t9°–12°			4\n" +
				"\t13°–16° 			5\n" +
				"\t17°–20°			6\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Disciplinas elementais", "\tAs disciplinas elementais serão apresentadas em ordem alfabética. Se a disciplina tiver um nível como pré-requisito, você deve ter aquele nível na classe para aprendê-la.\n" +
				"\tCavalgar o Vento (11° nível Requerido). Você pode gastar 4 pontos de chi para conjurar voo em si mesmo.\n" +
				"\tChamas da Fénix (11° nível Requerido). Você pode gastar 4 pontos de chi para conjurar bola de fogo.\n" +
				"\tChicote de Água. Você pode gastar 2 pontos de chi, com uma ação, para criar um chicote de água que empurra e puxa uma criatura para desequilibrá-la. Uma criatura que você possa ver a até 9 metros deve realizar um teste de resistência de Destreza. Se falhar, a criatura sofre 3d10 de dano de concussão, mais 1d10 de dano de concussão extra para cada ponto de chi adicional que você gastar e você pode tanto derrubar a criatura no chão, quanto puxá-la 7,5 metros para perto de você. Em um sucesso, a criatura sofre metade do dano e você não a puxa ou derruba.\n" +
				"\tDefesa Eterna da Montanha (17° nível Requerido). Você pode gastar 5 pontos de chi para conjurar pele de pedra em si mesmo.\n" +
				"\tGolpe de Varredura Cauterizante Você pode gastar 2 pontos de chi para conjurar mãos flamejantes.\n" +
				"\tGongo do Pico (6° nível Requerido). Você pode gastar 3 pontos de chi para conjurar despedaçar.\n" +
				"\tInvestida dos Espíritos da Ventania. Você pode gastar 2 pontos de chi para conjurar lufada de vento.\n" +
				"\tMoldar o Rio Corrente. Com uma ação, você pode gastar 1 ponto de chi para escolher uma área de gelo ou água, não maior que 9 metros quadrados a até 36 metros de você. Você pode transformar água em gelo dentro da área, e vice-versa e pode remodelar o gelo na área da maneira que desejar. Você pode levantar ou baixar a elevação do gelo, criar encher uma vala, erguer ou achatar uma parede ou formar um pilar. A extensão dessas mudanças não podem exceder metade da maior dimensão da área. Por exemplo, se você afetou 9 metros quadrados, você pode criar um pilar de até 4,5 metros de altura, erguer ou rebaixar a elevação do quadrado em 4,5 metros, escavar uma vala de 4,5 metros de profundidade e assim por diante. Você não pode moldar o gelo para aprisionar ou ferir uma criatura na área.\n" +
				"\tOnda de Pedras Rolantes (17° nível Requerido). Você pode gastar 6 pontos de chi para conjurar muralha de pedra.\n" +
				"\tPostura da Neblina (11° nível Requerido). Você pode gastar 4 pontos de chi para conjurar forma gasosa.\n" +
				"\tPresas da Serpente de Fogo. Quando você usa a ação de Ataque no seu turno, você pode gastar 1 ponto de chi para fazer com que gavinhas de chamas estiquem-se dos seus punho e pés. Seu alcance com seus ataques desarmados aumenta em 3 metros durante essa ação e também pelo resto do seu turno. Um acerto com tal ataque causa dano de fogo, ao invés de dano de concussão e, se você gastar 1 ponto de chi quando atingir o ataque, ele também causará 1d10 de fogo adicional.\n" +
				"\tPunho do Ar Continuo. Você pode criar uma explosão de ar comprimido que atinge como um poderoso soco. Com uma ação, você pode gastar 2 pontos de chi e escolher uma criatura a até 9 metros. A criatura deve realizar um teste de resistência de Força. Se falhar, a criatura sofrerá 3d10 de dano de concussão, mais 1d10 de dano de concussão extra para cada ponto de chi adicional que você gastar e você pode empurrar a criatura para até 6 metros longe de você e derrubá-la no chão. Em um sucesso, a criatura sofre metade do dano e você não a empurra ou derruba.\n" +
				"\tPunho dos Quatro Trovões. Você pode gastar 2 pontos de chi para conjurar onda trovejante.\n" +
				"\tRio de Chamas Famintas (17° nível Requerido). Você pode gastar 5 pontos de chi para conjurar muralha de fogo.\n" +
				"\tSerragem do Vento do Norte (6° nível Requerido). Você pode gastar 3 pontos de chi para conjurar imobilizar pessoa.\n" +
				"\tSintonia Elemental. Você pode usar sua ação para, momentaneamente, controlar as forças elementais próximas, causando um dos seguintes efeitos, à sua escolha:\n" +
				"\t*Criar, instantaneamente, um efeito sensorial inofensivo relacionado à água, ar, fogo ou terra, como uma chuva de faíscas, um sopro de vento, uma leve rajada de névoa ou um suave estrondo de pedra.\n" +
				"\t*Acender ou apagar, instantaneamente, uma vela, tocha ou pequena fogueira.\n" +
				"\t*Esfriar ou esquentar 0,5 quilo de material inorgânico por até 1 hora.\n" +
				"\t*Fazer com que terra, fogo, ar ou névoa que possa caber dentro de 30 centímetros cúbicos se molde em uma forma bruta que você esculpiu por 1 minuto.\n" +
				"\tSopro do Inverno (17° nível Requerido). Você pode gastar 6 pontos de chi para conjurar cone de frio.\n\n", 3));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);	
	}

	@Override
	public String getDescricao() {
		return "\tVocê segue uma tradição monástica que ensina você a dominar os elementos. Quando você foca seu chi, você pode se alinhar com as forças da criação e moldar os elementos a sua vontade, usando-os como uma extensão do seu corpo. Alguns membros dessa tradição se dedicam a um único elemento, mas outros tecem os elementos juntos.\n" +
				"\tMuitos monges dessa tradição tatuam seus corpos com representações dos seus poderes de chi, normalmente representadas através de dragões enrolados, mas também como fênix, peixes, plantas, montanhas e ondas coroantes.\n";
	}
}
