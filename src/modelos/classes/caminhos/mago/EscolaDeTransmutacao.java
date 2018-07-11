package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeTransmutacao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Transmuta��o";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Transmuta��o instru�da", "\tQuando voc� escolhe essa escola no 2� n�vel, o ouro e o tempo que voc� precisa gastar para copiar uma magia da escola de transmuta��o em seu grim�rio � reduzido � metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Alquimia menor", "\tA partir do 2� n�vel, quando voc� escolhe essa escola, voc� pode alterar temporariamente as propriedades f�sicas de um objeto n�o-m�gico, alterando-o de uma substancia para outra. Voc� realiza um procedimento alqu�mico especial em um objeto composto inteiramente de madeira, pedra (mas n�o uma pedra preciosa), ferro, cobre ou prata, transformando-o em um material diferente dentre esses. Para cada 10 minutos que voc� gastar realizando esse procedimento, voc� pode transformar 30 cent�metros c�bicos de material. Ap�s 1 hora, ou at� voc� perder sua concentra��o (como es estivesse se concentrando em uma magia) o material reverte � sua substancia original.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Pedra de transmutador", "\tA partir do 6� n�vel, voc� pode gastar 8 horas criando uma pedra de transmutador que armazena magia de transmuta��o. Voc� pode se beneficiar da pedra ou d�-la para outra criatura. Uma criatura ganha um benef�cio, � sua escolha, enquanto a pedra estiver em sua posse. Quando voc� cria a pedra, escolha um benef�cio dentre as op��es a seguir:\n" +
				"\t* Vis�o no escuro com alcance de 18 metros, como descrito no cap�tulo 8\n" +
				"\t* Um aumento de 3 metros no deslocamento enquanto a criatura n�o estiver sobrecarregada\n" +
				"\t* Profici�ncia em testes de resist�ncia de Constitui��o\n" +
				"\t* Resist�ncia a dano de �cido, frio, fogo, el�trico ou trovejante (escolhido por voc� quando escolhe esse benef�cio)\n" +
				"\tCada vez que voc� conjurar uma magia de conjura��o de 1� n�vel ou superior, voc� pode mudar o efeito da sua pedra, se ela estiver em sua posse.\n" +
				"\tSe voc� criar uma nova pedra de transmutador, a anterior para de funcionar.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Metamorfo", "\tNo 10� n�vel, voc� adiciona a magia metamorfose ao seu grim�rio, se voc� ainda n�o a possuir. Voc� pode conjurar metamorfose sem gastar um espa�o de magia. Quando o fizer, voc� s� pode escolher a si mesmo como alvo e se transforma em uma besta com n�vel de desafio 1 ou menor.\n" +
				"\tQuando voc� conjurar metamorfose dessa forma, voc� n�o poder� faz�-lo novamente at� terminar um descanso curto ou longo, apesar de ainda poder conjur�-la normalmente usando espa�os de magia dispon�veis.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Mestre transmutador", "\tA partir do 14� n�vel, voc� pode usar sua a��o para consumir a reserva de magia de transmuta��o armazenada dentro da sua pedra de transmutador em uma �nica explos�o. Quando o fizer, escolha um dos seguintes efeitos. Sua pedra de transmutador � destru�da e n�o pode ser refeita at� voc� terminar um descanso longo.\n" +
				"\tTransforma��o Maior. Voc� pode transmutar um objeto n�o-m�gico � n�o maior que 1,5 metro cubico � em outro objeto n�o-m�gico de tamanho e massa similares e de valor igual ou inferior. Voc� deve gastar 10 minutos manipulando o objeto para transform�-lo.\n" +
				"\tPanaceia. Voc� remove todas as maldi��es, doen�as e venenos afetando uma criatura que voc� tocar com sua pedra de transmutador. A criatura tamb�m recupera todos os seu pontos de vida.\n" +
				"\tRestaurar Vida. Voc� pode conjurar reviver mortos em uma criatura que voc� tocar com sua pedra de transmutador, sem gastar espa�o de magia ou precisar ter a magia no seu grim�rio.\n" +
				"\tRestaurar Juventude. Voc� toca a pedra de transmutador em uma criatura volunt�ria e a idade aparente da criatura � reduzida em 3d10 anos, para o m�nimo de 13 anos. Esse efeito n�o estende a vida �til da criatura.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tVoc� � um estudante de magias que modificam energia e mat�ria. Para voc�, o mundo n�o � uma coisa fixa, mas sim eminentemente mut�vel e voc� se deleita em ser um agente da mudan�a. Voc� empunha a mat�ria-prima da cria��o e aprendeu tanto formas f�sicas quanto qualidades mentais. Sua magia lhe d� as ferramentas para se tornar o ferreiro na forja da realidade.\n" +
				"\tAlguns transmutadores s�o vigaristas ou brincalh�es, transformando pessoas em sapos e transformando cobre em prata por divers�o e lucro ocasional. Outros perseguem seus estudos m�gicos com uma seriedade m�rbida, buscando o poder dos deuses de criar e destruir mundos.\n";
	}
}
