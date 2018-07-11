package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeAbjuracao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Abjuração";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Abjuração instruída", "\tQuando você escolhe essa escola no 2º nível, o ouro e o tempo que você precisa gastar para copiar uma magia da escola de abjuração em seu grimório é reduzido à metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Proteção arcana", "\tA partir do 2° nível, você pode tecer a magia a sua volta para proteção. Quando você conjura uma magia de abjuração de 1° nível ou superior, você pode, simultaneamente, usar uma vertente do poder da magia para criar uma proteção mágica em si mesmo, que dura até você terminar um descanso longo. A proteção tem pontos de vida iguais ao dobro do seu nível de mago + seu modificador de Inteligência. Sempre que você sofrer dano, a proteção sofrerá o dano no lugar. Se o dano reduzir a proteção a 0 pontos de vida, você sofre qualquer dano remanescente.\n" +
				"\tQuando a proteção estiver com 0 pontos de vida, ela não poderá mais absorver dano, mas a mágica permanece. Toda vez que você conjurar uma magia de abjuração de 1° nível ou superior, a proteção recupera um número de pontos de vida igual ao dobro do nível da magia.\n" +
				"\tUma vez que você tenha criado a proteção, você não pode criá-la novamente até terminar um descanso longo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Proteção projetada", "\tA partir do 6° nível, quando uma criatura que você possa ver a até 9 metros sofrer dano, você pode usar sua reação para fazer com que sua Proteção Arcana absorva aquele dano. Se esse dano reduzir a proteção a 0 pontos de vida, a criatura protegida sofrerá qualquer dano remanescente.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Abjuração aprimorada", "\tA partir do 10° nível, quando você conjurar uma magia de abjuração que requeira que você realize um teste de habilidade como parte da conjuração da magia (como em contramágica e dissipar magia), você adiciona seu bônus de proficiência a esse teste de habilidade.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Resistência à magia", "\tA partir do 14° nível, você tem vantagem em testes de resistência contra magia.\n" +
				"\tAlém disso, você tem resistência contra o dano de magias.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tA Escola de Abjuração enfatiza magias que bloqueiam, expulsão ou protegem. Detratores dessa escola dizem que sua tradição trata de contradição, negação, ao invés de asserções positivas. Você compreende, no entanto, que terminar efeitos nocivos, proteger os fracos e banir influências malignas é tudo, menos um vazio filosófico. É uma vocação de orgulho e respeito.\n" +
				"\tChamados de abjuradores, membros dessa escola são procurados quando espíritos sinistros precisam ser exorcizados, quando locais importantes devem ser guardados contra espionagem mágica e quando portais para outros planos de existência precisam ser selados.\n";
	}
}