package modelos.racas;

import modelos.Beneficio;
import modelos.Personagem;

public class Halfing extends Raca {
	@Override
	public String toString() {
		return "Halfing";
	}
	
	@Override
	public void aumentoNoValorDeHabilidade(Personagem personagem) {
		personagem.setDestreza(personagem.getDestreza() + 2);
		personagem.atualizaModificadores();	
	}

	@Override
	public void setaDeslocamento(Personagem personagem) {
		personagem.setDeslocamento(7.5);	
	}

	@Override
	public void setBeneficios() {
		super.beneficiosAdd(new Beneficio("Sortudo", "\tQuando você obtiver um 1 natural em uma jogada de ataque, teste de habilidade ou teste de resistência, você pode jogar de novo o dado e deve utilizar o novo resultado.\n"));
		super.beneficiosAdd(new Beneficio("Bravura", "\tVocê tem vantagem em testes de resistência contra ficar amedrontado.\n"));
		super.beneficiosAdd(new Beneficio("Agilidade Halfling", "\tVocê pode mover-se através do espaço de qualquer criatura que for de um tamanho maior que o seu.\n"));
	}
}
