package modelos.classes.caminhos.feiticeiro;

import classesAuxiliares.GuardaMagias;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Feiticeiro;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class MagiaSelvagem implements Caminho<Feiticeiro> {
	@Override
	public String toString() {
		return "Magia Selvagem";
	}
	
	@Override
	public void setHabilidades(Feiticeiro classe) {
		//TODO tabela
		classe.habilidadesAdd(new Habilidade("Surto de magia selvagem", "\tA partir do momento que voc� escolhe essa origem, no 1� n�vel, sua conjura��o pode liberar surtos de magia selvagem. Imediatamente ap�s voc� conjurar uma magia de feiticeiro de 1� n�vel ou superior, o Mestre pode solicitar que voc� role um d20. Se voc� rolar um 1, role na tabela Surto de Magia Selvagem para criar um efeito m�gico aleat�rio. Um surto s� pode ocorrer uma vez por turno. Se o efeito de um surto for uma magia, ela � muito selvagem para ser afetada por Metamagia. Se ela normalmente exige concentra��o, nesse caso n�o ser� necess�rio; a magia permanece por sua dura��o total.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Mar�s de caos", "\tA partir do 1� n�vel, voc� pode manipular as for�as do acaso e do caos para ganhar vantagem em uma jogada de ataque, teste de habilidade ou teste de resist�ncia. Quando o fizer, voc� deve finalizar um descanso longo antes de poder usar essa caracter�stica novamente.\n" +
				"\tA qualquer momento, depois de recuperar o uso dessa caracter�stica, o Mestre pode rolar na tabela Surto de Magia Selvagem, imediatamente ap�s voc� conjurar uma magia de feiticeiro de 1� n�vel ou superior. Ap�s isso, voc� recupera o uso dessa caracter�stica.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Dobrar a sorte", "\tA partir do 6� n�vel, voc� adquire a habilidade de mudar o destino usando sua magia selvagem. Quando outra criatura que voc� possa ver realizar uma jogada de ataque, um teste de habilidade ou um teste de resist�ncia, voc� pode usar sua rea��o para gastar 2 pontos de feiti�aria para rolar 1d4 e aplicar o n�mero rolado como um b�nus ou uma penalidade (� sua escolha) na jogada da criatura. Voc� pode fazer isso depois da criatura fazer a jogada, mas antes do efeito ocorrer.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Caos controlado", "\tNo 14� n�vel, voc� ganha um controle modico sobre seus surtos de magia selvagem. Sempre que voc� rolar a tabela Surto de Magia Selvagem, voc� pode rolar duas vezes e usar qualquer resultado.\n\n", 14));
		classe.habilidadesAdd(new Habilidade("Bombardeio de magia", "\tA partir do 18� n�vel, a energia nociva das suas magias se intensifica. Quando voc� rolar o dano de uma magia e rolar o maior dano poss�vel em qualquer dado, escolha um desses dados, role ele novamente e adicione o valor rolado ao dano. Voc� pode usar essa caracter�stica apenas uma vez por rodada.\n\n", 18));
	}

	@Override
	public String getDescricao() {
		return "\tSua magia inata vem das for�as selvagens do caos que constituem a base da ordem da cria��o. Voc� deve ter sido exposto a algum tipo de magia bruta, talvez de um portal planar que levava ao Limbo, a Planos Elementais ou ao misterioso Reino Distante. Talvez voc� tenha sido aben�oado por uma poderosa criatura fe�rica ou marcado por um corruptor. Ou sua magia pode ser uma casualidade do seu nascimento, sem qualquer raz�o aparente. No entanto, ela existe, essa magia ca�tica fervilha dentro de voc�, esperando por qualquer brecha.\n";
	}
}