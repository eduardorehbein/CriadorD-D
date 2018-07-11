package modelos.classes.caminhos.guerreiro;

import modelos.Habilidade;
import modelos.classes.Guerreiro;
import modelos.classes.caminhos.Caminho;

public class Campeao implements Caminho<Guerreiro> {
	@Override
	public String toString() {
		return "Campeão";
	}
	
	@Override
	public void setHabilidades(Guerreiro classe) {
		classe.habilidadesAdd(new Habilidade("Crítico aprimorado", "\tA partir do 3º nível, seus ataques com armas adquirem uma margem de acerto crítico de 19 a 20 nas jogadas de ataque.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Atletismo extraordinário", "\tA partir do 7º nível, você adiciona metade de seu bônus de proficiência (arredondado para cima) em qualquer teste de Força, Destreza ou Constituição que você já não aplique seu bônus de proficiência.\n" +
				"\tAlém disso, quando você fizer um salto longo com corrida, o alcance em metros que poderá saltar aumenta em 0,3 vezes o seu modificador de Força.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Estilo de luta adicional", "\tNo 10º nível, você pode escolher um segundo Estilo de Combate da sua característica de classe.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Crítico superior", "\tA partir do 15º nível, seus ataques com armas adquirem uma margem de acerto crítico de 18 a 20 nas jogadas de ataque.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Sobrevivente", "\tNo 18º nível, você alcança o topo da resiliência em batalha. No começo de cada um de seus turnos, você recupera uma quantidade de pontos de vida igual a 5 + seu modificador de Constituição se não estiver com mais que metade de seus pontos de vida. Você não recebe esse benefício se estiver com 0 pontos de vida.\n\n", 18));
	}

	@Override
	public String getDescricao() {
		return "\tO arquétipo Campeão foca no desenvolvimento da pura força física acompanhada por uma perfeição mortal. Aqueles que trilham o caminho desse arquétipo combinam rigorosos treinamentos com excelência física para desferir golpes devastadores.\n";
	}
}
