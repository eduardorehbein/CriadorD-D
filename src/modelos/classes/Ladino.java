package modelos.classes;

import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Ladino extends Classe {
	private Caminho<Ladino> caminho;
	
	@Override
	public String toString() {
		return "Ladino";
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
	protected void setPvInicial(Personagem personagem) {
		personagem.setPv(8 + personagem.getModificadorConstituicao());
		if(personagem.getNivel() > 1) {
			for(int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}	
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD8() + personagem.getModificadorConstituicao());		
	}

	@Override
	protected void setHabilidades() {
		super.habilidadesAdd(new Habilidade("Especializa��o", "\tNo 1� n�vel, voc� escolhe duas de suas per�cias que seja proficiente, ou uma per�cia que seja proficiente e ferramentas de ladr�o. Seu b�nus de profici�ncia � dobrado em qualquer teste de habilidade que fizer com elas.\n" +
				"\tNo 6� n�vel, voc� pode escolher outras duas de suas profici�ncias (em per�cias ou ferramentas de ladr�o) para ganhar esse benef�cio.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Ataque furtivo", "\tA partir do 1� n�vel, voc� sabe como atacar sutilmente e explorar a distra��o de seus inimigos. Uma vez por turno, voc� pode adicionar 1d6 nas jogadas de dano contra qualquer criatura que acertar, desde que tenha vantagem nas jogadas de ataque. O ataque deve ser com uma arma de acuidade ou � dist�ncia.\n" +
				"\tVoc� n�o precisa ter vantagem nas jogadas de ataque se outro inimigo do seu alvo estiver a 1,5 metro de dist�ncia dele, desde que este inimigo n�o esteja incapacitado e voc� n�o tenha desvantagem nas jogadas de ataque.\n" +
				"\tA quantidade de dano extra aumenta conforme voc� ganha n�veis nessa classe, como mostrado na coluna Ataque Furtivo da tabela O Ladino.\n\n", 1));
		super.habilidadesAdd(new Habilidade("G�ria de ladr�o", "\tDurante seu treinamento voc� aprendeu as g�rias de ladr�o, um misto de dialeto, jarg�o e c�digos secretos que permitem voc� passar mensagens secretas durante uma conversa aparentemente normal. Somente outra criatura que conhe�a essas g�rias de ladr�o entende as mensagens. Leva-se quatro vezes mais tempo para transmitir essa mensagem do que falar a mesma ideia claramente.\n" +
				"\tAl�m disso, voc� entende um conjunto de sinais secretos e s�mbolos usados para transmitir mensagens curtas e simples, como saber se uma �rea � perigosa ou se � territ�rio de uma guilda de ladr�es, se o saque est� pr�ximo, se as pessoas na �rea s�o alvos f�ceis ou at� mesmo indicar lugares seguros para ladinos se esconderem.\n\n", 1));
		super.habilidadesAdd(new Habilidade("A��o ardilosa", "\tA partir do 2� n�vel, seu pensamento r�pido e agilidade faz voc� se mover e agir rapidamente. Voc� pode usar uma a��o b�nus durante cada um de seus turnos em combate. Esta a��o pode ser usada somente para Disparada, Desengajar ou Esconder.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Arqu�tipo de ladino", "\tNo 3� n�vel, voc� escolhe um arqu�tipo que se esfor�ar� para se equiparar atrav�s de exerc�cios de suas habilidades de ladino: Assassino, Ladr�o ou Trapaceiro Arcano, todos detalhados no final da descri��o da classe. Sua escolha garante a voc� caracter�sticas no 3� n�vel e de novo no 9�, 13� e 17� n�vel.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc� atinge o 4� n�vel e novamente no 8�, 10�, 12�, 16� e 19� n�vel, voc� pode aumentar um valor de habilidade, � sua escolha, em 2 ou voc� pode aumentar dois valores de habilidade, � sua escolha, em 1. Como padr�o, voc� n�o pode elevar um valor de habilidade acima de 20 com essa caracter�stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Esquiva sobrenatural", "\tA partir do 5� n�vel, quando um inimigo que voc� possa ver o acerta com um ataque, voc� pode usar sua rea��o para reduzir pela metade o dano sofrido.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Evas�o", "\tA partir do 7� n�vel, voc� pode esquivar-se agilmente de certos efeitos em �rea, como o sopro flamejante de um drag�o vermelho ou uma magia tempestade de gelo.\n" +
				"\tQuando voc� for alvo de um efeito que exige um teste de resist�ncia de Destreza para sofrer metade do dano, voc� n�o sofre dano algum se passar, e somente metade do dano se falhar.\n\n", 7));
		super.habilidadesAdd(new Habilidade("Talento confi�vel", "\tNo 11� n�vel, voc� refinou suas per�cias beirando � perfei��o. Toda vez que voc� fizer um teste de habilidade no qual possa adicionar seu b�nus de profici�ncia, voc� trata um resultado no d20 de 9 ou menor como um 10.\n\n", 11));
		super.habilidadesAdd(new Habilidade("Sentido cego", "\tNo 14� n�vel, se voc� for capaz de ouvir, voc� est� ciente da localiza��o de qualquer criatura escondida ou invis�vel a at� 3 metros de voc�.\n\n", 14));
		super.habilidadesAdd(new Habilidade("Mente escorregadia", "\tNo 15� n�vel, voc� adquire uma grande for�a de vontade, adquirindo profici�ncia nos testes de resist�ncia de Sabedoria.\n\n", 15));
		super.habilidadesAdd(new Habilidade("Elusivo", "\tA partir do 18� n�vel, voc� se torna t�o sagaz que raramente algu�m encosta a m�o em voc�. Nenhuma jogada de ataque tem vantagem contra voc�, desde que voc� n�o esteja incapacitado.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Golpe de sorte", "\tNo 20� n�vel, voc� adquire um dom incr�vel para ter sucesso nos momentos em que mais precisa. Se um ataque seu falhar contra um alvo ao seu alcance, voc� pode transformar essa falha em um acerto. Ou se falhar em um teste qualquer, voc� pode tratar a jogada desse mesmo teste como 20 natural.\n" +
				"\tUma vez que voc� use essa caracter�stica, voc� n�o pode faz�-lo de novo at� terminar um descanso curto ou longo.\n\n", 20));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());	
	}

	public Caminho<Ladino> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Ladino> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
