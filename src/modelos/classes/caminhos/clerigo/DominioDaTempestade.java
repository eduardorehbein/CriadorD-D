package modelos.classes.caminhos.clerigo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Clerigo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class DominioDaTempestade implements Caminho<Clerigo>, Magica {
	@Override
	public String toString() {
		return "Dom�nio da Tempestade";
	}
	
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Profici�ncia adicional", "\tA partir do 1� n�vel, voc� adquire profici�ncia em armas marciais e armaduras pesadas.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Ira da tormenta", "\tTamb�m a partir do 1� n�vel, voc� pode repreender ataques violentamente. Quando uma criatura a 1,5 metro de voc� que voc� possa ver, atingir voc� com um ataque, voc� pode usar sua rea��o para for�ar a criatura a realizar um teste de resist�ncia de Destreza. A criatura sofre 2d8 de dano el�trico ou de trov�o (� sua escolha) caso falhe no teste, e metade desse dano caso seja bem sucedido.\n" +
				"\tVoc� pode usar essa caracter�stica um n�mero de vezes igual ao seu modificador de Sabedoria (m�nimo uma vez). Voc� recupera todos os usos gastos ap�s terminar um descanso longo.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: ira destruidora", "\tA partir do 2� n�vel, voc� pode usar seu Canalizar Divindade para empunhar o poder da tormenta com ferocidade desmedida.\n" +
				"\tQuando voc� rolar dano el�trico ou de trov�o, voc� pode usar seu Canalizar Divindade para causar o m�ximo de dano, ao inv�s de rol�-lo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Golpe de rel�mpago", "\tNo 6� n�vel, quando voc� causa dano el�trico a uma criatura Grande ou menor, voc� tamb�m pode empurr�-la para at� 3 metros de dist�ncia de voc�.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8� n�vel, voc� ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando voc� acertar uma criatura com um ataque com arma, voc� causa 1d8 de dano radiante adicional ao alvo. Quando alcan�ar o 14� n�vel, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Filho da tormenta", "\tA partir do 17� n�vel, voc� adquire deslocamento de voo igual a seu deslocamento de caminhada contanto que voc� n�o esteja no subterr�neo ou em local fechado.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tDeuses cujo portf�lio contenha o dom�nio da Tempestade � como Talos, Umberlee, Kord, Zeboim, o Devorador, Zeus e Thor � governam tormentas, mares e c�us. Est�o inclusos deuses dos rel�mpagos e trov�es, deuses dos terremotos, alguns deuses do fogo e certos deuses da viol�ncia, for�a f�sica e coragem. Em alguns pante�es, um deus com esse dom�nio comanda os outros deuses e � conhecido pela justi�a r�pida levada atrav�s de rel�mpagos. Nos pante�es de povos mar�timos e navegantes, deuses com esse dom�nio s�o divindades do oceano e patrono dos marinheiros. Deuses da tempestade enviam seus cl�rigos para inspirar pavor no povo comum, tanto para mant�-los no caminho da justi�a e coragem quanto para oferecer sacrif�cios de propicia��o para afastar a ira divina.\n";
	}
}