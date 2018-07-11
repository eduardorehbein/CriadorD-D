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
		return "Domínio da Guerra";
	}

	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Proficiência adicional", "\tNo 1° nível, você adquire proficiência em armas marciais e em armaduras pesadas.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Sacerdote da guerra", "\tA partir do 1° nível, seu deus envia rajadas de inspiração a você quando você está engajado em combate. Quando você usa a ação de Ataque, você pode realizar um ataque com arma, com uma ação bônus.\n" +
				"\tVocê pode usar essa característica um número de vezes igual ao seu modificador de Sabedoria (mínimo uma vez). Você recupera todos os usos gastos após terminar um descanso longo.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: ataque dirigido", "\tA partir do 2° nível, você pode usar seu Canalizar Divindade para golpear com precisão sobrenatural. Quando você realiza uma jogada de ataque, você pode usar seu Canalizar Divindade para recebe +10 de bônus na jogada. Você realiza essa escolha depois de ver a rolagem, mas antes do Mestre dizer se o ataque atingiu ou errou.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: bênção do deus da guerra", "\tNo 6° nível, quando uma criatura a até 9 metros de você realizar uma jogada de ataque, você pode usar sua reação para conceder a criatura +10 de bônus nessa jogada, usando seu Canalizar Divindade. Você realiza essa escolha depois de ver a rolagem, mas antes do Mestre dizer se o ataque atingiu ou errou.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8º nível, você ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando você acertar uma criatura com um ataque com arma, você causa 1d8 de dano radiante adicional ao alvo. Quando alcançar o 14º nível, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Avatar da batalha", "\tA partir do 17° nível, você ganha resistência a dano de concussão, cortante e perfurante de armas não-mágicas.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tA guerra tem muitas manifestações. Ela pode tornar pessoas comuns em heróis. Ela pode ser desesperadora e horripilante, com atos de crueldade e covardia obscurecendo momentos de bravura e coragem. Em ambos os casos, os deuses da guerra zelam pelos guerreiros e os recompensa pelos seus grandes feitos. Os clérigos de tais deuses se sobressaem em batalha, inspirando os outros a lutar o bom combate ou oferecendo atos de violência como suas orações. Entre os deuses da guerra estão inclusos campeões da honra e bravura (como Torm, Heironeous e Kir-Jolith) assim como deuses da destruição e pilhagem (como Erythnul, a Fúria, Gruumsh e Ares) e deuses da conquista e dominação (como Bane, Hextor e Maglubiyet). Outros deuses da guerra (como Tempus, Nike e Nuada) tomam uma postura mais neutra, promovendo a guerra em todas as suas manifestações e apoiando os guerreiros em qualquer circunstância.\n";
	}
}
