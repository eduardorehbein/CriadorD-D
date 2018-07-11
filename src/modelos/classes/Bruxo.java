package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Bruxo extends Classe implements Magica {
	private Caminho<Bruxo> caminho;

	@Override
	public String toString() {
		return "Bruxo";
	}
	
	@Override
	public void inicializa(Personagem personagem) {
		super.inicializa(personagem);
		addMagiasAoBau(personagem);
	}
	
	@Override
	protected void setTabela() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setEquipamentoInicial(Personagem personagem) {
		// Relacionar com as proficiencias da classe		
	}

	@Override
	protected void setPvInicial(Personagem personagem) {
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
	protected void setHabilidades() {
		super.habilidadesAdd(new Habilidade("Patrono transcedental", "\tNo 1° nível, você conclui uma barganha com um ser transcendental, à sua escolha: a Arquifada, o Corruptor ou o Grande Antigo, cada um deles é detalhado no final da descrição da classe. Sua escolha lhe confere traços no 1° nível e novamente no6°, 10° e 14° nível.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Magia de pacto", "\tSua pesquisa arcana e a magia outorgada a você por seu patrono, lhe concedem uma gama de magias. Veja o capítulo 10 para as regras gerais de conjuração e o capítulo 11 para a lista de magias de bruxo.\n" + 
				"\tTruques: Você conhece dois truques, à sua escolha, da lista de magias de bruxo. Você aprende truques de bruxo adicionais, à sua escolha, em níveis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Bruxo.\n" +
				"\tEspaços de Magia: A tabela O Bruxo mostra quantos espaços de magia você possui. A tabela também mostra qual o nível desses espaços; todos os seus espaços de magia são do mesmo nível. Para conjurar uma magia de bruxo de 1° nível ou superior, você deve gastar uma espaço de magia. Você recobra todos os espaços de magia gastos quando você completa um descanso curto ou longo. Por exemplo, quando você atingir o 5° nível, você terá dois espaços de magia de 3° nível. Para conjurar a magia de 1° nível onda trovejante, você deve gastar um desses espaços e você a conjura como uma magia de 3° nível.\n" +
				"\tMagias Conhecidas de 1º Nível e Superiores: No 1° nível, você conhece duas magias de 1° nível, à sua escolha da lista de magias de bruxo. A coluna Magias Conhecidas na tabela O Bruxo mostra quando você aprende mais magias de bruxo, à sua escolha, de 1° nível ou superior. Cada uma dessas magias deve ser de um nível a que você tenha acesso, como mostrado na tabela na coluna de Nível de Magia para o seu nível. Quando você alcança o 6° nível, por exemplo, você aprende uma nova magia de bruxo, que pode ser de 1°, 2° ou 3° nível. Além disso, quando você adquire um nível nessa classe, você pode escolher uma magia de bruxo que você conheça e substituí-la por outra magia da lista de magias de bruxo, que também deve ser de um nível ao qual você tenha espaços de magia.\n" +
				"\tHabilidade de Conjuração: Sua habilidade de conjuração é Carisma para suas magias de bruxo, portanto, você usa seu Carisma sempre que alguma magia se referir à sua habilidade de conjurar magias. Além disso, você usa o seu modificador de Carisma para definir a CD dos testes de resistência para as magias de bruxo que você conjura e quando você realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + bônus de proficiência + seu modificador de Carisma\n" +
				"\tModificador de ataque de magia = seu bônus de proficiência + seu modificador de Carisma\n" +
				"\tFoco de Conjuração: Você pode usar um foco arcano (encontrado no capítulo 5) como foco de conjuração das suas magias de bruxo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Invocações místicas", "\tDurante seus estudos sobre conhecimento oculto, você descobriu as invocações místicas, fragmentos de conhecimento proibido que infundiram você com habilidade mágica permanente.\n" +
				"\tNo 2° nível, você ganha duas invocações místicas, à sua escolha. Suas opções de invocação estão detalhadas no final da descrição dessa classe. Quando você atinge certos nível de bruxo, você adquire novas invocações à sua escolha, como mostrado na coluna Invocações Conhecidas na tabela O Bruxo.\n" +
				"\tAlém disso, quando você adquire um novo nível nessa classe, você pode escolher uma invocação que você conheça e substituí-la por outra invocação que você possa aprender nesse nível.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Dádiva do pacto", "\tNo 3° nível, seu patrono transcendental lhe confere um dom por seus leais serviços. Você adquire uma das características a seguir, à sua escolha.\n" +
				"\tPacto da corrente: Você aprende a magia convocar familiar e pode conjurá-la como um ritual. Essa magia não conta no número de magias que você conhece.\n" +
				"\tQuando você conjura essa magia, você pode escolher uma das formas convencionais para o seu familiar ou uma das seguintes formas especiais: diabrete, pseudodragão, quasit ou sprite.\n" +
				"\tAlém disso, quando você realiza a ação de Ataque, você pode renunciar s um dos seus ataques para permitir que seu familiar realize um ataque, com a reação dele." +
				"\tPacto da lâmina: Você pode usar sua ação para criar uma arma de pacto em sua mão vazia. Você escolhe a forma que essa arma corpo-a-corpo tem a cada vez que você a cria (veja as opções de arma no capítulo 5). Você é proficiente com ela enquanto a empunhar. Essa arma conta como sendo mágica com os propósitos de ultrapassar resistência e imunidade a ataques e danos não-mágicos.\n" +
				"\tSua arma de pacto desaparece se ela estiver a mais de 1,5 metro de você por 1 minuto ou mais. Ela também desaparece se você usar essa característica novamente, se você dissipar a arma (não requer ação) ou se você morrer.\n" +
				"\tVocê pode transformar uma arma mágica em sua arma de pacto ao realizar um ritual especial enquanto empunha a arma. Você precisa de 1 hora para concluir o ritual, que pode ser realizado durante um descanso curto. Você pode dissipar a arma, guardando-a em um espaço extradimensional, e ela reaparece toda vez que você criar sua arma de pacto. A arma deixa de ser sua arma de pacto se você morrer, se você realizar um ritual de 1 hora com outra arma diferente ou se você realizar um ritual de 1 hora para romper seu elo com ela. A arma aparece aos seus pés se ela estiver no espaço extradimensional quando o elo for quebrado.\n" +
				"\tPacto do trono: Seu patrono lhe deu um grimório chamado Livro das Sombras. Quando você adquire essa característica, escolha três truques da lista de magias de qualquer classe. Enquanto o livro estiver com você, você poderá conjurar esses truques a vontade. Eles não contam no número de truques que você conhece. Esses truques são considerados magias de bruxo para você e não precisam ser da mesma lista de magia.\n" +
				"\tSe você perder seu Livro das Sombras, você pode realizar uma cerimônia de 1 hora para receber um substituto do seu patrono. Essa cerimônia pode ser realizada durante um descanso curto ou longo e destrói o livro anterior. O livro se torna cinzas quando você morre.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Arcana mística", "\tNo 11° nível, seu patrono confere a você um segredo mágico conhecido como arcana. Escolha uma magia de 6° nível da lista de magias de bruxo como sua arcana.\n" +
				"\tVocê pode conjurar essa magia arcana uma vez sem gastar um espaço de magia. Você deve terminar um descanso longo antes de poder fazer isso novamente.\n" +
				"\tEm nível altos, você adquire mais magias de bruxo de sua escolha que podem ser conjuradas dessa forma: uma magia de 7° nível no 13° nível, uma magia de 8° nível no 15° nível e uma magia de 9° nível no 17° nível. Você recupera todos os usos de sua Arcana Mística quando você termina um descanso longo.\n\n", 11));
		super.habilidadesAdd(new Habilidade("Mestre místico", "\tNo 20° nível, você pode recarregar sua reserva interior de poder místico quando suplicar ao seu patrono para recuperar espaços de magia gastos. Você pode gastar 1 minuto suplicando pela ajuda do seu patrono para recuperar todos os espaços de magia gastos da sua característica Magia de Pacto. Uma vez que você recuperou espaços de magia com essa característica, você deve terminar um descanso longo antes de fazê-lo novamente.\n\n", 20));	
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());	
	}
	
	@Override
	public void addMagiasAoBau(Personagem personagem) {
		// TODO Auto-generated method stub
		
	}

	public Caminho<Bruxo> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Bruxo> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}