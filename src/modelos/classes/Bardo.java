package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Bardo extends Classe implements Magica{
	//TODO: Corrigir strings defeituosas
	private Caminho<Bardo> caminho;

	@Override
	public String toString() {
		return "Bardo";
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
		super.habilidadesAdd(new Habilidade("Conjura??o", "\tVoc? aprendeu a desembara?ar e remodelar o decido da realidade em harmonia com os seus desejos e m?sica. Suas magias s?o parte do seu vasto repert?rio, magia que voc? pode entoar em diferentes situa??es. Veja o cap?tulo 10 para as regras gerais de conjura??o e o cap?tulo 11 para a lista de magias de bardo.\n" +
				"\tTruques: Voc? conhece dois truques, ? sua escolha da lista de magias de bardo. Voc? aprende truques de bardo adicionais, ? sua escolha em n?veis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Bardo.\n" +
				"\tEspa?os de Magia: A tabela O Bardo mostra quantos espa?os de magia de 1? n?vel e superiores voc? possui dispon?veis para conjura??o. Para conjurar uma dessas magias, voc? deve gastar uma espa?o de magia do n?vel da magia ou superior. Voc? recobra todos os espa?os de magia gastos quando voc? completa um descanso longo. Por exemplo, se voc? quiser conjurar a magia de 1? n?vel curar ferimentos e voc? tiver um espa?o de magia de 1? n?vel e um de 2? n?vel dispon?veis, voc? poder? conjurar curar ferimentos usando qualquer dos dois espa?os.\n" +
				"\tMagias Conhecidas de 1? N?vel e Superiores: Voc? conhece quatro magias de 1? n?vel, ? sua escolha, da lista de magias de bardo. A coluna Magias Conhecidas na tabela O Bardo mostra quando voc? aprende mais magias de bardo, ? sua escolha. Cada uma dessas magias deve ser de um n?vel a que voc? tenha acesso, como mostrado na tabela. Por exemplo, quando voc? alcan?a o 3? n?vel da classe, voc? pode aprender uma nova magia de 1? ou 2? n?vel. Al?m disso, quando voc? adquire um n?vel nessa classe, voc? pode escolher uma magia de bardo que voc? conhe?a e substitu?-la por outra magia da lista de magias de bardo, que tamb?m deve ser de um n?vel ao qual voc? tenha espa?os de magia.\n" +
				"\tHabilidade de Conjura??o: Sua habilidade de conjura??o ? Carisma para suas magias de bardo, portanto, voc? usa seu Carisma sempre que alguma magia se referir ? sua habilidade de conjurar magias. Al?m disso, voc? usa o seu modificador de Carisma para definir a CD dos testes de resist?ncia para as magias de bardo que voc? conjura e quando voc? realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + b?nus de profici?ncia + seu modificador de Carisma\n" +
				"\tModificador de ataque de magia = seu b?nus de profici?ncia + seu modificador de Carisma\n" +
				"\tConjura??o de Ritual: Voc? pode conjurar qualquer magia de bardo que voc? conhe?a como um ritual se ela possuir o descritor ritual.\n" +
				"\tFoco de Conjura??o: Voc? pode usar um instrumento musical (encontrado no cap?tulo 5) como foco de conjura??o das suas magias de bardo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Inspira??o de bardo", "\tVoc? pode inspirar os outros atrav?s de palavras animadoras ou m?sica. Para tanto, voc? usa uma a??o b?nus no seu turno para escolher uma outra criatura, que n?o seja voc? mesmo, a at? 18 metros de voc? que possa ouvi-lo. Essa criatura ganha um dado de Inspira??o de Bardo, um d6.\n" +
				"\tUma vez, nos pr?ximos 10 minutos, a criatura poder? rolar o dado e adicionar o valor rolado a um teste de habilidade, jogada de ataque ou teste de resist?ncia que ela fizer. A criatura pode esperar at? rolar o d20 antes de decidir usar o dado de Inspira??o de Bardo, mas deve decidir antes do Mestre dizer se a rolagem foi bem ou mal sucedida. Quando o dado de Inspira??o de Bardo for rolado, ele ? gasto. Uma criatura pode ter apenas um dado de Inspira??o de Bardo por vez.\n" +
				"\tVoc? pode usar essa caracter?stica um n?mero de vezes igual ao seu modificador de Carisma (no m?nimo uma vez). Voc? recupera todos os usos quando termina um descanso longo.\n" +
				"\tSeu dado de Inspira??o de Bardo muda quando voc? atinge certos n?veis na classe. O dado se torna um d8 no 5? n?vel, um d10 no 10? n?vel e um d12 no 15? n?vel.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Versatilidade", "\tA partir do 2? n?vel, voc? pode adicionar metade do seu b?nus de profici?ncia, arredondado para baixo, em qualquer teste de habilidade que voc? fizer que ainda n?o possua seu b?nus de profici?ncia.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Can??o de descanso", "\tA partir do 2? n?vel, voc? pode usar m?sica ou ora??o calmantes para ajudar a revitalizar seus aliados feridos durante um descanso curto. Se voc? ou qualquer criatura amig?vel que puder ouvir sua atua??o recuperar pontos de vida no fim do descanso curto ao gastar um ou mais Dados de Vida, cada uma dessas criaturas recupera 1d6 pontos de vida adicionais.\n" +
				"\tOs pontos de vida adicionais aumentam quando voc? alcan?a determinados n?veis na classe: para 1d8 no 9? n?vel, para 1d10 no 13? n?vel e para 1d12 no 17? n?vel.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Col?gio de bardo", "\tNo 3? n?vel, voc? investiga as t?cnicas avan?adas de um col?gio de bardo, ? sua escolha: o Col?gio do Conhecimento ou o Col?gio da Bravura, ambos detalhados no final da descri??o da classe. Sua escolha lhe concede caracter?sticas no 3? n?vel e novamente no 6? e 14? n?vel.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Aptid?o", "\tNo 3? n?vel, escolha duas das per?cias em que voc? ? proficiente. Seu b?nus de profici?ncia ? dobrado em qualquer teste de habilidade que voc? fizer que utilize qualquer das per?cias escolhidas.\n" +
				"\tNo 10? n?vel, voc? escolhe mais duas per?cias em que ? proficiente para ganhar esse benef?cio.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc? atinge o 4? n?vel e novamente no 8?, 12?, 16? e 19? n?vel, voc? pode aumentar um valor de habilidade, ? sua escolha, em 2 ou voc? pode aumentar dois valores de habilidade, ? sua escolha, em 1. Como padr?o, voc? n?o pode elevar um valor de habilidade acima de 20 com essa caracter?stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Fonte de inspira??o", "\tCome?ando no momento em que voc? atinge o 5? n?vel, voc? recupera todos as utiliza??es gastas da sua Inspira??o de Bardo quando voc? termina um descanso curto ou longo.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Can??o de prote??o", "\tNo 6? n?vel, voc? adquire a habilidade de usar notas musicais ou palavras de poder para interromper efeito de influ?ncia mental. Com uma a??o, voc? pode come?ar uma atua??o que dura at? o fim do seu pr?ximo turno. Durante esse tempo, voc? e qualquer criatura amig?vel a at? 9 metros de voc? ter? vantagem em testes de resist?ncia para n?o ser amedrontado ou enfeiti?ado. Uma criatura deve ser capaz de ouvir voc? para receber esse benef?cio. A atua??o termina prematuramente se voc? for incapacitado ou silenciado ou se voc? termin?-la voluntariamente (n?o requer a??o).\n\n", 6));
		super.habilidadesAdd(new Habilidade("Segredos m?gicos", "\tNo 10? n?vel, voc? usurpou conhecimento m?gico de um vasto espectro de disciplinas. Escolha duas magias de qualquer classe, incluindo essa. A magia que voc? escolher deve ser de um n?vel que voc? possa conjurar, como mostrado na tabela O Bardo, ou um truque.\n" +
				"\tAs magias escolhidas contam como magias de bardo para voc? e j? est?o inclu?das no n?mero da coluna Magias Conhecidas da tabela O Bardo.\n" +
				"\tVoc? aprende duas magias adicionais de qualquer classe no 14? n?vel e novamente no 18? n?vel.\n\n", 10));
		super.habilidadesAdd(new Habilidade("Inspira??o superior", "\tNo 20? n?vel, quando voc? rolar iniciativa e n?o tiver nenhum uso restante de Inspira??o de Bardo, voc? recupera um uso.\n\n", 20));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());		
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) { }
	
	public Caminho<Bardo> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Bardo> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
