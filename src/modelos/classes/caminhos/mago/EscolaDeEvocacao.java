package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeEvocacao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Evoca��o";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Evoca��o instru�da", "\tQuando voc� escolhe essa escola no 2� n�vel, o ouro e o tempo que voc� precisa gastar para copiar uma magia da escola de evoca��o em seu grim�rio � reduzido � metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Esculpir magias", "\tA partir do 2� n�vel, voc� pode criar bols�es de seguran�a relativa contra os efeitos de suas magias de evoca��o. Quando voc� conjurar uma magia de evoca��o que afeta outras criaturas que voc� possa ver, voc� pode escolher um n�mero delas igual a 1 + o n�vel da magia. As criaturas escolhidas passam automaticamente em seus testes de resist�ncia contra a magia conjurada e elas n�o sofrem dano se normalmente sofreriam metade em um sucesso no teste de resist�ncia.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Truque potente", "\tA partir do 6� n�vel, seus truques de dano afetam at� mesmo as criaturas que evitariam a for�a daquele efeito. Quando uma criatura passa em um teste de resist�ncia de seus truques, ela sofre metade do dano (se existir), mas n�o sofre nenhum efeito adicional.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Evoca��o potencializada", "\tA partir do 10� n�vel, voc� pode adicionar seu modificador de Intelig�ncia no resultado das jogadas de dano de qualquer magia de evoca��o de mago que voc� conjurar. O bonus de dano se aplica a uma rolagem de dano da magia, n�o � m�ltiplas rolagens.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Sobrecarga", "\tA partir do 14� n�vel, voc� pode aumentar o poder de suas magias mais simples. Quando voc� conjurar uma magia de mago de 5� n�vel ou inferior (exceto truques) que cause dano, a magia causa o dano m�ximo.\n" +
				"\tA primeira vez que fizer isso, voc� n�o sofre qualquer efeito adverso. Por�m, se usar de novo essa caracter�stica antes de terminar um descanso longo, voc� sofre 2d12 de dano necr�tico para cada n�vel de magia, imediatamente ap�s conjur�-la. Cada vez que voc� usar essa caracter�stica antes de terminar um descanso longo, o dano necr�tico por n�vel da magia aumenta em 1d12. Esse dano ignora qualquer resist�ncia ou imunidade.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tVoc� foca seu estudo para criar poderosos efeitos elementais, como um frio cortante, uma chama intensa, um trov�o estrondoso, um rel�mpago devastador e �cido ardente. Alguns evocadores encontram emprego nas for�as militares, servindo como artilharia para explodir fileiras inimigas de longe. Outros usam seu poder espetacular para proteger os fracos, enquanto alguns buscam o ganho pr�prio como bandidos, aventureiros ou aspirantes de tiranos.\n";
	}
}
