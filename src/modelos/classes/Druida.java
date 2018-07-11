package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Druida extends Classe implements Magica{
	//TODO: Corrigir strings defeituosas
	private Caminho<Druida> caminho;
	
	@Override
	public String toString() {
		return "Druida";
	}
	
	@Override
	public void inicializa(Personagem personagem) {
		super.inicializa(personagem);
		personagem.idiomasAdd("Dru?dico");
		addMagiasAoBau(personagem);
	}
	
	@Override
	protected void setTabela() {}

	@Override
	public void setEquipamentoInicial(Personagem personagem) {}

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
		super.habilidadesAdd(new Habilidade("Dru?dico", "\tVoc? conhece o Dru?dico, o idioma secreto dos druidas. Voc? pode falar esse idioma e us?-lo para deixar mensagens escondidas. Voc? e outros que conhe?am esse idioma automaticamente veem tais mensagens. Outros perceber?o a presen?a da mensagem se passarem num teste de Sabedoria (Percep??o) CD 15, mas n?o conseguir?o decifr?-lo sem magia.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Conjura??o", "\tBaseado na ess?ncia divina da pr?pria natureza, voc? pode conjurar magias para moldar sua ess?ncia a sua vontade. Veja o cap?tulo 10 para as regras gerais de conjura??o e o cap?tulo 11 para a lista de magias de druida.\n" + 
				"\tTruques: Voc? conhece dois truques, ? sua escolha, da lista de magias de druida. Voc? aprende truques de druida adicionais, ? sua escolha, em n?veis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Druida.\n" +
				"\tPreparando e Conjurando Magias: A tabela O Druida mostra quantos espa?os de magia voc? t?m para conjurar suas magias de 1? n?vel e superiores. Para conjurar uma dessas magias, voc? precisa gastar um espa?o do n?vel da magia ou superior. Voc? recupera todos os espa?os gastos quando termina um descanso longo. Voc? prepara a lista de magias dispon?veis selecionando-as da lista de magias de Druida. Voc? seleciona um n?mero de magias igual ao seu modificador de Sabedoria + seu n?vel de druida (m?nimo de uma magia). Essas magias devem ser de n?veis que voc? possua espa?os de magia. Por exemplo, se voc? ? um druida de 3? n?vel, voc? possui quatro espa?os de magia de 1? n?vel e dois de 2? n?vel. Com Sabedoria 16, sua lista de magias preparadas pode incluir 6 magias, combinando as de 1? e 2? n?vel em qualquer ordem. Se voc? preparar a magia de 1? n?vel curar ferimentos, voc? pode conjur?-la com um espa?o de magia de 1? ou de 2? n?vel. Ao conjurar a magia, voc? n?o a retira de sua lista de magias preparadas, podendo conjur?-la de novo se tiver espa?os de magia dispon?veis. Voc? pode modificar a sua lista de magias preparadas quando termina um descanso longo. Preparar uma nova lista de magias de druida requer tempo gasto em preces e medita??o: no m?nimo 1 minuto por n?vel de magia para cada magia preparada.\n" +
				"\tPlantas e Florestas Sagradas: O druida tem certas plantas como sagradas, em particular o amieiro, freixo, b?tula, elder, avel?, azevinho, zimbro, visco, carvalho, sorva, salgueiro e teixo. Druidas, muitas vezes, usam essas plantas como parte de seu foco de conjura??o, incorporando lascas de carvalho ou teixo ou ramos de visco branco.\n" +
				"\tDa mesma forma, um druida usa tais madeiras para fazer outros objetos, com armas e escudos. O teixo est? associado a morte e renascimento, ent?o, empunhaduras de cimitarras ou foices seriam feitas com esse material. O freixo est? associado com a vida e o carvalho com a for?a. Essas madeiras fazem excelentes cabos ou armas inteiras, como clavas ou bord?es, assim como escudos. O amieiro ? associado ao ar e seria usado para armas de arremesso, como dardos e azagaias.\n" +
				"\tOs druidas de regi?es que n?o possuem as plantas descritas aqui, tem que escolher outras plantas para usos similares. Por exemplo, um druida de uma regi?o des?rtica valorizaria a ?rvore da i?ca e as plantas de cacto.\n" +
				"\tHabilidade de Conjura??o: Sabedoria ? a sua habilidade para voc? conjurar suas magias de druida, j? que sua magia vem da sua devo??o e sintonia com a natureza. Voc? usa sua Sabedoria sempre que alguma magia se referir a sua habilidade de conjurar magias. Al?m disso, voc? usa o seu modificador de Sabedoria para definir a CD dos testes de resist?ncia para as magias de druida que voc? conjura e quando voc? realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + b?nus de profici?ncia + seu modificador de Sabedoria\n" +
				"\tModificador de ataque de magia = seu b?nus de profici?ncia + seu modificador de Sabedoria\n" +
				"\tConjura??o de Ritual: Voc? pode conjurar qualquer magia de druida que voc? conhe?a como um ritual se ela possuir o descritor ritual.\n" +
				"\tFoco de Conjura??o: Voc? pode usar um foco dru?dico (encontrado no cap?tulo 5) como foco de conjura??o das suas magias de druida.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Forma selvagem", "\tA partir do 2? n?vel, voc? pode usar sua a??o para assumir magicamente a forma de uma besta que voc? j? tenha visto antes. Voc? pode usar essa caracter?stica duas vezes. Voc? recupera os usos quando termina um descanso curto ou longo.\n" +
				"\tSeu n?vel de druida determina as bestas em que voc? pode se transformar, como mostrado na tabela Formas de Besta. No 2? n?vel, por exemplo, voc? pode se transformar em qualquer besta que possui n?vel de desafio 1/4 ou inferior que n?o possua deslocamento de voo ou nata??o.\n" +
				"\tFormas de besta:\n" +
				"\tN?vel	-	ND Max.	-	Limita??es							-	Exemplo\n" +
				"\t2?		-	1/4		-	Sem deslocamento de voo ou nata??o	-	Lobo\n" +
				"\t2?		-	1/2		-	Sem deslocamento de voo				-	Crocodilo\n" +
				"\t2?		-	1		-	-									-	?guia gigante\n" +
				"\tVoc? pode continuar na forma de besta por um n?mero de horas igual ? metade do seu n?vel de druida (arredondado para baixo). Ent?o, voc? volta a sua forma original, a n?o ser que voc? gaste outro uso dessa caracter?stica. Voc? pode reverter a sua forma normal prematuramente usando uma a??o b?nus no seu turno. Voc? reverte automaticamente se cair inconsciente, cair a 0 pontos de vida ou morrer.\n" +
				"\tEnquanto estiver transformado, as seguintes regras se aplicam:" +
				"*\tSuas estat?sticas de jogo s?o substitu?das pelas estat?sticas da besta, mas voc? mantem sua tend?ncia, personalidade e valores de Intelig?ncia, Sabedoria e Carisma. Voc? tamb?m mantem suas profici?ncias em todas as suas per?cias e testes de resist?ncia, al?m de receber as profici?ncias da criatura. Se a criatura possuir a mesma profici?ncia que voc? e o b?nus no bloco de estat?stica dela for maior que o seu, voc? usar? o b?nus da criatura no lugar do seu. Se a criatura possuir qualquer a??o lend?ria ou de covil, voc? n?o pode us?-las.\n" +
				"*\tQuando voc? se transforma, voc? assume os pontos de vida e Dados de Vida da criatura. Quando voc? reverte a sua forma normal, voc? retorna ao n?mero de pontos de vida que tinha antes de se transformar. Por?m, se voc? reverter como resultado de ter ca?do a 0 pontos de vida, todo o dano excedente ser? transferido para a sua forma normal. Por exemplo, se voc? sofrer 10 pontos de dano em forma animal e tiver apenas 1 ponto de vida restante, voc? reverte e sofre 9 de dano. Contanto que o dano excedente n?o reduza voc? a 0 pontos de vida, voc? n?o cair? inconsciente.\n" +
				"*\tVoc? n?o pode conjurar magias e sua capacidade de fala ou de realizar qualquer a??o que requeira m?os s?o limitadas pelas capacidades da forma da besta que voc? assumiu. Transformar-se n?o interrompe sua concentra??o em uma magia que voc? j? tenha conjurado, no entanto, nem previne voc? de realizar a??es que s?o parte da conjura??o, como convocar rel?mpagos que voc? j? tenha conjurado.\n" +
				"*\tVoc? mantem os benef?cios de todas as caracter?sticas de classe, ra?a ou outras fontes, e pode us?-las caso a nova forma seja fisicamente capaz de faz?-lo. No entanto, voc? n?o pode usar qualquer dos seus sentidos especiais, como vis?o no escuro, a n?o ser que a sua nova forma tamb?m tenha esse sentido.\n" +
				"*\tVoc? pode escolher se o seu equipamento cai no ch?o no seu espa?o, ? assimilado a sua nova forma ou ? usado por ela. Equipamentos vestidos e carregados funcionam normalmente, mas o Mestre decide qual equipamento ? vi?vel para a nova forma vestir ou usar, baseado na forma e tamanho da criatura. O seu equipamento n?o muda de forma ou tamanho para se adaptar ? nova forma e, qualquer equipamento que a nova forma n?o possa vestir deve, ou cair no ch?o ou ser assimilado por ela. Equipamentos assimilados n?o ter?o efeito at? voc? deixar a forma.\n\n", 2));
		super.habilidadesAdd(new Habilidade("C?rculo de dru?dico", "\tNo 2? n?vel, voc? escolhe se identificar com um c?rculo de druidas: o C?rculo da Terra ou o C?rculo da Lua, ambos detalhados no final da descri??o da classe. Sua escolha lhe concede caracter?sticas no 2? n?vel e novamente no 6?, 10? e 14? n?vel.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Incremento no valor e habilidade", "\tQuando voc? atinge o 4? n?vel e novamente no 8?, 12?, 16? e 19? n?vel, voc? pode aumentar um valor de habilidade, ? sua escolha, em 2 ou voc? pode aumentar dois valores de habilidade, ? sua escolha, em 1. Como padr?o, voc? n?o pode elevar um valor de habilidade acima de 20 com essa caracter?stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Corpo atemporal", "\tCome?ando no 18? n?vel, a magia primordial que voc? controla faz com que voc? envelhe?a mais lentamente. Para cada 10 anos que passarem, seu corpo envelhece apenas 1.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Magias da besta", "\tA partir do 18? n?vel, voc? pode conjurar muitas das suas magias em qualquer forma que assumir usando a Forma Selvagem. Voc? pode realizar os componentes som?ticos e verbais de uma magia de druida na forma de besta, mas voc? n?o ? capaz de prover os componentes materiais.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Arquidruida", "\tNo 20? n?vel, voc? pode usar sua Forma Selvagem um n?mero ilimitado de vezes.\n" +
				"\tAl?m disso, voc? pode ignorar os componentes verbais e som?ticos das suas magias de druida, assim como qualquer componente material que n?o tenha custo e n?o seja consumido pela magia. Voc? recebe esse benef?cio tanto na sua forma normal, quanto na forma de besta da sua Forma Selvagem.\n\n", 20));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());	
	}
	
	@Override
	public void addMagiasAoBau(Personagem personagem) { }

	public Caminho<Druida> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Druida> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
