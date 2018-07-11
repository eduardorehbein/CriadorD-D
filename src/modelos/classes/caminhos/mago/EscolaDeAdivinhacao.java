package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeAdivinhacao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Adivinha��o";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Adivinha��o instru�da", "\tQuando voc� escolhe essa escola no 2� n�vel, o ouro e o tempo que voc� precisa gastar para copiar uma magia da escola de adivinha��o em seu grim�rio � reduzido � metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Prod�gio", "\tCome�ando no 2� n�vel, quando voc� escolhe essa escola, vislumbres do futuro come�am a aparecer em sua consci�ncia. Quando voc� termina um descanso longo, role dois d20s e anote os n�meros rolados. Voc� pode substituir qualquer jogada de ataque, teste de resist�ncia ou teste de habilidade feito por voc� ou por outra criatura que voc� possa ver por uma das rolagens de premuni��o. Voc� deve escolher fazer isso antes da rolagem e voc� pode substituir uma rolagem dessa forma apenas uma vez por rodada.\n" +
				"\tCada rolagem de premoni��o pode ser usada apenas uma vez. Quando voc� termina um descanso longo, voc� perde qualquer rolagem de premoni��o que n�o tenha sido usada.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Especialista em adivinha��o", "\tA partir do 6� n�vel, conjurar magias de adivinha��o se tornou t�o f�cil pra voc� que isso requer apenas uma fra��o do seu esfor�o de conjura��o. Quando voc� conjura uma magia de adivinha��o de 2� n�vel ou superior usando um espa�o de magia, voc� recupera um espa�o de magia gasto. O espa�o de magia que voc� recupera deve ser de um n�vel inferior ao da magia conjurada e n�o pode ser maior que 5� n�vel.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("O terceiro olho", "\tA partir do 10� n�vel, voc� pode usar sua a��o para aumentar seus poderes de percep��o. Quando o fizer, escolha um dos benef�cios a seguir, que dura at� voc� ficar incapacitado ou realizar um descanso curto ou longo. Voc� n�o pode usar essa caracter�stica novamente at� ter terminado um descanso longo.\n" +
				"\tVis�o no Escuro. Voc� adquire vis�o no escuro com alcance de 18 metros, como descrito no cap�tulo 8.\n" +
				"\tVis�o Et�rea. Voc� pode ver no Plano Et�reo com alcance de 18 metros.\n" +
				"\tCompreens�o Maior. Voc� pode ler qualquer idioma.\n" +
				"\tVer Invisibilidade. Voc� pode ver criaturas e objetos invis�veis a at� 3 metros de voc� aos quais voc� tenha linha de vis�o.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Prod�gio maior", "\tA partir do 14� n�vel, as vis�es em seus sonhos se intensificam e pintam um quadro mais preciso na sua mente do que est� para acontecer. Voc� rola tr�s d20s para a sua caracter�stica Prod�gio, ao inv�s de dois.\n\n", 14));	
	}

	@Override
	public String getDescricao() {
		return "\tOs conselhos de um adivinho s�o procurados tanto pela realeza quanto pelos plebeus comuns, por todos que buscam uma compreens�o mais clara do passado, presente e futuro. Como um adivinho, voc� se esfor�a para separar os v�us do espa�o, tempo e da consci�ncia, de modo que voc� possa ver claramente. Voc� trabalha para dominar magias de discernimento, vis�o remota, conhecimento sobrenatural e previs�o.\n";
	}
}
