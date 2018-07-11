package modelos;

public class Pericia {
	private String nome;
	private String descricao;
	private int valor;

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Pericia(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getValor() {
		return valor;
	}
	
}
