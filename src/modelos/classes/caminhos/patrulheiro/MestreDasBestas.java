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
		classe.habilidadesAdd(new Habilidade("Companheiro de patrulha", "\tNo 3� n�vel, voc� ganha um companheiro bestial que acompanha voc� em suas aventuras e � treinado para lutar ao seu lado. Escolha uma besta que n�o seja maior que M�dio e tenha um n�vel de desafio 1/4 ou inferior. (ap�ndice D apresenta as estat�sticas do falc�o, mastim e pantera, como exemplos). Adicione seu b�nus de profici�ncia � CA, jogadas de ataque, jogadas de dano, assim como a todos os testes de resist�ncia e per�cias em que a besta for proficiente. O m�ximo de pontos de vida dela ser� igual ao seu total normal ou a quatro vezes seu n�vel de patrulheiro, o que for maior. Como qualquer criatura, seu companheiro pode gastar Dados de Vida durante um descanso curto.\n" +
				"\tA besta obedece os seus comando da melhor forma que puder. Ela realiza o turno dela na sua iniciativa, j� que ela n�o realiza qualquer a��o at� que voc� a comande, exceto rea��es). No seu turno, voc� pode comandar verbalmente a beste para onde ela deve se mover (sem a��o necess�ria). Voc� pode usar sua a��o para comand�-la verbalmente a realizar as a��es de Ataque, Disparada, Desengajar, Esquivar ou Ajuda. Se voc� tiver a caracter�stica Ataque Extra, voc� pode realizar um ataque com arma quando comandar a besta a realizar a a��o de Ataque. Ela age por contra pr�pria se voc� estiver incapacitado ou ausente, focando-se em defender voc�.\n" +
				"\tEnquanto estiver viajando atrav�s do seu terreno favorito apenas com a besta, voc� pode se mover furtivamente com ritmo de viagem normal.\n" +
				"\tSe a besta morrer, voc� pode obter outra besta gastando 8 horas criando uma conex�o m�gica com outra besta que n�o seja hostil a voc�, tanto de mesmo tipo da besta anterior quanto uma diferente.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Treinamento excepcional", "\tCome�ando no 7� n�vel, em qualquer dos seus turnos, quando seu companheiro bestial n�o tiver atacado, voc� pode usar sua a��o b�nus para comandar a besta a realizar as a��es de Disparada, Desengajar, Esquivar ou Ajuda, no seu turno.\n\n", 7));
		classe.habilidadesAdd(new Habilidade("F�ria bestial", "\tA partir do 11� n�vel, seu companheiro bestial pode realizar dois ataques ou realizar a a��o de Ataque M�ltiplo (se ele possuir essa a��o) quando voc� o comanda a usar a a��o de Ataque.\n\n", 11));
		classe.habilidadesAdd(new Habilidade("Compartilhar magias", "\tA partir do 15� n�vel, quando voc� conjurar uma magia que tenha voc� como alvo, voc� tamb�m pode afetar seu companheiro bestial com a magia, se o companheiro estiver a at� 9 metros de voc�.\n\n", 15));
		
	}

	@Override
	public String getDescricao() {
		return "\tO arqu�tipo Mestre das Bestas incorpora a amizade entre as ra�as civilizadas e as bestas do mundo. Unidos com um prop�sito, besta e patrulheiro trabalham como um para lutar contra inimigos monstruosos que amea�am tanto a civiliza��o quanto as terras selvagens. Emular o arqu�tipo Mestre das Bestas significa se empenhar no seu ideal, trabalhando em parceria com um animal como seu companheiro e amigo.\n";
	}
}
