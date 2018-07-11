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
		return "Juramento de Vingan�a";
	}
	
	@Override
	public void setHabilidades(Paladino classe) {
		classe.habilidadesAdd(new Habilidade("Dogmas de vingan�a", "\tOs dogmas do Juramento de Vingan�a variam de paladino para paladino, mas todos os dogmas giram em torno de punir malfeitores a qualquer custo. Paladinos que defendem esses dogmas est�o dispostos a sacrificar, at� mesmo sua pr�pria integridade para fazer justi�a sobre aqueles que praticaram o mal, de modo que, muitas vezes, os paladinos s�o neutros ou leais e neutros em alinhamento. Os princ�pios fundamentais dos dogmas s�o brutalmente simples.\n" +
				"\tCombater o Mal Maior. Entre escolher lutar contra meus inimigos jurados ou combater um mal menor. Eu escolho o mal maior.\n" +
				"\tSem Miseric�rdia para os Malignos. Inimigos comuns podem ter minha miseric�rdia, mas meus inimigos jurados n�o.\n" +
				"\tA Todo Custo. Meus escr�pulos n�o podem ficar no caminho do exterm�nio dos meus inimigos.\n" +
				"\tRestitui��o. Se meus inimigos causaram ruina no mundo, � porque eu falhei em det�-los. Devo ajudar aqueles prejudicados pelos delitos.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade", "\tQuando voc� faz esse juramento, no 3� n�vel, voc� ganha as duas op��es seguintes de Canalizar Divindade.\n" +
				"\tAbjurar Inimigo. Com uma a��o, voc� ergue seu s�mbolo sagrado e faz uma prece de condena��o, usando seu Canalizar Divindade. Escolha uma criatura a at� 18 metros de voc� que voc� possa ver. A criatura deve realizar um teste de resist�ncia de Sabedoria, a n�o ser que seja imune a ser amedrontada. Corruptores e mortos-vivos tem desvantagem nesse teste de resist�ncia.\n" +
				"\tNum fracasso no teste de resist�ncia, a criatura ficar� amedrontada por 1 minuto ou at� sofrer qualquer dano. Enquanto estiver amedrontada, o deslocamento da criatura ser� 0 e ela n�o pode receber qualquer b�nus de deslocamento.\n" +
				"\tEm um sucesso, o deslocamento da criatura � reduzido � metade por 1 minuto ou at� que ela sofra qualquer dano.\n" +
				"\tVoto de Inimizade. Com uma a��o, voc� pode pronunciar um voto de inimizade contra uma criatura que voc� possa ver a at� 3 metros, usando seu Canalizar Divindade. Voc� ganha vantagem nas jogadas de ataque contra a criatura por 1 minuto ou at� ela cair a 0 pontos de vida ou cair inconsciente.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Vingador implac�vel", "\tNo 7� n�vel, seu foco sobrenatural ajuda voc� a impedir a fuga de um inimigo. Quando voc� atinge uma criatura com um ataque de oportunidade, voc� pode se mover at� metade do seu deslocamento, imediatamente depois do ataque e como parte da mesma rea��o. Esse movimento n�o provoca ataques de oportunidade.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Alma de vingan�a", "\tA partir do 15� n�vel, a autoridade com a qual voc� fala seu Voto de Inimizada lhe d� maior poder sobre seu inimigo. Quando uma criatura sob efeito do seu Voto de Inimizade realizar um ataque, voc� pode usar sua rea��o para realizar um ataque corpo-a-corpo com arma contra essa criatura, se ela estiver ao seu alcance.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Anjo vingador", "\tNo 20� n�vel, voc� pode assumir a forma de um anjo vingador. Usando sua a��o, voc� sofre uma transforma��o. Por 1 hora, voc� ganha os seguintes benef�cios:\n" +
				"\t* Asas crescem nas suas costas e lhe concedem deslocamento de voo de 18 metros.\n" +
				"\t* Voc� emana uma aura de amea�a num raio de 9 metros. A primeira vez que qualquer criatura inimiga entrar na aura ou come�ar seu turno nela, durante uma batalha, a criatura deve ser bem sucedida num teste de resist�ncia de Sabedoria ou ficar� amedrontada em rela��o a voc� por 1 minuto ou at� sofrer qualquer dano. Jogadas de ataque contra a criatura amedrontada tem vantagem.\n" +
				"\t*Uma vez que voc� use essa caracter�stica, n�o poder� faz�-lo novamente at� ter terminado um descanso longo.\n\n", 20));
	}
	
	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tO Juramento de Vingan�a � um comprometimento solene de punir aqueles que cometeram pecados graves. Quando for�as malignas chacinam camponeses indefesos, quando todo um povo se volta contra a vontade dos deuses, quando uma guilda de ladr�es cresce e se torna violenta e poderosa, quando um drag�o investe atrav�s da zona rural � em momentos como esses, paladinos surgem e fazem o Juramento de Vingan�a para tornar certo o que j� foi errado. Para esses paladinos � algumas vezes chamados de vingadores ou de cavaleiros negros � sua pr�pria pureza n�o � t�o importante quando trazer justi�a.\n";
	}
}
