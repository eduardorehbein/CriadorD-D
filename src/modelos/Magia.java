package modelos;

public class Magia {
	private int nivel;
	private String tipo;
	private String nome;
	private String tempoDeConjuracao;
	private String alcance;
	private String componentes;
	private String duracao;
	private String descricao;
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.nome + "\n")
		.append(this.nivel + "º Nível de " + this.tipo + "\n")
		.append("Tempo de conjuração: " + this.tempoDeConjuracao + "\n")
		.append("Alcance: " + this.alcance + "\n")
		.append("Componentes: " + this.componentes + "\n")
		.append("Duração: " + this.duracao + "\n")
		.append("Descrição:\n" + this.descricao);
		return stringBuilder.toString();
	}
	
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTempoDeConjuracao() {
		return tempoDeConjuracao;
	}
	public void setTempoDeConjuracao(String tempoDeConjuracao) {
		this.tempoDeConjuracao = tempoDeConjuracao;
	}
	public String getAlcance() {
		return alcance;
	}
	public void setAlcance(String alcance) {
		this.alcance = alcance;
	}
	public String getComponentes() {
		return componentes;
	}
	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
