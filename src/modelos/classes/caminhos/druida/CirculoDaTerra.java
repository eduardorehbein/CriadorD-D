package modelos.classes.caminhos.druida;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Druida;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class CirculoDaTerra implements Caminho<Druida>, Magica {
	@Override
	public String toString() {
		return "Círculo da Terra";
	}
	
	@Override
	public void setHabilidades(Druida classe) {
		classe.habilidadesAdd(new Habilidade("Truque adicional", "\tQuando você escolhe esse círculo no 2° nível, você aprende um truque de druida adicional, à sua escolha.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Recuperação natural", "\tA partir do 2° nível, você pode recuperar parte da sua energia mágica parando para fazer uma meditação e comunhão com a natureza. Durante um descanso curto, você escolhe espaços de magia gastos para recuperar. O espaço de magia pode ter um nível combinado igual ou menor que metade do seu nível de druida (arredondado para baixo) e, nenhum dos espaços pode ser de uma magia de 6° nível ou superior. Você não pode usar essa característica novamente até terminar um descanso longo.\n" +
				"\tPor exemplo, quando você for um druida de 4° nível, você pode recuperar até dois níveis em espaços de magia. Você pode recuperar, tanto uma magia de 2° nível, quanto duas magias de 1° nível.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Caminho da floresta", "\tA partir do 6° nível, mover-se através de terreno difícil não-mágico não te custará nenhum movimento extra. Você também pode passar através de plantas não-mágicas sem ser atrasado por elas e sem sofrer dano delas se elas tiverem espinhos, espinhas ou perigos similares.\n" +
				"\tAlém disso, você tem vantagem em testes de resistência contra plantas criadas magicamente ou manipuladas para impedir movimentação, como as criadas pela magia constrição.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Proteção natural", "\tQuando você atingir o 10° nível, você não pode ser enfeitiçado ou amedrontado por elementais ou fadas e você se torna imune a venenos e doenças.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Santuário natural", "\tA partir do 14° nível, as criaturas do mundo natural sentem sua ligação com a natureza e hesitarão em atacar você. Quando uma besta ou plantar atacar você, essa criatura deverá fazer um teste de resistência de Sabedoria contra uma CD igual a das suas magias de druida. Em uma falha, a criatura deve escolher um alvo diferente ou o ataque erra automaticamente. Em um sucesso, a criatura se torna imune a esse efeito por 24 horas.\n" +
				"\tA criatura está ciente deste efeito antes de resolver atacar você.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tO Círculo da Terra é constituído por místicos e sábios que salvaguardam conhecimento e ritos antigos através de uma vasta tradição oral. Esses druida se encontram em círculos sagrados de árvores ou monólitos para sussurrar segredos primordiais em Druídico. Os membros mais sábios do círculo presidem como os sacerdotes-dirigentes de comunidades que creem na Crença Antiga, e servem como conselheiros para os governantes desses povos. Como membro desse círculo, sua magia é influenciada pela terra onde você é iniciado nos ritos misteriosos do círculo.\n";
	}
}
