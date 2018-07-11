package janelas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelos.Personagem;
import modelos.classes.Classe;
import modelos.classes.Monge;
import modelos.classes.caminhos.Caminho;
import modelos.classes.caminhos.barbaro.CaminhoDoFurioso;
import modelos.classes.caminhos.barbaro.CaminhoDoGuerreiroTotemico;
import modelos.classes.caminhos.bardo.ColegioDaBravura;
import modelos.classes.caminhos.bardo.ColegioDoConhecimento;
import modelos.classes.caminhos.bruxo.Arquifada;
import modelos.classes.caminhos.bruxo.OCorruptor;
import modelos.classes.caminhos.bruxo.OGrandeAntigo;
import modelos.classes.caminhos.clerigo.DominioDaEnganacao;
import modelos.classes.caminhos.clerigo.DominioDaGuerra;
import modelos.classes.caminhos.clerigo.DominioDaLuz;
import modelos.classes.caminhos.clerigo.DominioDaNatureza;
import modelos.classes.caminhos.clerigo.DominioDaTempestade;
import modelos.classes.caminhos.clerigo.DominioDaVida;
import modelos.classes.caminhos.clerigo.DominioDoConhecimento;
import modelos.classes.caminhos.druida.CirculoDaLua;
import modelos.classes.caminhos.druida.CirculoDaTerra;
import modelos.classes.caminhos.feiticeiro.LinhagemDraconica;
import modelos.classes.caminhos.feiticeiro.MagiaSelvagem;
import modelos.classes.caminhos.guerreiro.Campeao;
import modelos.classes.caminhos.guerreiro.CavaleiroArcano;
import modelos.classes.caminhos.guerreiro.MestreDeBatalha;
import modelos.classes.caminhos.ladino.Assassino;
import modelos.classes.caminhos.ladino.Ladrao;
import modelos.classes.caminhos.ladino.TrapaceiroArcano;
import modelos.classes.caminhos.mago.EscolaDeAbjuracao;
import modelos.classes.caminhos.mago.EscolaDeAdivinhacao;
import modelos.classes.caminhos.mago.EscolaDeConjuracao;
import modelos.classes.caminhos.mago.EscolaDeEncantamento;
import modelos.classes.caminhos.mago.EscolaDeEvocacao;
import modelos.classes.caminhos.mago.EscolaDeIlusao;
import modelos.classes.caminhos.mago.EscolaDeNecromancia;
import modelos.classes.caminhos.mago.EscolaDeTransmutacao;
import modelos.classes.caminhos.monge.CaminhoDaMaoAberta;
import modelos.classes.caminhos.monge.CaminhoDaSombra;
import modelos.classes.caminhos.monge.CaminhoDosQuatroElementos;
import modelos.classes.caminhos.paladino.JuramentoDeDevocao;
import modelos.classes.caminhos.paladino.JuramentoDeVinganca;
import modelos.classes.caminhos.paladino.JuramentoDosAncioes;
import modelos.classes.caminhos.patrulheiro.Cacador;
import modelos.classes.caminhos.patrulheiro.MestreDasBestas;
import modelos.racas.Elfo;

public class JanelaTeste extends JFrame {

