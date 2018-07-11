package modelos.classes.caminhos.bardo;

import modelos.Habilidade;
import modelos.classes.Bardo;
import modelos.classes.caminhos.Caminho;

public class ColegioDaBravura implements Caminho<Bardo> {
	@Override
	public String toString() {
		return "Colégio da Bravura";
	}

	@Override
	public void setHabilidades(Bardo classe) {
		classe.habilidadesAdd(new Habilidade("Proficiência adicional", "\tQuando você se junta ao Colégio da Bravura no 3° nível, você adquire proficiência com armadura médias, escudos e armas marciais.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Inspiração em combate", "\tTambém no 3° nível, você aprende a inspirar os outros em batalha. Uma criatura que possuir um dado de Inspiração de Bardo seu, pode rolar esse dado e adicionar o número rolado a uma jogada de dano que ele tenha acabado de fazer. Alternativamente, quando uma jogada de ataque for realizada contra essa criatura, ela pode usar sua reação para rolar o dado de Inspiração de Bardo e adicionar o número rolado a sua CA contra esse ataque, depois da rolagem ser feita, mas antes de saber se errou ou acertou.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 6° nível, você pode atacar duas vezes, ao invés de uma, sempre que você realizar a ação de Ataque no seu turno.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Magia de batalha", "\tNo 14° nível, você dominou a arte de tecer a conjuração e usar armas em um ato harmonioso. Quando você usar sua ação para conjurar uma magia de bardo, você pode realizar um ataque com arma com uma ação bônus.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tOs bardos do Colégio da Bravura são escaldos destemidos de quem os contos mantem viva a memória dos grandes heróis do passado, dessa forma inspirando uma nova geração de heróis. Esses bardos se reúnem em salões de hidromel ou ao redor de fogueiras para cantar os feitos dos grandiosos, tanto do passado quanto do presente. Eles viajam pelos lugares para testemunhar grandes eventos em primeira mão e para garantir que a memória desses eventos não se perca nesse mundo. Com suas canções, eles inspiram outros a alcançar o mesmo patamar de realizações dos antigos heróis.\n";
	}
}
