package modelos.classes.caminhos.clerigo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Clerigo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class DominioDaVida implements Caminho<Clerigo>, Magica {
	@Override
	public String toString() {
		return "Domínio da Vida";
	}
	
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Proficiência adicional", "\tQuando você escolhe este domínio no 1º nível, você ganha proficiência com armaduras pesadas.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Discípulo da vida", "\tTambém no 1º nível, suas magias de cura são mais efetivas. Sempre que você conjurar uma magia de cura para recuperar pontos de vida, o alvo daquela magia recupera pontos de vida adicionais iguais a 2 + nível da magia.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: preservar a vida", "\tA partir do 2º nível, você pode usar seu Canalizar Divindade para curar os feridos.\n" +
				"\tComo uma ação, você usa seu símbolo sagrado para invocar energia que pode recuperar um total de 5 vezes seu nível de clérigo em pontos de vida. Você escolhe quaisquer criaturas a até 9 metros de você e divide esses pontos entre elas. Essa característica só pode curar as criaturas a até metade de seu máximo de pontos de vida. Você não pode usar essa característica em um morto-vivo ou constructo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Curandeiro abençoado", "\tA partir do 6º nível, as magias que você conjurar para curar os outros também curam você. Quando conjurar uma magia de cura em outra criatura, você também recupera pontos de vida, em um total de 2 + nível da magia.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8º nível, você ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando você acertar uma criatura com um ataque com arma, você causa 1d8 de dano radiante adicional ao alvo. Quando alcançar o 14º nível, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Cura suprema", "\tA partir do 17º nível, quando você jogaria normalmente um ou mais dados para recuperar pontos de vida com uma magia, você usa o maior resultado possível nos dados. Por exemplo, ao invés de recuperar 2d6 pontos de vida, você recupera 12.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tO domínio da vida foca na vívida energia positiva – uma das forças fundamentais do universo – que sustenta toda a vida. Os deuses da vida promovem a vitalidade e a saúde, curando os doentes e feridos, cuidando dos necessitados, além de afastar as forças da morte e hordas de mortos-vivos. Quase toda divindade não maligna pode alegar influência sobre esse domínio. Em particular divindades da agricultura (como Chauntea, Arawai e Demeter), do sol (como Lathander, Pelor e Re-Horakhty), da cura ou resistência (como Ilmater, Mishakal, Apolo e Diancecht), e do lar e comunidade (como Hestia, Hathor e Boldrei).\n";
	}
}
