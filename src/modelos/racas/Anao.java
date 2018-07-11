package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Anao extends Raca {
	@Override
	public String toString() {
		return "An�o";
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
		super.beneficiosAdd(new Beneficio("Vis�o no escuro", "\tAcostumado � vida subterr�nea, voc� tem uma vis�o superior no escuro e na penumbra. Voc� enxerga na penumbra a at� 18 metros como se fosse luz plena, e no escuro como se fosse na penumbra. Voc� n�o pode discernir cores no escuro, apenas tons de cinza.\n"));
		super.beneficiosAdd(new Beneficio("Resili�ncia an�", "\tVoc� possui vantagem em testes de resist�ncia contra venenos e resist�ncia contra dano de veneno.\n"));
		super.beneficiosAdd(new Beneficio("Especializa��o em rochas", "\tSempre que voc� realizar um teste de Intelig�ncia (Hist�ria) relacionado � origem de um trabalho em pedra, voc� � considerado proficiente na per�cia Hist�ria e adiciona o dobro do seu b�nus de profici�ncia ao teste, ao inv�s do seu b�nus de profici�ncia normal.\n"));
		super.beneficiosAdd(new Beneficio("Profici�ncia com ferramentas", "\tVoc� tem profici�ncia em uma ferramenta de artes�o � sua escolha entre: ferramentas de ferreiro, suprimentos de cervejeiro ou ferramentas de pedreiro.\n"));
		super.beneficiosAdd(new Beneficio("Treinamento an�o em combate", "\tVoc� tem profici�ncia com machados de batalha, machadinhas, martelos leves e martelos de guerra.\n"));
	}
}