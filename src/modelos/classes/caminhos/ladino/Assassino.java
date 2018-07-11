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
		classe.habilidadesAdd(new Habilidade("Profici�ncia adicional", "\tQuando voc� escolhe esse arqu�tipo, no 3� n�vel, voc� ganha profici�ncia com kit de disfarce e kit de venenos.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Assassinar", "\tA partir do 3� n�vel, voc� fica mais mortal quando pega seus oponentes desprevenidos. Voc� tem vantagem nas jogadas de ataque contra qualquer criatura que ainda n�o tenha chegado ao turno dela no combate. Al�m disso, qualquer ataque que voc� fizer contra essa criatura que est� surpresa, ser� um ataque cr�tico.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Especializa��o em infiltra��o", "\tA partir do 9� n�vel, voc� pode infalivelmente, criar identidades falsas para si mesmo. Voc� deve gastar sete dias e 25 po para estabelecer o hist�rico, profiss�o e filia��es para uma identidade. Voc� n�o pode estabelecer uma identidade que perten�a a algu�m. Por exemplo, voc� deveria adquirir roupas apropriadas, cartas de introdu��o e um certificado, aparentemente oficial, para estabelecer-se como um membro da casa de com�rcio de uma cidade remota, assim, voc� poderia introduzir-se na companhia de outros comerciantes abastados.\n" +
				"\tPosteriormente, se voc� adotar a nova identidade como disfarce, outras criaturas acreditar�o que voc� � aquela pessoa, at� terem algum motivo obvio para pensarem o contr�rio.\n\n", 9));
		classe.habilidadesAdd(new Habilidade("Impostor", "\tNo 13� n�vel, voc� adquire a habilidade de imitar a fala, escrita e comportamento de outra pessoa, infalivelmente. Voc� deve gastar pelo menos tr�s horas estudando esses tr�s componentes do comportamento de uma pessoa, ouvindo sua articula��o, examinando sua escrita e observando seus maneirismos.\n" +
				"\tSeu ardil � impercept�vel para um observador casual. Se uma criatura desconfiada suspeitar que algo est� errado, voc� tem vantagem em qualquer teste de Carisma (Engana��o) que voc� fizer para evitar ser detectado.\n\n", 13));
		classe.habilidadesAdd(new Habilidade("Golpe letal", "\tNo 17� n�vel, voc� se torna um mestre da morte instant�nea. Quando voc� atacar e atingir uma criatura que esteja surpresa, ela deve realizar um teste de resist�ncia de Constitui��o (CD 8 + seu modificador de Destreza + seu b�nus de profici�ncia). Se ela falhar, dobre o dano do seu ataque contra a criatura.\n\n", 17));
	}

	@Override
	public String getDescricao() {
		return "\tVoc� focou seu treinamento na macabra arte da morte. Aqueles que devotam-se a esse arqu�tipo s�o diversos: assassinos de aluguel, espi�es, ca�adores de recompensa e, at� mesmo, padres especialmente treinados em exterminar os inimigos das suas divindades. Subterf�gio, veneno e disfarces ajudam voc� a eliminar seus oponentes com efici�ncia mort�fera.\n";
	}
}
