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
		return "Dom�nio da Natureza";
	}
	
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Ac�lito da natureza", "\tNo 1� n�vel, voc� aprende um truque de druida, � sua escolha. Voc� tamb�m ganha profici�ncia em uma das seguintes per�cias, � sua escolha: Adestrar Animais, Natureza ou Sobreviv�ncia.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Profici�ncia adicional", "\tTamb�m a partir do 1� n�vel, voc� adquire profici�ncia com armaduras pesadas.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: enfeiti�ar animais e plantas", "\tA partir do 2� n�vel, voc� pode usar seu Canalizar Divindade para enfeiti�ar animais e plantas.\n" +
				"\tCom uma a��o, voc� ergue seu s�mbolo sagrado e invoca o nome do seu deus. Cada besta ou criatura-planta que puder ver voc� num raio de 9 metros, deve realizar um teste de resist�ncia de Sabedoria. Se a criatura falhar, ela estar� enfeiti�ada por voc� durante 1 minuto ou at� sofrer dano. Enquanto estiver enfeiti�ada por voc�, ela ser� amistosa a voc� a as criaturas que voc� designar.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Amortecer elementos", "\tNo 6� n�vel, quando voc� ou uma criatura a at� 9 metros de voc� sofrer dano de �cido, frio, fogo, el�trico ou trov�o, voc� pode usar sua rea��o para conceder resist�ncia a criatura contra aquele tipo de dano.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Golpe divino", "\tNo 8� n�vel, voc� ganha a habilidade de imbuir seus ataques com poder divino. Uma vez em cada um de seus turnos, quando voc� acertar uma criatura com um ataque com arma, voc� causa 1d8 de dano radiante adicional ao alvo. Quando alcan�ar o 14� n�vel, o dano extra aumenta para 2d8.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Senhor da natureza", "\tA partir do 17� n�vel, voc� ganha a habilidade de comandar animais e criaturas-planta. Enquanto a criatura estiver enfeiti�ada pela sua caracter�stica Enfeiti�ar Animais e Plantas, voc� pode usar uma a��o b�nus no seu turno para dizer verbalmente o que cada uma dessas criaturas devem fazer no pr�ximo turno delas.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tOs deuses da natureza s�o t�o variados como a pr�pria natureza do mundo, desde deuses inescrut�veis de profundas florestas (como Silvanus, Obad-Hai, Chislev, Balinor e P�) at� divindades amig�veis associadas a alguma fonte ou bosque em particular (como Eldath). Druidas reverenciam a natureza como um todo e podem vir a servir essas divindades, praticando ritos misteriosos e recitando ora��es a muito esquecidas em sua pr�pria l�ngua secreta. Por�m, muitos desses deuses tamb�m possuem cl�rigos, campe�es que tem um papel mais ativo em promover os interesses particulares de um deus da natureza. Esses cl�rigos devem ca�ar monstruosidades malignas que usurpam dos bosques, aben�oar a colheita dos fieis ou murchar a cultura dos que irritarem seus deuses.\n";
	}
}
