package modelos;

public class Beneficio {
	private String nome;
	private String descricao;
	
	public Beneficio(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
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
}
