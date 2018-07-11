package modelos.equipamentos;

public class Arma extends Equipamento {
	private String dano;
	private String propriedade;
	
	public String getDano() {
		return dano;
	}
	public void setDano(String dano) {
		this.dano = dano;
	}
	public String getPropriedade() {
		return propriedade;
	}
	public void setPropriedade(String propriedade) {
		this.propriedade = propriedade;
	}
}
