package modelos;

public class Habilidade {
	private String nome;
	private String descricao;
	private int nivel;

	public Habilidade(String nome, String descricao, int nivel) {
		this.nome = nome;
		this.descricao = descricao;
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return nome + ": \n" + descricao;
	}
	
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getNivel() {
		return nivel;
	}
}
