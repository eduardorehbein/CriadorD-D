package modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import classesAuxiliares.MapaDePericias;
import modelos.classes.Classe;
import modelos.equipamentos.Equipamento;
import modelos.racas.Raca;

public class Personagem {
	// Atributos do personagem
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private double deslocamento;
	private String corDoCabelo;
	private String corDosOlhos;

	private int nivel;
	private int xp;
	private int ca;
	private int pv;
	private Classe classe;
	private Raca raca;
	private String tendencia;
	private String riqueza;
	private String historia;

	private List<String> idiomas = new ArrayList<>();
	private List<Magia> magias = new ArrayList<>();
	private List<Truque> truques = new ArrayList<>();
	private Map<String, Pericia> pericias;
	private List<Equipamento> equipamentos = new ArrayList<>();

	private int forca;
	private int constituicao;
	private int destreza;
	private int inteligencia;
	private int sabedoria;
	private int carisma;

	private int modificadorForca;
	private int modificadorConstituicao;
	private int modificadorDestreza;
	private int modificadorInteligencia;
	private int modificadorSabedoria;
	private int modificadorCarisma;

	// Construtor da classe
	public Personagem(String nome, int idade, double altura, double peso, String corDoCabelo, String corDosOlhos, int nivel,
			String tendencia, List<String> idiomas, String historia, int forca, int constituicao, int destreza, int inteligencia,
			int sabedoria, int carisma) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.corDoCabelo = corDoCabelo;
		this.corDosOlhos = corDosOlhos;
		this.nivel = nivel;
		this.tendencia = tendencia;
		this.pericias = MapaDePericias.getMapa();
		this.idiomas = idiomas;
		this.historia = historia;
		this.forca = forca;
		this.constituicao = constituicao;
		this.destreza = destreza;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.carisma = carisma;
		this.atualizaModificadores();
	}

	// Metodos
	public void equipamentosAdd(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
	}

	public void idiomasAdd(String idioma) {
		this.idiomas.add(idioma);
	}

	public void magiasAdd(Magia magia) {
		this.magias.add(magia);
	}

	public void truquesAdd(Truque truque) {
		this.truques.add(truque);
	}
	
	public void setValorDePericia(String nomeDaPericia, int valor) {
		this.pericias.get(nomeDaPericia).setValor(valor);
	}
	
	public void atualizaModificadores() {
		this.modificadorForca = Math.round((forca - 10) / 2);
		this.modificadorConstituicao = Math.round((constituicao - 10) / 2);
		this.modificadorDestreza = Math.round((destreza - 10) / 2);
		this.modificadorInteligencia = Math.round((inteligencia - 10) / 2);
		this.modificadorSabedoria = Math.round((sabedoria - 10) / 2);
		this.modificadorCarisma = Math.round((carisma - 10) / 2);
	}
	
	public void inicializaClasseERaca() {
		classe.inicializa(this);
		raca.inicializa(this);
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public double getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(double deslocamento) {
		this.deslocamento = deslocamento;
	}

	public String getCorDoCabelo() {
		return corDoCabelo;
	}

	public String getCorDosOlhos() {
		return corDosOlhos;
	}

	public int getNivel() {
		return nivel;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getCa() {
		return ca;
	}

	public void setCa(int ca) {
		this.ca = ca;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public String getTendencia() {
		return tendencia;
	}
	
	public String getRiqueza() {
		return riqueza;
	}

	public void setRiqueza(String riqueza) {
		this.riqueza = riqueza;
	}

	public List<String> getIdiomas() {
		return idiomas;
	}
	
	public String getHistoria() {
		return historia;
	}

	public List<Magia> getMagias() {
		return magias;
	}

	public List<Truque> getTruques() {
		return truques;
	}

	public Map<String, Pericia> getPericias() {
		return pericias;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public int getForca() {
		return forca;
	}
	
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int getConstituicao() {
		return constituicao;
	}
	
	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	public int getDestreza() {
		return destreza;
	}
	
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	
	public int getInteligencia() {
		return inteligencia;
	}
	
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}
	
	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}

	public int getCarisma() {
		return carisma;
	}
	
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	public int getModificadorForca() {
		return modificadorForca;
	}

	public int getModificadorConstituicao() {
		return modificadorConstituicao;
	}

	public int getModificadorDestreza() {
		return modificadorDestreza;
	}

	public int getModificadorInteligencia() {
		return modificadorInteligencia;
	}

	public int getModificadorSabedoria() {
		return modificadorSabedoria;
	}

	public int getModificadorCarisma() {
		return modificadorCarisma;
	}
}
