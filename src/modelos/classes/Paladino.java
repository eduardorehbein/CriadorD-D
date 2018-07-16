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
		super.habilidadesAdd(new Habilidade("Sentido divino", "\tA presen�a de um mal poderoso � registrada nos seus sentidos como um odor nocivo e o bem poderoso badala como m�sica celestial nos seus ouvidos. Com uma a��o, voc� pode expandir sua consci�ncia para detectar tais for�as. At� o final do seu pr�ximo turno, voc� sabe a localiza��o de qualquer celestial, corruptor ou morto-vivo a 18 metros de voc� que n�o esteja com cobertura total. Voc� sabe o tipo (celestial, corruptor ou morto-vivo) de qualquer ser cuja presen�a voc� sentiu, mas n�o sua identidade (o vampiro Conde Strahd von Zarovish, por exemplo). Dentro do mesmo raio, voc� tamb�m detecta a presen�a de qualquer lugar ou objeto que tenha sido consagrado ou conspurcado, como pela magia consagrar.\n" +
				"\tVoc� pode usar essa caracter�stica um n�mero de vezes igual a 1 + seu modificador de Carisma. Quando voc� concluir um descanso longo, voc� recupera todos os usos gastos.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Cura pelas m�os", "\tSeu toque aben�oado pode curar ferimentos. Voc� tem um po�o de poder curativo que se enche quando voc� realiza um descanso longo. Com esse po�o, voc� pode restaurar um n�mero total de pontos de vida igual ao seu n�vel de paladino x 5.\n" +
				"\tCom uma a��o, voc� pode tocar uma criatura e sugar poder do seu po�o para restaurar um n�mero de pontos de vida da criatura, at� o m�ximo de pontos restantes no po�o.\n" +
				"\tAlternativamente, voc� pode gastar 5 pontos de cura do seu po�o de cura para curar o alvo de uma doen�a ou neutralizar um veneno que o esteja afetando. Voc� pode curar m�ltiplas doen�as e neutralizar m�ltiplos venenos com um �nico uso de Cura pelas M�os, gastando pontos de vida separadamente para cada um.\n" +
				"\tEssa caracter�stica n�o gera nenhum efeito em mortos-vivos e constructos.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Estilo de luta", "\tNo 2� n�vel, voc� adota um estilo de combate particular que ser� sua especialidade. Escolha uma das op��es a seguir. Voc� n�o pode escolher o mesmo Estilo de Combate mais de uma vez, mesmo se puder escolher de novo.\n" +
				"\tCombate com armas grandes: Quando voc� rolar um 1 ou um 2 num dado de dano de um ataque com arma corpo-a-corpo que voc� esteja empunhando com duas m�os, voc� pode rolar o dado novamente e usar a nova rolagem, mesmo que resulte em 1 ou 2. A arma deve ter a propriedade duas m�os ou vers�til para ganhar esse benef�cio.\n" + 
				"\tDefesa: Enquanto estiver usando armadura, voc� ganha +1 de b�nus em sua CA.\n" +
				"\tDuelismo: Quando voc� empunhar uma arma de ataque corpo-a-corpo em uma m�o e nenhuma outra arma, voc� ganha +2 de b�nus nas jogadas de dano com essa arma.\n" +
				"\tProte��o: Quando uma criatura que voc� possa ver atacar um alvo que esteja a at� 1,5 metro de voc�, voc� pode usar sua rea��o para impor desvantagem nas jogadas de ataque da criatura. Voc� deve estar empunhando um escudo.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Conjura��o", "\tNo 2� n�vel, voc� aprende a extrair magia divina atrav�s de medita��o e ora��o para conjurar magias, como um cl�rigo faz. Veja o cap�tulo 10 para as regras gerais de conjura��o e o cap�tulo 11 para a lista de magias de paladino.\n" +
				"\tPreparando e Conjurando Magias: A tabela O Paladino mostra quantos espa�os de magia voc� t�m para conjurar suas magias de 1� n�vel e superiores. Para conjurar uma dessas magias, voc� precisa gastar um espa�o do n�vel da magia ou superior. Voc� recupera todos os espa�os gastos quando termina um descanso longo.\n" +
				"\tVoc� prepara a lista de magias dispon�veis selecionando-as da lista de magias de paladino. Voc� seleciona um n�mero de magias igual ao seu modificador de Carisma + metade do seu n�vel de paladino, arredondado para baixo (m�nimo de uma magia). Essas magias devem ser de n�veis que voc� possua espa�os de magia.\n" +
				"\tPor exemplo, se voc� � um paladino de 5� n�vel, voc� possui quatro espa�os de magia de 1� n�vel e dois de 2� n�vel. Com Carisma de 14, sua lista de magias preparadas pode incluir quatro magias, combinando as de 1� e 2� n�vel em qualquer ordem. Se voc� preparar a magia de 1� n�vel curar ferimentos, voc� pode conjur�-la com um espa�o de magia de 1� ou de 2� n�vel. Ao conjurar a magia, voc� n�o a retira de sua lista de magias preparadas, podendo conjur�-la de novo se tiver espa�os de magia dispon�veis.\n" +
				"\tVoc� pode modificar a sua lista de magias preparadas quando termina um descanso longo. Preparar uma nova lista de magias de paladino requer tempo gasto em preces e medita��o: no m�nimo 1 minuto por n�vel de magia para cada magia preparada.\n" +
				"\tHabilidade de Conjura��o: Carisma � a sua habilidade para voc� conjurar suas magias de paladino, j� que seu poder deriva da for�a das suas convic��es. Voc� usa seu Carisma sempre que alguma magia se referir a sua habilidade de conjurar magias. Al�m disso, voc� usa o seu modificador de Carisma para definir a CD dos testes de resist�ncia para as magias de paladino que voc� conjura e quando voc� realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + b�nus de profici�ncia + seu modificador de Carisma\n" +
				"\tModificador de ataque de magia = seu b�nus de profici�ncia + seu modificador de Carisma\n" +
				"\tFoco de conjura��o: Voc� pode usar um s�mbolo sagrado (encontrado no cap�tulo 5) como foco de conjura��o das suas magias de paladino.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Destrui��o divina", "\tA partir do 2� n�vel, quando voc� atingir uma criatura com um ataque corpo-a-corpo com arma, voc� pode gastar um espa�o de magia de qualquer classe para causar dano radiante no alvo, al�m do dano normal da arma. O dano extra � de 2d8 para um espa�o de magia de 1� n�vel, mais 1d8 para cada espa�o de magia acima do 1�, at� o m�ximo de 5d8. O dano aumenta em 1d8 se o alvo for um corruptor ou um morto-vivo.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Sa�de divina", "\tNo 3� n�vel, a magia divina flui atrav�s de voc� tornando voc� imune a doen�as.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Juramento sagrado", "\tQuando voc� alcan�a o 3� n�vel, voc� faz um juramento que torna-o um paladino para sempre. At� ent�o, voc� estava em um est�gio preparat�rio, guiado pelo caminho, mas ainda n�o jurado a ele. Agora voc� escolhe o Juramento de Devo��o, o Juramento dos Anci�es ou o Juramento de Vingan�a, todos detalhados no final da descri��o da classe.\n" +
				"\tSua escolha lhe confere caracter�sticas no 3� n�vel e novamente no 7�, 15� e 20� n�vel. Tais caracter�sticas incluem as magias de juramento e a caracter�stica Canalizar Divindade.\n" + 
				"\tMagias de Juramento: Cada juramento possui uma lista de magias associada a ele. Voc� ganha acesso a essas magias nos n�veis especificados na descri��o do juramento. Uma vez que voc� tenha ganhado acesso a uma magia de juramento, voc� sempre a ter� preparada. Magias de juramento n�o contam no n�mero de magias que voc� pode preparar a cada dia. Se voc� ganhar uma magia de juramento que n�o apare�a na lista de magias de paladino, a magia ser�, no entanto, uma magia de paladino para voc�.\n" +
				"\tCanalizar Divindade: Seu juramento permite que voc� canalize energia divina para abastecer efeitos m�gicos. Cada op��o de Canalizar Divindade concedida por um juramento explica como us�-la. Quando voc� usa o seu Canalizar Divindade, voc� escolhe qual op��o usar. Voc� deve terminar um descanso curto ou longo para pode usar seu Canalizar Divindade novamente. Alguns efeitos de Canalizar Divindade requerem um teste de resist�ncia. Quando voc� usar tais efeitos dessa classe, a CD ser� igual a CD das suas magias de paladino.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16� e 19� n�vel, voc� pode aumentar um valor de habilidade, � sua escolha, em 2 ou voc� pode aumentar dois valores de habilidade, � sua escolha, em 1. Como padr�o, voc� n�o pode elevar um valor de habilidade acima de 20 com essa caracter�stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5� n�vel, voc� pode atacar duas vezes, ao inv�s de uma, sempre que voc� realizar a a��o de Ataque no seu turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Aura de prote��o", "\tA partir do 6� n�vel, sempre que voc� ou uma criatura amig�vel a at� 3 metros de voc� tiver que fazer um teste de resist�ncia, aquela criatura ganha um b�nus no seu teste de prote��o igual a seu modificador de Carisma (com um b�nus m�nimo de +1). Voc� deve estar consciente para garantir esse b�nus.\n" +
				"\tNo 18� n�vel, o alcance dessa aura aumenta para 9 metros.\n\n", 6));
		super.habilidadesAdd(new Habilidade("Aura de coragem", "\tCome�ando no 10� n�vel, voc� e as criaturas amig�veis dentro de um raio de 3 metros de voc� n�o podem ser amedrontadas enquanto voc� estiver consciente.\n" +
				"\tNo 18� n�vel, o alcance dessa aura aumenta para 9 metros.\n\n", 10));
		super.habilidadesAdd(new Habilidade("Destrui��o divina aprimorada", "\tNo 11� n�vel, voc� fica t�o infundido com o poder da justi�a que todos os seus ataques corpo-a-corpo com arma carregam poder divino neles. Sempre que voc� atingir uma criatura com um ataque corpo-a-corpo, a criatura sofre 1d8 de dano radiante extra. Se voc� tamb�m usar sua Destrui��o Divina em um ataque, voc� adiciona esse dano ao dano extra da sua Destrui��o Divina.\n\n", 11));
		super.habilidadesAdd(new Habilidade("Toque purificador", "\tA partir do 14� n�vel, voc� pode usar sua a��o para terminar uma magia em si mesmo ou em uma criatura volunt�ria que voc� tocar.\n" +
				"\tVoc� pode usar essa caracter�stica um n�mero de vezes igual a seu modificador de Carisma (m�nimo uma vez). Voc� recupera os usos gastos quando termina um descanso longo.\n\n", 14));
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
