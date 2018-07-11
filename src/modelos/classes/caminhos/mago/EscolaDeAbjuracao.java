package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeAbjuracao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Abjura��o";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Abjura��o instru�da", "\tQuando voc� escolhe essa escola no 2� n�vel, o ouro e o tempo que voc� precisa gastar para copiar uma magia da escola de abjura��o em seu grim�rio � reduzido � metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Prote��o arcana", "\tA partir do 2� n�vel, voc� pode tecer a magia a sua volta para prote��o. Quando voc� conjura uma magia de abjura��o de 1� n�vel ou superior, voc� pode, simultaneamente, usar uma vertente do poder da magia para criar uma prote��o m�gica em si mesmo, que dura at� voc� terminar um descanso longo. A prote��o tem pontos de vida iguais ao dobro do seu n�vel de mago + seu modificador de Intelig�ncia. Sempre que voc� sofrer dano, a prote��o sofrer� o dano no lugar. Se o dano reduzir a prote��o a 0 pontos de vida, voc� sofre qualquer dano remanescente.\n" +
				"\tQuando a prote��o estiver com 0 pontos de vida, ela n�o poder� mais absorver dano, mas a m�gica permanece. Toda vez que voc� conjurar uma magia de abjura��o de 1� n�vel ou superior, a prote��o recupera um n�mero de pontos de vida igual ao dobro do n�vel da magia.\n" +
				"\tUma vez que voc� tenha criado a prote��o, voc� n�o pode cri�-la novamente at� terminar um descanso longo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Prote��o projetada", "\tA partir do 6� n�vel, quando uma criatura que voc� possa ver a at� 9 metros sofrer dano, voc� pode usar sua rea��o para fazer com que sua Prote��o Arcana absorva aquele dano. Se esse dano reduzir a prote��o a 0 pontos de vida, a criatura protegida sofrer� qualquer dano remanescente.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Abjura��o aprimorada", "\tA partir do 10� n�vel, quando voc� conjurar uma magia de abjura��o que requeira que voc� realize um teste de habilidade como parte da conjura��o da magia (como em contram�gica e dissipar magia), voc� adiciona seu b�nus de profici�ncia a esse teste de habilidade.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Resist�ncia � magia", "\tA partir do 14� n�vel, voc� tem vantagem em testes de resist�ncia contra magia.\n" +
				"\tAl�m disso, voc� tem resist�ncia contra o dano de magias.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tA Escola de Abjura��o enfatiza magias que bloqueiam, expuls�o ou protegem. Detratores dessa escola dizem que sua tradi��o trata de contradi��o, nega��o, ao inv�s de asser��es positivas. Voc� compreende, no entanto, que terminar efeitos nocivos, proteger os fracos e banir influ�ncias malignas � tudo, menos um vazio filos�fico. � uma voca��o de orgulho e respeito.\n" +
				"\tChamados de abjuradores, membros dessa escola s�o procurados quando esp�ritos sinistros precisam ser exorcizados, quando locais importantes devem ser guardados contra espionagem m�gica e quando portais para outros planos de exist�ncia precisam ser selados.\n";
	}
}