package modelos.classes.caminhos.guerreiro;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Guerreiro;
import modelos.classes.caminhos.Caminho;

public class CavaleiroArcano implements Caminho<Guerreiro>, Magica {
	@Override
	public String toString() {
		return "Cavaleiro Arcano";
	}
	
	@Override
	public void setHabilidades(Guerreiro classe) {
		//TODO tabela
		classe.habilidadesAdd(new Habilidade("Conjura��o", "\tQuando voc� alcan�ar o 3� n�vel, voc� amplia o seu poderio marcial com a habilidade de conjurar magias. Veja o cap�tulo 10 para as regras gerais de conjura��o e o cap�tulo 11 para a lista de magias de mago." +
				"\tTruques. Voc� aprende dois truques, � sua escolha, da lista de magias de mago. Voc� aprende um truque de mago adicional, � sua escolha, no 10� n�vel.\n" +
				"\tEspa�os de Magia. A tabela Conjura��o de Cavaleiro Arcano mostra quantos espa�os de magia de 1� n�vel e superiores voc� possui dispon�veis para conjura��o. Para conjurar uma dessas magias, voc� deve gastar uma espa�o de magia do n�vel da magia ou superior. Voc� recobra todos os espa�os de magia gastos quando voc� completa um descanso longo. Por exemplo, se voc� quiser conjurar a magia de 1� n�vel escudo arcano e voc� tiver um espa�o de magia de 1� n�vel e um de 2� n�vel dispon�veis, voc� poder� conjurar escudo arcano usando qualquer dos dois espa�os.\n" +
				"\tMagias Conhecidas de 1� N�vel e Superiores. Voc� conhece tr�s magias de 1� n�vel, � sua escolha, as quais duas delas voc� deve escolher das magias de abjura��o e evoca��o da lista de magias de mago. A coluna Magias Conhecidas na tabela Conjura��o do Cavaleiro Arcano mostra quando voc� aprende mais magias de mago, de 1� n�vel ou superior. Cada uma dessas magias deve ser uma magia de abjura��o ou evoca��o, � sua escolha, de um n�vel a que voc� tenha acesso, como mostrado na tabela. Por exemplo, quando voc� alcan�a o 7� n�vel da classe, voc� pode aprender uma nova magia de 1� ou 2� n�vel. As magias que voc� aprende no 8�, 14� e 20� n�vel podem vir de qualquer escola de magia. Al�m disso, quando voc� adquire um n�vel nessa classe, voc� pode escolher uma magia de mago que voc� conhe�a e substitu�-la por outra magia da lista de magias de mago, que tamb�m deve ser de um n�vel ao qual voc� tenha espa�os de magia e deve ser uma magia de abjura��o ou evoca��o, exceto as magias substitu�das no 8�, 14� e 20� n�vel.\n" +
				"\tHabilidade de Conjura��o. Sua habilidade de conjura��o � Intelig�ncia para suas magias de mago, portanto, voc� usa sua Intelig�ncia sempre que alguma magia se referir � sua habilidade de conjurar magias. Al�m disso, voc� usa o seu modificador de Intelig�ncia para definir a CD dos testes de resist�ncia para as magias de mago que voc� conjura e quando voc� realiza uma jogada de ataque com uma magia.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("V�nculo com arma", "\tNo 3� n�vel, voc� aprende um ritual que cria um v�nculo m�gico entre voc� e uma arma. Voc� realiza esse ritual no curso de 1 hora, que pode ser realizada durante um descanso curto. A arma deve estar ao seu alcance ao decorrer do ritual, ao conclu�-lo, voc� toca a arma e forja o elo.\n" +
				"\tUma vez que voc� tenha vinculado uma arma a voc�, voc� n�o pode ser desarmado dessa arma, a menos que voc� esteja incapacitado. Se ela estiver no mesmo plano de exist�ncia, voc� pode invocar essa arma com uma a��o b�nus, no seu turno, fazendo-a se teletransportar instantaneamente para a sua m�o.\n" +
				"\tVoc� pode ter at� duas armas vinculadas, mas s� pode invocar uma por vez com sua a��o b�nus. Se voc� quiser criar um elo com uma terceira arma, voc� deve quebrar o v�nculo com um das outras duas.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Magia de guerra", "\tA partir do 7� n�vel, quando voc� usar sua a��o para conjurar um truque, voc� pode realizar um ataque com arma, com uma a��o b�nus.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Golpe m�stico", "\tNo 10� n�vel, voc� aprende como fazer com que os seus golpes com arma penetrem a resist�ncia de uma criatura �s suas magias. Quando voc� atingir uma criatura com um ataque com arma, aquela criatura ter� desvantagem no pr�ximo teste de resist�ncia que ela fizer contra uma magia que voc� conjurar antes do final do seu pr�ximo turno.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Investida arcana", "\tNo 15� n�vel, voc� ganha a capacidade de se teletransportar at� 9 metros para um espa�o desocupado que voc� possa ver, quando voc� usar seu Surto de A��o. Voc� pode se teletransportar antes ou depois da a��o adicional.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Magia de guerra aprimorada", "\tA partir do 18� n�vel, quando voc� usar sua a��o para conjurar uma magia, voc� pode realizar um ataque com arma, com uma a��o b�nus.\n\n", 18));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		//Aqui por classe de mago
	}

	@Override
	public String getDescricao() {
		return "\tO arqu�tipo de Cavaleiro Arcano combina a maestria marcial comum a todos os guerreiros, com um cuidadoso estudo de magia. Os cavaleiros arcanos usam t�cnicas m�gicas similares as praticadas pelos magos. Eles focam seu estudo em duas das oito escolas: abjura��o e evoca��o. As magia de abjura��o concedem prote��o adicional em batalha ao Cavaleiro Arcano, e as magias de evoca��o causam dano a v�rios oponentes de uma vez, estendendo o alcance do guerreiro em combate. Esses cavaleiros aprendem, comparativamente, um pequeno n�mero de magias, guardando-as na mem�ria ao inv�s de mant�-las em um grim�rio.\n";
	}
}
