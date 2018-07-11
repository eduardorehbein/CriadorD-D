package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeConjuracao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Conjuração";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Conjuração instruída", "\tQuando você escolhe essa escola no 2º nível, o ouro e o tempo que você precisa gastar para copiar uma magia da escola de conjuração em seu grimório é reduzido à metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Conjuração menor", "\tA partir do 2° nível, quando você escolhe essa escola, você pode usar sua ação para conjurar até um objeto inanimado em sua mão ou no chão, em um espaço desocupado que você possa ver, a até 3 metros de você. Esse objeto não pode ter mais de 90 centímetros de largura nem pesar mais de 5 quilos e sua forma deve ser de um objeto não-mágico que você tenha visto. O objeto é visivelmente mágico, emanando penumbra a 1,5 metro.\n" +
				"\tO objeto desaparece depois de 1 hora, quando você usa essa característica novamente ou se ele sofrer qualquer dano.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Transposição benigna", "\tA partir do 6° nível, você pode usar sua ação para se teletransportar até 9 metros em um espaço desocupado que você possa ver. Alternativamente, você pode escolher um espaço ao alcance que seja ocupado por uma criatura Pequena ou Média. Se essa criatura for voluntária, vocês dois teletransportam-se, trocando de lugar.\n" +
				"\tUma vez que você usa essa característica, não pode usá-la novamente até terminar um descanso longo ou até conjurar uma magia de conjuração de 1° nível ou superior.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Conjuração focada", "\tComeçando no 10° nível, enquanto você estiver concentrado em uma magia de conjuração, sua concentração não pode ser interrompida como resultado de ter sofrido dano.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Invocações resistentes", "\tA partir do 14° nível, qualquer criatura que você invocar ou criar com uma magia de conjuração, terá 30 pontos de vida temporários.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tComo um conjurador, você prefere magias que produzam objetos e criaturas do nada. Você pode conjurar nuvens esvoaçantes de gás mortal ou invocar criaturas de outros lugares para lutar por você. À medida que seu domínio cresce, você aprende magias de teletransportação e pode se teletransportar por vastas distâncias, até mesmo para outros planos de existência, em um instante.\n";
	}
}
