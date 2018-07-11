package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Bardo extends Classe implements Magica{
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
		super.habilidadesAdd(new Habilidade("Conjuração", "\tVocê aprendeu a desembaraçar e remodelar o decido da realidade em harmonia com os seus desejos e música. Suas magias são parte do seu vasto repertório, magia que você pode entoar em diferentes situações. Veja o capítulo 10 para as regras gerais de conjuração e o capítulo 11 para a lista de magias de bardo.\n" +
				"\tTruques: Você conhece dois truques, à sua escolha da lista de magias de bardo. Você aprende truques de bardo adicionais, à sua escolha em níveis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Bardo.\n" +
				"\tEspaços de Magia: A tabela O Bardo mostra quantos espaços de magia de 1° nível e superiores você possui disponíveis para conjuração. Para conjurar uma dessas magias, você deve gastar uma espaço de magia do nível da magia ou superior. Você recobra todos os espaços de magia gastos quando você completa um descanso longo. Por exemplo, se você quiser conjurar a magia de 1° nível curar ferimentos e você tiver um espaço de magia de 1° nível e um de 2° nível disponíveis, você poderá conjurar curar ferimentos usando qualquer dos dois espaços.\n" +
				"\tMagias Conhecidas de 1º Nível e Superiores: Você conhece quatro magias de 1° nível, à sua escolha, da lista de magias de bardo. A coluna Magias Conhecidas na tabela O Bardo mostra quando você aprende mais magias de bardo, à sua escolha. Cada uma dessas magias deve ser de um nível a que você tenha acesso, como mostrado na tabela. Por exemplo, quando você alcança o 3° nível da classe, você pode aprender uma nova magia de 1° ou 2° nível. Além disso, quando você adquire um nível nessa classe, você pode escolher uma magia de bardo que você conheça e substituí-la por outra magia da lista de magias de bardo, que também deve ser de um nível ao qual você tenha espaços de magia.\n" +
				"\tHabilidade de Conjuração: Sua habilidade de conjuração é Carisma para suas magias de bardo, portanto, você usa seu Carisma sempre que alguma magia se referir à sua habilidade de conjurar magias. Além disso, você usa o seu modificador de Carisma para definir a CD dos testes de resistência para as magias de bardo que você conjura e quando você realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + bônus de proficiência + seu modificador de Carisma\n" +
				"\tModificador de ataque de magia = seu bônus de proficiência + seu modificador de Carisma\n" +
				"\tConjuração de Ritual: Você pode conjurar qualquer magia de bardo que você conheça como um ritual se ela possuir o descritor ritual.\n" +
				"\tFoco de Conjuração: Você pode usar um instrumento musical (encontrado no capítulo 5) como foco de conjuração das suas magias de bardo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Inspiração de bardo", "\tVocê pode inspirar os outros através de palavras animadoras ou música. Para tanto, você usa uma ação bônus no seu turno para escolher uma outra criatura, que não seja você mesmo, a até 18 metros de você que possa ouvi-lo. Essa criatura ganha um dado de Inspiração de Bardo, um d6.\n" +
				"\tUma vez, nos próximos 10 minutos, a criatura poderá rolar o dado e adicionar o valor rolado a um teste de habilidade, jogada de ataque ou teste de resistência que ela fizer. A criatura pode esperar até rolar o d20 antes de decidir usar o dado de Inspiração de Bardo, mas deve decidir antes do Mestre dizer se a rolagem foi bem ou mal sucedida. Quando o dado de Inspiração de Bardo for rolado, ele é gasto. Uma criatura pode ter apenas um dado de Inspiração de Bardo por vez.\n" +
				"\tVocê pode usar essa característica um número de vezes igual ao seu modificador de Carisma (no mínimo uma vez). Você recupera todos os usos quando termina um descanso longo.\n" +
				"\tSeu dado de Inspiração de Bardo muda quando você atinge certos níveis na classe. O dado se torna um d8 no 5° nível, um d10 no 10° nível e um d12 no 15° nível.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Versatilidade", "\tA partir do 2° nível, você pode adicionar metade do seu bônus de proficiência, arredondado para baixo, em qualquer teste de habilidade que você fizer que ainda não possua seu bônus de proficiência.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Canção de descanso", "\tA partir do 2° nível, você pode usar música ou oração calmantes para ajudar a revitalizar seus aliados feridos durante um descanso curto. Se você ou qualquer criatura amigável que puder ouvir sua atuação recuperar pontos de vida no fim do descanso curto ao gastar um ou mais Dados de Vida, cada uma dessas criaturas recupera 1d6 pontos de vida adicionais.\n" +
				"\tOs pontos de vida adicionais aumentam quando você alcança determinados níveis na classe: para 1d8 no 9° nível, para 1d10 no 13° nível e para 1d12 no 17° nível.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Colégio de bardo", "\tNo 3° nível, você investiga as técnicas avançadas de um colégio de bardo, à sua escolha: o Colégio do Conhecimento ou o Colégio da Bravura, ambos detalhados no final da descrição da classe. Sua escolha lhe concede características no 3° nível e novamente no 6° e 14° nível.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Aptidão", "\tNo 3° nível, escolha duas das perícias em que você é proficiente. Seu bônus de proficiência é dobrado em qualquer teste de habilidade que você fizer que utilize qualquer das perícias escolhidas.\n" +
				"\tNo 10° nível, você escolhe mais duas perícias em que é proficiente para ganhar esse benefício.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Fonte de inspiração", "\tComeçando no momento em que você atinge o 5° nível, você recupera todos as utilizações gastas da sua Inspiração de Bardo quando você termina um descanso curto ou longo.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Canção de proteção", "\tNo 6° nível, você adquire a habilidade de usar notas musicais ou palavras de poder para interromper efeito de influência mental. Com uma ação, você pode começar uma atuação que dura até o fim do seu próximo turno. Durante esse tempo, você e qualquer criatura amigável a até 9 metros de você terá vantagem em testes de resistência para não ser amedrontado ou enfeitiçado. Uma criatura deve ser capaz de ouvir você para receber esse benefício. A atuação termina prematuramente se você for incapacitado ou silenciado ou se você terminá-la voluntariamente (não requer ação).\n\n", 6));
		super.habilidadesAdd(new Habilidade("Segredos mágicos", "\tNo 10° nível, você usurpou conhecimento mágico de um vasto espectro de disciplinas. Escolha duas magias de qualquer classe, incluindo essa. A magia que você escolher deve ser de um nível que você possa conjurar, como mostrado na tabela O Bardo, ou um truque.\n" +
				"\tAs magias escolhidas contam como magias de bardo para você e já estão incluídas no número da coluna Magias Conhecidas da tabela O Bardo.\n" +
				"\tVocê aprende duas magias adicionais de qualquer classe no 14° nível e novamente no 18° nível.\n\n", 10));
		super.habilidadesAdd(new Habilidade("Inspiração superior", "\tNo 20° nível, quando você rolar iniciativa e não tiver nenhum uso restante de Inspiração de Bardo, você recupera um uso.\n\n", 20));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());		
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		// TODO Auto-generated method stub
		
	}
	
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
