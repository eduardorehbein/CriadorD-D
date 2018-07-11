package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeIlusao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Ilusão";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Ilusão instruída", "\tQuando você escolhe essa escola no 2º nível, o ouro e o tempo que você precisa gastar para copiar uma magia da escola de ilusão em seu grimório é reduzido à metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Ilusão menor aprimorada", "\tA partir do 2° nível, quando você escolhe essa escola, você aprende o truque ilusão menor. Se você já conhece esse truque, você aprende um truque de mago diferente, à sua escolha. O truque não conta no número de truque que você conhece.\n" +
				"\tQuando você conjurar ilusão menor, você pode criar tanto um som quanto uma imagem com uma única conjuração da magia.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Ilusões moldáveis", "\tA partir do 6° nível, quando você conjura uma magia de ilusão que tenha duração de 1 minuto ou maior, você pode usar sua ação para mudar a natureza da ilusão (usando os parâmetros normais da magia para a ilusão), considerando que você pode ver a ilusão.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Eu ilusório", "\tComeçando no 10° nível, você pode criar uma duplicata ilusória de si mesmo em um instante, como uma reação instintiva ao perigo. Quando uma criatura realizar uma jogada de ataque contra você, você pode usar sua reação para interpor a duplicata ilusória entre o atacante e você. O ataque erra você automaticamente, e então, a ilusão se dissipa.\n" +
				"\tUma vez que você usa essa característica, não pode usá-la novamente até terminar um descanso longo.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Realidade Ilusória", "\tA partir do 14° nível, você aprendeu o segredo de como tecer magia sombria em suas ilusões para torná-las semirreais. Quando você conjura uma magia de ilusão de 1° nível ou superior, você pode escolher um objeto inanimado e não-mágico que é parte da ilusão e tornar esse objeto real. Você pode fazer isso no seu turno, com uma ação bônus, enquanto a magia estiver em efeito. O objeto permanece real por 1 minuto. Por exemplo, você pode criar uma ilusão de uma ponte sobre um abismo e depois torná-la real tempo suficiente para que seus aliados a atravessem.\n" +
				"\tO objeto não pode causar dano ou qualquer tipo de ferimento direto a ninguém.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tVocê focou seus estudos em magias que ofuscam os sentidos, confundem a mente e enganam até mesmo os povos mais sábios. Sua mágica é sutil, mas as ilusões criadas pela sua mente afiada fazem o impossível parecer real. Alguns ilusionistas – incluindo muitos magos gnomos – são vigaristas benignos que usam suas magias para entreter. Outros são mestres mais sinistros da enganação, usando suas ilusões para apavorar e iludir os outros para ganhos pessoais.\n";
	}
}
