package modelos.classes.caminhos.druida;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Druida;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class CirculoDaTerra implements Caminho<Druida>, Magica {
	@Override
	public String toString() {
		return "C�rculo da Terra";
	}
	
	@Override
	public void setHabilidades(Druida classe) {
		classe.habilidadesAdd(new Habilidade("Truque adicional", "\tQuando voc� escolhe esse c�rculo no 2� n�vel, voc� aprende um truque de druida adicional, � sua escolha.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Recupera��o natural", "\tA partir do 2� n�vel, voc� pode recuperar parte da sua energia m�gica parando para fazer uma medita��o e comunh�o com a natureza. Durante um descanso curto, voc� escolhe espa�os de magia gastos para recuperar. O espa�o de magia pode ter um n�vel combinado igual ou menor que metade do seu n�vel de druida (arredondado para baixo) e, nenhum dos espa�os pode ser de uma magia de 6� n�vel ou superior. Voc� n�o pode usar essa caracter�stica novamente at� terminar um descanso longo.\n" +
				"\tPor exemplo, quando voc� for um druida de 4� n�vel, voc� pode recuperar at� dois n�veis em espa�os de magia. Voc� pode recuperar, tanto uma magia de 2� n�vel, quanto duas magias de 1� n�vel.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Caminho da floresta", "\tA partir do 6� n�vel, mover-se atrav�s de terreno dif�cil n�o-m�gico n�o te custar� nenhum movimento extra. Voc� tamb�m pode passar atrav�s de plantas n�o-m�gicas sem ser atrasado por elas e sem sofrer dano delas se elas tiverem espinhos, espinhas ou perigos similares.\n" +
				"\tAl�m disso, voc� tem vantagem em testes de resist�ncia contra plantas criadas magicamente ou manipuladas para impedir movimenta��o, como as criadas pela magia constri��o.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Prote��o natural", "\tQuando voc� atingir o 10� n�vel, voc� n�o pode ser enfeiti�ado ou amedrontado por elementais ou fadas e voc� se torna imune a venenos e doen�as.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Santu�rio natural", "\tA partir do 14� n�vel, as criaturas do mundo natural sentem sua liga��o com a natureza e hesitar�o em atacar voc�. Quando uma besta ou plantar atacar voc�, essa criatura dever� fazer um teste de resist�ncia de Sabedoria contra uma CD igual a das suas magias de druida. Em uma falha, a criatura deve escolher um alvo diferente ou o ataque erra automaticamente. Em um sucesso, a criatura se torna imune a esse efeito por 24 horas.\n" +
				"\tA criatura est� ciente deste efeito antes de resolver atacar voc�.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tO C�rculo da Terra � constitu�do por m�sticos e s�bios que salvaguardam conhecimento e ritos antigos atrav�s de uma vasta tradi��o oral. Esses druida se encontram em c�rculos sagrados de �rvores ou mon�litos para sussurrar segredos primordiais em Dru�dico. Os membros mais s�bios do c�rculo presidem como os sacerdotes-dirigentes de comunidades que creem na Cren�a Antiga, e servem como conselheiros para os governantes desses povos. Como membro desse c�rculo, sua magia � influenciada pela terra onde voc� � iniciado nos ritos misteriosos do c�rculo.\n";
	}
}
