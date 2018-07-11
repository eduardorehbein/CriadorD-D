package modelos.equipamentos;

public class Armadura extends Equipamento {
	private int ca;
	private int forcaNecessaria;
	private String furtividade;
	
	public int getCa() {
		return ca;
	}
	public void setCa(int ca) {
		this.ca = ca;
	}
	public int getForcaNecessaria() {
		return forcaNecessaria;
	}
	public void setForcaNecessaria(int forcaNecessaria) {
		this.forcaNecessaria = forcaNecessaria;
	}
	public String getFurtividade() {
		return furtividade;
	}
	public void setFurtividade(String furtividade) {
		this.furtividade = furtividade;
	}
}
