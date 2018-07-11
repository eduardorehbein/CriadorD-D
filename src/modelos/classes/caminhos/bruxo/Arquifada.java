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
		classe.habilidadesAdd(new Habilidade("Lista de magia expandida", "\tAs magias referentes ao seu pacto s�o adicionadas automaticamente na sua lista de magias.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Presen�a fe�rica", "\tA partir do 1� n�vel, seu patrono concede a voc� a habilidade de projetar a sedu��o e temeridade da presen�a da fada. Com uma a��o, voc� pode fazer com que cada criatura num cubo de 3 metros centrado em voc�, fa�a um teste de resist�ncia de Sabedoria com uma CD igual a de sua magia de bruxo. As criaturas que falharem no teste ficaram enfeiti�adas ou amedrontadas por voc� (� sua escolha) at� o in�cio do seu pr�ximo turno.\n" +
				"\tQuando voc� usar essa caracter�stica, voc� n�o poder� utiliz�-la novamente antes de realizar um descanso curto ou longo.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("N�voa de fuga", "\tA partir do 6� n�vel, voc� pode desaparecer em uma lufada de n�voa em resposta a alguma ofensa. Quando voc� sofrer dano, voc� pode usar sua rea��o para ficar invis�vel e se teletransportar a at� 18 metros para um espa�o desocupado que voc� possa ver. Voc� permanece invis�vel at� o in�cio do seu pr�ximo turno ou at� realizar um ataque ou conjurar uma magia.\n" +
				"\tAp�s usar essa caracter�sticas, voc� n�o poder� utiliz�-la novamente at� terminar um descanso curto ou longo.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Defesa sedutora", "\tA partir do 10� n�vel, seu patrono ensina voc� como voltar as magias de efeito mental dos seus inimigos contra eles. Voc� n�o pode ser enfeiti�ado e, quando outra criatura tenta enfeiti��-lo, voc� pode usar sua rea��o para tentar reverter o encanto de volta aquela criatura. A criatura deve ser bem sucedida num teste de resist�ncia de Sabedoria contra a CD da sua magia de bruxo ou ficara enfeiti�ado por 1 minuto ou at� a criatura sofrer dano.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Del�rio sombrio", "\tCome�ando no 14� n�vel, voc� pode imergir uma criatura num reino ilus�rio. Com um a��o, escolha uma criatura que voc� possa ver a at� 18 metros de voc�. Ela deve ser bem sucedida num teste de resist�ncia de Sabedoria contra a CD da sua magia de bruxo. Se ela falhar, ela ficar� enfeiti�ada ou amedrontada por voc� (� sua escolha) por 1 minuto ou at� voc� quebrar sua concentra��o (como se voc� estivesse se concentrando em uma magia). Esse efeito termina prematuramente se a criatura sofrer dano.\n" +
				"\tAt� que essa ilus�o termine, a criatura acredita que est� perdida num reino enevoado, a apar�ncia desse reino fica a seu crit�rio. A criatura s� pode ver e ouvir a si mesma, a voc� e a sua ilus�o.\n" +
				"\tVoc� deve terminar um descanso curto ou longo antes de poder usar essa caracter�stica novamente.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tSeu patrono � um senhor ou senhora das fadas, uma criatura lend�ria que det�m segredos que foram esquecidos antes das ra�as mortais nascerem. As motiva��es desses seres s�o, muitas vezes, inescrut�veis e, as vezes, exc�ntricas e podem envolver esfor�os para adquirir grandes poderes m�gicos ou resolu��o de desaven�as antigas. Incluem-se dentre esses seres o Pr�ncipe do Frio; a Rainha do Ar e Trevas, regente da Corte do Crep�sculo; Titania da Corte do Ver�o; seu c�njuge, Oberon, o Senhor Verdejante; Hyrsam, o Pr�ncipe dos Tolos; e bruxas antigas.\n";
	}
}
