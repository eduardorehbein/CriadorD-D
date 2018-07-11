package modelos.classes.caminhos.bruxo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Bruxo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class Arquifada implements Caminho<Bruxo>, Magica{
	@Override
	public String toString() {
		return "Arquifada";
	}

	@Override
	public void setHabilidades(Bruxo classe) {
		classe.habilidadesAdd(new Habilidade("Lista de magia expandida", "\tAs magias referentes ao seu pacto são adicionadas automaticamente na sua lista de magias.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Presença feérica", "\tA partir do 1° nível, seu patrono concede a você a habilidade de projetar a sedução e temeridade da presença da fada. Com uma ação, você pode fazer com que cada criatura num cubo de 3 metros centrado em você, faça um teste de resistência de Sabedoria com uma CD igual a de sua magia de bruxo. As criaturas que falharem no teste ficaram enfeitiçadas ou amedrontadas por você (à sua escolha) até o início do seu próximo turno.\n" +
				"\tQuando você usar essa característica, você não poderá utilizá-la novamente antes de realizar um descanso curto ou longo.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Névoa de fuga", "\tA partir do 6° nível, você pode desaparecer em uma lufada de névoa em resposta a alguma ofensa. Quando você sofrer dano, você pode usar sua reação para ficar invisível e se teletransportar a até 18 metros para um espaço desocupado que você possa ver. Você permanece invisível até o início do seu próximo turno ou até realizar um ataque ou conjurar uma magia.\n" +
				"\tApós usar essa características, você não poderá utilizá-la novamente até terminar um descanso curto ou longo.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Defesa sedutora", "\tA partir do 10° nível, seu patrono ensina você como voltar as magias de efeito mental dos seus inimigos contra eles. Você não pode ser enfeitiçado e, quando outra criatura tenta enfeitiçá-lo, você pode usar sua reação para tentar reverter o encanto de volta aquela criatura. A criatura deve ser bem sucedida num teste de resistência de Sabedoria contra a CD da sua magia de bruxo ou ficara enfeitiçado por 1 minuto ou até a criatura sofrer dano.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Delírio sombrio", "\tComeçando no 14° nível, você pode imergir uma criatura num reino ilusório. Com um ação, escolha uma criatura que você possa ver a até 18 metros de você. Ela deve ser bem sucedida num teste de resistência de Sabedoria contra a CD da sua magia de bruxo. Se ela falhar, ela ficará enfeitiçada ou amedrontada por você (à sua escolha) por 1 minuto ou até você quebrar sua concentração (como se você estivesse se concentrando em uma magia). Esse efeito termina prematuramente se a criatura sofrer dano.\n" +
				"\tAté que essa ilusão termine, a criatura acredita que está perdida num reino enevoado, a aparência desse reino fica a seu critério. A criatura só pode ver e ouvir a si mesma, a você e a sua ilusão.\n" +
				"\tVocê deve terminar um descanso curto ou longo antes de poder usar essa característica novamente.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tSeu patrono é um senhor ou senhora das fadas, uma criatura lendária que detém segredos que foram esquecidos antes das raças mortais nascerem. As motivações desses seres são, muitas vezes, inescrutáveis e, as vezes, excêntricas e podem envolver esforços para adquirir grandes poderes mágicos ou resolução de desavenças antigas. Incluem-se dentre esses seres o Príncipe do Frio; a Rainha do Ar e Trevas, regente da Corte do Crepúsculo; Titania da Corte do Verão; seu cônjuge, Oberon, o Senhor Verdejante; Hyrsam, o Príncipe dos Tolos; e bruxas antigas.\n";
	}
}
