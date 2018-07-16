package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Patrulheiro extends Classe implements Magica{
	private Caminho<Patrulheiro> caminho;

	@Override
	public String toString() {
		return "Patrulheiro";
	}
	
	@Override
	public void inicializa(Personagem personagem) {
		super.inicializa(personagem);
		addMagiasAoBau(personagem);
	}

	@Override
	void setTabela() {}
	
	@Override
	public void setEquipamentoInicial(Personagem personagem) {}

	@Override
	protected void setPvInicial(Personagem personagem) {
		personagem.setPv(10 + personagem.getModificadorConstituicao());
		if(personagem.getNivel() > 1) {
			for(int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD10() + personagem.getModificadorConstituicao());
	}

	@Override
	protected void setHabilidades() {
		//TODO: Extrair strings para um XML
		super.habilidadesAdd(new Habilidade("Inimigo favorito", "\tA partir do 1� n�vel, voc� tem experi�ncia significativa estudando, rastreando, ca�ando e, at� mesmo, falando com certos tipos de inimigos.\n" +
				"\tEscolha um tipo de inimigo favorito: aberra��es, bestas, celestiais, constructos, corruptores, drag�es, elementais, fadas, gigantes, limos, monstruosidades, mortos-vivos ou plantas. Alternativamente, voc� pode escolher duas ra�as de humanoides (como gnolls e orcs) para seus inimigos favoritos.\n" +
				"\tVoc� tem vantagem nas jogadas de ataque, em testes de Sabedoria (Sobreviv�ncia) para rastrear seus inimigos favoritos, assim como em testes de Intelig�ncia para lembrar informa��es sobre eles.\n" +
				"\tQuando voc� adquire essa caracter�stica, voc� tamb�m aprende um idioma, � sua escolha, que seja falado pelos seus inimigos favoritos, se eles falarem algum.\n" +
				"\tVoc� escolhe um inimigo favorito adicional, assim como um idioma associado, no 6� e 14� n�vel. A medida que voc� ganha n�veis, suas escolhas dever�o refletir os tipos de monstros que voc� encontrou nas suas aventuras.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Explorador natural", "\tVoc� est� particularmente familiarizado com um tipo de ambiente natural e � perito em viajar e sobreviver em tais regi�es. Escolha um tipo de terreno favorito: �rtico, costa, deserto, floresta, montanha, p�ntano, plan�cie ou subterr�neo. Quando voc� fizer um teste de Intelig�ncia ou de Sabedoria relacionado ao seu terreno favorito, seu b�nus de profici�ncia ser� dobrado se voc� estiver usando uma per�cia na qual seja proficiente.\n" +
				"\tEnquanto viajar por uma hora ou mais em seu terreno favorito, voc� ganha os seguintes benef�cios:\n" +
				"\t*Terreno dif�cil n�o retarda a viagem do seu grupo.\n" +
				"\t*Seu grupo n�o pode se perder, exceto por meios m�gicos.\n" +
				"\t*Mesmo quando voc� estiver engajado em outra atividade enquanto viaja (como forragear, navegar ou rastrear), voc� se mantem alerta ao perigo.\n" +
				"\t*Se voc�s estiver viajando sozinho, voc� pode se mover furtivamente com seu ritmo de viagem normal.\n" +
				"\t*Quando voc� forrageia, voc� encontra o dobro de comida que normalmente encontraria.\n" +
				"\t*Enquanto estiver rastreando outras criaturas, voc� tamb�m descobre a quantidade exata delas, seus tamanhos e a quanto tempo elas passaram pela �rea.\n" +
				"\tVoc� escolhe um tipo de terreno favorito adicional no 6� e 10� n�vel.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Estilo de luta", "\tNo 2� n�vel, voc� adota um estilo de combate particular que ser� sua especialidade. Escolha uma das op��es a seguir. Voc� n�o pode escolher o mesmo Estilo de Combate mais de uma vez, mesmo se puder escolher de novo.\n" +
				"\tArquearia: Voc� ganha +2 de b�nus nas jogadas de ataque realizadas com uma arma de ataque � dist�ncia.\n" +
				"\tCombate com Duas Armas: Quando voc� estiver engajado em uma luta com duas armas, voc� pode adicionar o seu modificador de habilidade na jogada de dano do seu segundo ataque.\n" +
				"\tDefesa: Enquanto estiver usando armadura, voc� ganha +1 de b�nus em sua CA.\n" +
				"\tDuelismo: Quando voc� empunhar uma arma de ataque corpo-a-corpo em uma m�o e nenhuma outra arma, voc� ganha +2 de b�nus nas jogadas de dano com essa arma.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Conjura��o", "\tQuando voc� alcan�a o 2� n�vel, voc� aprende a usar a ess�ncia m�gica da natureza para conjurar magias, como um druida faz. Veja o cap�tulo 10 para as regras gerais de conjura��o e o cap�tulo 11 para a lista de magias de patrulheiro.\n" + 
				"\tEspa�os de Magia: A tabela O Patrulheiro mostra quantos espa�os de magia voc� tem para conjurar suas magias de 1� n�vel e superiores. Para conjurar uma dessas magias, voc� deve gastar uma espa�o de magia do n�vel da magia ou superior. Voc� recobra todos os espa�os de magia gastos quando voc� completa um descanso longo. Por exemplo, se voc� quiser conjurar a magia de 1� n�vel amizade animal e voc� tiver um espa�o de magia de 1� n�vel e um de 2� n�vel dispon�veis, voc� poder� conjurar amizade animal usando qualquer dos dois espa�os.\n" +
				"\tMagias Conhecidas de 1� N�vel e Superiores: Voc� conhece duas magias de 1� n�vel, � sua escolha, da lista de magias de patrulheiro. A coluna Magias Conhecidas na tabela O Patrulheiro mostra quando voc� aprende mais magias de patrulheiro, � sua escolha. Cada uma dessas magias deve ser de um n�vel a que voc� tenha acesso, como mostrado na tabela. Por exemplo, quando voc� alcan�a o 5� n�vel da classe, voc� pode aprender uma nova magia de 1� ou 2� n�vel. Al�m disso, quando voc� adquire um n�vel nessa classe, voc� pode escolher uma magia de patrulheiro que voc� conhe�a e substitu�-la por outra magia da lista de magias de patrulheiro, que tamb�m deve ser de um n�vel ao qual voc� tenha espa�os de magia.\n" +
				"\tHabilidade de Conjura��o: Sabedoria � a sua habilidade para conjurar suas magias de patrulheiro, j� que sua magia vem da sua sintonia com a natureza. Voc� usa sua Sabedoria sempre que alguma magia se referir a sua habilidade de conjurar magias. Al�m disso, voc� usa o seu modificador de Sabedoria para definir a CD dos testes de resist�ncia para as magias de patrulheiro que voc� conjura e quando voc� realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + b�nus de profici�ncia + seu modificador de Sabedoria\n" +
				"\tModificador de ataque de magia = seu b�nus de profici�ncia + seu modificador de Sabedoria\n\n", 2));
		super.habilidadesAdd(new Habilidade("Arqu�tipo de patrulheiro", "\tNo 3� n�vel, voc� escolhe um arqu�tipo que voc� se esfor�a para imitar: Ca�ador ou Mestre das Bestas, ambos detalhados no final da descri��o da classe. Sua escolha lhe concede caracter�sticas no 3� n�vel e novamente no 7�, 11� e 15� n�vel.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Prontid�o primitiva", "\tA partir do 3� n�vel, voc� pode usar sua a��o e gastar um espa�o de magia de patrulheiro para focar sua aten��o na regi�o a seu redor. Por 1 minuto por n�vel do espa�o de magia gasto, voc� pode sentir se os seguintes tipos de criaturas est�o presentes a 1,5 quilometro de voc� (ou dentro de at� 10 quil�metros se voc� estiver em seu terreno favorito): aberra��es, celestiais, corruptores, drag�es, elementais, fadas e mortos-vivos. Essa caracter�stica n�o revela a localiza��o ou quantidade de criaturas.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16� e 19� n�vel, voc� pode aumentar um valor de habilidade, � sua escolha, em 2 ou voc� pode aumentar dois valores de habilidade, � sua escolha, em 1. Como padr�o, voc� n�o pode elevar um valor de habilidade acima de 20 com essa caracter�stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5� n�vel, voc� pode atacar duas vezes, ao inv�s de uma, sempre que voc� realizar a a��o de Ataque no seu turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Caminho da floresta", "\tCome�ando no 8� n�vel, se mover atrav�s de terreno dif�cil n�o-m�gico n�o lhe custa deslocamento adicional. Voc� tamb�m pode passar atrav�s de plantas n�o-m�gicas sem ter seu deslocamento reduzido por elas e sem sofrer dano delas caso apresentem espinhos, ac�leos ou perigo similar.\n" +
				"\tAl�m disso, voc� tem vantagem em testes de resist�ncia contra plantas criadas ou manipuladas magicamente para impedir movimento, como as criaturas pela magia constri��o.\n\n", 8));
		super.habilidadesAdd(new Habilidade("Mimetismo", "\tA partir do 10� n�vel, voc� pode gastar 1 minuto criando uma camuflagem para si mesmo. Voc� deve ter acesso a lama fresca, terra, plantas, fuligem e outros materiais naturalmente comuns para criar sua camuflagem.\n" +
				"\tQuando voc� estiver camuflado dessa forma, voc� pode tentar se esconder ao se pressionar contra uma superf�cie s�lida, como uma �rvore ou muro, que seja, pelo menos, t�o alto quanto voc�. Voc� recebe +10 de b�nus em testes de Destreza (Furtividade) enquanto voc� permanecer ali parado e sem realizar a��es. Quando voc� se mover ou realizar uma a��o ou rea��o, voc� deve se camuflar novamente para ganhar esse benef�cio.\n\n", 10));
		super.habilidadesAdd(new Habilidade("Desaparecer", "\tCome�ando no 14� n�vel, voc� pode usar a a��o de Esconder, com uma a��o b�nus, no seu turno. Al�m disso, voc� n�o pode ser rastreado por meios n�o-m�gicos, a n�o ser que voc� decida deixar um rastro.\n\n", 14));
		super.habilidadesAdd(new Habilidade("Sentidos selvagens", "\tNo 18� n�vel, voc� ganha sentidos preternaturais que o ajudam a lutar contra criaturas que voc� n�o pode ver. Quando voc� atacar uma criatura que voc� n�o possa ver, sua incapacidade em v�-la n�o imp�em desvantagem nas suas jogadas de ataque contra ela.\n" +
				"\tVoc� tamb�m est� ciente da localiza��o de qualquer criatura invis�vel a at� 9 metros de voc�, considerando que a criatura n�o esteja se escondendo de voc� e voc� n�o esteja cego ou surdo.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Matador de inimigos", "\tNo 20� n�vel, voc� se torna um ca�ador incompar�vel de inimigos. Uma vez em cada um dos seus turnos, voc� pode adicionar seu modificador de Sabedoria na jogada de ataque ou jogada de dano de um ataque que voc� fa�a contra um dos seus inimigos favoritos. Voc� pode escolher usar essa caracter�stica antes ou depois da rolagem, mas antes de qualquer efeito da jogada ser aplicado.\n\n", 20));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());
	}
	
	@Override
	public void addMagiasAoBau(Personagem personagem) {}

	public Caminho<Patrulheiro> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Patrulheiro> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
