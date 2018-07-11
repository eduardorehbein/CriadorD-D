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
		return "Domínio da Tempestade";
	}
	
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Proficiência adicional", "\tA partir do 1° nível, você adquire proficiência em armas marciais e armaduras pesadas.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Ira da tormenta", "\tTambém a partir do 1° nível, você pode repreender ataques violentamente. Quando uma criatura a 1,5 metro de você que você possa ver, atingir você com um ataque, você pode usar sua reação para forçar a criatura a realizar um teste de resistência de Destreza. A criatura sofre 2d8 de dano elétrico ou de trovão (à sua escolha) caso falhe no teste, e metade desse dano caso seja bem sucedido.\n" +
				"\tVocê pode usar essa característica um número de vezes igual ao seu modificador de Sabedoria (mínimo uma vez). Você recupera todos os usos gastos após terminar um descanso longo.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: ira destruidora", "\tA partir do 2° nível, você pode usar seu Canalizar Divindade para empunhar o poder da tormenta com ferocidade desmedida.\n" +
				"\tQuando você rolar dano elétrico ou de trovão, você pode usar seu Canalizar Divindade para causar o máximo de dano, ao invés de rolá-lo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Golpe de relâmpago", "\tNo 6° nível, quando você causa dano elétrico a uma criatura Grande ou menor, você também pode empurrá-la para até 3 metros de distância de você.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8º nível, você ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando você acertar uma criatura com um ataque com arma, você causa 1d8 de dano radiante adicional ao alvo. Quando alcançar o 14º nível, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Filho da tormenta", "\tA partir do 17° nível, você adquire deslocamento de voo igual a seu deslocamento de caminhada contanto que você não esteja no subterrâneo ou em local fechado.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tDeuses cujo portfólio contenha o domínio da Tempestade – como Talos, Umberlee, Kord, Zeboim, o Devorador, Zeus e Thor – governam tormentas, mares e céus. Estão inclusos deuses dos relâmpagos e trovões, deuses dos terremotos, alguns deuses do fogo e certos deuses da violência, força física e coragem. Em alguns panteões, um deus com esse domínio comanda os outros deuses e é conhecido pela justiça rápida levada através de relâmpagos. Nos panteões de povos marítimos e navegantes, deuses com esse domínio são divindades do oceano e patrono dos marinheiros. Deuses da tempestade enviam seus clérigos para inspirar pavor no povo comum, tanto para mantê-los no caminho da justiça e coragem quanto para oferecer sacrifícios de propiciação para afastar a ira divina.\n";
	}
}