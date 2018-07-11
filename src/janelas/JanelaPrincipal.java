package janelas;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import janelas.paineis.AtributosComplexos;
import janelas.paineis.AtributosSimples;
import modelos.Personagem;

public class JanelaPrincipal extends JFrame {
	private CardLayout card;
	private JPanel container;
	private AtributosSimples painelAS;
	private AtributosComplexos painelAC;

	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 20, 1250, 700);
		setTitle("Criador D&D");
		
		card = new CardLayout();
		
		container = new JPanel();
		container.setLayout(card);
		
		painelAS = new AtributosSimples(this);
		painelAS.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		painelAC = new AtributosComplexos();
		painelAC.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		container.add(painelAS, "1");
		container.add(painelAC, "2");
		card.show(container, "1");
		
		add(container);
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setResizable(false);
	}
	
	public void usarPainelAC(Personagem personagem) {
		painelAC.draw(personagem);
		card.show(container, "2");
	}
}
