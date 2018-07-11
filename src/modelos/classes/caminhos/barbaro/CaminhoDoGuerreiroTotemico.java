package modelos.classes.caminhos.barbaro;

import modelos.Habilidade;
import modelos.classes.Barbaro;
import modelos.classes.caminhos.Caminho;

public class CaminhoDoGuerreiroTotemico implements Caminho<Barbaro> {
	@Override
	public String toString() {
		return "Caminho do Guerreiro Tot�mico";
	}

	@Override
	public void setHabilidades(Barbaro classe) {
		classe.habilidadesAdd(new Habilidade("Conselheiro espiritual", "\tSeu caminho � buscar a sintonia com o mundo natural, concedendo a voc� uma afinidade com as bestas. A partir do 3� n�vel, quando voc� toma esse caminho, voc� recebe a habilidade de conjurar as magias sentido bestial e falar com animais, mas apenas na forma de rituais, como descrito no cap�tulo 10.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Totem espiritual", "\tA partir do 3� n�vel, quando voc� adota esse caminho, voc� escolhe um totem espiritual e ganha suas caracter�sticas. Voc� deve fazer ou adquirir um objeto f�sico como totem � um amuleto ou adorno similar � que incorpora o pelo ou penas, garras, dente ou ossos do animal tot�mico. Se voc� quiser, voc� tamb�m adquire pequenos atributos f�sicos que o assemelham ao seu totem espiritual. Por exemplo, se voc� tiver o totem espiritual do urso, voc� seria incomumente peludo e de pele grossa, ou se o seu totem for a �guia, seu olhos teriam um brilho amarelado.\n" +
				"\tSeu totem animal deve ser um animal relacionado aos listados aqui, mas pode ser um mais apropriado a sua terra natal. Por exemplo, voc� poderia escolher falc�o ou abutre ao inv�s de �guia.\n" +
				"\t�guia. Quando estiver em f�ria e n�o estiver vestindo uma armadura pesada, as outras criaturas ter�o desvantagem nas jogadas de ataque de oportunidade contra voc� e voc� pode usar a a��o de Disparada como uma a��o b�nus no seu turno. O espirito da �guia torna voc� um predador que pode vagar pelo meio da briga com facilidade.\n" +
				"\tLobo. Quando estiver em f�ria, seus amigos tem vantagem nas jogadas de ataque corpo-a-corpo realizadas contra qualquer criatura a 1,5 metro de voc� que seja hostil a voc�. O espirito do lobo transforma voc� em um l�der de ca�a.\n" +
				"\tUrso. Quando em f�ria, voc� adquire resist�ncia a todos os tipos de dano, exceto os f�sicos. O espirito do urso torna voc� vigoroso o suficiente para permanecer de p� diante de qualquer castigo.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Aspecto da besta", "\tNo 6� n�vel, voc� adquire um benef�cio m�stico baseado no totem que voc� escolheu. Voc� pode escolher o mesmo animal que selecionou no 3� n�vel ou um diferente.\n" +
				"\t�guia. Voc� ganha a vis�o agu�ada de uma �guia. Voc� pode ver a at� 1,6 km sem dificuldade, sendo capaz de discernir at� os menores detalhes quando estiver olhando para algo a menos de 30 metros de voc�. Al�m disso, penumbra n�o imp�em desvantagem nos seus testes de Sabedoria (Percep��o).\n" +
				"\tLobo. Voc� ganha a sensibilidade predat�ria de um lobo. Voc� pode rastrear outras criaturas quando estiver viajando a passo r�pido e voc� pode se mover furtivamente quando estiver viajando a passo normal (veja o cap�tulo 8 para as regras de passo de viagem).\n" +
				"\tUrso. Voc� ganha a for�a de um urso. Sua capacidade de carga (incluindo carga m�xima e capacidade de erguer) � dobrada e voc� tem vantagem em testes de For�a realizados para empurrar, puxar, erguer ou quebrar objetos.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Andarilho espiritual", "\tNo 10� n�vel, voc� pode conjurar a magia comunh�o com a natureza, mas apenas como um ritual. Quando o fizer, uma vers�o espiritual de um dos animais que voc� escolheu como Totem Espiritual ou Aspecto da Besta aparece para voc� para transmitir a informa��o que voc� busca.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Sintonia tot�mica", "\tNo 14� n�vel, voc� ganha um benef�cio magico baseado em um totem animal, � sua escolha. Voc� pode escolher o mesmo animal que selecionou anteriormente ou um diferente.\n" +
				"\t�guia. Quando estiver em f�ria, voc� adquire um deslocamento de voo igual ao seu deslocamento de caminhada. Esse benef�cio funciona apenas em pequenos explos�es: voc� cai se terminar seu turno no ar e n�o tiver nada em que possa se agarrar.\n" +
				"\tLobo. Quando estiver em f�ria, voc� pode usar uma a��o b�nus no seu turno para derrubar uma criatura Grande ou menor no ch�o quando voc� atingi-la com um ataque corpo-a-corpo com arma.\n" +
				"\tUrso. Quando estiver em f�ria, qualquer criatura a at� 1,5 metro de voc� que for hostil a voc� ter� desvantagem nas jogadas de ataque contra outros alvos al�m de voc� ou outro personagem com essa caracter�stica. Um inimigo � imune a esse efeito se ele n�o puder ver ou ouvir voc� ou caso ele n�o possa ser amedrontado.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tO Caminho do Guerreiro Tot�mico � uma jornada espiritual, � partir do momento que o b�rbaro aceita um espirito animal como seu guia, protetor e inspira��o. Em batalha, seu espirito tot�mico preenche voc� com for�a sobrenatural, adicionando combust�vel m�gico a sua f�ria b�rbara.\n" +
				"\tA maioria das tribos b�rbaras consideram que um animal tot�mico possui parentesco a um cl� em particular. Em tais casos, � incomum a um indiv�duo possuir mais de um espirito animal tot�mico, apesar de existirem exce��es.\n";
	}
}
