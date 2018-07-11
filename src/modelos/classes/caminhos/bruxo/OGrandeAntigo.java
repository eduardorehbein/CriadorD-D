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
		classe.habilidadesAdd(new Habilidade("Lista de magia expandida", "\tAs magias referentes ao seu pacto são adicionadas automaticamente na sua lista de magias.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Despertar a mente", "\tA partir do 1° nível, seu conhecimento alienígena concede a você a habilidade de tocar a mente de outras criaturas. Você pode se comunicar telepaticamente com qualquer criatura que você possa ver a até 18 metros de você. Você não precisa partilhar um idioma com a criatura para compreender suas expressões telepáticas, mas a criatura deve ser capaz de compreender pelo menos um idioma.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Proteção entrópica", "\tA partir do 6° nível, você aprende a se proteger magicamente contra ataques e a transformar os ataques mal sucedidos de seus inimigos em boa sorte pra você. Quando uma criatura realizar uma jogada de ataque contra você, você pode usar sua reação para impor desvantagem nesse jogada. Se o ataque errar você, sua próxima jogada de ataque contra essa criatura recebe vantagem se você o fizer antes do final do seu próximo turno.\n" +
				"\tApós usar essa características, você não poderá utilizá-la novamente até terminar um descanso curto ou longo.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Escudo de pensamentos", "\tA partir do 10° nível, seus pensamentos não podem ser lidos através de telepatia ou outros meios, a não ser que você permita. Você também adquire resistência a dano psíquico e, toda vez que uma criatura causar dano psíquico a você, essa criatura sofre a mesma quantidade de dano que você sofreu.\n\n", 10));
		classe.habilidadesAdd(new Habilidade("Criar lacaio", "\tNo 14° nível, você adquire a habilidade de infectar a mente de um humanoide com a magia alienígena do seu patrono. Você pode usar sua ação para tocar um humanoide incapacitado. Essa criatura então, ficará enfeitiçada por você até que a magia remover maldição seja conjurada sobre ela, a condição enfeitiçado seja removida dela ou você use essa característica novamente.\n" +
				"\tVocê pode se comunicar telepaticamente com a criatura enfeitiçada contanto que ambos estejam no mesmo plano de existência.\n\n", 14));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tSeu patrono é uma entidade misteriosa cuja natureza é profundamente alheia ao tecido da realidade. Ela deve ter vindo do Reino Distante, o espaço além da realidade, ou ela pode ser um dos deuses anciãos conhecido apenas nas lendas. Seus motivos são incompreensíveis para os mortais e seu conhecimento é tão imenso e antigo que, até mesmo, as mais grandiosas bibliotecas desbotam em comparação com os vastos segredos que ele detém. O Grande Antigo pode desconhecer a sua existência ou ser totalmente indiferente a você, mas os segredos que você desvendou permitem que você obtenha suas magias dele.\n" +
				"\tEntidades desse tipo incluem Ghaunadar, conhecido como Aquele que Espreita; Tharizdun, o Deus Acorrentado; Dendar, a Serpente da Noite; Zargon, o Retornado; Grande Cthulhu; entre outros seres insondáveis.\n";
	}
}