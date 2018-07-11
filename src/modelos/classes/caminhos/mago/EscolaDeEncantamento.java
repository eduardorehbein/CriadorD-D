package modelos.classes.caminhos.mago;

import modelos.Habilidade;
import modelos.classes.Mago;
import modelos.classes.caminhos.Caminho;

public class EscolaDeEncantamento implements Caminho<Mago> {
	@Override
	public String toString() {
		return "Escola de Encantamento";
	}
	
	@Override
	public void setHabilidades(Mago classe) {
		classe.habilidadesAdd(new Habilidade("Encantamento instru�do", "\tQuando voc� escolhe essa escola no 2� n�vel, o ouro e o tempo que voc� precisa gastar para copiar uma magia da escola de encantamento em seu grim�rio � reduzido � metade.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Olhar hipnotizante", "\tA partir do 2� n�vel, quando voc� escolhe essa escola, suas palavras suaves e olhar encantador podem escravizar magicamente outra criatura. Com uma a��o, escolha uma criatura que voc� possa ver a at� 1,5 metro. Se o alvo puder ver ou ouvir voc�, ele deve ser bem sucedido num teste de resist�ncia de Sabedoria contra uma CD igual das suas magias de mago, ou ficar� enfeiti�ado por voc� at� o final do seu pr�ximo turno. O deslocamento da criatura enfeiti�ada cai para 0 e a criatura est� incapacitada e visivelmente aturdida.\n" +
				"\tNos turnos subsequentes, voc� pode usar sua a��o para manter esse efeito, estendendo sua dura��o at� o final do seu pr�ximo turno. No entanto, o efeito termina se voc� se afastar mais de 1,5 metro da criatura, se a criatura n�o puder nem ver nem ouvir voc� ou se a criatura sofrer dano.\n" +
				"\tAssim que o efeito terminar, ou se a criatura for bem sucedida no teste de resist�ncia inicial contra esse efeito, voc� n�o poder� usar essa caracter�stica nessa criatura novamente at� terminar um descanso longo.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Encanto instintivo", "\tCome�ando no 6� n�vel, quando uma criatura que voc� puder ver a at� 9 metros, realizar uma jogada de ataque contra voc�, voc� pode usar sua rea��o para desviar o ataque, contanto que exista outra criatura no alcance do ataque. O atacante deve realizar um teste de resist�ncia de Sabedoria contra uma CD igual das suas magias de mago. Caso falhe, o atacante deve atacar a criatura mais pr�xima dele, excluindo voc� ou ele mesmo. Se existirem diversas criaturas pr�ximas, o atacante escolhe qual deseja atacar. Em um sucesso, voc� n�o poder� usar essa caracter�stica contra o atacante novamente at� terminar um descanso longo.\n" +
				"\tVoc� deve escolher usar essa caracter�stica antes de saber se o ataque atingiu ou errou. Criaturas que n�o podem ser enfeiti�adas s�o imunes a esse efeito.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Dividir encantamento", "\tA partir do 10� n�vel, quando voc� conjurar uma magia de encantamento de 1� n�vel ou superior que tenha uma �nica criatura como alvo, voc� pode fazer com que ela afete uma segunda criatura.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Alterar mem�rias", "\tNo 14� n�vel, voc� ganha a habilidade de tornar uma criatura inconsciente da sua influ�ncia m�gica sobre ela. Quando voc� conjura uma magia de encantamento para enfeiti�ar uma ou mais criaturas, voc� pode alterar a compreens�o de uma criatura para que ela continue sem saber que est� sendo enfeiti�ada.\n" +
				"\tAl�m disso, assim que a magia expirar, voc� pode usar sua a��o para tentar fazer com que a criatura escolhida esque�a parte do tempo que permaneceu enfeiti�ada. A criatura deve ser bem sucedida num teste de resist�ncia de Intelig�ncia contra uma CD igual das suas magias de mago ou perder� uma quantidade de horas da sua mem�ria igual a 1 + seu modificador de Carisma (m�nimo 1). Voc� pode fazer com que a criatura esque�a menos tempo e o total de tempo n�o pode exceder a dura��o da sua magia de encantamento.\n\n", 14));
	}

	@Override
	public String getDescricao() {
		return "\tComo um membro da Escola de Encantamento, voc� afiou sua habilidade de entrar magicamente e seduzir outras pessoas e monstros. Alguns encantadores s�o pacifistas que fascinam os violentos para que larguem suas armas e enfeiti�am os cru�is para mostrar miseric�rdia. Outros s�o tiranos que dominam magicamente os involunt�rios, obrigando-os a servi-lo. A maioria dos encantadores est� em algum lugar entre esses extremos.\n";
	}
}
