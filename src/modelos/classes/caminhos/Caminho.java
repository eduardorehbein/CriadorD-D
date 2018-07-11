package modelos.classes.caminhos;

import modelos.classes.Classe;

public interface Caminho<Classe> {
	void setHabilidades(Classe classe);
	String getDescricao();
}
