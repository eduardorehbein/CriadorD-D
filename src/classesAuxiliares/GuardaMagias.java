package classesAuxiliares;

import java.util.HashSet;
import java.util.Set;

import modelos.Magia;

public class GuardaMagias {
	private static final Set<Magia> magias = new HashSet<>();
	
	public static synchronized void add(Magia magia) {
		magias.add(magia);
	}
	
	public static Set<Magia> get() {
		return magias;
	}
}
