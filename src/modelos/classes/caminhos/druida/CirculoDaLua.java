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
		return "Círculo da Lua";
	}
	
	@Override
	public void setHabilidades(Druida classe) {
		classe.habilidadesAdd(new Habilidade("Forma selvagem de combate", "\tQuando você escolhe esse círculo, no 2° nível, você recebe a habilidade de usar sua Forma Selvagem no seu turno com uma ação bônus, ao invés de com uma ação.\n" +
				"\tAlém disso, enquanto você estiver transformando pela sua Forma Selvagem, você pode usar uma ação bônus para gastar uma espaço de magia e ganhar 1d8 pontos de vida por nível do espaço de magia gasto.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Formas de círculo", "\tOs ritos do seu círculo garantem a você a habilidade de se transformar em formas animais mais poderosas. A partir do 2° nível, você pode usar sua Forma Selvagem para se transformar em uma besta com nível de desafio até 1 (você ignora a coluna ND Max da tabela Formas de Besta, mas ainda deve acatar as limitações descritas lá).\n" +
				"\tA partir do 6° nível, você pode se transformar em uma besta com nível de desafio tão alto quanto seu nível de druida dividido por 3, arredondado para baixo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Ataque primordial", "\tA partir do 6° nível, seus ataques na forma de besta contam como mágicos com os propósitos de ultrapassar resistência e imunidade a ataques e danos não-mágicos.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Forma selvagem de elemental", "\tNo 10° nível, você pode gastar dois usos da sua Forma Selvagem, ao mesmo tempo, para se transformar em um elemental da água, elemental do ar, elemental do fogo ou elemental da terra.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Mil formas", "\tNo 14° nível, você aprende a usar magia para alterar sua forma física de formas mais sutis. Você pode conjurar a magia alterar-se a vontade.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tOs druidas do Círculo da Lua são ferrenhos guardiões na natureza. Sua ordem se reuni nas noites de lua cheia para partilhar notícias e trocar informações. Eles assombram as partes mais profundas das florestas, onde eles podia ir por semanas a fio antes de cruzar o caminho de outro humanoide e, muito menos outro druida." +
				"\tTão mutável quanto a lua, um druida desse círculo poderia espreitar como um grande felino, voar sobre a copa das árvores como uma águia no dia seguinte e mergulhar pela vegetação rasteira como um urso para expulsar um monstro invasor. A selvageria está no sangue do druida.\n";
	}
}
