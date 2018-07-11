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
	protected void setTabela() {}
	
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
		//TODO: Extrair strings para um XML
		super.habilidadesAdd(new Habilidade("Conjura��o", "\tUm evento do seu passado ou na vida de um parente ou ancestral, deixou uma marca indel�vel em voc�, infundindo voc� com magia arcana. A fonte desse poder, independente da sua origem, flui em suas magias. Veja o cap�tulo 10 para as regras gerais de conjura��o e o cap�tulo 11 para a lista de magias de feiticeiro.\n" +
				"\tTruques: Voc� conhece quatro truques, � sua escolha, da lista de magias de feiticeiro. Voc� aprende truques de feiticeiro adicionais, � sua escolha, em n�veis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Feiticeiro.\n" +
				"\tEspa�os de Magia: A tabela O Feiticeiro mostra quantos espa�os de magia de 1� n�vel e superiores voc� possui dispon�veis para conjura��o. Para conjurar uma dessas magias, voc� deve gastar uma espa�o de magia do n�vel da magia ou superior. Voc� recobra todos os espa�os de magia gastos quando voc� completa um descanso longo. Por exemplo, se voc� quiser conjurar a magia de 1� n�vel m�os flamejantes e voc� tiver um espa�o de magia de 1� n�vel e um de 2� n�vel dispon�veis, voc� poder� conjurar m�os flamejantes usando qualquer dos dois espa�os.\n" +
				"\tMagias Conhecidas de 1� N�vel e Superiores: Voc� conhece duas magias de 1� n�vel, � sua escolha, da lista de magias de feiticeiro. A coluna Magias Conhecidas na tabela O Feiticeiro mostra quando voc� aprende mais magias de feiticeiro, � sua escolha. Cada uma dessas magias deve ser de um n�vel a que voc� tenha acesso, como mostrado na tabela. Por exemplo, quando voc� alcan�a o 3� n�vel da classe, voc� pode aprender uma nova magia de 1� ou 2� n�vel. Al�m disso, quando voc� adquire um n�vel nessa classe, voc� pode escolher uma magia de feiticeiro que voc� conhe�a e substitu�-la por outra magia da lista de magias de feiticeiro, que tamb�m deve ser de um n�vel ao qual voc� tenha espa�os de magia.\n" +
				"\tHabilidade de Conjura��o: Carisma � a sua habilidade de conjura��o para suas magias de feiticeiro, j� que o poder da sua magia depende da sua capacidade de projetar sua vontade no mundo. Use seu Carisma sempre que alguma magia se referir � sua habilidade de conjurar magias. Al�m disso, voc� usa o seu modificador de Carisma para definir a CD dos testes de resist�ncia para as magias de feiticeiro que voc� conjura e quando voc� realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + b�nus de profici�ncia + seu modificador de Carisma\n" +
				"\tModificador de ataque de magia = seu b�nus de profici�ncia + seu modificador de Carisma\n" +
				"\tFoco de Conjura��o: Voc� pode usar um foco arcano (encontrado no cap�tulo 5) como foco de conjura��o das suas magias de feiticeiro.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Origem de feiti�aria", "\tEscolha uma origem de feiti�aria, que descreve a fonte do seu poder m�gico inato: Linhagem Drac�nica ou Magia Selvagem.\n" +
				"\tSua escolha lhe confere caracter�sticas quando voc� a escolhe, no 1� n�vel e novamente no 6�, 14� e 18� n�vel.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Fonte de magia", "\tNo 2� n�vel, voc� alcan�a uma profunda fonte de magia dentro de voc�. Essa fonte � representada pelos pontos de feiti�aria, que permitem que voc� crie uma variedade de efeitos m�gicos.\n" + 
				"\tPontos de Feiti�aria: Voc� tem 2 pontos de feiti�aria e ganha mais a medida que alcan�a n�veis elevados, como mostrado na coluna Pontos de Feiti�aria da tabela O Feiticeiro. Voc� nunca poder� ter mais pontos de feiti�aria que os mostrados na tabela para o seu n�vel. Voc� recupera todos os pontos de feiti�aria gastos quando termina um descanso longo.\n" +
				"\tConjura��o Flex�vel: Voc� pode usar seus pontos de feitiaria para ganhar novos espa�os de magia ou sacrificar espa�os de magia para ganhar pontos de magia adicionais. Voc� aprende novas formas de usar seus pontos de feiti�aria quando alcan�a n�veis elevados. Os espa�os de magia criados desaparecem ao final de um descanso longo.\n" +
				"\tCriando Espa�os de Magia. Voc� pode transformar pontos de magia dispon�veis em um espa�o de magia, com uma a��o b�nus, no seu turno. A tabela Criando Espa�os de Magia mostra o custo para criar um espa�o de magia de determinado n�vel. Voc� n�o pode criar espa�os de magia acima do 5� n�vel.\n" +
				"\tN�vel de Espa�o de Magia	-	Custo de Pontos de Feiti�aria\n" +
				"\t1� 						-	2\n" +
				"\t2� 						-	3\n" +
				"\t3� 						-	5\n" +
				"\t4� 						-	6\n" +
				"\t5� 						-	7\n" +
				"\tConvertendo um Espa�o de Magia em Pontos de Feiti�aria. Com uma a��o b�nus, no seu turno, voc� pode gastar um espa�o de magia dispon�vel e ganhar uma quantidade de pontos de feiti�aria igual ao n�vel do espa�o.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Metam�gica", "\tNo 3� n�vel, voc� adquire a habilidade de distorcer suas magias para se adequarem �s suas necessidades. Voc� ganha duas das seguintes op��es de Metam�gica, � sua escolha. Voc� adquire outra no 10� e 17� n�vel.\n" +
				"\tVoc� pode usar apenas uma op��o de Metam�gica em uma magia quando a conjura, a n�o ser que esteja descrito o contr�rio." + 
				"\tMagia Acelerada: Quando voc� conjurar uma magia que tenha um tempo de conjura��o de 1 a��o, voc� pode gastar 2 pontos de feiti�aria para mudar o tempo de conjura��o para 1 a��o b�nus para essa magia.\n" +
				"\tMagia Aumentada: Quando voc� conjura uma magia que obriga uma criatura a realizar um teste de resist�ncia contra o seu efeito, voc� pode gastar 3 pontos de feiti�aria para dar desvantagem a um alvo da magia no primeiro teste de resist�ncia feito contra ela.\n" +
				"\tMagia Cuidadosa: Quando voc� conjurar uma magia que obriga outras criaturas a realizarem um teste de resist�ncia, voc� pode proteger algumas dessas criaturas da for�a total da magia. Para tanto, voc� gasta 1 ponto de feiti�aria e escolhe um n�mero dessas criaturas at� o seu modificador de Carisma (m�nimo de uma criatura). Uma criatura escolhida passa automaticamente no teste de resist�ncia contra a magia.\n" +
				"\tMagia Distante: Quando voc� conjurar uma magia que tenha dist�ncia de 1,5 metro ou maior, voc� pode gastar 1 ponto de feiti�aria para dobrar o alcance da magia. Quando voc� conjura uma magia com alcance de toque, voc� pode gastar 1 ponto de feiti�aria para mudar o alcance da magia para 9 metros.\n" +
				"\tMagia Duplicada: Quando voc� conjurar uma magia que seja incapaz de ter mais de uma criatura como alvo no n�vel atual dela e n�o possua alcance pessoal, voc� pode gastar um n�mero de pontos de feiti�aria igual ao n�vel da magia para ter uma segunda criatura, no alcance da magia, como alvo (1 ponto de feiti�aria se a magia for um truque).\n" +
				"\tMagia Estendida: Quando voc� conjurar uma magia que tenha dura��o de 1 minuto ou maior, voc� pode gastar 1 ponto de feiti�aria para dobrar sua dura��o, at� uma dura��o m�xima de 24 horas.\n" +
				"\tMagia Potencializada: Quando voc� rola o dano de uma magia, voc� pode gastar 1 ponto de feiti�aria para jogar novamente um n�mero de dados de dano, at� seu modificador de Carisma (m�nimo de um). Voc� deve usar a nova rolagem. Voc� pode usar Magia Potencializada mesmo que voc� j� tenha usado uma op��o diferente de Metam�gica durante a conjura��o da magia.\n" +
				"\tMagia Sutil: Quando voc� conjurar uma magia, voc� pode gastar 1 ponto de feiti�aria para faz�-lo sem qualquer componente som�tico ou verbal.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16� e 19� n�vel, voc� pode aumentar um valor de habilidade, � sua escolha, em 2 ou voc� pode aumentar dois valores de habilidade, � sua escolha, em 1. Como padr�o, voc� n�o pode elevar um valor de habilidade acima de 20 com essa caracter�stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Restaura��o m�stica", "\tNo 20� n�vel, voc� recupera 4 pontos de feiti�aria gastos sempre que voc� terminar um descanso curto.\n\n", 20));
	}
	
	@Override
	public void addMagiasAoBau(Personagem personagem) {}
	
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