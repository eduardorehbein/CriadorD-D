package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeEncantamento implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Encantamento";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Encantamento instruído", "\tQuando você escolhe essa escola no 2º nível, o ouro e o tempo que você precisa gastar para copiar uma magia da escola de encantamento em seu grimório é reduzido à metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Olhar hipnotizante", "\tA partir do 2° nível, quando você escolhe essa escola, suas palavras suaves e olhar encantador podem escravizar magicamente outra criatura. Com uma ação, escolha uma criatura que você possa ver a até 1,5 metro. Se o alvo puder ver ou ouvir você, ele deve ser bem sucedido num teste de resistência de Sabedoria contra uma CD igual das suas magias de mago, ou ficará enfeitiçado por você até o final do seu próximo turno. O deslocamento da criatura enfeitiçada cai para 0 e a criatura está incapacitada e visivelmente aturdida.\n" +
				"\tNos turnos subsequentes, você pode usar sua ação para manter esse efeito, estendendo sua duração até o final do seu próximo turno. No entanto, o efeito termina se você se afastar mais de 1,5 metro da criatura, se a criatura não puder nem ver nem ouvir você ou se a criatura sofrer dano.\n" +
				"\tAssim que o efeito terminar, ou se a criatura for bem sucedida no teste de resistência inicial contra esse efeito, você não poderá usar essa característica nessa criatura novamente até terminar um descanso longo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Encanto instintivo", "\tComeçando no 6° nível, quando uma criatura que você puder ver a até 9 metros, realizar uma jogada de ataque contra você, você pode usar sua reação para desviar o ataque, contanto que exista outra criatura no alcance do ataque. O atacante deve realizar um teste de resistência de Sabedoria contra uma CD igual das suas magias de mago. Caso falhe, o atacante deve atacar a criatura mais próxima dele, excluindo você ou ele mesmo. Se existirem diversas criaturas próximas, o atacante escolhe qual deseja atacar. Em um sucesso, você não poderá usar essa característica contra o atacante novamente até terminar um descanso longo.\n" +
				"\tVocê deve escolher usar essa característica antes de saber se o ataque atingiu ou errou. Criaturas que não podem ser enfeitiçadas são imunes a esse efeito.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Dividir encantamento", "\tA partir do 10° nível, quando você conjurar uma magia de encantamento de 1° nível ou superior que tenha uma única criatura como alvo, você pode fazer com que ela afete uma segunda criatura.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Alterar memórias", "\tNo 14° nível, você ganha a habilidade de tornar uma criatura inconsciente da sua influência mágica sobre ela. Quando você conjura uma magia de encantamento para enfeitiçar uma ou mais criaturas, você pode alterar a compreensão de uma criatura para que ela continue sem saber que está sendo enfeitiçada.\n" +
				"\tAlém disso, assim que a magia expirar, você pode usar sua ação para tentar fazer com que a criatura escolhida esqueça parte do tempo que permaneceu enfeitiçada. A criatura deve ser bem sucedida num teste de resistência de Inteligência contra uma CD igual das suas magias de mago ou perderá uma quantidade de horas da sua memória igual a 1 + seu modificador de Carisma (mínimo 1). Você pode fazer com que a criatura esqueça menos tempo e o total de tempo não pode exceder a duração da sua magia de encantamento.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tComo um membro da Escola de Encantamento, você afiou sua habilidade de entrar magicamente e seduzir outras pessoas e monstros. Alguns encantadores são pacifistas que fascinam os violentos para que larguem suas armas e enfeitiçam os cruéis para mostrar misericórdia. Outros são tiranos que dominam magicamente os involuntários, obrigando-os a servi-lo. A maioria dos encantadores está em algum lugar entre esses extremos.\n";
	}
}
