package janelas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class JanelaInicial extends JFrame {
	private JPanel painel;

	public static void main(String[] args) {
		JanelaInicial frame = new JanelaInicial();
		frame.setVisible(true);
	}
	
	public JanelaInicial() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 250, 500, 250);
		setTitle("Criador D&D");
		
		painel = new JPanel();
		painel.setBackground(new Color(240, 230, 140));
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		painel.setLayout(null);
		
		iniciaComponentes();
		
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setResizable(false);
	}

	private void iniciaComponentes() {
		JLabel lblBemVindo1 = new JLabel("Bem vindo ao seu asistente de criação de personagens D&D");
		lblBemVindo1.setBounds(71, 27, 393, 14);
		painel.add(lblBemVindo1);
		
		JLabel lblBemVindo2 = new JLabel("Para continuar selecione uma ação:");
		lblBemVindo2.setBounds(142, 52, 211, 14);
		painel.add(lblBemVindo2);
		
		JLabel lblAguarde = new JLabel("Aguarde...");
		lblAguarde.setBounds(221, 157, 132, 14);
		painel.add(lblAguarde);
		lblAguarde.setVisible(false);
		
		JButton novo = new JButton("Novo");
		novo.setBackground(new Color(205, 133, 63));
		novo.setForeground(new Color(Color.TRANSLUCENT));
		novo.setBounds(87, 92, 120, 50);
		
		JButton carregar = new JButton("Carregar");
		carregar.setBackground(new Color(205, 133, 63));
		carregar.setForeground(new Color(Color.TRANSLUCENT));
		carregar.setBounds(282, 92, 120, 50);
		
		JButton creditos = new JButton("...");
		creditos.setBackground(new Color(205, 133, 63));
		carregar.setForeground(new Color(Color.TRANSLUCENT));
		creditos.setBounds(435, 182, 45, 23);
		
		novo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				lblAguarde.setVisible(true);
				novo.setEnabled(false);
				carregar.setEnabled(false);
				
				JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
				janelaPrincipal.setVisible(true);
				
				close();
			}
		});
		
		carregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				lblAguarde.setVisible(true);
				novo.setEnabled(false);
				carregar.setEnabled(false);
			}
		});
		
		creditos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "\tDesenvolvido por Eduardo Rehbein de Souza com a ajuda dos ilustres\n" +
						"Luiz Fernando de Souza, Cristiano Zarbato Morais, André Luiz Rodrigues e Guilherme Lopes Roque.");
			}
		});
		
		painel.add(novo);
		painel.add(carregar);
		painel.add(creditos);
	}
	
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}
	
