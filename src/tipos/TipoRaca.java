package tipos;

import modelos.racas.Anao;
import modelos.racas.Draconato;
import modelos.racas.Elfo;
import modelos.racas.Gnomo;
import modelos.racas.Halfing;
import modelos.racas.Humano;
import modelos.racas.MeioElfo;
import modelos.racas.MeioOrc;
import modelos.racas.Raca;
import modelos.racas.Tiefling;

public enum TipoRaca {
	//Tipos
	
		ANAO("Anão") {
			@Override
			public Raca getInstance() {
				return new Anao();
			}
		},
		DRACONATO("Draconato") {
			@Override
			public Raca getInstance() {
				return new Draconato();
			}
		},
		ELFO("Élfo") {
			@Override
			public Raca getInstance() {
				return new Elfo();
			}
		},
		GNOMO("Gnomo") {
			@Override
			public Raca getInstance() {
				return new Gnomo();
			}
		},
		HALFING("Halfing") {
			@Override
			public Raca getInstance() {
				return new Halfing();
			}
		},
		HUMANO("Humano") {
			@Override
			public Raca getInstance() {
				return new Humano();
			}
		},
		MEIO_ELFO("Meio-Élfo") {
			@Override
			public Raca getInstance() {
				return new MeioElfo();
			}
		},
		MEIO_ORC("Meio-Orc") {
			@Override
			public Raca getInstance() {
				return new MeioOrc();
			}
		},
		TIEFLING("Tiefling") {
			@Override
			public Raca getInstance() {
				return new Tiefling();
			}
		};
		
		//Métodos e atributos dos tipos
		
		private String nome;

		TipoRaca(String string) {
			nome = string;
		}
		
		@Override
		public String toString() {
			return nome;
		}
		
		public abstract Raca getInstance();
}
