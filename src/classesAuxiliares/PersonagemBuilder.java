package classesAuxiliares;

import java.util.ArrayList;
import java.util.List;

import modelos.Personagem;

public class PersonagemBuilder {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String corDoCabelo;
	private String corDosOlhos;

	private int nivel;
	private String tendencia;
	private List<String> idiomas = new ArrayList<>();
	private String historia;

	private int forca;
	private int constituicao;
	private int destreza;
	private int inteligencia;
	private int sabedoria;
	private int carisma;

	public Personagem getInstance() {
		return new Personagem(nome, idade, altura, peso, corDoCabelo, corDosOlhos, nivel,
				tendencia, idiomas, historia, forca, constituicao, destreza, inteligencia,
				sabedoria, carisma);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}

	public void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setTendencia(String tendencia) {
		this.tendencia = tendencia;
	}
	
	public void idiomasAdd(String idioma) {
		this.idiomas.add(idioma);
	}
	
	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	
}
