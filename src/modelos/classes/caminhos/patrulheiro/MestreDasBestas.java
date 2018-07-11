package modelos.classes.caminhos.patrulheiro;

import modelos.Habilidade;
import modelos.classes.Patrulheiro;
import modelos.classes.caminhos.Caminho;

public class MestreDasBestas implements Caminho<Patrulheiro> {
	@Override
	public String toString() {
		return "Mestre das Bestas";
	}

	@Override
	public void setHabilidades(Patrulheiro classe) {
		classe.habilidadesAdd(new Habilidade("Companheiro de patrulha", "\tNo 3° nível, você ganha um companheiro bestial que acompanha você em suas aventuras e é treinado para lutar ao seu lado. Escolha uma besta que não seja maior que Médio e tenha um nível de desafio 1/4 ou inferior. (apêndice D apresenta as estatísticas do falcão, mastim e pantera, como exemplos). Adicione seu bônus de proficiência à CA, jogadas de ataque, jogadas de dano, assim como a todos os testes de resistência e perícias em que a besta for proficiente. O máximo de pontos de vida dela será igual ao seu total normal ou a quatro vezes seu nível de patrulheiro, o que for maior. Como qualquer criatura, seu companheiro pode gastar Dados de Vida durante um descanso curto.\n" +
				"\tA besta obedece os seus comando da melhor forma que puder. Ela realiza o turno dela na sua iniciativa, já que ela não realiza qualquer ação até que você a comande, exceto reações). No seu turno, você pode comandar verbalmente a beste para onde ela deve se mover (sem ação necessária). Você pode usar sua ação para comandá-la verbalmente a realizar as ações de Ataque, Disparada, Desengajar, Esquivar ou Ajuda. Se você tiver a característica Ataque Extra, você pode realizar um ataque com arma quando comandar a besta a realizar a ação de Ataque. Ela age por contra própria se você estiver incapacitado ou ausente, focando-se em defender você.\n" +
				"\tEnquanto estiver viajando através do seu terreno favorito apenas com a besta, você pode se mover furtivamente com ritmo de viagem normal.\n" +
				"\tSe a besta morrer, você pode obter outra besta gastando 8 horas criando uma conexão mágica com outra besta que não seja hostil a você, tanto de mesmo tipo da besta anterior quanto uma diferente.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Treinamento excepcional", "\tComeçando no 7° nível, em qualquer dos seus turnos, quando seu companheiro bestial não tiver atacado, você pode usar sua ação bônus para comandar a besta a realizar as ações de Disparada, Desengajar, Esquivar ou Ajuda, no seu turno.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("Fúria bestial", "\tA partir do 11° nível, seu companheiro bestial pode realizar dois ataques ou realizar a ação de Ataque Múltiplo (se ele possuir essa ação) quando você o comanda a usar a ação de Ataque.\n\n", 11));
		classe.habilidadesAdd(new Habilidade("Compartilhar magias", "\tA partir do 15° nível, quando você conjurar uma magia que tenha você como alvo, você também pode afetar seu companheiro bestial com a magia, se o companheiro estiver a até 9 metros de você.\n\n", 15));
		
	}

	@Override
	public String getDescricao() {
		return "\tO arquétipo Mestre das Bestas incorpora a amizade entre as raças civilizadas e as bestas do mundo. Unidos com um propósito, besta e patrulheiro trabalham como um para lutar contra inimigos monstruosos que ameaçam tanto a civilização quanto as terras selvagens. Emular o arquétipo Mestre das Bestas significa se empenhar no seu ideal, trabalhando em parceria com um animal como seu companheiro e amigo.\n";
	}
}
