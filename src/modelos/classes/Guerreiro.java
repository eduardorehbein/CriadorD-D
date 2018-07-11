package modelos.classes;

import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Guerreiro extends Classe {
	private Caminho<Guerreiro> caminho;
	
	@Override
	public String toString() {
		return "Guerreiro";
	}

	@Override
	protected void setTabela() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setEquipamentoInicial(Personagem personagem) {
		// TODO Auto-generated method stub		
	}

	@Override
	protected void setPvInicial(Personagem personagem) {
		personagem.setPv(10 + personagem.getModificadorConstituicao());
		if(personagem.getNivel() > 1) {
			for(int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}	
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD10() + personagem.getModificadorConstituicao());	
	}

	@Override
	protected void setHabilidades() {
		super.habilidadesAdd(new Habilidade("Estilo de luta", "\tVocê adota um estilo de combate particular que será sua especialidade. Escolha uma das opções a seguir. Você não pode escolher o mesmo Estilo de Combate mais de uma vez, mesmo se puder escolher de novo.\n" +
				"\tArquearia: Você ganha +2 de bônus nas jogadas de ataque realizadas com uma arma de ataque à distância.\n" +
				"\tCombate com Armas Grandes: Quando você rolar um 1 ou um 2 num dado de dano de um ataque com arma corpo-a-corpo que você esteja empunhando com duas mãos, você pode rolar o dado novamente e usar a nova rolagem, mesmo que resulte em 1 ou 2. A arma deve ter a propriedade duas mãos ou versátil para ganhar esse benefício.\n" +
				"\tCombate com Duas Armas: Quando você estiver engajado em uma luta com duas armas, você pode adicionar o seu modificador de habilidade de dano na jogada de dano de seu segundo ataque.\n" +
				"\tDefesa: Enquanto estiver usando armadura, você ganha +1 de bônus em sua CA.\n" +
				"\tDuelismo: Quando você empunhar uma arma de ataque corpo-a-corpo em uma mão e nenhuma outra arma, você ganha +2 de bônus nas jogadas de dano com essa arma.\n" +
				"\tProteção: Quando uma criatura que você possa ver atacar um alvo que esteja a até 1,5 metro de você, você pode usar sua reação para impor desvantagem nas jogadas de ataque da criatura. Você deve estar empunhando um escudo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Retomar o fôlego", "\tVocê possui uma reserva de estamina e pode usá-la para proteger a si mesmo contra danos. No seu turno, você pode usar uma ação bônus para recuperar pontos de vida igual a 1d10 + seu nível de guerreiro.\n" +
				"\tUma vez que você use essa característica, você precisa terminar um descanso curto ou longo para usá-la de novo.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Surto de ação", "\tA partir do 2º nível, você pode forçar o seu limite para além do normal por um momento. Durante o seu turno, você pode realizar uma ação adicional juntamente com sua ação e possível ação bônus.\n" +
				"\tUma vez que você use essa característica, você precisa terminar um descanso curto ou longo para usá-la de novo. A partir do 17º nível, você pode usá-la duas vezes antes do descanso, porém somente uma vez por turno.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Arquétipo marcial", "\tNo 3º nível, você escolhe um arquétipo o qual se esforçará para seguir as técnicas e estilos de combate dele. Escolha Campeão, Cavaleiro Arcano ou Mestre de Batalha, todos detalhados no final da descrição da classe. O arquétipo confere a você características especiais no 3º nível e de novo nos 7º, 10º, 15º e 18º nível.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 6°, 8°, 12°, 14°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5º nível, você pode atacar duas vezes, ao invés de uma, quando usar a ação Atacar durante o seu turno.\n" +
				"\tO número de ataques aumenta para três quando você alcançar o 11º nível de guerreiro e para 4 quando alcançar o 20º nível de guerreiro.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Indomável", "\tA partir do 9º nível, você pode jogar de novo um teste de resistência que falhou. Se o fizer, você deve usar o novo valor e não pode usar essa característica de novo antes de terminar um descanso longo.\n" +
				"\tVocê pode usar esta característica duas vezes entre descansos longos quando chegar no 13º nível e três vezes entre descansos longos quando chegar no 17º nível.\n\n", 9));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());	
	}

	public Caminho<Guerreiro> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Guerreiro> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
