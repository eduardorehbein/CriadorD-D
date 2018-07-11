package modelos.classes.caminhos.guerreiro;

import modelos.Habilidade;
import modelos.classes.Guerreiro;
import modelos.classes.caminhos.Caminho;

public class Campeao implements Caminho<Guerreiro> {
	@Override
	public String toString() {
		return "Campe�o";
	}
	
	@Override
	public void setHabilidades(Guerreiro classe) {
		classe.habilidadesAdd(new Habilidade("Cr�tico aprimorado", "\tA partir do 3� n�vel, seus ataques com armas adquirem uma margem de acerto cr�tico de 19 a 20 nas jogadas de ataque.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Atletismo extraordin�rio", "\tA partir do 7� n�vel, voc� adiciona metade de seu b�nus de profici�ncia (arredondado para cima) em qualquer teste de For�a, Destreza ou Constitui��o que voc� j� n�o aplique seu b�nus de profici�ncia.\n" +
				"\tAl�m disso, quando voc� fizer um salto longo com corrida, o alcance em metros que poder� saltar aumenta em 0,3 vezes o seu modificador de For�a.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Estilo de luta adicional", "\tNo 10� n�vel, voc� pode escolher um segundo Estilo de Combate da sua caracter�stica de classe.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Cr�tico superior", "\tA partir do 15� n�vel, seus ataques com armas adquirem uma margem de acerto cr�tico de 18 a 20 nas jogadas de ataque.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Sobrevivente", "\tNo 18� n�vel, voc� alcan�a o topo da resili�ncia em batalha. No come�o de cada um de seus turnos, voc� recupera uma quantidade de pontos de vida igual a 5 + seu modificador de Constitui��o se n�o estiver com mais que metade de seus pontos de vida. Voc� n�o recebe esse benef�cio se estiver com 0 pontos de vida.\n\n", 18));
	}

	@Override
	public String getDescricao() {
		return "\tO arqu�tipo Campe�o foca no desenvolvimento da pura for�a f�sica acompanhada por uma perfei��o mortal. Aqueles que trilham o caminho desse arqu�tipo combinam rigorosos treinamentos com excel�ncia f�sica para desferir golpes devastadores.\n";
	}
}
