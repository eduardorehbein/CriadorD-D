package modelos.racas;

import java.util.ArrayList;
import java.util.List;

import modelos.Beneficio;
import modelos.Personagem;

public abstract class Raca {
	protected List<Beneficio> beneficios = new ArrayList<>();

	public void inicializa(Personagem personagem) {
		aumentoNoValorDeHabilidade(personagem);
		setaDeslocamento(personagem);
		setBeneficios();
	}
	
	public abstract void aumentoNoValorDeHabilidade(Personagem personagem);
	public abstract void setaDeslocamento(Personagem personagem);
	public abstract void setBeneficios();
	
	protected void beneficiosAdd(Beneficio beneficio) {
		beneficios.add(beneficio);
	}
	
	public List<Beneficio> getBeneficios() {
		return beneficios;
	}
}
