package modelos.classes;

import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Monge extends Classe {
	private Caminho<Monge> caminho;
	
	@Override
	public String toString() {
		return "Monge";
	}
	
	@Override
	protected void setTabela() {
		// TODO Auto-generated method stub
		
	}
		
	@Override
	public void setEquipamentoInicial(Personagem personagem) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPvInicial(Personagem personagem) {
		personagem.setPv(8 + personagem.getModificadorConstituicao());
		if (personagem.getNivel() > 1) {
			for (int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD8() + personagem.getModificadorConstituicao());	
	}

	@Override
	public void setHabilidades() {
		super.habilidadesAdd(new Habilidade("Defesa sem armadura", "\tA partir do 1° nível, quando você não estiver vestindo nenhuma armadura nem empunhando um escudo, sua Classe de Armadura será 10 + seu modificador de Destreza + seu modificador de Sabedoria.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Artes marciais", "\tNo 1° nível, sua pratica nas artes marciais concede a você maestria nos estilos de combate que utilizam golpes desarmados e armas de monge, que são as espadas curtas e quaisquer armas simples corpo-a-corpo que não tenham a propriedade duas mãos ou pesada.\n" +
				"\tVocê ganha os seguintes benefícios enquanto estiver desarmado ou empunhando uma arma de monge e não estiver vestindo nenhuma armadura ou empunhando um escudo:\n" +
				"\t* Você pode usar Destreza ao invés de Força para as jogadas de ataque e dano dos seus golpes desarmados e de suas armas de monge.\n" +
				"\t* Você pode rolar um d4 no lugar do dano normal dos seus golpes desarmados e armas de monge. Esse dado muda à medida que você adquire níveis de monge, como mostrado na coluna Artes Marciais na tabela O Monge.\n" +
				"\t* Quando você usa a ação de Ataque com um golpe desarmado ou uma arma de monge no seu turno, você pode realizar um golpe desarmado com uma ação bônus. Por exemplo, se você realizar a ação de Ataque com um bastão, você também poderá realizar um golpe desarmado com uma ação bônus, assumindo que você ainda não realizou uma ação bônus nesse turno.\n" +
				"\tDeterminados monastérios usam formas especializadas de armas de monge. Por exemplo, você pode usar uma clava feita por dois pedaços de madeira conectados por uma pequena corrente (chamado de nunchaku) ou uma foice com uma estranha lâmina fina (chamada de kama). Qualquer que seja o nome que você use para uma arma de monge, você pode usar as estatísticas de jogo mostradas para as armas no capítulo 5.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Chi", "\tA partir do 2° nível, seu treinamento permitiu que você controlasse a energia mística do chi. Seu acesso a essa energia é representado por um número de pontos de chi. Seu nível de monge determina o número de pontos que você tem, como mostrado na coluna Pontos de Chi da tabela O Monge.\n" +
				"\tVocê pode gastar esses pontos para abastecer várias características de chi. Você começa conhecendo três dessas características: Rajada de Golpes, Defesa Paciente e Passo do Vento. Você aprende mais características de chi à medida que adquire níveis nessa classe.\n" +
				"\tQuando você gasta um ponto de chi, ele se torna indisponível até você terminar um descanso curto ou longo, no fim deste, todos os pontos de chi gastos volta para você. Você deve gastar, pelo menos, 30 minutos do descanso meditando para recuperar seus pontos de chi.\n" +
				"\tAlgumas das características de chi requerem que seu alvo realize um teste de resistência para resistir ao efeito da característica. A CD do teste de resistência é calculada a seguir:\n" +
				"\tCD de resistência de Chi = 8 + bônus de proficiência + seu modificador de Sabedoria\n" +
				"\tRajada de golpes: Imediatamente após você realizar a ação de Ataque no seu turno, você pode gastar 1 ponto de chi para realizar dois golpes desarmados com uma ação bônus.\n" +
				"\tDefesa paciente: Você pode gastar 1 ponto de chi para realizar a ação de Esquivar, com uma ação bônus, no seu turno.\n" +
				"\tPasso do vento: Você pode gastar 1 ponto de chi para realizar a Ação de Desengajar ou Disparada, com uma ação bônus, no seu turno, e sua distância de salto é dobrada nesse turno.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Movimento sem armadura", "\tA partir do 2° nível, seu deslocamento aumenta em 3 metros enquanto você não estiver usando armadura nem empunhando um escudo. Esse bônus aumenta quando você alcança determinados níveis, como mostrado na tabela O Monge.\n" +
				"\tNo 9° nível, você ganha a habilidade de se mover através de superfícies verticais e sobre líquidos, no seu turno, sem cair durante o movimento.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Tradição monástica", "\tQuando você alcança o 3° nível, você ingressa numa tradição monástica: o Caminho da Mão Aberta, o Caminho Sombrio e o Caminho dos Quatro Elementos, todas detalhadas no final da descrição dessa classe. Sua tradição concede a você características no 3° nível e novamente no 6°, 11° e 17° nível.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Defletir projéteis", "\tA partir do 3° nível, você pode usar sua reação para defletir ou apanhar o projétil quando você é atingido por um ataque de arma à distância. Quando o fizer, o dano que você sofrer do ataque é reduzido em 1d10 + seu modificador de Destreza + seu nível de monge.\n" +
				"\tSe o dano for reduzido a 0, você pode apanhar o projétil se ele for pequeno o suficiente para ser segurando em uma mão e você tenha, pelo menos, uma mão livre. Se você apanhar um projétil dessa forma, você pode gastar 1 ponto de chi para realizar uma ataque à distância com a arma ou munição que você acabou de pegar, como parte da mesma reação. Você realiza esse ataque com proficiência, independentemente das armas em que você é proficiente, e o projétil conta como uma arma de monge para o ataque. A distância do ataque do monge é de 6/18 metros.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Queda lenta", "\tComeçando no 4° nível, você pode usar sua reação, quando você cai, para reduzir o dano de queda sofrido por um valor igual a cinco vezes seu nível de monge.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5° nível, você pode atacar duas vezes, ao invés de uma, sempre que você realizar a ação de Ataque no seu turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Ataque atordoante", "\tA partir do 5° nível, você pode interferir no fluxo de chi do corpo de um oponente. Quando você atingir outra criatura com um ataque corpo-a-corpo com arma, você pode gastar 1 ponto de chi para tentar um ataque atordoante. O alvo deve ser bem sucedido num teste de resistência de Constituição ou ficará atordoado até o final do seu próximo turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Golpes de chi", "\tA partir do 6° nível, seus golpes desarmados contam como armas mágicas com o propósito de ultrapassar a resistência ou imunidade a ataque e danos não-mágicos.\n\n", 6));
		super.habilidadesAdd(new Habilidade("Evasão", "\tA partir do 7º nível, você pode esquivar-se agilmente de certos efeitos em área, como o sopro elétrico de um dragão azul ou uma magia bola de fogo. Quando você for alvo de um efeito que exige um teste de resistência de Destreza para sofrer metade do dano, você não sofre dano algum se passar, e somente metade do dano se falhar.\n\n", 7));
		super.habilidadesAdd(new Habilidade("Mente tranquila", "\tA partir do 7° nível, você pode usar sua ação para terminar um efeito em si mesmo, que esteja lhe enfeitiçando ou amedrontando.\n\n", 7));
		super.habilidadesAdd(new Habilidade("Pureza corporal", "\tNo 10° nível, sua maestria do chi flui através de você, tornando-o imune a doenças e venenos.\n\n", 10));
		super.habilidadesAdd(new Habilidade("Idiomas do sol e da lua", "\tA partir do 13° nível, você aprende a tocar o chi de outras mentes fazendo com que você compreenda todos os idiomas falados. Além do mais, qualquer criatura que possa entender um idioma poderá entender o que você fala.\n\n", 13));
		super.habilidadesAdd(new Habilidade("Alma de diamante", "\tA partir do 14° nível, sua maestria do chi concede a você proficiência em todos os testes de resistência.\n" +
				"\tAlém disso, toda vez que você realizar um teste de resistência e falha, você pode gastar 1 ponto de chi para jogar novamente e ficar com o segundo resultado.\n\n", 14));
		super.habilidadesAdd(new Habilidade("Corpo atemporal", "\tNo 15° nível, seu chi sustenta você tanto que você não sofre os efeitos da velhice e não pode envelhecer magicamente. Você ainda morrerá de velhice, no entanto. Além disso, você não precisa mais de comida ou água.\n\n", 15));
		super.habilidadesAdd(new Habilidade("Corpo vazio", "\tA partir do 18° nível, você pode usar sua ação para gastar 4 pontos de chi e ficar invisível por 1 minuto. Durante esse tempo, você também adquire resistência a todos os danos, exceto dano de energia.\n" +
				"\tAlém disso, você pode gastar 8 pontos de chi para conjurar a magia projeção astral, sem precisar de componentes materiais. Quando o fizer, você não pode levar qualquer outra criatura com você.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Auto aperfeiçoamento", "\tNo 20° nível, quando você rolar iniciativa e não tiver nenhum ponto de chi restante, você recupera 4 pontos de chi.\n\n", 20));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4();
		personagem.setRiqueza("po: " + riqueza.toString());
		
	}

	public Caminho<Monge> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Monge> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
