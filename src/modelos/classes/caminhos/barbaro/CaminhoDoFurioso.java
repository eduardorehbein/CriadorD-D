package modelos.classes.caminhos.barbaro;

import modelos.Habilidade;
import modelos.classes.Barbaro;
import modelos.classes.caminhos.Caminho;

public class CaminhoDoFurioso implements Caminho<Barbaro> {
	@Override
	public String toString() {
		return "Caminho do Furioso";
	}

	@Override
	public void setHabilidades(Barbaro classe) {
		classe.habilidadesAdd(new Habilidade("Frenesi", "\tCome�ando no momento que voc� escolhe esse caminho no 3� n�vel, voc� pode entrar num frenesi quando estiver em f�ria. Se voc� desejar, pela dura��o da sua f�ria, voc� pode realizar um �nico ataque corpo-a-corpo com arma, com uma a��o b�nus, em cada um de seus turnos ap�s esse. Quando sua f�ria acabar, voc� sofrer� um n�vel de exaust�o (como descrito no ap�ndice A).\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Furia inconsciente", "\tA partir do 6� n�vel, voc� n�o pode ser enfeiti�ado ou amedrontado enquanto estiver em f�ria. Se voc� estava enfeiti�ado ou amedrontado quando entrou em f�ria, o efeito � suspenso pela dura��o da f�ria.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Presen�a intimidante", "\tA partir do 10� n�vel, voc� pode usar sua a��o para amedrontar algu�m com sua presen�a intimidante. Quando o fizer, escolha uma criatura que voc� possa ver a 9 metros. Se a criatura puder ver ou ouvir voc�, ela deve ser bem sucedida num teste de resist�ncia de Sabedoria (CD igual a 8 + seu b�nus de profici�ncia + seu modificador de Carisma) ou ficara com medo de voc� at� o fim do seu pr�ximo turno. Nos turnos seguintes, voc� pode usar sua a��o para estender a dura��o desse efeito na criatura amedrontada at� o in�cio do seu pr�ximo turno. Esse efeito termina se a criatura terminar seu turno fora da sua linha de vis�o ao a mais de 18 metros de voc�.\n" +
				"\tSe a criatura for bem sucedida no teste de resist�ncia, voc� n�o poder� usar essa caracter�stica nessa criatura novamente por 24 horas.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Retalia��o", "\tA partir do 14� n�vel, quando voc� sofrer dano de uma criatura que esteja a at� 1,5 metro de voc�, voc� pode usar sua rea��o para realizar um ataque corpo-a-corpo com arma contra essa criatura.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tPara alguns b�rbaros, a f�ria � um meio para um fim � esse fim � a viol�ncia. O Caminho do Furioso � um caminho de f�ria livre, entumecido em sangue. A medida que voc� entra na f�ria de um furioso, voc� vibra no caos da batalha, despreocupado com a sua pr�pria sa�de ou bem-estar.\n";
	}
}
