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
		return "Domínio da Enganação";
	}

	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Bênção do trapaceiro", "\tA partir do momento em que você escolhe esse domínio, no 1° nível, você pode usar sua ação para tocar uma criatura voluntária além de você mesmo para conceder vantagem em testes de Destreza (Furtividade). Essa bênção dura por 1 hora ou até você usar essa característica novamente.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: invocar duplicidade", "\tA partir do 2° nível, você pode usar seu Canalizar Divindade para criar uma duplicada ilusória de si mesmo.\n" +
				"\tCom uma ação, você cria uma ilusão perfeita de si mesmo que dura por 1 minuto ou até você perder sua concentração (como se você estivesse se concentrando em uma magia). A ilusão aparece em um espaço desocupado que você possa ver a até 9 metros de você. Com uma ação bônus, no seu turno, você pode mover a ilusão até 9 metros para um espaço que você possa ver, mas ela deve permanecer a até 36 metros de você.\n" +
				"\tPela duração, você pode conjurar magias como se você estivesse no espaço ocupado pela ilusão, mas você deve usar seus próprios sentidos. Além disso, quando ambos você e sua ilusão estiverem a 1,5 metro de uma criatura que possa ver a ilusão, você tem vantagem nas jogadas de ataque contra essa criatura, devido a distração causada no alvo pela ilusão.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: manto de sombras", "\tNo 6° nível, você pode usar seu Canalizar Divindade para desaparecer.\n" +
				"\tCom uma ação, você se torna invisível até o final do seu próximo turno. Você se torna visível se atacar ou conjurar uma magia.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8º nível, você ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando você acertar uma criatura com um ataque com arma, você causa 1d8 de dano radiante adicional ao alvo. Quando alcançar o 14º nível, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Duplicidade aprimorada", "\tA partir do 17° nível, você pode criar até quatro duplicatas de você, ao invés de uma, quando usar Invocar Duplicidade. Com uma ação bônus, no seu turno, você pode mover quantas duplicadas quiser até 9 metros, até no máximo de 36 metros de distância.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tDeuses da enganação – como Tymora, Beshaba, Olidammara, o Viajante, Garl Glittergold e Loki – são causadores de travessuras e instigadores que se mantem como um desafio constante para a aceitação das ordens tanto de mortais quanto dos deuses. Eles são patronos dos ladrões, trapaceiros, apostadores, rebeldes e libertadores. Seus clérigos são uma força intrometida no mundo, ferindo orgulhos, zombando de tiranos, roubando dos ricos, libertando cativos e desrespeitando tradições vazias. Eles preferem subterfúgio, trapaças, enganação e rouba no lugar do confronto direto.\n";
	}
}
