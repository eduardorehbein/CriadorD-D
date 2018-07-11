package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Feiticeiro extends Classe implements Magica{
	private Caminho<Feiticeiro> caminho;
	
	@Override
	public String toString() {
		return "Feiticeiro";
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
			
	}

	@Override
	protected void setPvInicial(Personagem personagem) {
		personagem.setPv(6 + personagem.getModificadorConstituicao());
		if(personagem.getNivel() > 1) {
			for(int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}	
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD6() + personagem.getModificadorConstituicao());	
	}

	@Override
	protected void setHabilidades() {
		super.habilidadesAdd(new Habilidade("Conjuração", "\tUm evento do seu passado ou na vida de um parente ou ancestral, deixou uma marca indelével em você, infundindo você com magia arcana. A fonte desse poder, independente da sua origem, flui em suas magias. Veja o capítulo 10 para as regras gerais de conjuração e o capítulo 11 para a lista de magias de feiticeiro.\n" +
				"\tTruques: Você conhece quatro truques, à sua escolha, da lista de magias de feiticeiro. Você aprende truques de feiticeiro adicionais, à sua escolha, em níveis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Feiticeiro.\n" +
				"\tEspaços de Magia: A tabela O Feiticeiro mostra quantos espaços de magia de 1° nível e superiores você possui disponíveis para conjuração. Para conjurar uma dessas magias, você deve gastar uma espaço de magia do nível da magia ou superior. Você recobra todos os espaços de magia gastos quando você completa um descanso longo. Por exemplo, se você quiser conjurar a magia de 1° nível mãos flamejantes e você tiver um espaço de magia de 1° nível e um de 2° nível disponíveis, você poderá conjurar mãos flamejantes usando qualquer dos dois espaços.\n" +
				"\tMagias Conhecidas de 1º Nível e Superiores: Você conhece duas magias de 1° nível, à sua escolha, da lista de magias de feiticeiro. A coluna Magias Conhecidas na tabela O Feiticeiro mostra quando você aprende mais magias de feiticeiro, à sua escolha. Cada uma dessas magias deve ser de um nível a que você tenha acesso, como mostrado na tabela. Por exemplo, quando você alcança o 3° nível da classe, você pode aprender uma nova magia de 1° ou 2° nível. Além disso, quando você adquire um nível nessa classe, você pode escolher uma magia de feiticeiro que você conheça e substituí-la por outra magia da lista de magias de feiticeiro, que também deve ser de um nível ao qual você tenha espaços de magia.\n" +
				"\tHabilidade de Conjuração: Carisma é a sua habilidade de conjuração para suas magias de feiticeiro, já que o poder da sua magia depende da sua capacidade de projetar sua vontade no mundo. Use seu Carisma sempre que alguma magia se referir à sua habilidade de conjurar magias. Além disso, você usa o seu modificador de Carisma para definir a CD dos testes de resistência para as magias de feiticeiro que você conjura e quando você realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + bônus de proficiência + seu modificador de Carisma\n" +
				"\tModificador de ataque de magia = seu bônus de proficiência + seu modificador de Carisma\n" +
				"\tFoco de Conjuração: Você pode usar um foco arcano (encontrado no capítulo 5) como foco de conjuração das suas magias de feiticeiro.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Origem de feitiçaria", "\tEscolha uma origem de feitiçaria, que descreve a fonte do seu poder mágico inato: Linhagem Dracônica ou Magia Selvagem.\n" +
				"\tSua escolha lhe confere características quando você a escolhe, no 1° nível e novamente no 6°, 14° e 18° nível.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Fonte de magia", "\tNo 2° nível, você alcança uma profunda fonte de magia dentro de você. Essa fonte é representada pelos pontos de feitiçaria, que permitem que você crie uma variedade de efeitos mágicos.\n" + 
				"\tPontos de Feitiçaria: Você tem 2 pontos de feitiçaria e ganha mais a medida que alcança níveis elevados, como mostrado na coluna Pontos de Feitiçaria da tabela O Feiticeiro. Você nunca poderá ter mais pontos de feitiçaria que os mostrados na tabela para o seu nível. Você recupera todos os pontos de feitiçaria gastos quando termina um descanso longo.\n" +
				"\tConjuração Flexível: Você pode usar seus pontos de feitiaria para ganhar novos espaços de magia ou sacrificar espaços de magia para ganhar pontos de magia adicionais. Você aprende novas formas de usar seus pontos de feitiçaria quando alcança níveis elevados. Os espaços de magia criados desaparecem ao final de um descanso longo.\n" +
				"\tCriando Espaços de Magia. Você pode transformar pontos de magia disponíveis em um espaço de magia, com uma ação bônus, no seu turno. A tabela Criando Espaços de Magia mostra o custo para criar um espaço de magia de determinado nível. Você não pode criar espaços de magia acima do 5° nível.\n" +
				"\tNível de Espaço de Magia	-	Custo de Pontos de Feitiçaria\n" +
				"\t1° 						-	2\n" +
				"\t2° 						-	3\n" +
				"\t3° 						-	5\n" +
				"\t4° 						-	6\n" +
				"\t5° 						-	7\n" +
				"\tConvertendo um Espaço de Magia em Pontos de Feitiçaria. Com uma ação bônus, no seu turno, você pode gastar um espaço de magia disponível e ganhar uma quantidade de pontos de feitiçaria igual ao nível do espaço.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Metamágica", "\tNo 3° nível, você adquire a habilidade de distorcer suas magias para se adequarem às suas necessidades. Você ganha duas das seguintes opções de Metamágica, à sua escolha. Você adquire outra no 10° e 17° nível.\n" +
				"\tVocê pode usar apenas uma opção de Metamágica em uma magia quando a conjura, a não ser que esteja descrito o contrário." + 
				"\tMagia Acelerada: Quando você conjurar uma magia que tenha um tempo de conjuração de 1 ação, você pode gastar 2 pontos de feitiçaria para mudar o tempo de conjuração para 1 ação bônus para essa magia.\n" +
				"\tMagia Aumentada: Quando você conjura uma magia que obriga uma criatura a realizar um teste de resistência contra o seu efeito, você pode gastar 3 pontos de feitiçaria para dar desvantagem a um alvo da magia no primeiro teste de resistência feito contra ela.\n" +
				"\tMagia Cuidadosa: Quando você conjurar uma magia que obriga outras criaturas a realizarem um teste de resistência, você pode proteger algumas dessas criaturas da força total da magia. Para tanto, você gasta 1 ponto de feitiçaria e escolhe um número dessas criaturas até o seu modificador de Carisma (mínimo de uma criatura). Uma criatura escolhida passa automaticamente no teste de resistência contra a magia.\n" +
				"\tMagia Distante: Quando você conjurar uma magia que tenha distância de 1,5 metro ou maior, você pode gastar 1 ponto de feitiçaria para dobrar o alcance da magia. Quando você conjura uma magia com alcance de toque, você pode gastar 1 ponto de feitiçaria para mudar o alcance da magia para 9 metros.\n" +
				"\tMagia Duplicada: Quando você conjurar uma magia que seja incapaz de ter mais de uma criatura como alvo no nível atual dela e não possua alcance pessoal, você pode gastar um número de pontos de feitiçaria igual ao nível da magia para ter uma segunda criatura, no alcance da magia, como alvo (1 ponto de feitiçaria se a magia for um truque).\n" +
				"\tMagia Estendida: Quando você conjurar uma magia que tenha duração de 1 minuto ou maior, você pode gastar 1 ponto de feitiçaria para dobrar sua duração, até uma duração máxima de 24 horas.\n" +
				"\tMagia Potencializada: Quando você rola o dano de uma magia, você pode gastar 1 ponto de feitiçaria para jogar novamente um número de dados de dano, até seu modificador de Carisma (mínimo de um). Você deve usar a nova rolagem. Você pode usar Magia Potencializada mesmo que você já tenha usado uma opção diferente de Metamágica durante a conjuração da magia.\n" +
				"\tMagia Sutil: Quando você conjurar uma magia, você pode gastar 1 ponto de feitiçaria para fazê-lo sem qualquer componente somático ou verbal.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Restauração mística", "\tNo 20° nível, você recupera 4 pontos de feitiçaria gastos sempre que você terminar um descanso curto.\n\n", 20));
	}
	
	@Override
	public void addMagiasAoBau(Personagem personagem) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());
	}

	public Caminho<Feiticeiro> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Feiticeiro> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}