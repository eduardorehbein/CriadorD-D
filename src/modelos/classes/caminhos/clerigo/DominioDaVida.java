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
		return "Dom�nio da Vida";
	}
	
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Profici�ncia adicional", "\tQuando voc� escolhe este dom�nio no 1� n�vel, voc� ganha profici�ncia com armaduras pesadas.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Disc�pulo da vida", "\tTamb�m no 1� n�vel, suas magias de cura s�o mais efetivas. Sempre que voc� conjurar uma magia de cura para recuperar pontos de vida, o alvo daquela magia recupera pontos de vida adicionais iguais a 2 + n�vel da magia.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: preservar a vida", "\tA partir do 2� n�vel, voc� pode usar seu Canalizar Divindade para curar os feridos.\n" +
				"\tComo uma a��o, voc� usa seu s�mbolo sagrado para invocar energia que pode recuperar um total de 5 vezes seu n�vel de cl�rigo em pontos de vida. Voc� escolhe quaisquer criaturas a at� 9 metros de voc� e divide esses pontos entre elas. Essa caracter�stica s� pode curar as criaturas a at� metade de seu m�ximo de pontos de vida. Voc� n�o pode usar essa caracter�stica em um morto-vivo ou constructo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Curandeiro aben�oado", "\tA partir do 6� n�vel, as magias que voc� conjurar para curar os outros tamb�m curam voc�. Quando conjurar uma magia de cura em outra criatura, voc� tamb�m recupera pontos de vida, em um total de 2 + n�vel da magia.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8� n�vel, voc� ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando voc� acertar uma criatura com um ataque com arma, voc� causa 1d8 de dano radiante adicional ao alvo. Quando alcan�ar o 14� n�vel, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Cura suprema", "\tA partir do 17� n�vel, quando voc� jogaria normalmente um ou mais dados para recuperar pontos de vida com uma magia, voc� usa o maior resultado poss�vel nos dados. Por exemplo, ao inv�s de recuperar 2d6 pontos de vida, voc� recupera 12.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tO dom�nio da vida foca na v�vida energia positiva � uma das for�as fundamentais do universo � que sustenta toda a vida. Os deuses da vida promovem a vitalidade e a sa�de, curando os doentes e feridos, cuidando dos necessitados, al�m de afastar as for�as da morte e hordas de mortos-vivos. Quase toda divindade n�o maligna pode alegar influ�ncia sobre esse dom�nio. Em particular divindades da agricultura (como Chauntea, Arawai e Demeter), do sol (como Lathander, Pelor e Re-Horakhty), da cura ou resist�ncia (como Ilmater, Mishakal, Apolo e Diancecht), e do lar e comunidade (como Hestia, Hathor e Boldrei).\n";
	}
}
