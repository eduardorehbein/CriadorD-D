package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Clerigo extends Classe implements Magica{
	//TODO: Corrigir strings defeituosas
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
	protected void setTabela() { }
	
	@Override
	public void setEquipamentoInicial(Personagem personagem) { }

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
		super.habilidadesAdd(new Habilidade("Conjura??o", "\tComo um canalizador de poder divino, voc? pode conjurar magias de cl?rigo. Veja o cap?tulo 10 para as regras gerais de conjura??o e o cap?tulo 11 para a lista de magias de cl?rigo.\n" + 
				"\tTruques: Voc? conhece tr?s truques, ? sua escolha, da lista de magias de cl?rigo. Voc? aprende truques de cl?rigo adicionais, ? sua escolha, em n?veis mais altos, como mostrado na coluna Truques Conhecidos da tabela O Cl?rigo.\n" +
				"\tPreparando e Conjurando Magias: A tabela O Cl?rigo mostra quantos espa?os de magia voc? t?m para conjurar suas magias de 1? n?vel e superiores. Para conjurar uma dessas magias, voc? precisa gastar um espa?o do n?vel da magia ou superior. Voc? recupera todos os espa?os gastos quando termina um descanso longo. Voc? prepara a lista de magias dispon?veis selecionando-as da lista de magias de cl?rigo. Voc? seleciona um n?mero de magias igual ao seu modificador de Sabedoria + seu n?vel de cl?rigo (m?nimo de uma magia). Essas magias devem ser de n?veis que voc? possua espa?os de magia. Por exemplo, se voc? ? um cl?rigo de 3? n?vel, voc? possui quatro espa?os de magia de 1? n?vel e dois de 2? n?vel. Com Sabedoria 16, sua lista de magias preparadas pode incluir 6 magias, combinando as de 1? e 2? n?vel em qualquer ordem. Se voc? preparar a magia de 1? n?vel curar ferimentos, voc? pode conjur?-la com um espa?o de magia de 1? ou de 2? n?vel. Ao conjurar a magia, voc? n?o a retira de sua lista de magias preparadas, podendo conjur?-la de novo se tiver espa?os de magia dispon?veis. Voc? pode modificar a sua lista de magias preparadas quando termina um descanso longo. Preparar uma nova lista de magias de cl?rigo requer tempo gasto em preces e medita??o: no m?nimo 1 minuto por n?vel de magia para cada magia preparada.\n" +
				"\tHabilidade de Conjura??o: Sabedoria ? a sua habilidade para voc? conjurar suas magias de cl?rigo. O poder de suas magias vem da devo??o que voc? tem ao seu deus. Voc? usa sua Sabedoria sempre que alguma magia se referir a sua habilidade de conjurar magias. Al?m disso, voc? usa o seu modificador de Sabedoria para definir a CD dos testes de resist?ncia para as magias de cl?rigo que voc? conjura e quando voc? realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + b?nus de profici?ncia + seu modificador de Sabedoria\n" +
				"\tModificador de ataque de magia = seu b?nus de profici?ncia + seu modificador de Sabedoria\n" +
				"\tConjura??o de Ritual: Voc? pode conjurar qualquer magia de druida que voc? conhe?a como um ritual se ela possuir o descritor ritual.\n" +
				"\tFoco de Conjura??o: Voc? pode usar um s?mbolo sagrado (encontrado no cap?tulo 5) como foco de conjura??o das suas magias de cl?rigo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Dom?nio divino", "\tEscolha um dom?nio relacionado ? sua divindade: Conhecimento, Engana??o, Guerra, Luz, Natureza, Tempestade ou Vida. Cada dom?nio ? detalhado ao final da descri??o da classe e, cada um, fornece exemplos dos deuses associados a eles. Essa escolha, realizada no 1? n?vel, concede magias de dom?nio e outras caracter?sticas.\n" +
				"\tEla tamb?m concede a voc? outras formas de utilizar seu Canalizar Divindade quando voc? ganh?-lo no 2? n?vel, bem como outros benef?cios no 6?, 8? e 17? n?veis.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Canalizar divindade", "\tNo 2? n?vel, voc? se torna capaz de canalizar energia diretamente de sua divindade, utilizando-a como combust?vel para efeitos m?gicos. Voc? come?a com dois efeitos: Expulsar Mortos-vivos e um efeito determinado pelo seu dom?nio. Alguns dom?nios conferem efeitos adicionais conforme voc? avan?a de n?vel, como consta na descri??o de cada dom?nio.\n" +
				"\tQuando voc? usar seu Canalizar Divindade, voc? escolhe qual efeito quer criar. Voc? precisa terminar um descanso curto ou longo para usar a caracter?stica de novo.\n" +
				"\tAlguns efeitos requerem teste de resist?ncia. Quando voc? usar um desses efeitos, a CD ? igual a das suas magias de cl?rigo.\n" +
				"\tA partir do 6? n?vel, voc? pode Canalizar Divindade duas vezes entre descansos e a partir do 18? n?vel, tr?s vezes. Voc? recupera os usos dessa caracter?stica quando termina um descanso curto ou longo.\n" +
				"\tCanalizar Divindade: Expulsar Mortos-Vivos: Usando uma a??o, voc? levanta seu s?mbolo sagrado e murmura uma prece repreendendo os mortos-vivos. Cada morto-vivo que puder ver ou ouvir voc? em um raio de 9 metros a partir de voc?, deve fazer um teste de resist?ncia de Sabedoria. Se falhar, a criatura est? expulsa por 1 minuto ou at? sofrer algum dano.\n" +
				"\tUma criatura expulsa deve usar seu turno para fugir da melhor forma poss?vel e de forma alguma pode aproximar-se a mais de 9 metros de voc? por vontade pr?pria. Ela tamb?m n?o pode usar rea??es. Como uma a??o, a criatura pode apenas realizar uma Disparada ou tentar escapar de um efeito que a impe?a de se mover. Se n?o h? lugar para ir, a criatura pode usar a a??o Esquivar.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc? atinge o 4? n?vel e novamente no 8?, 12?, 16? e 19? n?vel, voc? pode aumentar um valor de habilidade, ? sua escolha, em 2 ou voc? pode aumentar dois valores de habilidade, ? sua escolha, em 1. Como padr?o, voc? n?o pode elevar um valor de habilidade acima de 20 com essa caracter?stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Destruir mortos vivos", "\tA partir do 5? n?vel, quando um morto-vivo falhar no teste de resist?ncia contra a sua caracter?stica Expulsar Mortos-vivos, ele ? instantaneamente destru?do se o N?vel de Desafio dele for menor ou igual ao valor da tabela Destruir Mortos-vivos, de acordo com seu n?vel de cl?rigo.\n" +
				"\tN?vel 5 - Mortos Vivos de ND 1/2 ou menor\n" +
				"\tN?vel 8 - Mortos Vivos de ND 1 ou menor\n" +
				"\tN?vel 11 - Mortos Vivos de ND 2 ou menor\n" +
				"\tN?vel 14 - Mortos Vivos de ND 3 ou menor\n" +
				"\tN?vel 17 - Mortos Vivos de ND 4 ou menor\n\n", 5));
		super.habilidadesAdd(new Habilidade("Interven??o divina", "\tA partir do 10? n?vel, voc? pode rogar ? sua divindade para que auxilie voc? em uma ?rdua tarefa.\n" +
				"\tImplorar pelo aux?lio requer uma a??o. Voc? precisa descrever o que busca e realizar uma rolagem de dado de percentagem. Se o resultado for menor ou igual ao seu n?vel de cl?rigo, sua divindade interv?m. O Mestre escolhe a natureza da interven??o. O efeito de qualquer magia de cl?rigo ou magia de dom?nio ? apropriado como resultado.\n" +
				"\tSe sua divindade intervir, voc? fica impedido de usar essa caracter?stica de novo por 7 dias. Do contr?rio, voc? pode us?-la de novo ap?s terminar um descanso longo.\n" +
				"\tNo 20? n?vel, seus pedidos de interven??o funcionam automaticamente, sem necessidade de rolagem de dados.\n\n", 10));		
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());	
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) { }
	
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