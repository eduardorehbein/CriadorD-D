package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Bruxo extends Classe implements Magica {
	//TODO: Corrigir strings defeituosas
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
	protected void setTabela() { }
	
	@Override
	public void setEquipamentoInicial(Personagem personagem) {
		//TODO: Relacionar com as proficiencias da classe
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
		//TODO: Extrair strings para um XML
		super.habilidadesAdd(new Habilidade("Patrono transcedental", "\tNo 1? n?vel, voc? conclui uma barganha com um ser transcendental, ? sua escolha: a Arquifada, o Corruptor ou o Grande Antigo, cada um deles ? detalhado no final da descri??o da classe. Sua escolha lhe confere tra?os no 1? n?vel e novamente no6?, 10? e 14? n?vel.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Magia de pacto", "\tSua pesquisa arcana e a magia outorgada a voc? por seu patrono, lhe concedem uma gama de magias. Veja o cap?tulo 10 para as regras gerais de conjura??o e o cap?tulo 11 para a lista de magias de bruxo.\n" + 
				"\tTruques: Voc? conhece dois truques, ? sua escolha, da lista de magias de bruxo. Voc? aprende truques de bruxo adicionais, ? sua escolha, em n?veis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Bruxo.\n" +
				"\tEspa?os de Magia: A tabela O Bruxo mostra quantos espa?os de magia voc? possui. A tabela tamb?m mostra qual o n?vel desses espa?os; todos os seus espa?os de magia s?o do mesmo n?vel. Para conjurar uma magia de bruxo de 1? n?vel ou superior, voc? deve gastar uma espa?o de magia. Voc? recobra todos os espa?os de magia gastos quando voc? completa um descanso curto ou longo. Por exemplo, quando voc? atingir o 5? n?vel, voc? ter? dois espa?os de magia de 3? n?vel. Para conjurar a magia de 1? n?vel onda trovejante, voc? deve gastar um desses espa?os e voc? a conjura como uma magia de 3? n?vel.\n" +
				"\tMagias Conhecidas de 1? N?vel e Superiores: No 1? n?vel, voc? conhece duas magias de 1? n?vel, ? sua escolha da lista de magias de bruxo. A coluna Magias Conhecidas na tabela O Bruxo mostra quando voc? aprende mais magias de bruxo, ? sua escolha, de 1? n?vel ou superior. Cada uma dessas magias deve ser de um n?vel a que voc? tenha acesso, como mostrado na tabela na coluna de N?vel de Magia para o seu n?vel. Quando voc? alcan?a o 6? n?vel, por exemplo, voc? aprende uma nova magia de bruxo, que pode ser de 1?, 2? ou 3? n?vel. Al?m disso, quando voc? adquire um n?vel nessa classe, voc? pode escolher uma magia de bruxo que voc? conhe?a e substitu?-la por outra magia da lista de magias de bruxo, que tamb?m deve ser de um n?vel ao qual voc? tenha espa?os de magia.\n" +
				"\tHabilidade de Conjura??o: Sua habilidade de conjura??o ? Carisma para suas magias de bruxo, portanto, voc? usa seu Carisma sempre que alguma magia se referir ? sua habilidade de conjurar magias. Al?m disso, voc? usa o seu modificador de Carisma para definir a CD dos testes de resist?ncia para as magias de bruxo que voc? conjura e quando voc? realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + b?nus de profici?ncia + seu modificador de Carisma\n" +
				"\tModificador de ataque de magia = seu b?nus de profici?ncia + seu modificador de Carisma\n" +
				"\tFoco de Conjura??o: Voc? pode usar um foco arcano (encontrado no cap?tulo 5) como foco de conjura??o das suas magias de bruxo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Invoca??es m?sticas", "\tDurante seus estudos sobre conhecimento oculto, voc? descobriu as invoca??es m?sticas, fragmentos de conhecimento proibido que infundiram voc? com habilidade m?gica permanente.\n" +
				"\tNo 2? n?vel, voc? ganha duas invoca??es m?sticas, ? sua escolha. Suas op??es de invoca??o est?o detalhadas no final da descri??o dessa classe. Quando voc? atinge certos n?vel de bruxo, voc? adquire novas invoca??es ? sua escolha, como mostrado na coluna Invoca??es Conhecidas na tabela O Bruxo.\n" +
				"\tAl?m disso, quando voc? adquire um novo n?vel nessa classe, voc? pode escolher uma invoca??o que voc? conhe?a e substitu?-la por outra invoca??o que voc? possa aprender nesse n?vel.\n\n", 2));
		super.habilidadesAdd(new Habilidade("D?diva do pacto", "\tNo 3? n?vel, seu patrono transcendental lhe confere um dom por seus leais servi?os. Voc? adquire uma das caracter?sticas a seguir, ? sua escolha.\n" +
				"\tPacto da corrente: Voc? aprende a magia convocar familiar e pode conjur?-la como um ritual. Essa magia n?o conta no n?mero de magias que voc? conhece.\n" +
				"\tQuando voc? conjura essa magia, voc? pode escolher uma das formas convencionais para o seu familiar ou uma das seguintes formas especiais: diabrete, pseudodrag?o, quasit ou sprite.\n" +
				"\tAl?m disso, quando voc? realiza a a??o de Ataque, voc? pode renunciar s um dos seus ataques para permitir que seu familiar realize um ataque, com a rea??o dele." +
				"\tPacto da l?mina: Voc? pode usar sua a??o para criar uma arma de pacto em sua m?o vazia. Voc? escolhe a forma que essa arma corpo-a-corpo tem a cada vez que voc? a cria (veja as op??es de arma no cap?tulo 5). Voc? ? proficiente com ela enquanto a empunhar. Essa arma conta como sendo m?gica com os prop?sitos de ultrapassar resist?ncia e imunidade a ataques e danos n?o-m?gicos.\n" +
				"\tSua arma de pacto desaparece se ela estiver a mais de 1,5 metro de voc? por 1 minuto ou mais. Ela tamb?m desaparece se voc? usar essa caracter?stica novamente, se voc? dissipar a arma (n?o requer a??o) ou se voc? morrer.\n" +
				"\tVoc? pode transformar uma arma m?gica em sua arma de pacto ao realizar um ritual especial enquanto empunha a arma. Voc? precisa de 1 hora para concluir o ritual, que pode ser realizado durante um descanso curto. Voc? pode dissipar a arma, guardando-a em um espa?o extradimensional, e ela reaparece toda vez que voc? criar sua arma de pacto. A arma deixa de ser sua arma de pacto se voc? morrer, se voc? realizar um ritual de 1 hora com outra arma diferente ou se voc? realizar um ritual de 1 hora para romper seu elo com ela. A arma aparece aos seus p?s se ela estiver no espa?o extradimensional quando o elo for quebrado.\n" +
				"\tPacto do trono: Seu patrono lhe deu um grim?rio chamado Livro das Sombras. Quando voc? adquire essa caracter?stica, escolha tr?s truques da lista de magias de qualquer classe. Enquanto o livro estiver com voc?, voc? poder? conjurar esses truques a vontade. Eles n?o contam no n?mero de truques que voc? conhece. Esses truques s?o considerados magias de bruxo para voc? e n?o precisam ser da mesma lista de magia.\n" +
				"\tSe voc? perder seu Livro das Sombras, voc? pode realizar uma cerim?nia de 1 hora para receber um substituto do seu patrono. Essa cerim?nia pode ser realizada durante um descanso curto ou longo e destr?i o livro anterior. O livro se torna cinzas quando voc? morre.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc? atinge o 4? n?vel e novamente no 8?, 12?, 16? e 19? n?vel, voc? pode aumentar um valor de habilidade, ? sua escolha, em 2 ou voc? pode aumentar dois valores de habilidade, ? sua escolha, em 1. Como padr?o, voc? n?o pode elevar um valor de habilidade acima de 20 com essa caracter?stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Arcana m?stica", "\tNo 11? n?vel, seu patrono confere a voc? um segredo m?gico conhecido como arcana. Escolha uma magia de 6? n?vel da lista de magias de bruxo como sua arcana.\n" +
				"\tVoc? pode conjurar essa magia arcana uma vez sem gastar um espa?o de magia. Voc? deve terminar um descanso longo antes de poder fazer isso novamente.\n" +
				"\tEm n?vel altos, voc? adquire mais magias de bruxo de sua escolha que podem ser conjuradas dessa forma: uma magia de 7? n?vel no 13? n?vel, uma magia de 8? n?vel no 15? n?vel e uma magia de 9? n?vel no 17? n?vel. Voc? recupera todos os usos de sua Arcana M?stica quando voc? termina um descanso longo.\n\n", 11));
		super.habilidadesAdd(new Habilidade("Mestre m?stico", "\tNo 20? n?vel, voc? pode recarregar sua reserva interior de poder m?stico quando suplicar ao seu patrono para recuperar espa?os de magia gastos. Voc? pode gastar 1 minuto suplicando pela ajuda do seu patrono para recuperar todos os espa?os de magia gastos da sua caracter?stica Magia de Pacto. Uma vez que voc? recuperou espa?os de magia com essa caracter?stica, voc? deve terminar um descanso longo antes de faz?-lo novamente.\n\n", 20));	
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());	
	}
	
	@Override
	public void addMagiasAoBau(Personagem personagem) { }

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