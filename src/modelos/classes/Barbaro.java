package modelos.classes;

import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Barbaro extends Classe {
	private Caminho<Barbaro> caminho;

	@Override
	public String toString() {
		return "B�rbaro";
	}
	
	@Override
	protected void setTabela() { }
	
	@Override
	public void setEquipamentoInicial(Personagem personagem) {
		//TODO: Relacionar com as proficiencias da classe
	}

	@Override
	protected void setPvInicial(Personagem personagem) {
		personagem.setPv(12 + personagem.getModificadorConstituicao());
		if(personagem.getNivel() > 1) {
			for(int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD12() + personagem.getModificadorConstituicao());	
	}

	@Override
	protected void setHabilidades() {
		//TODO: Extrair strings para um XML
		super.habilidadesAdd(new Habilidade("F�ria", "\tEm batalha, voc� luta com uma ferocidade primitiva. No seu turno, voc� pode entrar em f�ria com uma a��o b�nus.\n" +
				"\tEnquanto estiver em f�ria, voc� recebe os seguintes benef�cios se voc� n�o estiver vestindo uma armadura pesada:\n" +
				"\t* Voc� tem vantagem em testes de For�a e testes de resist�ncia de For�a\n" +
				"\t* Quando voc� desferir um ataque com arma corpo-a-corpo usando For�a, voc� recebe um b�nus nas jogadas de dano que aumenta � medida que voc� adquire n�veis de b�rbaro, como mostrado na coluna Dano de F�ria na tabela O B�rbaro.\n" +
				"\t* Voc� possui resist�ncia contra dano de concuss�o, cortante e perfurante.\n" +
				"\tSe voc� for capaz de conjurar magias, voc� n�o poder� conjur�-las ou se concentrar nelas enquanto estiver em f�ria.\n" +
				"\tSua f�ria dura por 1 minuto. Ela termina prematuramente se voc� cair inconsciente ou se seu turno acabar e voc� n�o tiver atacado nenhuma criatura hostil desde seu �ltimo turno ou tiver sofrido dano nesse per�odo. Voc� tamb�m pode terminar sua f�ria no seu turno com uma a��o b�nus.\n" +
				"\tQuando voc� tiver usado a quantidade de f�rias mostrada para o seu n�vel de b�rbaro na coluna F�rias da tabela O B�rbaro, voc� precisar� terminar um descanso longo antes de poder entrar em f�ria novamente.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Defesa sem armadura", "\tQuando voc� n�o estiver vestindo qualquer armadura, sua Classe de Armadura ser� 10 + seu modificador de Destreza + seu modificador de Constitui��o. Voc� pode usar um escudo e continuar a receber esse benef�cio.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Ataque descuidado", "\tA partir do 2� n�vel, voc� pode desistir de toda preocupa��o com sua defesa para atacar com um desespero feroz. Quando voc� fizer o seu primeiro ataque no turno, voc� pode decidir atacar descuidadamente. Fazer isso lhe concede vantagem nas jogadas de ataque com armas corpo-a-corpo usando For�a durante seu turno, por�m, as jogadas de ataques feitas contra voc� possuem vantagem at� o in�cio do seu pr�ximo turno.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Sentido de perigo", "\tNo 2� n�vel, voc� adquire um sentido sobrenatural de quando as coisas pr�ximas n�o est�o como deveriam, concedendo a voc� uma chance maior quando estiver evitando perigos.\n" +
				"\tVoc� possui vantagem em testes de resist�ncia de Destreza contra efeitos que voc� possa ver, como armadilhas e magias. Para receber esse benef�cio voc� n�o pode estar cego, surdo ou incapacitado.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Caminho primitivo", "\tNo 3� n�vel, voc� escolhe um caminho que molda a natureza da sua f�ria. Escolha o Caminho do Furioso ou o Caminho do Guerreiro Tot�mico, ambos detalhados no final da descri��o de classe. Sua escolha lhe conceder� caracter�sticas no 3� n�vel e novamente no 6�, 10� e 14� n�veis.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16� e 19� n�vel, voc� pode aumentar um valor de habilidade, � sua escolha, em 2 ou voc� pode aumentar dois valores de habilidade, � sua escolha em 1. Como padr�o, voc� n�o pode elevar um valor de habilidade acima de 20 com essa caracter�stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5� n�vel, voc� pode atacar duas vezes, ao inv�s de uma, sempre que voc� realizar a a��o de Ataque no seu turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Movimento r�pido", "\tCome�ando no 5� n�vel, seu deslocamento aumenta em 3 metros enquanto voc� n�o estiver vestindo uma armadura pesada.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Instinto Selvagem", "\tNo 7� n�vel, seu instinto est� t�o apurado que voc� recebe vantagem nas jogadas de iniciativa.\n" +
				"\tAl�m disso, se voc� estiver surpreso no come�o de um combate e n�o estiver incapacitado, voc� pode agir normalmente no seu primeiro turno, mas apenas se voc� entrar em f�ria antes de realizar qualquer outra coisa neste turno.\n\n", 7));
		super.habilidadesAdd(new Habilidade("Cr�tico brutal", "\tA partir do 9� n�vel, voc� pode rolar um dado de dano de arma adicional quando estiver determinando o dano extra de um acerto cr�tico com uma arma corpo-a-corpo.\n" +
				"\tIsso aumenta para dois dados adicionais no 13� n�vel e tr�s dados adicionais no 17� n�vel.\n\n", 9));
		super.habilidadesAdd(new Habilidade("F�ria implacavel", "\tA partir do 11� n�vel, sua f�ria pode manter voc� lutando independente da gravidade dos seus ferimentos. Se voc� cair para 0 pontos de vida enquanto estiver em f�ria e n�o morrer, voc� pode realizar um teste de resist�ncia de Constitui��o CD 10. Se voc� for bem sucedido, voc� volta para 1 ponto de vida ao inv�s disso.\n" +
				"\tCada vez que voc� utilizar essa caracter�stica ap�s a primeira, a CD aumenta em 5. Assim que voc� terminar um descanso curto ou longo a CD volta para 10.\n\n", 11));
		super.habilidadesAdd(new Habilidade("F�ria persistente", "\tA partir do 15� n�vel, sua f�ria � t�o brutal que ela s� termina prematuramente se voc� cair inconsciente ou se voc� decidir termin�-la.\n\n", 15));
		super.habilidadesAdd(new Habilidade("For�a indom�vel", "\tA partir do 18� n�vel, se o total de um teste de For�a seu for menor que o seu valor de For�a, voc� pode usar esse valor no lugar do resultado.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Campe�o primitivo", "\tNo 20� n�vel, voc� incorpora os poderes da natureza. Seus valores de For�a e Constitui��o aumentam em 4. Seu m�ximo para esses valores agora � 24.\n\n", 20));
	}
	
	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());
	}

	public Caminho<Barbaro> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Barbaro> caminho) {
		this.caminho = caminho;
	}

	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
