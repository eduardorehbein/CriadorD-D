package tipos;

import modelos.classes.Classe;
import modelos.classes.caminhos.Caminho;
import modelos.classes.caminhos.barbaro.*;
import modelos.classes.caminhos.bardo.*;
import modelos.classes.caminhos.bruxo.*;
import modelos.classes.caminhos.clerigo.*;
import modelos.classes.caminhos.druida.*;
import modelos.classes.caminhos.feiticeiro.*;
import modelos.classes.caminhos.guerreiro.*;
import modelos.classes.caminhos.ladino.*;
import modelos.classes.caminhos.mago.*;
import modelos.classes.caminhos.monge.*;
import modelos.classes.caminhos.paladino.*;
import modelos.classes.caminhos.patrulheiro.*;

public enum TipoCaminho {
	//Tipos
	
	CAMINHO_DO_FURIOSO("Caminho do Furioso") {
		@Override
		public CaminhoDoFurioso getInstance() {
			return new CaminhoDoFurioso();
		}
	},
	CAMINHO_DO_GUERREIRO_TOTEMICO("Caminho do Guerreiro Tot�mico") {
		@Override
		public CaminhoDoGuerreiroTotemico getInstance() {
			return new CaminhoDoGuerreiroTotemico();
		}
	},
	COLEGIO_DA_BRAVURA("Col�gio da Bravura") {
		@Override
		public ColegioDaBravura getInstance() {
			return new ColegioDaBravura();
		}
	},
	COLEGIO_DO_CONHECIMENTO("Col�gio do Conhecimento") {
		@Override
		public ColegioDoConhecimento getInstance() {
			return new ColegioDoConhecimento();
		}
	},
	ARQUIFADA("Arquifada") {
		@Override
		public Arquifada getInstance() {
			return new Arquifada();
		}
	},
	O_CORRUPTOR("O Corruptor") {
		@Override
		public OCorruptor getInstance() {
			return new OCorruptor();
		}
	},
	O_GRANDE_ANTIGO("O Grande Antigo") {
		@Override
		public OGrandeAntigo getInstance() {
			return new OGrandeAntigo();
		}
	},
	DOMINIO_DA_ENGANACAO("Dom�nio da Engana��o") {
		@Override
		public DominioDaEnganacao getInstance() {
			return new DominioDaEnganacao();
		}
	},
	DOMINIO_DA_GUERRA("Dom�nio da Guerra") {
		@Override
		public DominioDaGuerra getInstance() {
			return new DominioDaGuerra();
		}
	},
	DOMINIO_DA_LUZ("Dom�nio da Luz") {
		@Override
		public DominioDaLuz getInstance() {
			return new DominioDaLuz();
		}
	},
	DOMINIO_DA_NATUREZA("Dom�nio da Natureza") {
		@Override
		public DominioDaNatureza getInstance() {
			return new DominioDaNatureza();
		}
	},
	DOMINIO_DA_TEMPESTADE("Dom�nio da Tempestade") {
		@Override
		public DominioDaTempestade getInstance() {
			return new DominioDaTempestade();
		}
	},
	DOMINIO_DA_VIDA("Dom�nio da Vida") {
		@Override
		public DominioDaVida getInstance() {
			return new DominioDaVida();
		}
	},
	DOMINIO_DO_CONHECIMENTO("Dom�nio do Conhecimento") {
		@Override
		public DominioDoConhecimento getInstance() {
			return new DominioDoConhecimento();
		}
	},
	CIRCULO_DA_LUA("C�rculo da Lua") {
		@Override
		public CirculoDaLua getInstance() {
			return new CirculoDaLua();
		}
	},
	CIRCULO_DA_TERRA("C�rculo da Terra") {
		@Override
		public CirculoDaTerra getInstance() {
			return new CirculoDaTerra();
		}
	},
	LINHAGEM_DRACONICA("Linhagem Drac�nica") {
		@Override
		public LinhagemDraconica getInstance() {
			return new LinhagemDraconica();
		}
	},
	MAGIA_SELVAGEM("Magia Selvagem") {
		@Override
		public MagiaSelvagem getInstance() {
			return new MagiaSelvagem();
		}
	},
	CAMPEAO("Campe�o") {
		@Override
		public Campeao getInstance() {
			return new Campeao();
		}
	},
	CAVALEIRO_ARCANO("Cavaleiro Arcano") {
		@Override
		public CavaleiroArcano getInstance() {
			return new CavaleiroArcano();
		}
	},
	MESTRE_DE_BATALHA("Mestre de Batalha") {
		@Override
		public MestreDeBatalha getInstance() {
			return new MestreDeBatalha();
		}
	},
	ASSASSINO("Assassino") {
		@Override
		public Assassino getInstance() {
			return new Assassino();
		}
	},
	LADRAO("Ladr�o") {
		@Override
		public Ladrao getInstance() {
			return new Ladrao();
		}
	},
	TRAPACEIRO_ARCANO("Trapaceiro Arcano") {
		@Override
		public TrapaceiroArcano getInstance() {
			return new TrapaceiroArcano();
		}
	},
	ESCOLA_DE_ABJURACAO("Escola de Abjura��o") {
		@Override
		public EscolaDeAbjuracao getInstance() {
			return new EscolaDeAbjuracao();
		}
	},
	ESCOLA_DE_ADIVINHACAO("Escola de Adivinha��o") {
		@Override
		public EscolaDeAdivinhacao getInstance() {
			return new EscolaDeAdivinhacao();
		}
	},
	ESCOLA_DE_CONJURACAO("Escola de Conjura��o") {
		@Override
		public EscolaDeConjuracao getInstance() {
			return new EscolaDeConjuracao();
		}
	},
	ESCOLA_DE_ENCANTAMENTO("Escola de Encantamento") {
		@Override
		public EscolaDeEncantamento getInstance() {
			return new EscolaDeEncantamento();
		}
	},
	ESCOLA_DE_EVOCACAO("Escola de Evocacao") {
		@Override
		public EscolaDeEvocacao getInstance() {
			return new EscolaDeEvocacao();
		}
	},
	ESCOLA_DE_ILUSAO("Escola de Ilusao") {
		@Override
		public EscolaDeIlusao getInstance() {
			return new EscolaDeIlusao();
		}
	},
	ESCOLA_DE_NECROMANCIA("Escola de Necromancia") {
		@Override
		public EscolaDeNecromancia getInstance() {
			return new EscolaDeNecromancia();
		}
	},
	ESCOLA_DE_TRANSMUTACAO("Escola de Transmutacao") {
		@Override
		public EscolaDeTransmutacao getInstance() {
			return new EscolaDeTransmutacao();
		}
	},
	CAMINHO_DA_MAO_ABERTA("Caminho da M�o Aberta") {
		@Override
		public CaminhoDaMaoAberta getInstance() {
			return new CaminhoDaMaoAberta();
		}
	},
	CAMINHO_DA_SOMBRA("Caminho da Sombra") {
		@Override
		public CaminhoDaSombra getInstance() {
			return new CaminhoDaSombra();
		}
	},
	CAMINHO_DOS_QUATRO_ELEMENTOS("Caminho dos Quatro Elementos") {
		@Override
		public CaminhoDosQuatroElementos getInstance() {
			return new CaminhoDosQuatroElementos();
		}
	},
	JURAMENTO_DE_DEVOCAO("Juramento de Devo��o") {
		@Override
		public JuramentoDeDevocao getInstance() {
			return new JuramentoDeDevocao();
		}
	},
	JURAMENTO_DE_VINGANCA("Juramento de Vingan�a") {
		@Override
		public JuramentoDeVinganca getInstance() {
			return new JuramentoDeVinganca();
		}
	},
	JURAMENTO_DOS_ANCIOES("Juramento dos Anci�es") {
		@Override
		public JuramentoDosAncioes getInstance() {
			return new JuramentoDosAncioes();
		}
	},
	CACADOR("Ca�ador") {
		@Override
		public Cacador getInstance() {
			return new Cacador();
		}
	},
	MESTRE_DAS_BESTAS("Mestre das Bestas") {
		@Override
		public MestreDasBestas getInstance() {
			return new MestreDasBestas();
		}
	};
	
	//M�todos e atributos dos tipos
	
 	private String nome;

	TipoCaminho(String string) {
		nome = string;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	public abstract Caminho<? extends Classe> getInstance();
}
