package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Gnomo extends Raca {
	@Override
	public String toString() {
		return "Gnomo";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setInteligencia(personagem.getInteligencia() + 2);
		personagem.atualizaModificadores();	
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(7.5);	
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Visão no escuro", "\tAcostumado à vida subterrânea, você tem uma visão superior no escuro e na penumbra. Você enxerga na penumbra a até 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Você não pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Esperteza gnômica", "\tVocê possui vantagem em todos os testes de resistência de Inteligência, Sabedoria e Carisma contra magia.\n"));
	}
}
