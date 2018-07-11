package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeNecromancia implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Necromancia";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Necromancia instru�da", "\tQuando voc� escolhe essa escola no 2� n�vel, o ouro e o tempo que voc� precisa gastar para copiar uma magia da escola de necromancia em seu grim�rio � reduzido � metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Colheita sinistra", "\tA partir do 2� n�vel, voc� ganha a habilidade de ceifar a energia vital das criaturas que voc� mata com suas magias. Uma vez por turno, quando voc� matar uma ou mais criaturas com uma magia de 1� n�vel ou superior, voc� recupera uma quantidade de pontos de vida igual ao dobro do n�vel da magia ou o triplo do seu n�vel, se a magia pertencer a Escola de Necromancia. Voc� n�o recebe esse benef�cio por matar constructos ou mortos-vivos.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Escravos mortos-vivos", "\tNo 6� n�vel, voc� adiciona a magia animar mortos ao seu grim�rio se voc� ainda n�o a possuir. Quando voc� conjurar animar mortos, voc� pode escolher um corpo ou pilha de ossos adicional, criando outro zumbi ou esqueleto, como apropriado.\n" +
				"\tToda vez que voc� criar um morto-vivo atrav�s de uma magia de necromancia, ele ter� benef�cios adicionais:\n" +
				"\t* O m�ximo de pontos de vida da criatura aumenta numa quantidade igual a seu n�vel de mago.\n" +
				"\t* A criatura adiciona seu b�nus de profici�ncia as suas jogadas de dano.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Acostumado � morte-vida", "\tA partir do 10� n�vel, voc� ter� resist�ncia a dano necr�tico e seu m�ximo de pontos de vida n�o pode ser reduzido. Voc� gastou tanto tempo lidando com mortos-vivos e com as for�as que os animam que voc� se acostumou a alguns dos seus piores efeitos.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Comandar mortos-vivos", "\tA partir do 14� n�vel, voc� pode usar magia para trazer mortos-vivos ao seu controle, at� os criados por outros magos. Com uma a��o, voc� pode escolher um morto-vivo que voc� possa ver a at� 18 metros. Essa criatura deve realizar um teste de resist�ncia de Carisma com CD igual das suas magias de mago. Se ela for bem sucedida, voc� n�o poder� usar essa caracter�stica nela novamente. Se ela falhar, ela se tornar� amistosa a voc� e obedecer� seus comandos at� voc� usar essa caracter�stica novamente.\n" +
				"\tMortos-vivos inteligentes s�o dif�ceis de controlar dessa forma. Se o alvo tiver Intelig�ncia 8 ou superior, ele ter� vantagem no teste de resist�ncia. Se ele fracassar no teste de resist�ncia e tiver Intelig�ncia 12 ou superior, ele poder� repetir o teste de resist�ncia ao final de cada hora at� que obtenha sucesso e se liberte.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tA Escola de Necromancia explora as for�as c�smicas da vida, morte e morte-vida. � medida que voc� foca seus estudos nessa tradi��o, voc� aprende a manipular a energia que anima todas as coisas vivas. Enquanto progride, voc� aprende a retirar a for�a vital de uma criatura enquanto sua magia destr�i seu corpo, transformando a energia vital em poder m�gico que voc� pode manipular.\n" +
				"\tA maioria das pessoas veem necromantes como amea�as, ou at� mesmo vil�es, devido a sua associa��o intima com a morte. Nem todos os necromantes s�o malignos, mas as for�as que eles manipulam s�o consideradas tabu por diversas sociedades.\n";
	}
}
