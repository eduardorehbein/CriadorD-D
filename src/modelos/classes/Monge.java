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
		super.habilidadesAdd(new Habilidade("Defesa sem armadura", "\tA partir do 1� n�vel, quando voc� n�o estiver vestindo nenhuma armadura nem empunhando um escudo, sua Classe de Armadura ser� 10 + seu modificador de Destreza + seu modificador de Sabedoria.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Artes marciais", "\tNo 1� n�vel, sua pratica nas artes marciais concede a voc� maestria nos estilos de combate que utilizam golpes desarmados e armas de monge, que s�o as espadas curtas e quaisquer armas simples corpo-a-corpo que n�o tenham a propriedade duas m�os ou pesada.\n" +
				"\tVoc� ganha os seguintes benef�cios enquanto estiver desarmado ou empunhando uma arma de monge e n�o estiver vestindo nenhuma armadura ou empunhando um escudo:\n" +
				"\t* Voc� pode usar Destreza ao inv�s de For�a para as jogadas de ataque e dano dos seus golpes desarmados e de suas armas de monge.\n" +
				"\t* Voc� pode rolar um d4 no lugar do dano normal dos seus golpes desarmados e armas de monge. Esse dado muda � medida que voc� adquire n�veis de monge, como mostrado na coluna Artes Marciais na tabela O Monge.\n" +
				"\t* Quando voc� usa a a��o de Ataque com um golpe desarmado ou uma arma de monge no seu turno, voc� pode realizar um golpe desarmado com uma a��o b�nus. Por exemplo, se voc� realizar a a��o de Ataque com um bast�o, voc� tamb�m poder� realizar um golpe desarmado com uma a��o b�nus, assumindo que voc� ainda n�o realizou uma a��o b�nus nesse turno.\n" +
				"\tDeterminados monast�rios usam formas especializadas de armas de monge. Por exemplo, voc� pode usar uma clava feita por dois peda�os de madeira conectados por uma pequena corrente (chamado de nunchaku) ou uma foice com uma estranha l�mina fina (chamada de kama). Qualquer que seja o nome que voc� use para uma arma de monge, voc� pode usar as estat�sticas de jogo mostradas para as armas no cap�tulo 5.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Chi", "\tA partir do 2� n�vel, seu treinamento permitiu que voc� controlasse a energia m�stica do chi. Seu acesso a essa energia � representado por um n�mero de pontos de chi. Seu n�vel de monge determina o n�mero de pontos que voc� tem, como mostrado na coluna Pontos de Chi da tabela O Monge.\n" +
				"\tVoc� pode gastar esses pontos para abastecer v�rias caracter�sticas de chi. Voc� come�a conhecendo tr�s dessas caracter�sticas: Rajada de Golpes, Defesa Paciente e Passo do Vento. Voc� aprende mais caracter�sticas de chi � medida que adquire n�veis nessa classe.\n" +
				"\tQuando voc� gasta um ponto de chi, ele se torna indispon�vel at� voc� terminar um descanso curto ou longo, no fim deste, todos os pontos de chi gastos volta para voc�. Voc� deve gastar, pelo menos, 30 minutos do descanso meditando para recuperar seus pontos de chi.\n" +
				"\tAlgumas das caracter�sticas de chi requerem que seu alvo realize um teste de resist�ncia para resistir ao efeito da caracter�stica. A CD do teste de resist�ncia � calculada a seguir:\n" +
				"\tCD de resist�ncia de Chi = 8 + b�nus de profici�ncia + seu modificador de Sabedoria\n" +
				"\tRajada de golpes: Imediatamente ap�s voc� realizar a a��o de Ataque no seu turno, voc� pode gastar 1 ponto de chi para realizar dois golpes desarmados com uma a��o b�nus.\n" +
				"\tDefesa paciente: Voc� pode gastar 1 ponto de chi para realizar a a��o de Esquivar, com uma a��o b�nus, no seu turno.\n" +
				"\tPasso do vento: Voc� pode gastar 1 ponto de chi para realizar a A��o de Desengajar ou Disparada, com uma a��o b�nus, no seu turno, e sua dist�ncia de salto � dobrada nesse turno.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Movimento sem armadura", "\tA partir do 2� n�vel, seu deslocamento aumenta em 3 metros enquanto voc� n�o estiver usando armadura nem empunhando um escudo. Esse b�nus aumenta quando voc� alcan�a determinados n�veis, como mostrado na tabela O Monge.\n" +
				"\tNo 9� n�vel, voc� ganha a habilidade de se mover atrav�s de superf�cies verticais e sobre l�quidos, no seu turno, sem cair durante o movimento.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Tradi��o mon�stica", "\tQuando voc� alcan�a o 3� n�vel, voc� ingressa numa tradi��o mon�stica: o Caminho da M�o Aberta, o Caminho Sombrio e o Caminho dos Quatro Elementos, todas detalhadas no final da descri��o dessa classe. Sua tradi��o concede a voc� caracter�sticas no 3� n�vel e novamente no 6�, 11� e 17� n�vel.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Defletir proj�teis", "\tA partir do 3� n�vel, voc� pode usar sua rea��o para defletir ou apanhar o proj�til quando voc� � atingido por um ataque de arma � dist�ncia. Quando o fizer, o dano que voc� sofrer do ataque � reduzido em 1d10 + seu modificador de Destreza + seu n�vel de monge.\n" +
				"\tSe o dano for reduzido a 0, voc� pode apanhar o proj�til se ele for pequeno o suficiente para ser segurando em uma m�o e voc� tenha, pelo menos, uma m�o livre. Se voc� apanhar um proj�til dessa forma, voc� pode gastar 1 ponto de chi para realizar uma ataque � dist�ncia com a arma ou muni��o que voc� acabou de pegar, como parte da mesma rea��o. Voc� realiza esse ataque com profici�ncia, independentemente das armas em que voc� � proficiente, e o proj�til conta como uma arma de monge para o ataque. A dist�ncia do ataque do monge � de 6/18 metros.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16� e 19� n�vel, voc� pode aumentar um valor de habilidade, � sua escolha, em 2 ou voc� pode aumentar dois valores de habilidade, � sua escolha, em 1. Como padr�o, voc� n�o pode elevar um valor de habilidade acima de 20 com essa caracter�stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Queda lenta", "\tCome�ando no 4� n�vel, voc� pode usar sua rea��o, quando voc� cai, para reduzir o dano de queda sofrido por um valor igual a cinco vezes seu n�vel de monge.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5� n�vel, voc� pode atacar duas vezes, ao inv�s de uma, sempre que voc� realizar a a��o de Ataque no seu turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Ataque atordoante", "\tA partir do 5� n�vel, voc� pode interferir no fluxo de chi do corpo de um oponente. Quando voc� atingir outra criatura com um ataque corpo-a-corpo com arma, voc� pode gastar 1 ponto de chi para tentar um ataque atordoante. O alvo deve ser bem sucedido num teste de resist�ncia de Constitui��o ou ficar� atordoado at� o final do seu pr�ximo turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Golpes de chi", "\tA partir do 6� n�vel, seus golpes desarmados contam como armas m�gicas com o prop�sito de ultrapassar a resist�ncia ou imunidade a ataque e danos n�o-m�gicos.\n\n", 6));
		super.habilidadesAdd(new Habilidade("Evas�o", "\tA partir do 7� n�vel, voc� pode esquivar-se agilmente de certos efeitos em �rea, como o sopro el�trico de um drag�o azul ou uma magia bola de fogo. Quando voc� for alvo de um efeito que exige um teste de resist�ncia de Destreza para sofrer metade do dano, voc� n�o sofre dano algum se passar, e somente metade do dano se falhar.\n\n", 7));
		super.habilidadesAdd(new Habilidade("Mente tranquila", "\tA partir do 7� n�vel, voc� pode usar sua a��o para terminar um efeito em si mesmo, que esteja lhe enfeiti�ando ou amedrontando.\n\n", 7));
		super.habilidadesAdd(new Habilidade("Pureza corporal", "\tNo 10� n�vel, sua maestria do chi flui atrav�s de voc�, tornando-o imune a doen�as e venenos.\n\n", 10));
		super.habilidadesAdd(new Habilidade("Idiomas do sol e da lua", "\tA partir do 13� n�vel, voc� aprende a tocar o chi de outras mentes fazendo com que voc� compreenda todos os idiomas falados. Al�m do mais, qualquer criatura que possa entender um idioma poder� entender o que voc� fala.\n\n", 13));
		super.habilidadesAdd(new Habilidade("Alma de diamante", "\tA partir do 14� n�vel, sua maestria do chi concede a voc� profici�ncia em todos os testes de resist�ncia.\n" +
				"\tAl�m disso, toda vez que voc� realizar um teste de resist�ncia e falha, voc� pode gastar 1 ponto de chi para jogar novamente e ficar com o segundo resultado.\n\n", 14));
		super.habilidadesAdd(new Habilidade("Corpo atemporal", "\tNo 15� n�vel, seu chi sustenta voc� tanto que voc� n�o sofre os efeitos da velhice e n�o pode envelhecer magicamente. Voc� ainda morrer� de velhice, no entanto. Al�m disso, voc� n�o precisa mais de comida ou �gua.\n\n", 15));
		super.habilidadesAdd(new Habilidade("Corpo vazio", "\tA partir do 18� n�vel, voc� pode usar sua a��o para gastar 4 pontos de chi e ficar invis�vel por 1 minuto. Durante esse tempo, voc� tamb�m adquire resist�ncia a todos os danos, exceto dano de energia.\n" +
				"\tAl�m disso, voc� pode gastar 8 pontos de chi para conjurar a magia proje��o astral, sem precisar de componentes materiais. Quando o fizer, voc� n�o pode levar qualquer outra criatura com voc�.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Auto aperfei�oamento", "\tNo 20� n�vel, quando voc� rolar iniciativa e n�o tiver nenhum ponto de chi restante, voc� recupera 4 pontos de chi.\n\n", 20));
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
