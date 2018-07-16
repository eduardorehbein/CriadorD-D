package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Paladino extends Classe implements Magica{
	private Caminho<Paladino> caminho;
	
	@Override
	public String toString() {
		return "Paladino";
	}
	
	@Override
	public void inicializa(Personagem personagem) {
		super.inicializa(personagem);
		addMagiasAoBau(personagem);
	}

	@Override
	protected void setTabela() {}
	
	@Override
	public void setEquipamentoInicial(Personagem personagem) {}

	@Override
	protected void setPvInicial(Personagem personagem) {
		personagem.setPv(10 + personagem.getModificadorConstituicao());
		if(personagem.getNivel() > 1) {
			for(int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD10() + personagem.getModificadorConstituicao());
	}

	@Override
	protected void setHabilidades() {
		//TODO: Extrair strings para um XML
		super.habilidadesAdd(new Habilidade("Sentido divino", "\tA presença de um mal poderoso é registrada nos seus sentidos como um odor nocivo e o bem poderoso badala como música celestial nos seus ouvidos. Com uma ação, você pode expandir sua consciência para detectar tais forças. Até o final do seu próximo turno, você sabe a localização de qualquer celestial, corruptor ou morto-vivo a 18 metros de você que não esteja com cobertura total. Você sabe o tipo (celestial, corruptor ou morto-vivo) de qualquer ser cuja presença você sentiu, mas não sua identidade (o vampiro Conde Strahd von Zarovish, por exemplo). Dentro do mesmo raio, você também detecta a presença de qualquer lugar ou objeto que tenha sido consagrado ou conspurcado, como pela magia consagrar.\n" +
				"\tVocê pode usar essa característica um número de vezes igual a 1 + seu modificador de Carisma. Quando você concluir um descanso longo, você recupera todos os usos gastos.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Cura pelas mãos", "\tSeu toque abençoado pode curar ferimentos. Você tem um poço de poder curativo que se enche quando você realiza um descanso longo. Com esse poço, você pode restaurar um número total de pontos de vida igual ao seu nível de paladino x 5.\n" +
				"\tCom uma ação, você pode tocar uma criatura e sugar poder do seu poço para restaurar um número de pontos de vida da criatura, até o máximo de pontos restantes no poço.\n" +
				"\tAlternativamente, você pode gastar 5 pontos de cura do seu poço de cura para curar o alvo de uma doença ou neutralizar um veneno que o esteja afetando. Você pode curar múltiplas doenças e neutralizar múltiplos venenos com um único uso de Cura pelas Mãos, gastando pontos de vida separadamente para cada um.\n" +
				"\tEssa característica não gera nenhum efeito em mortos-vivos e constructos.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Estilo de luta", "\tNo 2° nível, você adota um estilo de combate particular que será sua especialidade. Escolha uma das opções a seguir. Você não pode escolher o mesmo Estilo de Combate mais de uma vez, mesmo se puder escolher de novo.\n" +
				"\tCombate com armas grandes: Quando você rolar um 1 ou um 2 num dado de dano de um ataque com arma corpo-a-corpo que você esteja empunhando com duas mãos, você pode rolar o dado novamente e usar a nova rolagem, mesmo que resulte em 1 ou 2. A arma deve ter a propriedade duas mãos ou versátil para ganhar esse benefício.\n" + 
				"\tDefesa: Enquanto estiver usando armadura, você ganha +1 de bônus em sua CA.\n" +
				"\tDuelismo: Quando você empunhar uma arma de ataque corpo-a-corpo em uma mão e nenhuma outra arma, você ganha +2 de bônus nas jogadas de dano com essa arma.\n" +
				"\tProteção: Quando uma criatura que você possa ver atacar um alvo que esteja a até 1,5 metro de você, você pode usar sua reação para impor desvantagem nas jogadas de ataque da criatura. Você deve estar empunhando um escudo.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Conjuração", "\tNo 2° nível, você aprende a extrair magia divina através de meditação e oração para conjurar magias, como um clérigo faz. Veja o capítulo 10 para as regras gerais de conjuração e o capítulo 11 para a lista de magias de paladino.\n" +
				"\tPreparando e Conjurando Magias: A tabela O Paladino mostra quantos espaços de magia você têm para conjurar suas magias de 1º nível e superiores. Para conjurar uma dessas magias, você precisa gastar um espaço do nível da magia ou superior. Você recupera todos os espaços gastos quando termina um descanso longo.\n" +
				"\tVocê prepara a lista de magias disponíveis selecionando-as da lista de magias de paladino. Você seleciona um número de magias igual ao seu modificador de Carisma + metade do seu nível de paladino, arredondado para baixo (mínimo de uma magia). Essas magias devem ser de níveis que você possua espaços de magia.\n" +
				"\tPor exemplo, se você é um paladino de 5º nível, você possui quatro espaços de magia de 1º nível e dois de 2º nível. Com Carisma de 14, sua lista de magias preparadas pode incluir quatro magias, combinando as de 1º e 2º nível em qualquer ordem. Se você preparar a magia de 1º nível curar ferimentos, você pode conjurá-la com um espaço de magia de 1º ou de 2º nível. Ao conjurar a magia, você não a retira de sua lista de magias preparadas, podendo conjurá-la de novo se tiver espaços de magia disponíveis.\n" +
				"\tVocê pode modificar a sua lista de magias preparadas quando termina um descanso longo. Preparar uma nova lista de magias de paladino requer tempo gasto em preces e meditação: no mínimo 1 minuto por nível de magia para cada magia preparada.\n" +
				"\tHabilidade de Conjuração: Carisma é a sua habilidade para você conjurar suas magias de paladino, já que seu poder deriva da força das suas convicções. Você usa seu Carisma sempre que alguma magia se referir a sua habilidade de conjurar magias. Além disso, você usa o seu modificador de Carisma para definir a CD dos testes de resistência para as magias de paladino que você conjura e quando você realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + bônus de proficiência + seu modificador de Carisma\n" +
				"\tModificador de ataque de magia = seu bônus de proficiência + seu modificador de Carisma\n" +
				"\tFoco de conjuração: Você pode usar um símbolo sagrado (encontrado no capítulo 5) como foco de conjuração das suas magias de paladino.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Destruição divina", "\tA partir do 2° nível, quando você atingir uma criatura com um ataque corpo-a-corpo com arma, você pode gastar um espaço de magia de qualquer classe para causar dano radiante no alvo, além do dano normal da arma. O dano extra é de 2d8 para um espaço de magia de 1° nível, mais 1d8 para cada espaço de magia acima do 1°, até o máximo de 5d8. O dano aumenta em 1d8 se o alvo for um corruptor ou um morto-vivo.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Saúde divina", "\tNo 3° nível, a magia divina flui através de você tornando você imune a doenças.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Juramento sagrado", "\tQuando você alcança o 3° nível, você faz um juramento que torna-o um paladino para sempre. Até então, você estava em um estágio preparatório, guiado pelo caminho, mas ainda não jurado a ele. Agora você escolhe o Juramento de Devoção, o Juramento dos Anciões ou o Juramento de Vingança, todos detalhados no final da descrição da classe.\n" +
				"\tSua escolha lhe confere características no 3° nível e novamente no 7°, 15° e 20° nível. Tais características incluem as magias de juramento e a característica Canalizar Divindade.\n" + 
				"\tMagias de Juramento: Cada juramento possui uma lista de magias associada a ele. Você ganha acesso a essas magias nos níveis especificados na descrição do juramento. Uma vez que você tenha ganhado acesso a uma magia de juramento, você sempre a terá preparada. Magias de juramento não contam no número de magias que você pode preparar a cada dia. Se você ganhar uma magia de juramento que não apareça na lista de magias de paladino, a magia será, no entanto, uma magia de paladino para você.\n" +
				"\tCanalizar Divindade: Seu juramento permite que você canalize energia divina para abastecer efeitos mágicos. Cada opção de Canalizar Divindade concedida por um juramento explica como usá-la. Quando você usa o seu Canalizar Divindade, você escolhe qual opção usar. Você deve terminar um descanso curto ou longo para pode usar seu Canalizar Divindade novamente. Alguns efeitos de Canalizar Divindade requerem um teste de resistência. Quando você usar tais efeitos dessa classe, a CD será igual a CD das suas magias de paladino.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5° nível, você pode atacar duas vezes, ao invés de uma, sempre que você realizar a ação de Ataque no seu turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Aura de proteção", "\tA partir do 6° nível, sempre que você ou uma criatura amigável a até 3 metros de você tiver que fazer um teste de resistência, aquela criatura ganha um bônus no seu teste de proteção igual a seu modificador de Carisma (com um bônus mínimo de +1). Você deve estar consciente para garantir esse bônus.\n" +
				"\tNo 18° nível, o alcance dessa aura aumenta para 9 metros.\n\n", 6));
		super.habilidadesAdd(new Habilidade("Aura de coragem", "\tComeçando no 10° nível, você e as criaturas amigáveis dentro de um raio de 3 metros de você não podem ser amedrontadas enquanto você estiver consciente.\n" +
				"\tNo 18° nível, o alcance dessa aura aumenta para 9 metros.\n\n", 10));
		super.habilidadesAdd(new Habilidade("Destruição divina aprimorada", "\tNo 11° nível, você fica tão infundido com o poder da justiça que todos os seus ataques corpo-a-corpo com arma carregam poder divino neles. Sempre que você atingir uma criatura com um ataque corpo-a-corpo, a criatura sofre 1d8 de dano radiante extra. Se você também usar sua Destruição Divina em um ataque, você adiciona esse dano ao dano extra da sua Destruição Divina.\n\n", 11));
		super.habilidadesAdd(new Habilidade("Toque purificador", "\tA partir do 14° nível, você pode usar sua ação para terminar uma magia em si mesmo ou em uma criatura voluntária que você tocar.\n" +
				"\tVocê pode usar essa característica um número de vezes igual a seu modificador de Carisma (mínimo uma vez). Você recupera os usos gastos quando termina um descanso longo.\n\n", 14));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {}

	public Caminho<Paladino> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Paladino> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
