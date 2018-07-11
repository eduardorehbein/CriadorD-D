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
		super.habilidadesAdd(new Habilidade("Especialização", "\tNo 1º nível, você escolhe duas de suas perícias que seja proficiente, ou uma perícia que seja proficiente e ferramentas de ladrão. Seu bônus de proficiência é dobrado em qualquer teste de habilidade que fizer com elas.\n" +
				"\tNo 6º nível, você pode escolher outras duas de suas proficiências (em perícias ou ferramentas de ladrão) para ganhar esse benefício.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Ataque furtivo", "\tA partir do 1º nível, você sabe como atacar sutilmente e explorar a distração de seus inimigos. Uma vez por turno, você pode adicionar 1d6 nas jogadas de dano contra qualquer criatura que acertar, desde que tenha vantagem nas jogadas de ataque. O ataque deve ser com uma arma de acuidade ou à distância.\n" +
				"\tVocê não precisa ter vantagem nas jogadas de ataque se outro inimigo do seu alvo estiver a 1,5 metro de distância dele, desde que este inimigo não esteja incapacitado e você não tenha desvantagem nas jogadas de ataque.\n" +
				"\tA quantidade de dano extra aumenta conforme você ganha níveis nessa classe, como mostrado na coluna Ataque Furtivo da tabela O Ladino.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Gíria de ladrão", "\tDurante seu treinamento você aprendeu as gírias de ladrão, um misto de dialeto, jargão e códigos secretos que permitem você passar mensagens secretas durante uma conversa aparentemente normal. Somente outra criatura que conheça essas gírias de ladrão entende as mensagens. Leva-se quatro vezes mais tempo para transmitir essa mensagem do que falar a mesma ideia claramente.\n" +
				"\tAlém disso, você entende um conjunto de sinais secretos e símbolos usados para transmitir mensagens curtas e simples, como saber se uma área é perigosa ou se é território de uma guilda de ladrões, se o saque está próximo, se as pessoas na área são alvos fáceis ou até mesmo indicar lugares seguros para ladinos se esconderem.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Ação ardilosa", "\tA partir do 2º nível, seu pensamento rápido e agilidade faz você se mover e agir rapidamente. Você pode usar uma ação bônus durante cada um de seus turnos em combate. Esta ação pode ser usada somente para Disparada, Desengajar ou Esconder.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Arquétipo de ladino", "\tNo 3º nível, você escolhe um arquétipo que se esforçará para se equiparar através de exercícios de suas habilidades de ladino: Assassino, Ladrão ou Trapaceiro Arcano, todos detalhados no final da descrição da classe. Sua escolha garante a você características no 3º nível e de novo no 9º, 13º e 17º nível.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 10°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Esquiva sobrenatural", "\tA partir do 5º nível, quando um inimigo que você possa ver o acerta com um ataque, você pode usar sua reação para reduzir pela metade o dano sofrido.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Evasão", "\tA partir do 7º nível, você pode esquivar-se agilmente de certos efeitos em área, como o sopro flamejante de um dragão vermelho ou uma magia tempestade de gelo.\n" +
				"\tQuando você for alvo de um efeito que exige um teste de resistência de Destreza para sofrer metade do dano, você não sofre dano algum se passar, e somente metade do dano se falhar.\n\n", 7));
		super.habilidadesAdd(new Habilidade("Talento confiável", "\tNo 11º nível, você refinou suas perícias beirando à perfeição. Toda vez que você fizer um teste de habilidade no qual possa adicionar seu bônus de proficiência, você trata um resultado no d20 de 9 ou menor como um 10.\n\n", 11));
		super.habilidadesAdd(new Habilidade("Sentido cego", "\tNo 14º nível, se você for capaz de ouvir, você está ciente da localização de qualquer criatura escondida ou invisível a até 3 metros de você.\n\n", 14));
		super.habilidadesAdd(new Habilidade("Mente escorregadia", "\tNo 15º nível, você adquire uma grande força de vontade, adquirindo proficiência nos testes de resistência de Sabedoria.\n\n", 15));
		super.habilidadesAdd(new Habilidade("Elusivo", "\tA partir do 18º nível, você se torna tão sagaz que raramente alguém encosta a mão em você. Nenhuma jogada de ataque tem vantagem contra você, desde que você não esteja incapacitado.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Golpe de sorte", "\tNo 20º nível, você adquire um dom incrível para ter sucesso nos momentos em que mais precisa. Se um ataque seu falhar contra um alvo ao seu alcance, você pode transformar essa falha em um acerto. Ou se falhar em um teste qualquer, você pode tratar a jogada desse mesmo teste como 20 natural.\n" +
				"\tUma vez que você use essa característica, você não pode fazê-lo de novo até terminar um descanso curto ou longo.\n\n", 20));
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
