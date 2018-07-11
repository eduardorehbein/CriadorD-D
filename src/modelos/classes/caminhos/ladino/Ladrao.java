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
		classe.habilidadesAdd(new Habilidade("Mãos rápidas", "\tA partir do 3º nível, você pode usar a sua ação bônus concedida pela Ação Ardilosa para fazer um teste de Destreza (Prestidigitação), usar suas ferramentas de ladrão para desarmar uma armadilha ou abrir uma fechadura, ou realizar a ação de Usar um Objeto.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Andarilho de telhados", "\tNo 3º nível, você adquire a habilidade de escalar mais rápido que o normal. Escalar agora não possui custo adicional de movimento para você.\n" +
				"\tAlém disso, quando você fizer um salto com corrida, o alcance que pode saltar aumenta um número de metros igual a 0,3 vezes o seu modificador de Destreza.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Furtividade suprema", "\tA partir do 9º nível, você tem vantagem no teste de Destreza (Furtividade) se você não mover-se mais do que a metade de seu deslocamento em um turno.\n\n", 9));
		classe.habilidadesAdd(new Habilidade("Usar instrumento mágico", "\tNo 13º nível, você aprende o suficiente sobre como a magia funciona e pode improvisar o uso de itens que nem mesmo foram destinados a você. Você ignora todos os requisitos de classes, raças e níveis para uso de qualquer item mágico.\n\n", 13));
		classe.habilidadesAdd(new Habilidade("Reflexos de ladrão", "\tQuando atinge o 17º nível, você se torna adepto em fazer emboscadas e fugas rápidas de situações perigosas. Você pode realizar dois turnos durante o primeiro turno de cada combate. Você realiza seu primeiro turno na sua iniciativa e o segundo na ordem de sua iniciativa menos 10.\n" +
				"\tVocê não pode usar essa característica quando está surpreso.\n\n", 17));
	}

	@Override
	public String getDescricao() {
		return "\tVocê aprimorou suas habilidades na arte do furto de pequenos itens. Gatunos, bandidos, batedores de carteira e outros criminosos geralmente seguem esse arquétipo, mas também aqueles ladinos que preferem se ver como caçadores de tesouro profissionais, exploradores de masmorras e investigadores. Além de aprimorar sua agilidade e furtividade, você aprende perícias úteis para desbravar ruínas antigas, ler idiomas incomuns e usar itens mágicos que normalmente não poderia.\n";
	}
}
