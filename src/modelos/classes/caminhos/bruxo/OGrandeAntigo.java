package modelos.classes.caminhos.bruxo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Bruxo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class OGrandeAntigo implements Caminho<Bruxo>, Magica {
	@Override
	public String toString() {
		return "O Grande Antigo";
	}

	@Override
	public void setHabilidades(Bruxo classe) {
		classe.habilidadesAdd(new Habilidade("Lista de magia expandida", "\tAs magias referentes ao seu pacto s�o adicionadas automaticamente na sua lista de magias.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Despertar a mente", "\tA partir do 1� n�vel, seu conhecimento alien�gena concede a voc� a habilidade de tocar a mente de outras criaturas. Voc� pode se comunicar telepaticamente com qualquer criatura que voc� possa ver a at� 18 metros de voc�. Voc� n�o precisa partilhar um idioma com a criatura para compreender suas express�es telep�ticas, mas a criatura deve ser capaz de compreender pelo menos um idioma.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Prote��o entr�pica", "\tA partir do 6� n�vel, voc� aprende a se proteger magicamente contra ataques e a transformar os ataques mal sucedidos de seus inimigos em boa sorte pra voc�. Quando uma criatura realizar uma jogada de ataque contra voc�, voc� pode usar sua rea��o para impor desvantagem nesse jogada. Se o ataque errar voc�, sua pr�xima jogada de ataque contra essa criatura recebe vantagem se voc� o fizer antes do final do seu pr�ximo turno.\n" +
				"\tAp�s usar essa caracter�sticas, voc� n�o poder� utiliz�-la novamente at� terminar um descanso curto ou longo.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Escudo de pensamentos", "\tA partir do 10� n�vel, seus pensamentos n�o podem ser lidos atrav�s de telepatia ou outros meios, a n�o ser que voc� permita. Voc� tamb�m adquire resist�ncia a dano ps�quico e, toda vez que uma criatura causar dano ps�quico a voc�, essa criatura sofre a mesma quantidade de dano que voc� sofreu.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Criar lacaio", "\tNo 14� n�vel, voc� adquire a habilidade de infectar a mente de um humanoide com a magia alien�gena do seu patrono. Voc� pode usar sua a��o para tocar um humanoide incapacitado. Essa criatura ent�o, ficar� enfeiti�ada por voc� at� que a magia remover maldi��o seja conjurada sobre ela, a condi��o enfeiti�ado seja removida dela ou voc� use essa caracter�stica novamente.\n" +
				"\tVoc� pode se comunicar telepaticamente com a criatura enfeiti�ada contanto que ambos estejam no mesmo plano de exist�ncia.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tSeu patrono � uma entidade misteriosa cuja natureza � profundamente alheia ao tecido da realidade. Ela deve ter vindo do Reino Distante, o espa�o al�m da realidade, ou ela pode ser um dos deuses anci�os conhecido apenas nas lendas. Seus motivos s�o incompreens�veis para os mortais e seu conhecimento � t�o imenso e antigo que, at� mesmo, as mais grandiosas bibliotecas desbotam em compara��o com os vastos segredos que ele det�m. O Grande Antigo pode desconhecer a sua exist�ncia ou ser totalmente indiferente a voc�, mas os segredos que voc� desvendou permitem que voc� obtenha suas magias dele.\n" +
				"\tEntidades desse tipo incluem Ghaunadar, conhecido como Aquele que Espreita; Tharizdun, o Deus Acorrentado; Dendar, a Serpente da Noite; Zargon, o Retornado; Grande Cthulhu; entre outros seres insond�veis.\n";
	}
}