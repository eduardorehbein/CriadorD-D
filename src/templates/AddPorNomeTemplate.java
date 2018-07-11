package templates;

import javax.xml.stream.XMLStreamException;

import modelos.Personagem;
import xao.MagiasXAO;

public class AddPorNomeTemplate {
	public void add(String[] nomesDasMagias, Personagem personagem) {
		MagiasXAO xao = new MagiasXAO();
		try {
			xao.addPorNomes(nomesDasMagias , personagem);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
	}
}
