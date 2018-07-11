package modelos.classes.caminhos.druida;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Druida;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class CirculoDaLua implements Caminho<Druida>, Magica {
	@Override
	public String toString() {
		return "C�rculo da Lua";
	}
	
	@Override
	public void setHabilidades(Druida classe) {
		classe.habilidadesAdd(new Habilidade("Forma selvagem de combate", "\tQuando voc� escolhe esse c�rculo, no 2� n�vel, voc� recebe a habilidade de usar sua Forma Selvagem no seu turno com uma a��o b�nus, ao inv�s de com uma a��o.\n" +
				"\tAl�m disso, enquanto voc� estiver transformando pela sua Forma Selvagem, voc� pode usar uma a��o b�nus para gastar uma espa�o de magia e ganhar 1d8 pontos de vida por n�vel do espa�o de magia gasto.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Formas de c�rculo", "\tOs ritos do seu c�rculo garantem a voc� a habilidade de se transformar em formas animais mais poderosas. A partir do 2� n�vel, voc� pode usar sua Forma Selvagem para se transformar em uma besta com n�vel de desafio at� 1 (voc� ignora a coluna ND Max da tabela Formas de Besta, mas ainda deve acatar as limita��es descritas l�).\n" +
				"\tA partir do 6� n�vel, voc� pode se transformar em uma besta com n�vel de desafio t�o alto quanto seu n�vel de druida dividido por 3, arredondado para baixo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Ataque primordial", "\tA partir do 6� n�vel, seus ataques na forma de besta contam como m�gicos com os prop�sitos de ultrapassar resist�ncia e imunidade a ataques e danos n�o-m�gicos.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Forma selvagem de elemental", "\tNo 10� n�vel, voc� pode gastar dois usos da sua Forma Selvagem, ao mesmo tempo, para se transformar em um elemental da �gua, elemental do ar, elemental do fogo ou elemental da terra.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Mil formas", "\tNo 14� n�vel, voc� aprende a usar magia para alterar sua forma f�sica de formas mais sutis. Voc� pode conjurar a magia alterar-se a vontade.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tOs druidas do C�rculo da Lua s�o ferrenhos guardi�es na natureza. Sua ordem se reuni nas noites de lua cheia para partilhar not�cias e trocar informa��es. Eles assombram as partes mais profundas das florestas, onde eles podia ir por semanas a fio antes de cruzar o caminho de outro humanoide e, muito menos outro druida." +
				"\tT�o mut�vel quanto a lua, um druida desse c�rculo poderia espreitar como um grande felino, voar sobre a copa das �rvores como uma �guia no dia seguinte e mergulhar pela vegeta��o rasteira como um urso para expulsar um monstro invasor. A selvageria est� no sangue do druida.\n";
	}
}
