package modelos.classes.caminhos.monge;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Monge;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class CaminhoDaSombra implements Caminho<Monge>, Magica {
	@Override
	public String toString() {
		return "Caminho da Sombra";
	}
	
	@Override
	public void setHabilidades(Monge classe) {
		classe.habilidadesAdd(new Habilidade("Artes sombrias", "\tCome�ando quando voc� escolhe essa tradi��o, no 3� n�vel, voc� pode usar seu chi para simular o efeito de certas magias. Com uma a��o, voc� pode gastar 2 pontos de chi para conjurar escurid�o, vis�o no escuro, passos sem pegadas ou sil�ncio, sem precisar de componentes materiais. Al�m disso, voc� ganha o truque ilus�o menor, se voc� ainda n�o o conhecia.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Passo das sombras", "\tNo 6� n�vel, voc� ganha a habilidade de entrar em uma sombra e sair em outra. Quando voc� estiver sob penumbra ou na escurid�o, com uma a��o b�nus, voc� pode se teletransportar a at� 18 metros para um espa�o desocupado que voc� possa ver que tamb�m esteja sob penumbra ou escurid�o. Voc�, ent�o, ter� vantagem no primeiro ataque corpo-a-corpo que voc� fizer antes do final do seu turno.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Manto de sombras", "\tNo 11� n�vel, voc� aprendeu a se tornar uno com as sombras. Quando voc� estiver em uma �rea de penumbra ou escurid�o, voc� pode usar sua a��o para se tornar invis�vel. Voc� permanece invis�vel at� realizar um ataque, conjurar uma magia ou se for para uma �rea de bem iluminada.\n\n", 11));
		classe.habilidadesAdd(new Habilidade("Oportunista", "\tNo 17� n�vel, voc� pode explorar um momento de distra��o de uma criatura quando ela � atingida por um ataque. Toda vez que uma criatura a at� 1,5 metro de voc� for atingida por um ataque realizar por outra criatura diferente de voc�, voc� pode usar sua rea��o para realizar um ataque corpo-a-corpo contra essa criatura.\n\n", 17));	
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tMonges do Caminho da Sombra seguem uma tradi��o que valoriza furtividade e subterfugio. Esses monges devem ser chamados de ninjas ou dan�arinos das sombras e eles servem como espi�es e assassinos. �s vezes, os membros de um monast�rio ninja s�o membros da mesma fam�lia, formando um cl� que jurou sigilo sobre suas artes e miss�es. Outros monast�rios parecem mais com guildas de ladr�es, oferecendo seus servi�os a nobres, mercadores ricos ou qualquer um que possa pagar suas taxas. Independente dos seus m�todos, os l�deres desses monast�rios esperam obedi�ncia inquestion�vel de seus estudantes.\n";
	}
}
