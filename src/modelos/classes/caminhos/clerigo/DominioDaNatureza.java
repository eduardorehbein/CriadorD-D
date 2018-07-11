package modelos.classes.caminhos.clerigo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Clerigo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class DominioDaNatureza implements Caminho<Clerigo>, Magica {
	@Override
	public String toString() {
		return "Domínio da Natureza";
	}
	
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Acólito da natureza", "\tNo 1° nível, você aprende um truque de druida, à sua escolha. Você também ganha proficiência em uma das seguintes perícias, à sua escolha: Adestrar Animais, Natureza ou Sobrevivência.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Proficiência adicional", "\tTambém a partir do 1° nível, você adquire proficiência com armaduras pesadas.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: enfeitiçar animais e plantas", "\tA partir do 2° nível, você pode usar seu Canalizar Divindade para enfeitiçar animais e plantas.\n" +
				"\tCom uma ação, você ergue seu símbolo sagrado e invoca o nome do seu deus. Cada besta ou criatura-planta que puder ver você num raio de 9 metros, deve realizar um teste de resistência de Sabedoria. Se a criatura falhar, ela estará enfeitiçada por você durante 1 minuto ou até sofrer dano. Enquanto estiver enfeitiçada por você, ela será amistosa a você a as criaturas que você designar.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Amortecer elementos", "\tNo 6° nível, quando você ou uma criatura a até 9 metros de você sofrer dano de ácido, frio, fogo, elétrico ou trovão, você pode usar sua reação para conceder resistência a criatura contra aquele tipo de dano.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8º nível, você ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando você acertar uma criatura com um ataque com arma, você causa 1d8 de dano radiante adicional ao alvo. Quando alcançar o 14º nível, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Senhor da natureza", "\tA partir do 17° nível, você ganha a habilidade de comandar animais e criaturas-planta. Enquanto a criatura estiver enfeitiçada pela sua característica Enfeitiçar Animais e Plantas, você pode usar uma ação bônus no seu turno para dizer verbalmente o que cada uma dessas criaturas devem fazer no próximo turno delas.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tOs deuses da natureza são tão variados como a própria natureza do mundo, desde deuses inescrutáveis de profundas florestas (como Silvanus, Obad-Hai, Chislev, Balinor e Pã) até divindades amigáveis associadas a alguma fonte ou bosque em particular (como Eldath). Druidas reverenciam a natureza como um todo e podem vir a servir essas divindades, praticando ritos misteriosos e recitando orações a muito esquecidas em sua própria língua secreta. Porém, muitos desses deuses também possuem clérigos, campeões que tem um papel mais ativo em promover os interesses particulares de um deus da natureza. Esses clérigos devem caçar monstruosidades malignas que usurpam dos bosques, abençoar a colheita dos fieis ou murchar a cultura dos que irritarem seus deuses.\n";
	}
}