	private JPanel contentPane;
	private JTextArea taCaminhoDescricao;
	private JComboBox<Caminho<? extends Classe>> cbCaminho;
	private JLabel lblAcrobacia;
	private JTextField tfAcrobacia;
	private JLabel lblAdestrarAnimais;
	private JTextField tfAdestrarAnimais;
	private JLabel lblArcanismo;
	private JTextField tfArcanismo;
	private JLabel lblAtletismo;
	private JTextField tfAtletismo;
	private JLabel lblAtuacao;
	private JTextField tfAtuacao;
	private JLabel lblEnganacao;
	private JTextField tfEnganacao;
	private JLabel lblFurtividade;
	private JTextField tfFurtividade;
	private JLabel lblHistoria;
	private JTextField tfHistoria;
	private JLabel lblIntimidacao;
	private JTextField tfIntimidacao;
	private JLabel lblIntuicao;
	private JTextField tfIntuicao;
	private JLabel lblInvestigacao;
	private JTextField tfInvestigacao;
	private JLabel lblMedicina;
	private JTextField tfMedicina;
	private JLabel lblNatureza;
	private JTextField tfNatureza;
	private JLabel lblPercepcao;
	private JTextField tfPercepcao;
	private JLabel lblPersuasao;
	private JTextField tfPersuasao;
	private JLabel lblPrestidigitacao;
	private JTextField tfPrestidigitacao;
	private JLabel lblReligiao;
	private JTextField tfReligiao;
	private JLabel lblSobrevivencia;
	private JTextField tfSobrevivencia;
	private List<JLabel> labelList = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personagem personagem = new Personagem("Vraulinsom", 23, 1.89, 80, "Branco", "Azul", 4, "Leal - bom", 
							Arrays.asList("Comum", "Élfico"), "História longa", 14, 15, 16, 17, 16, 14);
					personagem.setClasse(new Monge());
					personagem.setRaca(new Elfo());
					personagem.inicializaClasseERaca();
					JanelaTeste frame = new JanelaTeste(personagem);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public JanelaTeste(Personagem personagem) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 20, 1250, 700);
		setTitle("Criador D&D");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCaminho = new JLabel("Caminho:");
		lblCaminho.setBounds(10, 57, 62, 14);
		contentPane.add(lblCaminho);
		
		cbCaminho = new JComboBox<>();
		cbCaminho.setBounds(10, 75, 225, 20);
		plotaCaminhos(personagem.getClasse());
		contentPane.add(cbCaminho);

		taCaminhoDescricao = new JTextArea(((Caminho<? extends Classe>) cbCaminho.getSelectedItem()).getDescricao());
		taCaminhoDescricao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taCaminhoDescricao.setBounds(0, 0, 550, 200);
		taCaminhoDescricao.setLineWrap(true);
		taCaminhoDescricao.setWrapStyleWord(true);
		taCaminhoDescricao.setEditable(false);
		JScrollPane scroll = new JScrollPane(taCaminhoDescricao);
		scroll.setBounds(245, 50, 550, 200);
		contentPane.add(scroll);
		
		cbCaminho.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent event) {
				Caminho<? extends Classe> caminho = (Caminho) event.getItem();
				taCaminhoDescricao.setText(caminho.getDescricao());
			}
		});
		
		JLabel lblPericias = new JLabel("<html><h3>Perícias</h3></html>");
		lblPericias.setBounds(835, 50, 99, 14);
		contentPane.add(lblPericias);

		lblAcrobacia = new JLabel("Acrobacia:");
		lblAcrobacia.setBounds(835, 78, 68, 14);
		contentPane.add(lblAcrobacia);
		labelList.add(lblAcrobacia);
		
		tfAcrobacia = new JTextField();
		tfAcrobacia.setBounds(945, 75, 70, 20);
		contentPane.add(tfAcrobacia);
		tfAcrobacia.setColumns(10);
		
		lblAdestrarAnimais = new JLabel("Adestrar Animais:");
		lblAdestrarAnimais.setBounds(835, 103, 110, 14);
		contentPane.add(lblAdestrarAnimais);
		labelList.add(lblAdestrarAnimais);
		
		tfAdestrarAnimais = new JTextField();
		tfAdestrarAnimais.setBounds(945, 100, 70, 20);
		contentPane.add(tfAdestrarAnimais);
		tfAdestrarAnimais.setColumns(10);
		
		lblArcanismo = new JLabel("Arcanismo:");
		lblArcanismo.setBounds(835, 128, 68, 14);
		contentPane.add(lblArcanismo);
		labelList.add(lblArcanismo);
		
		tfArcanismo = new JTextField();
		tfArcanismo.setBounds(945, 125, 70, 20);
		contentPane.add(tfArcanismo);
		tfArcanismo.setColumns(10);
		
		lblAtletismo = new JLabel("Atletismo:");
		lblAtletismo.setBounds(835, 153, 62, 14);
		contentPane.add(lblAtletismo);
		labelList.add(lblAtletismo);
		
		tfAtletismo = new JTextField();
		tfAtletismo.setBounds(945, 150, 70, 20);
		contentPane.add(tfAtletismo);
		tfAtletismo.setColumns(10);
		
		lblAtuacao = new JLabel("Atuação:");
		lblAtuacao.setBounds(835, 178, 62, 14);
		contentPane.add(lblAtuacao);
		labelList.add(lblAtuacao);
		
		tfAtuacao = new JTextField();
		tfAtuacao.setBounds(945, 175, 70, 20);
		contentPane.add(tfAtuacao);
		tfAtuacao.setColumns(10);
		
		lblEnganacao = new JLabel("Enganação:");
		lblEnganacao.setBounds(835, 203, 68, 14);
		contentPane.add(lblEnganacao);
		labelList.add(lblEnganacao);
		
		tfEnganacao = new JTextField();
		tfEnganacao.setBounds(945, 200, 70, 20);
		contentPane.add(tfEnganacao);
		tfEnganacao.setColumns(10);
		
		lblFurtividade = new JLabel("Furtividade:");
		lblFurtividade.setBounds(835, 228, 68, 14);
		contentPane.add(lblFurtividade);
		labelList.add(lblFurtividade);
		
		tfFurtividade = new JTextField();
		tfFurtividade.setBounds(945, 225, 70, 20);
		contentPane.add(tfFurtividade);
		tfFurtividade.setColumns(10);
		
		lblHistoria = new JLabel("História:");
		lblHistoria.setBounds(835, 253, 62, 14);
		contentPane.add(lblHistoria);
		labelList.add(lblHistoria);
		
		tfHistoria = new JTextField();
		tfHistoria.setBounds(945, 250, 70, 20);
		contentPane.add(tfHistoria);
		tfHistoria.setColumns(10);
		
		lblIntimidacao = new JLabel("Intimidação:");
		lblIntimidacao.setBounds(835, 278, 86, 14);
		contentPane.add(lblIntimidacao);
		labelList.add(lblIntimidacao);
		
		tfIntimidacao = new JTextField();
		tfIntimidacao.setBounds(945, 275, 70, 20);
		contentPane.add(tfIntimidacao);
		tfIntimidacao.setColumns(10);
		
		lblIntuicao = new JLabel("Intuição:");
		lblIntuicao.setBounds(1025, 78, 68, 14);
		contentPane.add(lblIntuicao);
		labelList.add(lblIntuicao);
		
		tfIntuicao = new JTextField();
		tfIntuicao.setBounds(1135, 75, 70, 20);
		contentPane.add(tfIntuicao);
		tfIntuicao.setColumns(10);
		
		lblInvestigacao = new JLabel("Investigação:");
		lblInvestigacao.setBounds(1025, 103, 86, 14);
		contentPane.add(lblInvestigacao);
		labelList.add(lblInvestigacao);
		
		tfInvestigacao = new JTextField();
		tfInvestigacao.setBounds(1135, 100, 70, 20);
		contentPane.add(tfInvestigacao);
		tfInvestigacao.setColumns(10);
		
		lblMedicina = new JLabel("Medicina:");
		lblMedicina.setBounds(1025, 128, 68, 14);
		contentPane.add(lblMedicina);
		labelList.add(lblMedicina);
		
		tfMedicina = new JTextField();
		tfMedicina.setBounds(1135, 125, 70, 20);
		contentPane.add(tfMedicina);
		tfMedicina.setColumns(10);
		
		lblNatureza = new JLabel("Natureza:");
		lblNatureza.setBounds(1025, 153, 68, 14);
		contentPane.add(lblNatureza);
		labelList.add(lblNatureza);
		
		tfNatureza = new JTextField();
		tfNatureza.setBounds(1135, 150, 70, 20);
		contentPane.add(tfNatureza);
		tfNatureza.setColumns(10);
		
		lblPercepcao = new JLabel("Percepção:");
		lblPercepcao.setBounds(1025, 178, 86, 14);
		contentPane.add(lblPercepcao);
		labelList.add(lblPercepcao);
		
		tfPercepcao = new JTextField();
		tfPercepcao.setBounds(1135, 175, 70, 20);
		contentPane.add(tfPercepcao);
		tfPercepcao.setColumns(10);
		
		lblPersuasao = new JLabel("Persuasão:");
		lblPersuasao.setBounds(1025, 203, 68, 14);
		contentPane.add(lblPersuasao);
		labelList.add(lblPersuasao);
		
		tfPersuasao = new JTextField();
		tfPersuasao.setBounds(1135, 200, 70, 20);
		contentPane.add(tfPersuasao);
		tfPersuasao.setColumns(10);
		
		lblPrestidigitacao = new JLabel("Prestidigitação:");
		lblPrestidigitacao.setBounds(1025, 228, 99, 14);
		contentPane.add(lblPrestidigitacao);
		labelList.add(lblPrestidigitacao);
		
		tfPrestidigitacao = new JTextField();
		tfPrestidigitacao.setBounds(1135, 225, 70, 20);
		contentPane.add(tfPrestidigitacao);
		tfPrestidigitacao.setColumns(10);
		
		lblReligiao = new JLabel("Religião:");
		lblReligiao.setBounds(1025, 253, 68, 14);
		contentPane.add(lblReligiao);
		labelList.add(lblReligiao);
		
		tfReligiao = new JTextField();
		tfReligiao.setBounds(1135, 250, 70, 20);
		contentPane.add(tfReligiao);
		tfReligiao.setColumns(10);
		
		lblSobrevivencia = new JLabel("Sobrevivência:");
		lblSobrevivencia.setBounds(1025, 278, 86, 14);
		contentPane.add(lblSobrevivencia);
		labelList.add(lblSobrevivencia);
		
		tfSobrevivencia = new JTextField();
		tfSobrevivencia.setBounds(1135, 275, 70, 20);
		contentPane.add(tfSobrevivencia);
		tfSobrevivencia.setColumns(10);
	}

	private void plotaCaminhos(Classe classe) {
		switch (classe.getClass().getSimpleName()) {
			case "Barbaro":
				cbCaminho.addItem(new CaminhoDoFurioso());
				cbCaminho.addItem(new CaminhoDoGuerreiroTotemico());
				break;
			case "Bardo":
				cbCaminho.addItem(new ColegioDaBravura());
				cbCaminho.addItem(new ColegioDoConhecimento());
				break;
			case "Bruxo":
				cbCaminho.addItem(new Arquifada());
				cbCaminho.addItem(new OCorruptor());
				cbCaminho.addItem(new OGrandeAntigo());
				break;
			case "Clerigo":
				cbCaminho.addItem(new DominioDaEnganacao());
				cbCaminho.addItem(new DominioDaGuerra());
				cbCaminho.addItem(new DominioDaLuz());
				cbCaminho.addItem(new DominioDaNatureza());
				cbCaminho.addItem(new DominioDaTempestade());
				cbCaminho.addItem(new DominioDaVida());
				cbCaminho.addItem(new DominioDoConhecimento());
				break;
			case "Druida":
				cbCaminho.addItem(new CirculoDaLua());
				cbCaminho.addItem(new CirculoDaTerra());
				break;
			case "Feiticeiro":
				cbCaminho.addItem(new LinhagemDraconica());
				cbCaminho.addItem(new MagiaSelvagem());
				break;
			case "Guerreiro":
				cbCaminho.addItem(new Campeao());
				cbCaminho.addItem(new CavaleiroArcano());
				cbCaminho.addItem(new MestreDeBatalha());
				break;
			case "Ladino":
				cbCaminho.addItem(new Assassino());
				cbCaminho.addItem(new Ladrao());
				cbCaminho.addItem(new TrapaceiroArcano());
				break;
			case "Mago":
				cbCaminho.addItem(new EscolaDeAbjuracao());
				cbCaminho.addItem(new EscolaDeAdivinhacao());
				cbCaminho.addItem(new EscolaDeConjuracao());
				cbCaminho.addItem(new EscolaDeEncantamento());
				cbCaminho.addItem(new EscolaDeEvocacao());
				cbCaminho.addItem(new EscolaDeIlusao());
				cbCaminho.addItem(new EscolaDeNecromancia());
				cbCaminho.addItem(new EscolaDeTransmutacao());
				break;
			case "Monge":
				cbCaminho.addItem(new CaminhoDaMaoAberta());
				cbCaminho.addItem(new CaminhoDaSombra());
				cbCaminho.addItem(new CaminhoDosQuatroElementos());
				break;
			case "Paladino":
				cbCaminho.addItem(new JuramentoDeDevocao());
				cbCaminho.addItem(new JuramentoDeVinganca());
				cbCaminho.addItem(new JuramentoDosAncioes());
				break;
			case "Patrulheiro":
				cbCaminho.addItem(new Cacador());
				cbCaminho.addItem(new MestreDasBestas());
				break;
		}
	}
}

