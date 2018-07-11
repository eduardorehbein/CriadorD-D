package modelos.classes.caminhos.bardo;

import modelos.Habilidade;
import modelos.classes.Bardo;
import modelos.classes.caminhos.Caminho;

public class ColegioDoConhecimento implements Caminho<Bardo> {
	@Override
	public String toString() {
		return "Col�gio do Conhecimento";
	}

	@Override
	public void setHabilidades(Bardo classe) {
		classe.habilidadesAdd(new Habilidade("Profici�ncia adicional", "\tQuando voc� se junta ao Col�gio do Conhecimento no 3� n�vel, voc� ganha profici�ncia em tr�s per�cias, � sua escolha.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Palavras de interrup��o", "\tTamb�m no 3� n�vel, voc� aprende como usar sua perspic�cia para distrair, confundir e, de outras formas, atrapalhar a confian�a e compet�ncia de outros. Quando uma criatura que voc� pode ver a at� 18 metros de voc� realizar uma jogada de ataque, um teste de habilidade ou uma jogada de dano, voc� pode usar sua rea��o para gastar um uso de Inspira��o de Bardo, rolando o dado de Inspira��o de Bardo e subtraindo o n�mero rolado da rolagem da criatura. Voc� escolhe usar essa caracter�stica depois da criatura fazer a rolagem, mas antes do Mestre determinar se a jogada de ataque ou teste de habilidade foi bem ou mal sucedido, ou antes da criatura causar dano. A criatura ser� imune se n�o puder ouvir ou se n�o puder ser enfeiti�ada.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Segredos m�gicos adicionais", "\tNo 6� n�vel, voc� aprende duas magias, � sua escolha, de qualquer classe. As magias que voc� escolher devem ser de um n�vel que voc� possa conjurar, como mostrado na tabela O Bardo, ou um truque. As magias escolhidas contam como magias de bardo pra voc�, mas n�o contam no n�mero de magias de bardo que voc� conhece.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Per�cia inigual�vel", "\tA partir do 14� n�vel, quando voc� fizer um teste de habilidade, voc� pode gastar um uso de Inspira��o de Bardo. Role o dado de Inspira��o de Bardo e adicione o n�mero rolado ao seu teste de habilidade. Voc� pode escolher fazer isso depois de rolar o dado do teste de habilidade, mas antes do Mestre dizer se foi bem ou mal sucedido.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tBardos do Col�gio do Conhecimento conhecem algo sobre a maioria das coisas, coletando peda�os de conhecimento de fontes t�o diversas quanto tomos eruditos ou contos de camponeses. Quer seja cantando baladas populares em taverna, quer seja elaborando composi��es para cortes reais, esses bardos usam seus dons para manter a audi�ncia enfeiti�ada. Quando os aplausos acabam, os membros da audi�ncia v�o estar se questionando se tudo que eles creem � verdade, desde sua cren�a no sacerd�cio do templo local at� sua lealdade ao rei.\n" +
				"\tA fidelidade desses bardos reside na busca pela beleza e verdade, n�o na lealdade a um monarca ou em seguir os dogmas de uma divindade. Um nobre que mantem um bardo desses como seu arauto ou conselheiro, sabe que o bardo prefere ser honesto que pol�tico.\n" +
				"\tOs membros do col�gio se re�nem em bibliotecas e, as vezes, em faculdades de verdade, completas com salas de aula e dormit�rios, para partilhar seu conhecimento uns com os outros. Eles tamb�m se encontram em festivais ou em assuntos de estado, onde eles podem expor corrup��o, desvendar mentiras e zombar da superestima de figuras de autoridade.\n";
	}
}
