package modelos.classes.caminhos.ladino;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Ladino;
import modelos.classes.caminhos.Caminho;

public class TrapaceiroArcano implements Caminho<Ladino>, Magica {
	@Override
	public String toString() {
		return "Trapaceiro Arcano";
	}
	
	@Override
	public void setHabilidades(Ladino classe) {
		//TODO tabela
		classe.habilidadesAdd(new Habilidade("Conjura��o", "\tQuando voc� alcan�ar o 3� n�vel, voc� adquire a habilidade de conjurar magias. Veja o cap�tulo 10 para as regras gerais de conjura��o e o cap�tulo 11 para a lista de magias de mago.\n" +
				"\tTruques. Voc� aprende tr�s truques: m�os m�gicas e outros dois truques, � sua escolha, da lista de magias de mago. Voc� aprende um truque de mago adicional, � sua escolha, no 10� n�vel.\n" + 
				"\tEspa�os de Magia. A tabela Conjura��o de Trapaceiro Arcano mostra quantos espa�os de magia de 1� n�vel e superiores voc� possui dispon�veis para conjura��o. Para conjurar uma dessas magias, voc� deve gastar uma espa�o de magia do n�vel da magia ou superior. Voc� recobra todos os espa�os de magia gastos quando voc� completa um descanso longo. Por exemplo, se voc� quiser conjurar a magia de 1� n�vel enfeiti�ar pessoa e voc� tiver um espa�o de magia de 1� n�vel e um de 2� n�vel dispon�veis, voc� poder� conjurar enfeiti�ar pessoa usando qualquer dos dois espa�os.\n" + 
				"\tMagias Conhecidas de 1� N�vel e Superiores. Voc� conhece tr�s magias de 1� n�vel, � sua escolha, as quais duas delas voc� deve escolher das magias de encantamento e ilus�o da lista de magias de mago. A coluna Magias Conhecidas na tabela Conjura��o do Trapaceiro Arcano mostra quando voc� aprende mais magias de mago, de 1� n�vel ou superior. Cada uma dessas magias deve ser uma magia de encantamento ou ilus�o, � sua escolha, de um n�vel a que voc� tenha acesso, como mostrado na tabela. Por exemplo, quando voc� alcan�a o 7� n�vel da classe, voc� pode aprender uma nova magia de 1� ou 2� n�vel. As magias que voc� aprende no 8�, 14� e 20� n�vel podem vir de qualquer escola de magia. Al�m disso, quando voc� adquire um n�vel nessa classe, voc� pode escolher uma magia de mago que voc� conhe�a e substitu�-la por outra magia da lista de magias de mago, que tamb�m deve ser de um n�vel ao qual voc� tenha espa�os de magia e deve ser uma magia de encantamento ou ilus�o, exceto as magias substitu�das no 8�, 14� e 20� n�vel.\n" + 
				"\tHabilidade de Conjura��o. Sua habilidade de conjura��o � Intelig�ncia para suas magias de mago, portanto, voc� usa sua Intelig�ncia sempre que alguma magia se referir � sua habilidade de conjurar magias. Al�m disso, voc� usa o seu modificador de Intelig�ncia para definir a CD dos testes de resist�ncia para as magias de mago que voc� conjura e quando voc� realiza uma jogada de ataque com uma magia.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("M�os m�gicas malabaristas", "\tA partir do 3� n�vel, quando voc� conjurar m�os m�gicas, voc� pode fazer a m�o espectral ficar invis�vel e poder� realizar as seguintes tarefas adicionais:\n" +
				"\t* Voc� pode guardar um objeto que a m�o estiver segurando em um recipiente vestido ou carregado por outra criatura.\n" +
				"\t* Voc� pode recuperar um objeto guardado em um recipiente vestido ou carregado por outra criatura.\n" +
				"\t* Voc� pode usar ferramentas de ladr�o para abrir fechaduras ou desarmar armadilhas � dist�ncia.\n" +
				"\tVoc� pode realizar qualquer dessas tarefas sem ser notado por uma criatura se for bem sucedido num teste de Destreza (Prestidigita��o) resistido por um teste de Sabedoria (Percep��o) da criatura.\n" +
				"\tAl�m disso, voc� pode usar a a��o b�nus concedida por sua A��o Ardilosa para controlar a m�o.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Emboscada m�gica", "\tA partir do 9� n�vel, se voc� estiver escondido de uma criatura quando conjurar uma magia nela, a criatura ter� desvantagem em qualquer teste de resist�ncia que ela fizer contra a magia nesse turno.\n\n", 9));
		classe.habilidadesAdd(new Habilidade("Trapaceiro vers�til", "\tNo 13� n�vel, voc� ganha a habilidade de distrair alvos com suas m�os m�gicas. Com uma a��o b�nus, no seu turno, voc� pode designar uma criatura a at� 1,5 metro da m�o espectral criada por essa magia. Fazer isso, lhe concede vantagem nas jogadas de ataque contra essa criatura at� o final do turno.\n\n", 13));
		classe.habilidadesAdd(new Habilidade("Ladr�o de magia", "\tNo 17� n�vel, voc� ganha a habilidade de, magicamente, roubar o conhecimento de como conjurar uma magia de outro conjurador.\n" +
				"\tImediatamente depois de uma criatura conjurar uma magia que tenha voc� como alvo ou inclua voc� na sua �rea de efeito, voc� pode usar sua rea��o para for�ar a criatura a realizar um teste de resist�ncia com o modificador de habilidade de conjura��o dele. A CD � igual a CD das suas magias. Numa falha, voc� ignora o efeito da magia sobre voc� e rouba o conhecimento da magia, se ela for de, pelo menos, 1� n�vel e de um n�vel que voc� possa conjurar (n�o precisa ser uma magia de mago). Pelas pr�ximas 8 horas, voc� conhece a magia e pode conjur�-la usando seus espa�os de magia. A criatura n�o pode conjurar a magia at� que 8 horas tenham se passado.\n" +
				"\tUma vez que voc� tenha usado essa caracter�stica, voc� n�o pode us�-la novamente at� ter terminado um descanso longo.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		//Aqui por classe de mago
	}

	@Override
	public String getDescricao() {
		return "\tAlguns ladinos aprimoram suas finas per�cias de furtividade e agilidade com magia, aprendendo truques de encantamento e ilus�o. Esses ladinos incluem n�o somente batedores de carteira e assaltantes, mas tamb�m trapaceiros, enganadores e um n�mero significativo de aventureiros.\n";
	}
}
