package modelos.classes.caminhos.ladino;

import modelos.Habilidade;
import modelos.classes.Ladino;
import modelos.classes.caminhos.Caminho;

public class Ladrao implements Caminho<Ladino> {
	@Override
	public String toString() {
		return "Cavaleiro Arcano";
	}
	
	@Override
	public void setHabilidades(Ladino classe) {
		classe.habilidadesAdd(new Habilidade("M�os r�pidas", "\tA partir do 3� n�vel, voc� pode usar a sua a��o b�nus concedida pela A��o Ardilosa para fazer um teste de Destreza (Prestidigita��o), usar suas ferramentas de ladr�o para desarmar uma armadilha ou abrir uma fechadura, ou realizar a a��o de Usar um Objeto.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Andarilho de telhados", "\tNo 3� n�vel, voc� adquire a habilidade de escalar mais r�pido que o normal. Escalar agora n�o possui custo adicional de movimento para voc�.\n" +
				"\tAl�m disso, quando voc� fizer um salto com corrida, o alcance que pode saltar aumenta um n�mero de metros igual a 0,3 vezes o seu modificador de Destreza.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Furtividade suprema", "\tA partir do 9� n�vel, voc� tem vantagem no teste de Destreza (Furtividade) se voc� n�o mover-se mais do que a metade de seu deslocamento em um turno.\n\n", 9));
		classe.habilidadesAdd(new Habilidade("Usar instrumento m�gico", "\tNo 13� n�vel, voc� aprende o suficiente sobre como a magia funciona e pode improvisar o uso de itens que nem mesmo foram destinados a voc�. Voc� ignora todos os requisitos de classes, ra�as e n�veis para uso de qualquer item m�gico.\n\n", 13));
		classe.habilidadesAdd(new Habilidade("Reflexos de ladr�o", "\tQuando atinge o 17� n�vel, voc� se torna adepto em fazer emboscadas e fugas r�pidas de situa��es perigosas. Voc� pode realizar dois turnos durante o primeiro turno de cada combate. Voc� realiza seu primeiro turno na sua iniciativa e o segundo na ordem de sua iniciativa menos 10.\n" +
				"\tVoc� n�o pode usar essa caracter�stica quando est� surpreso.\n\n", 17));
	}

	@Override
	public String getDescricao() {
		return "\tVoc� aprimorou suas habilidades na arte do furto de pequenos itens. Gatunos, bandidos, batedores de carteira e outros criminosos geralmente seguem esse arqu�tipo, mas tamb�m aqueles ladinos que preferem se ver como ca�adores de tesouro profissionais, exploradores de masmorras e investigadores. Al�m de aprimorar sua agilidade e furtividade, voc� aprende per�cias �teis para desbravar ru�nas antigas, ler idiomas incomuns e usar itens m�gicos que normalmente n�o poderia.\n";
	}
}
