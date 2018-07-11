package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Anao extends Raca {
	@Override
	public String toString() {
		return "Anão";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setConstituicao(personagem.getConstituicao() + 2);
		personagem.atualizaModificadores();
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(7.5);
	}
	
	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Visão no escuro", "\tAcostumado à vida subterrânea, você tem uma visão superior no escuro e na penumbra. Você enxerga na penumbra a até 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Você não pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Resiliência anã", "\tVocê possui vantagem em testes de resistência contra venenos e resistência contra dano de veneno.\n"));
		super.beneficiosAdd(new Beneficio("Especialização em rochas", "\tSempre que você realizar um teste de Inteligência (História) relacionado à origem de um trabalho em pedra, você é considerado proficiente na perícia História e adiciona o dobro do seu bônus de proficiência ao teste, ao invés do seu bônus de proficiência normal.\n"));
		super.beneficiosAdd(new Beneficio("Proficiência com ferramentas", "\tVocê tem proficiência em uma ferramenta de artesão à sua escolha entre: ferramentas de ferreiro, suprimentos de cervejeiro ou ferramentas de pedreiro.\n"));
		super.beneficiosAdd(new Beneficio("Treinamento anão em combate", "\tVocê tem proficiência com machados de batalha, machadinhas, martelos leves e martelos de guerra.\n"));
	}
}