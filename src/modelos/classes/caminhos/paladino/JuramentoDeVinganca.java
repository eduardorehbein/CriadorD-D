package modelos.classes.caminhos.paladino;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Paladino;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class JuramentoDeVinganca implements Caminho<Paladino>, Magica {
	@Override
	public String toString() {
		return "Juramento de Vingança";
	}
	
	@Override
	public void setHabilidades(Paladino classe) {
		classe.habilidadesAdd(new Habilidade("Dogmas de vingança", "\tOs dogmas do Juramento de Vingança variam de paladino para paladino, mas todos os dogmas giram em torno de punir malfeitores a qualquer custo. Paladinos que defendem esses dogmas estão dispostos a sacrificar, até mesmo sua própria integridade para fazer justiça sobre aqueles que praticaram o mal, de modo que, muitas vezes, os paladinos são neutros ou leais e neutros em alinhamento. Os princípios fundamentais dos dogmas são brutalmente simples.\n" +
				"\tCombater o Mal Maior. Entre escolher lutar contra meus inimigos jurados ou combater um mal menor. Eu escolho o mal maior.\n" +
				"\tSem Misericórdia para os Malignos. Inimigos comuns podem ter minha misericórdia, mas meus inimigos jurados não.\n" +
				"\tA Todo Custo. Meus escrúpulos não podem ficar no caminho do extermínio dos meus inimigos.\n" +
				"\tRestituição. Se meus inimigos causaram ruina no mundo, é porque eu falhei em detê-los. Devo ajudar aqueles prejudicados pelos delitos.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade", "\tQuando você faz esse juramento, no 3° nível, você ganha as duas opções seguintes de Canalizar Divindade.\n" +
				"\tAbjurar Inimigo. Com uma ação, você ergue seu símbolo sagrado e faz uma prece de condenação, usando seu Canalizar Divindade. Escolha uma criatura a até 18 metros de você que você possa ver. A criatura deve realizar um teste de resistência de Sabedoria, a não ser que seja imune a ser amedrontada. Corruptores e mortos-vivos tem desvantagem nesse teste de resistência.\n" +
				"\tNum fracasso no teste de resistência, a criatura ficará amedrontada por 1 minuto ou até sofrer qualquer dano. Enquanto estiver amedrontada, o deslocamento da criatura será 0 e ela não pode receber qualquer bônus de deslocamento.\n" +
				"\tEm um sucesso, o deslocamento da criatura é reduzido à metade por 1 minuto ou até que ela sofra qualquer dano.\n" +
				"\tVoto de Inimizade. Com uma ação, você pode pronunciar um voto de inimizade contra uma criatura que você possa ver a até 3 metros, usando seu Canalizar Divindade. Você ganha vantagem nas jogadas de ataque contra a criatura por 1 minuto ou até ela cair a 0 pontos de vida ou cair inconsciente.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Vingador implacável", "\tNo 7° nível, seu foco sobrenatural ajuda você a impedir a fuga de um inimigo. Quando você atinge uma criatura com um ataque de oportunidade, você pode se mover até metade do seu deslocamento, imediatamente depois do ataque e como parte da mesma reação. Esse movimento não provoca ataques de oportunidade.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Alma de vingança", "\tA partir do 15° nível, a autoridade com a qual você fala seu Voto de Inimizada lhe dá maior poder sobre seu inimigo. Quando uma criatura sob efeito do seu Voto de Inimizade realizar um ataque, você pode usar sua reação para realizar um ataque corpo-a-corpo com arma contra essa criatura, se ela estiver ao seu alcance.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Anjo vingador", "\tNo 20° nível, você pode assumir a forma de um anjo vingador. Usando sua ação, você sofre uma transformação. Por 1 hora, você ganha os seguintes benefícios:\n" +
				"\t* Asas crescem nas suas costas e lhe concedem deslocamento de voo de 18 metros.\n" +
				"\t* Você emana uma aura de ameaça num raio de 9 metros. A primeira vez que qualquer criatura inimiga entrar na aura ou começar seu turno nela, durante uma batalha, a criatura deve ser bem sucedida num teste de resistência de Sabedoria ou ficará amedrontada em relação a você por 1 minuto ou até sofrer qualquer dano. Jogadas de ataque contra a criatura amedrontada tem vantagem.\n" +
				"\t*Uma vez que você use essa característica, não poderá fazê-lo novamente até ter terminado um descanso longo.\n\n", 20));
	}
	
	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tO Juramento de Vingança é um comprometimento solene de punir aqueles que cometeram pecados graves. Quando forças malignas chacinam camponeses indefesos, quando todo um povo se volta contra a vontade dos deuses, quando uma guilda de ladrões cresce e se torna violenta e poderosa, quando um dragão investe através da zona rural – em momentos como esses, paladinos surgem e fazem o Juramento de Vingança para tornar certo o que já foi errado. Para esses paladinos – algumas vezes chamados de vingadores ou de cavaleiros negros – sua própria pureza não é tão importante quando trazer justiça.\n";
	}
}
