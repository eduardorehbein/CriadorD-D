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
		classe.habilidadesAdd(new Habilidade("Artes sombrias", "\tComeçando quando você escolhe essa tradição, no 3° nível, você pode usar seu chi para simular o efeito de certas magias. Com uma ação, você pode gastar 2 pontos de chi para conjurar escuridão, visão no escuro, passos sem pegadas ou silêncio, sem precisar de componentes materiais. Além disso, você ganha o truque ilusão menor, se você ainda não o conhecia.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Passo das sombras", "\tNo 6° nível, você ganha a habilidade de entrar em uma sombra e sair em outra. Quando você estiver sob penumbra ou na escuridão, com uma ação bônus, você pode se teletransportar a até 18 metros para um espaço desocupado que você possa ver que também esteja sob penumbra ou escuridão. Você, então, terá vantagem no primeiro ataque corpo-a-corpo que você fizer antes do final do seu turno.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Manto de sombras", "\tNo 11° nível, você aprendeu a se tornar uno com as sombras. Quando você estiver em uma área de penumbra ou escuridão, você pode usar sua ação para se tornar invisível. Você permanece invisível até realizar um ataque, conjurar uma magia ou se for para uma área de bem iluminada.\n\n", 11));
		classe.habilidadesAdd(new Habilidade("Oportunista", "\tNo 17° nível, você pode explorar um momento de distração de uma criatura quando ela é atingida por um ataque. Toda vez que uma criatura a até 1,5 metro de você for atingida por um ataque realizar por outra criatura diferente de você, você pode usar sua reação para realizar um ataque corpo-a-corpo contra essa criatura.\n\n", 17));	
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tMonges do Caminho da Sombra seguem uma tradição que valoriza furtividade e subterfugio. Esses monges devem ser chamados de ninjas ou dançarinos das sombras e eles servem como espiões e assassinos. Às vezes, os membros de um monastério ninja são membros da mesma família, formando um clã que jurou sigilo sobre suas artes e missões. Outros monastérios parecem mais com guildas de ladrões, oferecendo seus serviços a nobres, mercadores ricos ou qualquer um que possa pagar suas taxas. Independente dos seus métodos, os líderes desses monastérios esperam obediência inquestionável de seus estudantes.\n";
	}
}
