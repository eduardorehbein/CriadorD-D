package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeConjuracao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Conjura��o";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Conjura��o instru�da", "\tQuando voc� escolhe essa escola no 2� n�vel, o ouro e o tempo que voc� precisa gastar para copiar uma magia da escola de conjura��o em seu grim�rio � reduzido � metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Conjura��o menor", "\tA partir do 2� n�vel, quando voc� escolhe essa escola, voc� pode usar sua a��o para conjurar at� um objeto inanimado em sua m�o ou no ch�o, em um espa�o desocupado que voc� possa ver, a at� 3 metros de voc�. Esse objeto n�o pode ter mais de 90 cent�metros de largura nem pesar mais de 5 quilos e sua forma deve ser de um objeto n�o-m�gico que voc� tenha visto. O objeto � visivelmente m�gico, emanando penumbra a 1,5 metro.\n" +
				"\tO objeto desaparece depois de 1 hora, quando voc� usa essa caracter�stica novamente ou se ele sofrer qualquer dano.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Transposi��o benigna", "\tA partir do 6� n�vel, voc� pode usar sua a��o para se teletransportar at� 9 metros em um espa�o desocupado que voc� possa ver. Alternativamente, voc� pode escolher um espa�o ao alcance que seja ocupado por uma criatura Pequena ou M�dia. Se essa criatura for volunt�ria, voc�s dois teletransportam-se, trocando de lugar.\n" +
				"\tUma vez que voc� usa essa caracter�stica, n�o pode us�-la novamente at� terminar um descanso longo ou at� conjurar uma magia de conjura��o de 1� n�vel ou superior.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Conjura��o focada", "\tCome�ando no 10� n�vel, enquanto voc� estiver concentrado em uma magia de conjura��o, sua concentra��o n�o pode ser interrompida como resultado de ter sofrido dano.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Invoca��es resistentes", "\tA partir do 14� n�vel, qualquer criatura que voc� invocar ou criar com uma magia de conjura��o, ter� 30 pontos de vida tempor�rios.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tComo um conjurador, voc� prefere magias que produzam objetos e criaturas do nada. Voc� pode conjurar nuvens esvoa�antes de g�s mortal ou invocar criaturas de outros lugares para lutar por voc�. � medida que seu dom�nio cresce, voc� aprende magias de teletransporta��o e pode se teletransportar por vastas dist�ncias, at� mesmo para outros planos de exist�ncia, em um instante.\n";
	}
}
