package tipos;

import modelos.classes.Barbaro;
import modelos.classes.Bardo;
import modelos.classes.Bruxo;
import modelos.classes.Classe;
import modelos.classes.Clerigo;
import modelos.classes.Druida;
import modelos.classes.Feiticeiro;
import modelos.classes.Guerreiro;
import modelos.classes.Ladino;
import modelos.classes.Mago;
import modelos.classes.Monge;
import modelos.classes.Paladino;
import modelos.classes.Patrulheiro;

public enum TipoClasse {
	//Tipos
	
	BARBARO("Bárbaro") {
		@Override
		public Classe getInstance() {
			return new Barbaro();
		}
	},
	BARDO("Bardo") {
		@Override
		public Classe getInstance() {
			return new Bardo();
		}
	},
	BRUXO("Bruxo") {
		@Override
		public Classe getInstance() {
			return new Bruxo();
		}
	},
	CLERIGO("Clérigo") {
		@Override
		public Classe getInstance() {
			return new Clerigo();
		}
	},
	DRUIDA("Drúida") {
		@Override
		public Classe getInstance() {
			return new Druida();
		}
	},
	FEITICEIRO("Feiticeiro") {
		@Override
		public Classe getInstance() {
			return new Feiticeiro();
		}
	},
	GUERREIRO("Guerreiro") {
		@Override
		public Classe getInstance() {
			return new Guerreiro();
		}
	},
	LADINO("Ladino") {
		@Override
		public Classe getInstance() {
			return new Ladino();
		}
	},
	MAGO("Mago") {
		@Override
		public Classe getInstance() {
			return new Mago();
		}
	},
	MONGE("Monge") {
		@Override
		public Classe getInstance() {
			return new Monge();
		}
	},
	PALADINO("Paladino") {
		@Override
		public Classe getInstance() {
			return new Paladino();
		}
	},
	PATRULHEIRO("Patrulheiro") {
		@Override
		public Classe getInstance() {
			return new Patrulheiro();
		}
	};
	
	//Métodos e atributos dos tipos
	
	private String nome;

	TipoClasse(String string) {
		nome = string;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	public abstract Classe getInstance();
}
