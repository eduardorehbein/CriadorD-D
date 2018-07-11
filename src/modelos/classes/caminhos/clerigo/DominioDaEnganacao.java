package modelos.classes.caminhos.clerigo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Clerigo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class DominioDaEnganacao implements Caminho<Clerigo>, Magica {
	@Override
	public String toString() {
		return "Dom�nio da Engana��o";
	}

	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("B�n��o do trapaceiro", "\tA partir do momento em que voc� escolhe esse dom�nio, no 1� n�vel, voc� pode usar sua a��o para tocar uma criatura volunt�ria al�m de voc� mesmo para conceder vantagem em testes de Destreza (Furtividade). Essa b�n��o dura por 1 hora ou at� voc� usar essa caracter�stica novamente.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: invocar duplicidade", "\tA partir do 2� n�vel, voc� pode usar seu Canalizar Divindade para criar uma duplicada ilus�ria de si mesmo.\n" +
				"\tCom uma a��o, voc� cria uma ilus�o perfeita de si mesmo que dura por 1 minuto ou at� voc� perder sua concentra��o (como se voc� estivesse se concentrando em uma magia). A ilus�o aparece em um espa�o desocupado que voc� possa ver a at� 9 metros de voc�. Com uma a��o b�nus, no seu turno, voc� pode mover a ilus�o at� 9 metros para um espa�o que voc� possa ver, mas ela deve permanecer a at� 36 metros de voc�.\n" +
				"\tPela dura��o, voc� pode conjurar magias como se voc� estivesse no espa�o ocupado pela ilus�o, mas voc� deve usar seus pr�prios sentidos. Al�m disso, quando ambos voc� e sua ilus�o estiverem a 1,5 metro de uma criatura que possa ver a ilus�o, voc� tem vantagem nas jogadas de ataque contra essa criatura, devido a distra��o causada no alvo pela ilus�o.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: manto de sombras", "\tNo 6� n�vel, voc� pode usar seu Canalizar Divindade para desaparecer.\n" +
				"\tCom uma a��o, voc� se torna invis�vel at� o final do seu pr�ximo turno. Voc� se torna vis�vel se atacar ou conjurar uma magia.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8� n�vel, voc� ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando voc� acertar uma criatura com um ataque com arma, voc� causa 1d8 de dano radiante adicional ao alvo. Quando alcan�ar o 14� n�vel, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Duplicidade aprimorada", "\tA partir do 17� n�vel, voc� pode criar at� quatro duplicatas de voc�, ao inv�s de uma, quando usar Invocar Duplicidade. Com uma a��o b�nus, no seu turno, voc� pode mover quantas duplicadas quiser at� 9 metros, at� no m�ximo de 36 metros de dist�ncia.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tDeuses da engana��o � como Tymora, Beshaba, Olidammara, o Viajante, Garl Glittergold e Loki � s�o causadores de travessuras e instigadores que se mantem como um desafio constante para a aceita��o das ordens tanto de mortais quanto dos deuses. Eles s�o patronos dos ladr�es, trapaceiros, apostadores, rebeldes e libertadores. Seus cl�rigos s�o uma for�a intrometida no mundo, ferindo orgulhos, zombando de tiranos, roubando dos ricos, libertando cativos e desrespeitando tradi��es vazias. Eles preferem subterf�gio, trapa�as, engana��o e rouba no lugar do confronto direto.\n";
	}
}
