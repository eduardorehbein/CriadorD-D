package modelos.classes.caminhos.clerigo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Clerigo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class DominioDaGuerra implements Caminho<Clerigo>, Magica {
	@Override
	public String toString() {
		return "Dom�nio da Guerra";
	}

	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Profici�ncia adicional", "\tNo 1� n�vel, voc� adquire profici�ncia em armas marciais e em armaduras pesadas.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Sacerdote da guerra", "\tA partir do 1� n�vel, seu deus envia rajadas de inspira��o a voc� quando voc� est� engajado em combate. Quando voc� usa a a��o de Ataque, voc� pode realizar um ataque com arma, com uma a��o b�nus.\n" +
				"\tVoc� pode usar essa caracter�stica um n�mero de vezes igual ao seu modificador de Sabedoria (m�nimo uma vez). Voc� recupera todos os usos gastos ap�s terminar um descanso longo.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: ataque dirigido", "\tA partir do 2� n�vel, voc� pode usar seu Canalizar Divindade para golpear com precis�o sobrenatural. Quando voc� realiza uma jogada de ataque, voc� pode usar seu Canalizar Divindade para recebe +10 de b�nus na jogada. Voc� realiza essa escolha depois de ver a rolagem, mas antes do Mestre dizer se o ataque atingiu ou errou.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: b�n��o do deus da guerra", "\tNo 6� n�vel, quando uma criatura a at� 9 metros de voc� realizar uma jogada de ataque, voc� pode usar sua rea��o para conceder a criatura +10 de b�nus nessa jogada, usando seu Canalizar Divindade. Voc� realiza essa escolha depois de ver a rolagem, mas antes do Mestre dizer se o ataque atingiu ou errou.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8� n�vel, voc� ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando voc� acertar uma criatura com um ataque com arma, voc� causa 1d8 de dano radiante adicional ao alvo. Quando alcan�ar o 14� n�vel, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Avatar da batalha", "\tA partir do 17� n�vel, voc� ganha resist�ncia a dano de concuss�o, cortante e perfurante de armas n�o-m�gicas.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tA guerra tem muitas manifesta��es. Ela pode tornar pessoas comuns em her�is. Ela pode ser desesperadora e horripilante, com atos de crueldade e covardia obscurecendo momentos de bravura e coragem. Em ambos os casos, os deuses da guerra zelam pelos guerreiros e os recompensa pelos seus grandes feitos. Os cl�rigos de tais deuses se sobressaem em batalha, inspirando os outros a lutar o bom combate ou oferecendo atos de viol�ncia como suas ora��es. Entre os deuses da guerra est�o inclusos campe�es da honra e bravura (como Torm, Heironeous e Kir-Jolith) assim como deuses da destrui��o e pilhagem (como Erythnul, a F�ria, Gruumsh e Ares) e deuses da conquista e domina��o (como Bane, Hextor e Maglubiyet). Outros deuses da guerra (como Tempus, Nike e Nuada) tomam uma postura mais neutra, promovendo a guerra em todas as suas manifesta��es e apoiando os guerreiros em qualquer circunst�ncia.\n";
	}
}
