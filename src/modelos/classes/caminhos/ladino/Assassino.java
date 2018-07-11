package modelos.classes.caminhos.ladino;

import modelos.Habilidade;
import modelos.classes.Ladino;
import modelos.classes.caminhos.Caminho;

public class Assassino implements Caminho<Ladino> {
	@Override
	public String toString() {
		return "Assassino";
	}
	
	@Override
	public void setHabilidades(Ladino classe) {
		classe.habilidadesAdd(new Habilidade("Proficiência adicional", "\tQuando você escolhe esse arquétipo, no 3° nível, você ganha proficiência com kit de disfarce e kit de venenos.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Assassinar", "\tA partir do 3° nível, você fica mais mortal quando pega seus oponentes desprevenidos. Você tem vantagem nas jogadas de ataque contra qualquer criatura que ainda não tenha chegado ao turno dela no combate. Além disso, qualquer ataque que você fizer contra essa criatura que está surpresa, será um ataque crítico.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Especialização em infiltração", "\tA partir do 9° nível, você pode infalivelmente, criar identidades falsas para si mesmo. Você deve gastar sete dias e 25 po para estabelecer o histórico, profissão e filiações para uma identidade. Você não pode estabelecer uma identidade que pertença a alguém. Por exemplo, você deveria adquirir roupas apropriadas, cartas de introdução e um certificado, aparentemente oficial, para estabelecer-se como um membro da casa de comércio de uma cidade remota, assim, você poderia introduzir-se na companhia de outros comerciantes abastados.\n" +
				"\tPosteriormente, se você adotar a nova identidade como disfarce, outras criaturas acreditarão que você é aquela pessoa, até terem algum motivo obvio para pensarem o contrário.\n\n", 9));
		classe.habilidadesAdd(new Habilidade("Impostor", "\tNo 13° nível, você adquire a habilidade de imitar a fala, escrita e comportamento de outra pessoa, infalivelmente. Você deve gastar pelo menos três horas estudando esses três componentes do comportamento de uma pessoa, ouvindo sua articulação, examinando sua escrita e observando seus maneirismos.\n" +
				"\tSeu ardil é imperceptível para um observador casual. Se uma criatura desconfiada suspeitar que algo está errado, você tem vantagem em qualquer teste de Carisma (Enganação) que você fizer para evitar ser detectado.\n\n", 13));
		classe.habilidadesAdd(new Habilidade("Golpe letal", "\tNo 17° nível, você se torna um mestre da morte instantânea. Quando você atacar e atingir uma criatura que esteja surpresa, ela deve realizar um teste de resistência de Constituição (CD 8 + seu modificador de Destreza + seu bônus de proficiência). Se ela falhar, dobre o dano do seu ataque contra a criatura.\n\n", 17));
	}

	@Override
	public String getDescricao() {
		return "\tVocê focou seu treinamento na macabra arte da morte. Aqueles que devotam-se a esse arquétipo são diversos: assassinos de aluguel, espiões, caçadores de recompensa e, até mesmo, padres especialmente treinados em exterminar os inimigos das suas divindades. Subterfúgio, veneno e disfarces ajudam você a eliminar seus oponentes com eficiência mortífera.\n";
	}
}
