package modelos.classes;

import java.util.ArrayList;
import java.util.List;

import modelos.Habilidade;
import modelos.Personagem;

public abstract class Classe {
	protected List<Habilidade> habilidades = new ArrayList<>();
	protected int tabela;
	
	
	public void inicializa(Personagem personagem) {
		setTabela();
		setEquipamentoInicial(personagem);
		setPvInicial(personagem);
		setHabilidades();
		setRiquezaInicial(personagem);
	}
	
	abstract void setTabela();
	abstract void setEquipamentoInicial(Personagem personagem);
	abstract void setPvInicial(Personagem personagem);
	abstract void adicionaPvPorNivel(Personagem personagem);
	abstract void setHabilidades();
	abstract void setRiquezaInicial(Personagem personagem);
	abstract String getCaminhoDescricao();
	
	public List<Habilidade> getHabilidades() {
		return habilidades;
	}
	
	public void habilidadesAdd(Habilidade habilidade) {
		habilidades.add(habilidade);
	}
}
