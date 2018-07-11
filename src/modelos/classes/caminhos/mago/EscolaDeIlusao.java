package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeIlusao implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Ilus�o";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Ilus�o instru�da", "\tQuando voc� escolhe essa escola no 2� n�vel, o ouro e o tempo que voc� precisa gastar para copiar uma magia da escola de ilus�o em seu grim�rio � reduzido � metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Ilus�o menor aprimorada", "\tA partir do 2� n�vel, quando voc� escolhe essa escola, voc� aprende o truque ilus�o menor. Se voc� j� conhece esse truque, voc� aprende um truque de mago diferente, � sua escolha. O truque n�o conta no n�mero de truque que voc� conhece.\n" +
				"\tQuando voc� conjurar ilus�o menor, voc� pode criar tanto um som quanto uma imagem com uma �nica conjura��o da magia.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Ilus�es mold�veis", "\tA partir do 6� n�vel, quando voc� conjura uma magia de ilus�o que tenha dura��o de 1 minuto ou maior, voc� pode usar sua a��o para mudar a natureza da ilus�o (usando os par�metros normais da magia para a ilus�o), considerando que voc� pode ver a ilus�o.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Eu ilus�rio", "\tCome�ando no 10� n�vel, voc� pode criar uma duplicata ilus�ria de si mesmo em um instante, como uma rea��o instintiva ao perigo. Quando uma criatura realizar uma jogada de ataque contra voc�, voc� pode usar sua rea��o para interpor a duplicata ilus�ria entre o atacante e voc�. O ataque erra voc� automaticamente, e ent�o, a ilus�o se dissipa.\n" +
				"\tUma vez que voc� usa essa caracter�stica, n�o pode us�-la novamente at� terminar um descanso longo.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Realidade Ilus�ria", "\tA partir do 14� n�vel, voc� aprendeu o segredo de como tecer magia sombria em suas ilus�es para torn�-las semirreais. Quando voc� conjura uma magia de ilus�o de 1� n�vel ou superior, voc� pode escolher um objeto inanimado e n�o-m�gico que � parte da ilus�o e tornar esse objeto real. Voc� pode fazer isso no seu turno, com uma a��o b�nus, enquanto a magia estiver em efeito. O objeto permanece real por 1 minuto. Por exemplo, voc� pode criar uma ilus�o de uma ponte sobre um abismo e depois torn�-la real tempo suficiente para que seus aliados a atravessem.\n" +
				"\tO objeto n�o pode causar dano ou qualquer tipo de ferimento direto a ningu�m.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tVoc� focou seus estudos em magias que ofuscam os sentidos, confundem a mente e enganam at� mesmo os povos mais s�bios. Sua m�gica � sutil, mas as ilus�es criadas pela sua mente afiada fazem o imposs�vel parecer real. Alguns ilusionistas � incluindo muitos magos gnomos � s�o vigaristas benignos que usam suas magias para entreter. Outros s�o mestres mais sinistros da engana��o, usando suas ilus�es para apavorar e iludir os outros para ganhos pessoais.\n";
	}
}
