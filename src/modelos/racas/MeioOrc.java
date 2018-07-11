package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class MeioOrc extends Raca {
	@Override
	public String toString() {
		return "Meio-Orc";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setForca(personagem.getForca() + 2);
		personagem.atualizaModificadores();	
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(9);	
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Visão no escuro", "\tGraças ao seu sangue orc, você tem uma visão superior no escuro e na penumbra. Você enxerga na penumbra a até 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Você não pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Ameaçador", "\tVocê adquire proficiência na perícia Intimidação.\n"));
		super.beneficiosAdd(new Beneficio("Resistência implacável", "\tQuando você é reduzido a 0 pontos de vida mas não é completamente morto, você pode voltar para 1 ponto de vida. Você não pode usar essa característica novamente até completar um descanso longo.\n"));
		super.beneficiosAdd(new Beneficio("Ataques selvagens", "\tQuando você atinge um ataque crítico com uma arma corpo-a-corpo, você pode rolar um dos dados de dano da arma mais uma vez e adicioná-lo ao dano extra causado pelo acerto crítico.\n"));
	}
}
