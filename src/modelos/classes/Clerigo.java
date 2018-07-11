package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Clerigo extends Classe implements Magica{
	private Caminho<Clerigo> caminho;

	@Override
	public String toString() {
		return "Clérigo";
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
		// TODO Auto-generated method stub	
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
		super.habilidadesAdd(new Habilidade("Conjuração", "\tComo um canalizador de poder divino, você pode conjurar magias de clérigo. Veja o capítulo 10 para as regras gerais de conjuração e o capítulo 11 para a lista de magias de clérigo.\n" + 
				"\tTruques: Você conhece três truques, à sua escolha, da lista de magias de clérigo. Você aprende truques de clérigo adicionais, à sua escolha, em níveis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Clérigo.\n" +
				"\tPreparando e Conjurando Magias: A tabela O Clérigo mostra quantos espaços de magia você têm para conjurar suas magias de 1º nível e superiores. Para conjurar uma dessas magias, você precisa gastar um espaço do nível da magia ou superior. Você recupera todos os espaços gastos quando termina um descanso longo. Você prepara a lista de magias disponíveis selecionando-as da lista de magias de clérigo. Você seleciona um número de magias igual ao seu modificador de Sabedoria + seu nível de clérigo (mínimo de uma magia). Essas magias devem ser de níveis que você possua espaços de magia. Por exemplo, se você é um clérigo de 3º nível, você possui quatro espaços de magia de 1º nível e dois de 2º nível. Com Sabedoria 16, sua lista de magias preparadas pode incluir 6 magias, combinando as de 1º e 2º nível em qualquer ordem. Se você preparar a magia de 1º nível curar ferimentos, você pode conjurá-la com um espaço de magia de 1º ou de 2º nível. Ao conjurar a magia, você não a retira de sua lista de magias preparadas, podendo conjurá-la de novo se tiver espaços de magia disponíveis. Você pode modificar a sua lista de magias preparadas quando termina um descanso longo. Preparar uma nova lista de magias de clérigo requer tempo gasto em preces e meditação: no mínimo 1 minuto por nível de magia para cada magia preparada.\n" +
				"\tHabilidade de Conjuração: Sabedoria é a sua habilidade para você conjurar suas magias de clérigo. O poder de suas magias vem da devoção que você tem ao seu deus. Você usa sua Sabedoria sempre que alguma magia se referir a sua habilidade de conjurar magias. Além disso, você usa o seu modificador de Sabedoria para definir a CD dos testes de resistência para as magias de clérigo que você conjura e quando você realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + bônus de proficiência + seu modificador de Sabedoria\n" +
				"\tModificador de ataque de magia = seu bônus de proficiência + seu modificador de Sabedoria\n" +
				"\tConjuração de Ritual: Você pode conjurar qualquer magia de druida que você conheça como um ritual se ela possuir o descritor ritual.\n" +
				"\tFoco de Conjuração: Você pode usar um símbolo sagrado (encontrado no capítulo 5) como foco de conjuração das suas magias de clérigo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Domínio divino", "\tEscolha um domínio relacionado à sua divindade: Conhecimento, Enganação, Guerra, Luz, Natureza, Tempestade ou Vida. Cada domínio é detalhado ao final da descrição da classe e, cada um, fornece exemplos dos deuses associados a eles. Essa escolha, realizada no 1º nível, concede magias de domínio e outras características.\n" +
				"\tEla também concede a você outras formas de utilizar seu Canalizar Divindade quando você ganhá-lo no 2º nível, bem como outros benefícios no 6º, 8º e 17º níveis.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Canalizar divindade", "\tNo 2º nível, você se torna capaz de canalizar energia diretamente de sua divindade, utilizando-a como combustível para efeitos mágicos. Você começa com dois efeitos: Expulsar Mortos-vivos e um efeito determinado pelo seu domínio. Alguns domínios conferem efeitos adicionais conforme você avança de nível, como consta na descrição de cada domínio.\n" +
				"\tQuando você usar seu Canalizar Divindade, você escolhe qual efeito quer criar. Você precisa terminar um descanso curto ou longo para usar a característica de novo.\n" +
				"\tAlguns efeitos requerem teste de resistência. Quando você usar um desses efeitos, a CD é igual a das suas magias de clérigo.\n" +
				"\tA partir do 6º nível, você pode Canalizar Divindade duas vezes entre descansos e a partir do 18º nível, três vezes. Você recupera os usos dessa característica quando termina um descanso curto ou longo.\n" +
				"\tCanalizar Divindade: Expulsar Mortos-Vivos: Usando uma ação, você levanta seu símbolo sagrado e murmura uma prece repreendendo os mortos-vivos. Cada morto-vivo que puder ver ou ouvir você em um raio de 9 metros a partir de você, deve fazer um teste de resistência de Sabedoria. Se falhar, a criatura está expulsa por 1 minuto ou até sofrer algum dano.\n" +
				"\tUma criatura expulsa deve usar seu turno para fugir da melhor forma possível e de forma alguma pode aproximar-se a mais de 9 metros de você por vontade própria. Ela também não pode usar reações. Como uma ação, a criatura pode apenas realizar uma Disparada ou tentar escapar de um efeito que a impeça de se mover. Se não há lugar para ir, a criatura pode usar a ação Esquivar.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Destruir mortos vivos", "\tA partir do 5º nível, quando um morto-vivo falhar no teste de resistência contra a sua característica Expulsar Mortos-vivos, ele é instantaneamente destruído se o Nível de Desafio dele for menor ou igual ao valor da tabela Destruir Mortos-vivos, de acordo com seu nível de clérigo.\n" +
				"\tNível 5 - Mortos Vivos de ND 1/2 ou menor\n" +
				"\tNível 8 - Mortos Vivos de ND 1 ou menor\n" +
				"\tNível 11 - Mortos Vivos de ND 2 ou menor\n" +
				"\tNível 14 - Mortos Vivos de ND 3 ou menor\n" +
				"\tNível 17 - Mortos Vivos de ND 4 ou menor\n\n", 5));
		super.habilidadesAdd(new Habilidade("Intervenção divina", "\tA partir do 10º nível, você pode rogar à sua divindade para que auxilie você em uma árdua tarefa.\n" +
				"\tImplorar pelo auxílio requer uma ação. Você precisa descrever o que busca e realizar uma rolagem de dado de percentagem. Se o resultado for menor ou igual ao seu nível de clérigo, sua divindade intervém. O Mestre escolhe a natureza da intervenção. O efeito de qualquer magia de clérigo ou magia de domínio é apropriado como resultado.\n" +
				"\tSe sua divindade intervir, você fica impedido de usar essa característica de novo por 7 dias. Do contrário, você pode usá-la de novo após terminar um descanso longo.\n" +
				"\tNo 20º nível, seus pedidos de intervenção funcionam automaticamente, sem necessidade de rolagem de dados.\n\n", 10));		
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
	
	public Caminho<Clerigo> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Clerigo> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}