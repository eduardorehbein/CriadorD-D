package janelas.paineis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import classesAuxiliares.PersonagemBuilder;
import janelas.JanelaPrincipal;
import modelos.Personagem;
import tipos.TipoClasse;
import tipos.TipoRaca;
import java.awt.Color;

public class AtributosSimples extends JPanel {
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTextField tfAltura;
	private JTextField tfPeso;
	private JTextField tfCorDoCabelo;
	private JTextField tfCorDosOlhos;
	private JTextField tfForca;
	private JTextField tfConstituicao;
	private JTextField tfDestreza;
	private JTextField tfInteligencia;
	private JTextField tfSabedoria;
	private JTextField tfCarisma;
	private JTextField tfNivel;
	private JComboBox<String> cbTendencia;
	private JTextField tfIdioma1;
	private JTextField tfIdioma2;
	private JTextField tfIdioma3;
	private JComboBox<TipoClasse> cbClasse;
	private JComboBox<TipoRaca> cbRaca;
	private JTextArea taHistoria;
	
	public AtributosSimples(JanelaPrincipal janela) {
		setBackground(new Color(240, 230, 140));
		setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(35, 30, 46, 14);
		add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(84, 27, 130, 20);
		add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(35, 55, 46, 14);
		add(lblIdade);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(84, 52, 130, 20);
		add(tfIdade);
		tfIdade.setColumns(10);
		
		JSeparator spAparencia = new JSeparator();
		spAparencia.setBounds(35, 93, 179, 2);
		add(spAparencia);
		
		JLabel lblAparencia = new JLabel("<html><h3>Aparência</h3></html>");
		lblAparencia.setBounds(84, 104, 87, 14);
		add(lblAparencia);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(35, 145, 46, 14);
		add(lblAltura);
		
		tfAltura = new JTextField();
		tfAltura.setBounds(84, 142, 130, 20);
		add(tfAltura);
		tfAltura.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(35, 170, 46, 14);
		add(lblPeso);
		
		tfPeso = new JTextField();
		tfPeso.setBounds(84, 167, 130, 20);
		add(tfPeso);
		tfPeso.setColumns(10);
		
		JLabel lblCorDoCabelo = new JLabel("Cor do cabelo:");
		lblCorDoCabelo.setBounds(35, 195, 82, 14);
		add(lblCorDoCabelo);
		
		tfCorDoCabelo = new JTextField();
		tfCorDoCabelo.setBounds(127, 192, 87, 20);
		add(tfCorDoCabelo);
		tfCorDoCabelo.setColumns(10);
		
		JLabel lblCorDosOlhos = new JLabel("Cor dos olhos:");
		lblCorDosOlhos.setBounds(35, 220, 82, 14);
		add(lblCorDosOlhos);
		
		tfCorDosOlhos = new JTextField();
		tfCorDosOlhos.setBounds(127, 217, 87, 20);
		add(tfCorDosOlhos);
		tfCorDosOlhos.setColumns(10);
		
		JSeparator spHabilidades = new JSeparator();
		spHabilidades.setBounds(35, 280, 179, 2);
		add(spHabilidades);
		
		JLabel lblHabilidades = new JLabel("<html><h3>Habilidades</h3></html>");
		lblHabilidades.setBounds(84, 293, 99, 14);
		add(lblHabilidades);
		
		JLabel lblForca = new JLabel("Força:");
		lblForca.setBounds(35, 328, 46, 14);
		add(lblForca);
		
		tfForca = new JTextField();
		tfForca.setBounds(84, 325, 130, 20);
		add(tfForca);
		tfForca.setColumns(10);
		
		JLabel lblConstituicao = new JLabel("Constituição:");
		lblConstituicao.setBounds(35, 353, 74, 14);
		add(lblConstituicao);
		
		tfConstituicao = new JTextField();
		tfConstituicao.setBounds(119, 350, 95, 20);
		add(tfConstituicao);
		tfConstituicao.setColumns(10);
		
		JLabel lblDestreza = new JLabel("Destreza:");
		lblDestreza.setBounds(35, 378, 59, 14);
		add(lblDestreza);
		
		tfDestreza = new JTextField();
		tfDestreza.setBounds(119, 375, 95, 20);
		add(tfDestreza);
		tfDestreza.setColumns(10);
		
		JLabel lblInteligencia = new JLabel("Inteligência:");
		lblInteligencia.setBounds(35, 403, 74, 14);
		add(lblInteligencia);
		
		tfInteligencia = new JTextField();
		tfInteligencia.setBounds(119, 400, 95, 20);
		add(tfInteligencia);
		tfInteligencia.setColumns(10);
		
		JLabel lblSabedoria = new JLabel("Sabedoria:");
		lblSabedoria.setBounds(35, 428, 74, 14);
		add(lblSabedoria);
		
		tfSabedoria = new JTextField();
		tfSabedoria.setBounds(119, 425, 95, 20);
		add(tfSabedoria);
		tfSabedoria.setColumns(10);
		
		JLabel lblCarisma = new JLabel("Carisma:");
		lblCarisma.setBounds(35, 453, 52, 14);
		add(lblCarisma);
		
		tfCarisma = new JTextField();
		tfCarisma.setBounds(119, 450, 95, 20);
		add(tfCarisma);
		tfCarisma.setColumns(10);
		
		JSeparator spOutros = new JSeparator();
		spOutros.setBounds(35, 495, 179, 2);
		add(spOutros);
		
		JLabel lblOutros = new JLabel("<html><h3>Outras Características</h3></html>");
		lblOutros.setBounds(67, 508, 130, 30);
		add(lblOutros);
		
		JLabel lblNivel = new JLabel("Nível:");
		lblNivel.setBounds(35, 562, 46, 14);
		add(lblNivel);
		
		tfNivel = new JTextField();
		tfNivel.setBounds(84, 559, 130, 20);
		add(tfNivel);
		tfNivel.setColumns(10);
		
		JLabel lblTendencia = new JLabel("Tendência:");
		lblTendencia.setBounds(84, 590, 74, 14);
		add(lblTendencia);

		cbTendencia = new JComboBox<>();
		cbTendencia.setBounds(35, 615, 179, 20);
		add(cbTendencia);
		cbTendencia.addItem("Leal - Bom");
		cbTendencia.addItem("Leal - Neutro");
		cbTendencia.addItem("Leal - Mau");
		cbTendencia.addItem("Neutro - Bom");
		cbTendencia.addItem("Completamente Neutro");
		cbTendencia.addItem("Neutro - Mau");
		cbTendencia.addItem("Caótico - Bom");
		cbTendencia.addItem("Caótico - Neutro");
		cbTendencia.addItem("Caótico - Mau");
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(233, 11, 2, 73);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(233, 104, 2, 166);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(233, 294, 2, 188);
		add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(233, 503, 2, 127);
		add(separator_3);
		
		JLabel lblIdiomas = new JLabel("<html><h3>Idiomas</h3></html>");
		lblIdiomas.setBounds(302, 15, 74, 14);
		add(lblIdiomas);
		
		JLabel lblIdioma1 = new JLabel("Idioma1:");
		lblIdioma1.setBounds(245, 55, 52, 14);
		add(lblIdioma1);
		
		tfIdioma1 = new JTextField();
		tfIdioma1.setColumns(10);
		tfIdioma1.setBounds(313, 52, 117, 20);
		add(tfIdioma1);
		
		JLabel lblidiomaopicional = new JLabel("<html>Idioma2: (Opcional)</html>");
		lblidiomaopicional.setBounds(245, 80, 65, 38);
		add(lblidiomaopicional);
		
		tfIdioma2 = new JTextField();
		tfIdioma2.setBounds(313, 90, 117, 20);
		add(tfIdioma2);
		tfIdioma2.setColumns(10);
		
		JLabel lblIdioma3 = new JLabel("<html>Idioma3: (Opcional)</html>");
		lblIdioma3.setBounds(245, 121, 65, 38);
		add(lblIdioma3);
		
		tfIdioma3 = new JTextField();
		tfIdioma3.setColumns(10);
		tfIdioma3.setBounds(313, 129, 117, 20);
		add(tfIdioma3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(451, 11, 2, 166);
		add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(251, 182, 179, 2);
		add(separator_5);
		
		JLabel lblClasse = new JLabel("Classe:");
		lblClasse.setBounds(536, 30, 52, 14);
		add(lblClasse);
		
		cbClasse = new JComboBox<>();
		cbClasse.setBounds(584, 27, 147, 20);
		add(cbClasse);
		cbClasse.addItem(TipoClasse.BARBARO);
		cbClasse.addItem(TipoClasse.BARDO);
		cbClasse.addItem(TipoClasse.BRUXO);
		cbClasse.addItem(TipoClasse.CLERIGO);
		cbClasse.addItem(TipoClasse.DRUIDA);
		cbClasse.addItem(TipoClasse.FEITICEIRO);
		cbClasse.addItem(TipoClasse.GUERREIRO);
		cbClasse.addItem(TipoClasse.LADINO);
		cbClasse.addItem(TipoClasse.MAGO);
		cbClasse.addItem(TipoClasse.MONGE);
		cbClasse.addItem(TipoClasse.PALADINO);
		cbClasse.addItem(TipoClasse.PATRULHEIRO);
		
		JLabel lblRaça = new JLabel("Raça:");
		lblRaça.setBounds(536, 55, 52, 14);
		add(lblRaça);
		
		cbRaca = new JComboBox<>();
		cbRaca.setBounds(584, 52, 147, 20);
		add(cbRaca);
		cbRaca.addItem(TipoRaca.ANAO);
		cbRaca.addItem(TipoRaca.DRACONATO);
		cbRaca.addItem(TipoRaca.ELFO);
		cbRaca.addItem(TipoRaca.GNOMO);
		cbRaca.addItem(TipoRaca.HALFING);
		cbRaca.addItem(TipoRaca.HUMANO);
		cbRaca.addItem(TipoRaca.MEIO_ELFO);
		cbRaca.addItem(TipoRaca.MEIO_ORC);
		cbRaca.addItem(TipoRaca.TIEFLING);
		
		JLabel lblHistoria = new JLabel("História:");
		lblHistoria.setFont(new Font("Tahoma", Font.ITALIC, 54));
		lblHistoria.setBounds(536, 89, 254, 92);
		add(lblHistoria);
		
		taHistoria = new JTextArea();
		taHistoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taHistoria.setBounds(0, 0, 989, 465);
		taHistoria.setLineWrap(true);
		taHistoria.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(taHistoria);
		scroll.setBounds(245, 195, 989, 465);
		add(scroll);
		
		JButton btContinuar = new JButton("Continuar");
		btContinuar.setBackground(new Color(205, 133, 63));
		btContinuar.setForeground(new Color(Color.TRANSLUCENT));
		btContinuar.setFont(new Font("Monotype Corsiva", Font.PLAIN, 50));
		btContinuar.setBounds(848, 31, 386, 133);
		add(btContinuar);
		
		btContinuar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				btContinuar.setEnabled(false);
				
				try {
					Personagem personagem = constroiPersonagem();

					TipoClasse tipoClasse = (TipoClasse) cbClasse.getSelectedItem();
					personagem.setClasse(tipoClasse.getInstance());

					TipoRaca tipoRaca = (TipoRaca) cbRaca.getSelectedItem();
					personagem.setRaca(tipoRaca.getInstance());

					personagem.inicializaClasseERaca();
					System.out.println("Personagem construído com sucesso.");
					
					janela.usarPainelAC(personagem);
				} catch(NumberFormatException | NullPointerException exception) {
					JOptionPane.showMessageDialog(null, "Por favor insira os dados corretamente.");
					btContinuar.setEnabled(true);
					exception.printStackTrace();
				}
			}
		});
	}
	
	private Personagem constroiPersonagem() throws NullPointerException, NumberFormatException {
		if(tfNome.getText().equals("")
				|| tfAltura.getText().equals("")
				|| tfPeso.getText().equals("")
				|| tfCorDoCabelo.getText().equals("")
				|| tfCorDosOlhos.getText().equals("")
				|| tfIdioma1.getText().equals("")
				|| taHistoria.getText().equals("")){
			throw new NullPointerException();
		} else {
			PersonagemBuilder builder = new PersonagemBuilder();
			
			builder.setNome(tfNome.getText());
			builder.setIdade(Integer.valueOf(tfIdade.getText()));
			
			String altura = tfAltura.getText();
			if(altura.contains(",")) {
				altura = altura.replace(',' , '.');
			}
			builder.setAltura(Double.valueOf(altura));
			
			String peso = tfPeso.getText();
			if(peso.contains(",")) {
				peso = peso.replace(',', '.');
			}
			builder.setAltura(Double.valueOf(peso));
			
			builder.setCorDoCabelo(tfCorDoCabelo.getText());
			builder.setCorDosOlhos(tfCorDosOlhos.getText());
			
			builder.setForca(Integer.valueOf(tfForca.getText()));
			builder.setConstituicao(Integer.valueOf(tfConstituicao.getText()));
			builder.setDestreza(Integer.valueOf(tfDestreza.getText()));
			builder.setInteligencia(Integer.valueOf(tfInteligencia.getText()));
			builder.setSabedoria(Integer.valueOf(tfSabedoria.getText()));
			builder.setCarisma(Integer.valueOf(tfCarisma.getText()));
			
			builder.setNivel(Integer.valueOf(tfNivel.getText()));
			builder.setTendencia((String) cbTendencia.getSelectedItem());
			
			builder.idiomasAdd(tfIdioma1.getText());
			
			if (!tfIdioma2.getText().equals("")) {
				builder.idiomasAdd(tfIdioma2.getText());
			}
			
			if (!tfIdioma3.getText().equals("")) {
				builder.idiomasAdd(tfIdioma3.getText());
			}
			
			builder.setHistoria(taHistoria.getText());
			
			return builder.getInstance();
		}
	}
}
