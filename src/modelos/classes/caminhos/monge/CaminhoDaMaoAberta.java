package modelos.classes.caminhos.monge;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Monge;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class CaminhoDaMaoAberta implements Caminho<Monge>, Magica {
	@Override
	public String toString() {
		return "Caminho da M�o Aberta";
	}
	
	@Override
	public void setHabilidades(Monge classe) {
		classe.habilidadesAdd(new Habilidade("T�cnica da m�o aberta", "\tCome�ando quando voc� escolhe essa tradi��o, no 3� n�vel, voc� pode manipular o chi do seu inimigo quando voc� controla o seu. Toda vez que voc� atingir uma criatura com um dos seus ataques garantidos por sua Rajada de Golpes, voc� pode impor um dos seguintes efeitos no alvo:\n" +
				"\t* Ele deve ser bem sucedido num teste de resist�ncia de Destreza ou cair� no ch�o.\n" +
				"\t* Ele deve realizar um teste de resist�ncia de For�a. Se falhar, voc� pode empurr�-lo 4,5 metros para longe de voc�.\n" +
				"\t* Ele n�o pode realizar rea��es at� o final do seu pr�ximo turno.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Integridade corporal", "\tNo 6� n�vel, voc� ganha a habilidade de se curar. Com uma a��o, voc� recupera uma quantidade de pontos de vida igual a tr�s vezes seu n�vel de monge. Voc� deve terminar um descanso longo antes de poder usar essa caracter�stica novamente.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Tranquilidade", "\tA partir do 11� n�vel, voc� pode entrar num estado especial de medita��o que rodeia voc� com uma aura pacifica. No final de um descanso longo, voc� ganha o efeito da magia santu�rio que dura at� o come�o do seu pr�ximo descanso longo (a magia pode terminar prematuramente, como normal). A CD do teste de resist�ncia para a magia � 8 + seu modificador de Sabedoria + seu b�nus de profici�ncia.\n\n", 11));
		classe.habilidadesAdd(new Habilidade("Palma vibrante", "\tNo 17� n�vel, voc� ganha a habilidade de criar vibra��es letais no corpo de algu�m. Quando voc� atingir uma criatura com um golpe desarmado, voc� pode gastar 3 pontos de chi para come�ar essas vibra��es impercept�veis, que duram por um n�mero de dias igual ao seu n�vel de monge. As vibra��es s�o inofensivas, a n�o ser que voc� use sua a��o para termin�-las. Para tanto, voc� e o alvo devem estar no mesmo plano de exist�ncia. Quando voc� usa essa a��o, a criatura deve realizar um teste de resist�ncia de Constitui��o. Se ela falhar, ela ser� reduzida a 0 pontos de vida. Se ela passar, ela sofrer� 10d10 de dano necr�tico.\n" +
				"\tVoc� pode ter apenas uma criatura sob o efeito dessa caracter�stica por vez. Voc� pode escolher terminar as vibra��es inofensivamente, sem usar uma a��o.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tMonges do Caminho da M�o Aberta s�o os mestres supremos das artes de combate marcial, tanto armado quanto desarmado. Eles aprendem t�cnicas para empurrar e derrubar seus oponentes, manipulando o chi para curar os ferimentos dos seus corpos e praticando uma medita��o avan�ada que os protege de mazelas.\n";
	}
}
