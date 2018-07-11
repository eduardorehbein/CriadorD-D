package modelos.classes.caminhos.bardo;

import modelos.Habilidade;
import modelos.classes.Bardo;
import modelos.classes.caminhos.Caminho;

public class ColegioDaBravura implements Caminho<Bardo> {
	@Override
	public String toString() {
		return "Col�gio da Bravura";
	}

	@Override
	public void setHabilidades(Bardo classe) {
		classe.habilidadesAdd(new Habilidade("Profici�ncia adicional", "\tQuando voc� se junta ao Col�gio da Bravura no 3� n�vel, voc� adquire profici�ncia com armadura m�dias, escudos e armas marciais.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Inspira��o em combate", "\tTamb�m no 3� n�vel, voc� aprende a inspirar os outros em batalha. Uma criatura que possuir um dado de Inspira��o de Bardo seu, pode rolar esse dado e adicionar o n�mero rolado a uma jogada de dano que ele tenha acabado de fazer. Alternativamente, quando uma jogada de ataque for realizada contra essa criatura, ela pode usar sua rea��o para rolar o dado de Inspira��o de Bardo e adicionar o n�mero rolado a sua CA contra esse ataque, depois da rolagem ser feita, mas antes de saber se errou ou acertou.\n\n", 3));
		classe.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 6� n�vel, voc� pode atacar duas vezes, ao inv�s de uma, sempre que voc� realizar a a��o de Ataque no seu turno.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Magia de batalha", "\tNo 14� n�vel, voc� dominou a arte de tecer a conjura��o e usar armas em um ato harmonioso. Quando voc� usar sua a��o para conjurar uma magia de bardo, voc� pode realizar um ataque com arma com uma a��o b�nus.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tOs bardos do Col�gio da Bravura s�o escaldos destemidos de quem os contos mantem viva a mem�ria dos grandes her�is do passado, dessa forma inspirando uma nova gera��o de her�is. Esses bardos se re�nem em sal�es de hidromel ou ao redor de fogueiras para cantar os feitos dos grandiosos, tanto do passado quanto do presente. Eles viajam pelos lugares para testemunhar grandes eventos em primeira m�o e para garantir que a mem�ria desses eventos n�o se perca nesse mundo. Com suas can��es, eles inspiram outros a alcan�ar o mesmo patamar de realiza��es dos antigos her�is.\n";
	}
}
