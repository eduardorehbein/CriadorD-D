package modelos.classes.caminhos.bruxo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Bruxo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class OCorruptor implements Caminho<Bruxo>, Magica {
	@Override
	public String toString() {
		return "O Corruptor";
	}

	@Override
	public void setHabilidades(Bruxo classe) {
		classe.habilidadesAdd(new Habilidade("Lista de magia expandida", "\tAs magias referentes ao seu pacto são adicionadas automaticamente na sua lista de magias.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Bênção do obscuro", "\tA partir do 1° nível, quando você reduzir uma criatura hostil a 0 pontos de vida, você ganha uma quantidade de pontos de vida temporários igual ao seu modificador de Carisma + seu nível de bruxo (mínimo 1).\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Sorte do próprio obscuro", "\tA partir do 6° nível, você pode pedir ao seu patrono para alterar o destino em seu favor. Quando você realizar um teste de habilidade ou um teste de resistência, você pode usar essa característica para adicionar 1d10 a sua jogada. Você pode fazer isso após ver sua jogada inicial, mas antes que qualquer efeito da jogada ocorra.\n" +
				"\tApós usar essa características, você não poderá utilizá-la novamente até terminar um descanso curto ou longo.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Resistência demoníaca", "\tA partir do 10° nível, você pode escolher um tipo de dano quando você terminar um descanso curto ou longo. Você adquire resistência contra esse tipo de dano até você escolher um tipo de dano diferente com essa característica. Dano causado por armas mágicas ou armas de prata ignoram essa resistência.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Lançar do inferno", "\tA partir do 14° nível, quando você atingir uma criatura com um ataque, você pode usar essa característica para, instantaneamente, transportar o alvo para os planos inferiores. A criatura desaparece e é jogada para um lugar similar a um pesadelo.\n" +
				"\tNo final do seu turno, o alvo retorna ao lugar que ela ocupava anteriormente, ou para o espaço desocupado mais próximo. Se o alvo não for um corruptor, ele sofre 10d10 de dano psíquico à medida que toma conta da experiência traumática.\n" +
				"\tApós usar essa características, você não poderá utilizá-la novamente até terminar um descanso curto ou longo.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tVocê realizou um pacto com um corruptor dos planos de existência inferiores, um ser cujos objetivos são o mal, mesmo se você se opor a esses objetivos. Tais seres desejam corromper ou destruir todas as coisas, em última análise, até mesmo você. Corruptores poderosos o bastante para forjar pactos incluem senhores demoníacos como Demogorgon, Orcus, Fraz’Urb-luu e Bafomé; arquidiabos como Asmodeus, Dispater, Mefistófeles e Belial; senhores das profundezas e balors que sejam excepcionalmente poderosos; e ultraloths e outros senhores dos yugoloths.\n";
	}
}