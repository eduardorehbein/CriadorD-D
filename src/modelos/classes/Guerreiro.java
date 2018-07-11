package modelos.classes;

import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Guerreiro extends Classe {
	private Caminho<Guerreiro> caminho;
	
	@Override
	public String toString() {
		return "Guerreiro";
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
		super.habilidadesAdd(new Habilidade("Estilo de luta", "\tVoc� adota um estilo de combate particular que ser� sua especialidade. Escolha uma das op��es a seguir. Voc� n�o pode escolher o mesmo Estilo de Combate mais de uma vez, mesmo se puder escolher de novo.\n" +
				"\tArquearia: Voc� ganha +2 de b�nus nas jogadas de ataque realizadas com uma arma de ataque � dist�ncia.\n" +
				"\tCombate com Armas Grandes: Quando voc� rolar um 1 ou um 2 num dado de dano de um ataque com arma corpo-a-corpo que voc� esteja empunhando com duas m�os, voc� pode rolar o dado novamente e usar a nova rolagem, mesmo que resulte em 1 ou 2. A arma deve ter a propriedade duas m�os ou vers�til para ganhar esse benef�cio.\n" +
				"\tCombate com Duas Armas: Quando voc� estiver engajado em uma luta com duas armas, voc� pode adicionar o seu modificador de habilidade de dano na jogada de dano de seu segundo ataque.\n" +
				"\tDefesa: Enquanto estiver usando armadura, voc� ganha +1 de b�nus em sua CA.\n" +
				"\tDuelismo: Quando voc� empunhar uma arma de ataque corpo-a-corpo em uma m�o e nenhuma outra arma, voc� ganha +2 de b�nus nas jogadas de dano com essa arma.\n" +
				"\tProte��o: Quando uma criatura que voc� possa ver atacar um alvo que esteja a at� 1,5 metro de voc�, voc� pode usar sua rea��o para impor desvantagem nas jogadas de ataque da criatura. Voc� deve estar empunhando um escudo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Retomar o f�lego", "\tVoc� possui uma reserva de estamina e pode us�-la para proteger a si mesmo contra danos. No seu turno, voc� pode usar uma a��o b�nus para recuperar pontos de vida igual a 1d10 + seu n�vel de guerreiro.\n" +
				"\tUma vez que voc� use essa caracter�stica, voc� precisa terminar um descanso curto ou longo para us�-la de novo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Surto de a��o", "\tA partir do 2� n�vel, voc� pode for�ar o seu limite para al�m do normal por um momento. Durante o seu turno, voc� pode realizar uma a��o adicional juntamente com sua a��o e poss�vel a��o b�nus.\n" +
				"\tUma vez que voc� use essa caracter�stica, voc� precisa terminar um descanso curto ou longo para us�-la de novo. A partir do 17� n�vel, voc� pode us�-la duas vezes antes do descanso, por�m somente uma vez por turno.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Arqu�tipo marcial", "\tNo 3� n�vel, voc� escolhe um arqu�tipo o qual se esfor�ar� para seguir as t�cnicas e estilos de combate dele. Escolha Campe�o, Cavaleiro Arcano ou Mestre de Batalha, todos detalhados no final da descri��o da classe. O arqu�tipo confere a voc� caracter�sticas especiais no 3� n�vel e de novo nos 7�, 10�, 15� e 18� n�vel.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc� atinge o 4� n�vel e novamente no 6�, 8�, 12�, 14�, 16� e 19� n�vel, voc� pode aumentar um valor de habilidade, � sua escolha, em 2 ou voc� pode aumentar dois valores de habilidade, � sua escolha, em 1. Como padr�o, voc� n�o pode elevar um valor de habilidade acima de 20 com essa caracter�stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5� n�vel, voc� pode atacar duas vezes, ao inv�s de uma, quando usar a a��o Atacar durante o seu turno.\n" +
				"\tO n�mero de ataques aumenta para tr�s quando voc� alcan�ar o 11� n�vel de guerreiro e para 4 quando alcan�ar o 20� n�vel de guerreiro.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Indom�vel", "\tA partir do 9� n�vel, voc� pode jogar de novo um teste de resist�ncia que falhou. Se o fizer, voc� deve usar o novo valor e n�o pode usar essa caracter�stica de novo antes de terminar um descanso longo.\n" +
				"\tVoc� pode usar esta caracter�stica duas vezes entre descansos longos quando chegar no 13� n�vel e tr�s vezes entre descansos longos quando chegar no 17� n�vel.\n\n", 9));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());	
	}

	public Caminho<Guerreiro> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Guerreiro> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
