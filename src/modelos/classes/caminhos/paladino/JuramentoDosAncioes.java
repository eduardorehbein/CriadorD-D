package modelos.classes.caminhos.paladino;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Paladino;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class JuramentoDosAncioes implements Caminho<Paladino>, Magica {
	@Override
	public String toString() {
		return "Juramento dos Anci�es";
	}
	
	@Override
	public void setHabilidades(Paladino classe) {
		classe.habilidadesAdd(new Habilidade("Dogmas dos anci�es", "\tOs dogmas do Juramento dos Anci�es tem sido preservados por incont�veis s�culos. Esse juramento enfatiza os princ�pios do bem acima de qualquer interesse de ordem ou caos. Seus quatro princ�pios centrais s�o simples.\n" +
				"\tAcenda a Luz. Atrav�s dos seus atos de miseric�rdia, gentileza e piedade, acenda a luz da esperan�a no mundo, afastando o desespero.\n" +
				"\tAbrigue a Luz. Onde houver bem, beleza, amor e riso no mundo, mantenha-se contra a maldade que pode engolir isso. Onde a vida floresce, mantenha-se contra as for�as que podem torn�-la est�ril.\n" +
				"\tPreserve Sua Pr�pria Luz. Deleite-se com m�sica e risadas, beleza e arte. Se voc� permitir que a luz morra em seu cora��o, voc� n�o poder� preserv�-la no mundo.\n" +
				"\tSeja a Luz. Seja uma glorioso guia para todos que vivem em desespero. Deixe a luz da sua alegria e coragem brilhar atrav�s de todos os seus feitos.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade", "\tQuando voc� faz esse juramento, no 3� n�vel, voc� ganha as duas op��es seguintes de Canalizar Divindade.\n" +
				"\tF�ria da Natureza. Voc� pode usar seu Canalizar Divindade para invocar for�as primitivas para enredar um oponente. Com uma a��o, voc� pode fazer com que vinhas espectrais cres�am e alcancem uma criatura a at� 3 metros de voc�, que voc� possa ver. A criatura deve ser bem sucedida num teste de resist�ncia de For�a ou Destreza (a escolha dela) ou ficar� impedida. Enquanto estiver impedida pelas vinhas, a criatura repete o teste de resist�ncia no final de cada turno dela. Se obtiver sucesso, ela se liberta e as vinhas desaparecem.\n" +
				"\tExpulsar os Infi�is. Voc� pode usar seu Canalizar Divindade para pronunciar palavras antigas que s�o dolorosas para fadas e corruptores que as ouvem. Com uma a��o, voc� ergue seu s�mbolo sagrado e cada fada ou corruptor que puder ver ou ouvir voc� e esteja a at� 9 metros, deve realizar um teste de resist�ncia de Sabedoria. Se a criatura falhar no teste de resist�ncia, ela ser� expulsa por 1 minuto ou at� sofrer dano.\n" +
				"\tUma criatura expulsa deve gastar seu turno tentando se mover para longe de voc� da melhor forma poss�vel e n�o pode, voluntariamente, se mover para um espa�o a menos de 9 metros de voc�. Ela tamb�m n�o pode realizar rea��es. Nas a��es delas, elas s� poder�o realizar a a��o de Disparada ou tentar escapar de um efeito que as impe�a de se mover. Se n�o houver lugar para se mover, a criatura pode usar a a��o de Esquivar.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Aura de vigil�ncia", "\tA partir do 7� n�vel, a magia antiga fica t�o profunda em voc� que ela forma uma prote��o m�stica. Voc� e as criaturas amistosas a at� 3 metros tem resist�ncia ao dano de magias.\n" +
				"\tNo 18� n�vel, o alcance dessa aura aumenta para 9 metros.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Sentinela imortal", "\tA partir do 15� n�vel, quando voc� for reduzido a 0 pontos de vida, mas n�o morrer totalmente, voc� pode escolher cair para 1 ponto de vida no lugar. Uma vez que voc� use essa caracter�stica, n�o poder� faz�-lo novamente at� ter terminado um descanso longo.\n" +
				"\tAl�m disso, voc� n�o sofre nenhum efeito colateral por envelhecer e voc� n�o pode envelhecer magicamente.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Campe�o dos anci�es", "\tNo 20� n�vel, voc� pode assumir a forma de uma antiga for�a da natureza, tomando a apar�ncia que desejar. Por exemplo, sua pele poderia ficar verde ou adquirir uma textura de casca de �rvore, seu cabelo poderia ficar com apar�ncia de folhas ou musgo ou poderia crescer galhadas ou uma juba como a de um le�o.\n" +
				"\tUsando sua a��o, voc� sofre uma transforma��o. Por 1 minuto, voc� ganha os seguintes benef�cios:\n" +
				"\t* No in�cio de cada um dos seus turnos, voc� recupera 10 pontos de vida.\n" +
				"\t* Sempre que voc� for conjurar uma magia de paladino que tiver um tempo de conjura��o de 1 a��o, voc� pode conjur�-la usando uma a��o b�nus, ao inv�s.\n" +
				"\t* Criaturas inimigas a at� 3 metros de voc� tem desvantagem em testes de resist�ncia contra suas magias de paladino e as op��es de Canalizar Divindade.\n" +
				"\tUma vez que voc� use essa caracter�stica, n�o poder� faz�-lo novamente at� ter terminado um descanso longo.\n\n", 20));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}
	
	@Override
	public String getDescricao() {
		return "\tO Juramento dos Anci�es � t�o antigo quanto a ra�a dos elfos e os rituais dos druidas. Algumas vezes chamados de cavaleiros fe�ricos, cavaleiros verdejantes ou cavaleiros dos chifres, paladinos que fazem esse juramento lan�am sua sorte com o lado da luz na batalha c�smica contra as trevas, porque eles amam as coisas belas e vivificantes do mundo, n�o necessariamente porque eles acreditam em princ�pios de honra, coragem e justi�a. Eles adornam suas armaduras e roupas com imagens de coisas que crescem � folhas, galhadas ou flores � para refletir seu comprometimento em preservar a vida e a luz no mundo.\n";
	}
}
