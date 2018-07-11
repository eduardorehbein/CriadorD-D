package modelos.classes.caminhos.paladino;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Paladino;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class JuramentoDosAncioes implements Caminho<Paladino>, Magica {
	@Override
	public String toString() {
		return "Juramento dos Anciôes";
	}
	
	@Override
	public void setHabilidades(Paladino classe) {
		classe.habilidadesAdd(new Habilidade("Dogmas dos anciões", "\tOs dogmas do Juramento dos Anciões tem sido preservados por incontáveis séculos. Esse juramento enfatiza os princípios do bem acima de qualquer interesse de ordem ou caos. Seus quatro princípios centrais são simples.\n" +
				"\tAcenda a Luz. Através dos seus atos de misericórdia, gentileza e piedade, acenda a luz da esperança no mundo, afastando o desespero.\n" +
				"\tAbrigue a Luz. Onde houver bem, beleza, amor e riso no mundo, mantenha-se contra a maldade que pode engolir isso. Onde a vida floresce, mantenha-se contra as forças que podem torná-la estéril.\n" +
				"\tPreserve Sua Própria Luz. Deleite-se com música e risadas, beleza e arte. Se você permitir que a luz morra em seu coração, você não poderá preservá-la no mundo.\n" +
				"\tSeja a Luz. Seja uma glorioso guia para todos que vivem em desespero. Deixe a luz da sua alegria e coragem brilhar através de todos os seus feitos.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade", "\tQuando você faz esse juramento, no 3° nível, você ganha as duas opções seguintes de Canalizar Divindade.\n" +
				"\tFúria da Natureza. Você pode usar seu Canalizar Divindade para invocar forças primitivas para enredar um oponente. Com uma ação, você pode fazer com que vinhas espectrais cresçam e alcancem uma criatura a até 3 metros de você, que você possa ver. A criatura deve ser bem sucedida num teste de resistência de Força ou Destreza (a escolha dela) ou ficará impedida. Enquanto estiver impedida pelas vinhas, a criatura repete o teste de resistência no final de cada turno dela. Se obtiver sucesso, ela se liberta e as vinhas desaparecem.\n" +
				"\tExpulsar os Infiéis. Você pode usar seu Canalizar Divindade para pronunciar palavras antigas que são dolorosas para fadas e corruptores que as ouvem. Com uma ação, você ergue seu símbolo sagrado e cada fada ou corruptor que puder ver ou ouvir você e esteja a até 9 metros, deve realizar um teste de resistência de Sabedoria. Se a criatura falhar no teste de resistência, ela será expulsa por 1 minuto ou até sofrer dano.\n" +
				"\tUma criatura expulsa deve gastar seu turno tentando se mover para longe de você da melhor forma possível e não pode, voluntariamente, se mover para um espaço a menos de 9 metros de você. Ela também não pode realizar reações. Nas ações delas, elas só poderão realizar a ação de Disparada ou tentar escapar de um efeito que as impeça de se mover. Se não houver lugar para se mover, a criatura pode usar a ação de Esquivar.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Aura de vigilância", "\tA partir do 7° nível, a magia antiga fica tão profunda em você que ela forma uma proteção mística. Você e as criaturas amistosas a até 3 metros tem resistência ao dano de magias.\n" +
				"\tNo 18° nível, o alcance dessa aura aumenta para 9 metros.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Sentinela imortal", "\tA partir do 15° nível, quando você for reduzido a 0 pontos de vida, mas não morrer totalmente, você pode escolher cair para 1 ponto de vida no lugar. Uma vez que você use essa característica, não poderá fazê-lo novamente até ter terminado um descanso longo.\n" +
				"\tAlém disso, você não sofre nenhum efeito colateral por envelhecer e você não pode envelhecer magicamente.\n\n", 15));
		classe.habilidadesAdd(new Habilidade("Campeão dos anciões", "\tNo 20° nível, você pode assumir a forma de uma antiga força da natureza, tomando a aparência que desejar. Por exemplo, sua pele poderia ficar verde ou adquirir uma textura de casca de árvore, seu cabelo poderia ficar com aparência de folhas ou musgo ou poderia crescer galhadas ou uma juba como a de um leão.\n" +
				"\tUsando sua ação, você sofre uma transformação. Por 1 minuto, você ganha os seguintes benefícios:\n" +
				"\t* No início de cada um dos seus turnos, você recupera 10 pontos de vida.\n" +
				"\t* Sempre que você for conjurar uma magia de paladino que tiver um tempo de conjuração de 1 ação, você pode conjurá-la usando uma ação bônus, ao invés.\n" +
				"\t* Criaturas inimigas a até 3 metros de você tem desvantagem em testes de resistência contra suas magias de paladino e as opções de Canalizar Divindade.\n" +
				"\tUma vez que você use essa característica, não poderá fazê-lo novamente até ter terminado um descanso longo.\n\n", 20));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}
	
	@Override
	public String getDescricao() {
		return "\tO Juramento dos Anciões é tão antigo quanto a raça dos elfos e os rituais dos druidas. Algumas vezes chamados de cavaleiros feéricos, cavaleiros verdejantes ou cavaleiros dos chifres, paladinos que fazem esse juramento lançam sua sorte com o lado da luz na batalha cósmica contra as trevas, porque eles amam as coisas belas e vivificantes do mundo, não necessariamente porque eles acreditam em princípios de honra, coragem e justiça. Eles adornam suas armaduras e roupas com imagens de coisas que crescem – folhas, galhadas ou flores – para refletir seu comprometimento em preservar a vida e a luz no mundo.\n";
	}
}
