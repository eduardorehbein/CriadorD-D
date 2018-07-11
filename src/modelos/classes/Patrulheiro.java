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
		super.habilidadesAdd(new Habilidade("Inimigo favorito", "\tA partir do 1° nível, você tem experiência significativa estudando, rastreando, caçando e, até mesmo, falando com certos tipos de inimigos.\n" +
				"\tEscolha um tipo de inimigo favorito: aberrações, bestas, celestiais, constructos, corruptores, dragões, elementais, fadas, gigantes, limos, monstruosidades, mortos-vivos ou plantas. Alternativamente, você pode escolher duas raças de humanoides (como gnolls e orcs) para seus inimigos favoritos.\n" +
				"\tVocê tem vantagem nas jogadas de ataque, em testes de Sabedoria (Sobrevivência) para rastrear seus inimigos favoritos, assim como em testes de Inteligência para lembrar informações sobre eles.\n" +
				"\tQuando você adquire essa característica, você também aprende um idioma, à sua escolha, que seja falado pelos seus inimigos favoritos, se eles falarem algum.\n" +
				"\tVocê escolhe um inimigo favorito adicional, assim como um idioma associado, no 6° e 14° nível. A medida que você ganha níveis, suas escolhas deverão refletir os tipos de monstros que você encontrou nas suas aventuras.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Explorador natural", "\tVocê está particularmente familiarizado com um tipo de ambiente natural e é perito em viajar e sobreviver em tais regiões. Escolha um tipo de terreno favorito: ártico, costa, deserto, floresta, montanha, pântano, planície ou subterrâneo. Quando você fizer um teste de Inteligência ou de Sabedoria relacionado ao seu terreno favorito, seu bônus de proficiência será dobrado se você estiver usando uma perícia na qual seja proficiente.\n" +
				"\tEnquanto viajar por uma hora ou mais em seu terreno favorito, você ganha os seguintes benefícios:\n" +
				"\t*Terreno difícil não retarda a viagem do seu grupo.\n" +
				"\t*Seu grupo não pode se perder, exceto por meios mágicos.\n" +
				"\t*Mesmo quando você estiver engajado em outra atividade enquanto viaja (como forragear, navegar ou rastrear), você se mantem alerta ao perigo.\n" +
				"\t*Se vocês estiver viajando sozinho, você pode se mover furtivamente com seu ritmo de viagem normal.\n" +
				"\t*Quando você forrageia, você encontra o dobro de comida que normalmente encontraria.\n" +
				"\t*Enquanto estiver rastreando outras criaturas, você também descobre a quantidade exata delas, seus tamanhos e a quanto tempo elas passaram pela área.\n" +
				"\tVocê escolhe um tipo de terreno favorito adicional no 6° e 10° nível.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Estilo de luta", "\tNo 2° nível, você adota um estilo de combate particular que será sua especialidade. Escolha uma das opções a seguir. Você não pode escolher o mesmo Estilo de Combate mais de uma vez, mesmo se puder escolher de novo.\n" +
				"\tArquearia: Você ganha +2 de bônus nas jogadas de ataque realizadas com uma arma de ataque à distância.\n" +
				"\tCombate com Duas Armas: Quando você estiver engajado em uma luta com duas armas, você pode adicionar o seu modificador de habilidade na jogada de dano do seu segundo ataque.\n" +
				"\tDefesa: Enquanto estiver usando armadura, você ganha +1 de bônus em sua CA.\n" +
				"\tDuelismo: Quando você empunhar uma arma de ataque corpo-a-corpo em uma mão e nenhuma outra arma, você ganha +2 de bônus nas jogadas de dano com essa arma.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Conjuração", "\tQuando você alcança o 2° nível, você aprende a usar a essência mágica da natureza para conjurar magias, como um druida faz. Veja o capítulo 10 para as regras gerais de conjuração e o capítulo 11 para a lista de magias de patrulheiro.\n" + 
				"\tEspaços de Magia: A tabela O Patrulheiro mostra quantos espaços de magia você tem para conjurar suas magias de 1° nível e superiores. Para conjurar uma dessas magias, você deve gastar uma espaço de magia do nível da magia ou superior. Você recobra todos os espaços de magia gastos quando você completa um descanso longo. Por exemplo, se você quiser conjurar a magia de 1° nível amizade animal e você tiver um espaço de magia de 1° nível e um de 2° nível disponíveis, você poderá conjurar amizade animal usando qualquer dos dois espaços.\n" +
				"\tMagias Conhecidas de 1º Nível e Superiores: Você conhece duas magias de 1° nível, à sua escolha, da lista de magias de patrulheiro. A coluna Magias Conhecidas na tabela O Patrulheiro mostra quando você aprende mais magias de patrulheiro, à sua escolha. Cada uma dessas magias deve ser de um nível a que você tenha acesso, como mostrado na tabela. Por exemplo, quando você alcança o 5° nível da classe, você pode aprender uma nova magia de 1° ou 2° nível. Além disso, quando você adquire um nível nessa classe, você pode escolher uma magia de patrulheiro que você conheça e substituí-la por outra magia da lista de magias de patrulheiro, que também deve ser de um nível ao qual você tenha espaços de magia.\n" +
				"\tHabilidade de Conjuração: Sabedoria é a sua habilidade para conjurar suas magias de patrulheiro, já que sua magia vem da sua sintonia com a natureza. Você usa sua Sabedoria sempre que alguma magia se referir a sua habilidade de conjurar magias. Além disso, você usa o seu modificador de Sabedoria para definir a CD dos testes de resistência para as magias de patrulheiro que você conjura e quando você realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + bônus de proficiência + seu modificador de Sabedoria\n" +
				"\tModificador de ataque de magia = seu bônus de proficiência + seu modificador de Sabedoria\n\n", 2));
		super.habilidadesAdd(new Habilidade("Arquétipo de patrulheiro", "\tNo 3° nível, você escolhe um arquétipo que você se esforça para imitar: Caçador ou Mestre das Bestas, ambos detalhados no final da descrição da classe. Sua escolha lhe concede características no 3° nível e novamente no 7°, 11° e 15° nível.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Prontidão primitiva", "\tA partir do 3° nível, você pode usar sua ação e gastar um espaço de magia de patrulheiro para focar sua atenção na região a seu redor. Por 1 minuto por nível do espaço de magia gasto, você pode sentir se os seguintes tipos de criaturas estão presentes a 1,5 quilometro de você (ou dentro de até 10 quilômetros se você estiver em seu terreno favorito): aberrações, celestiais, corruptores, dragões, elementais, fadas e mortos-vivos. Essa característica não revela a localização ou quantidade de criaturas.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5° nível, você pode atacar duas vezes, ao invés de uma, sempre que você realizar a ação de Ataque no seu turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Caminho da floresta", "\tComeçando no 8° nível, se mover através de terreno difícil não-mágico não lhe custa deslocamento adicional. Você também pode passar através de plantas não-mágicas sem ter seu deslocamento reduzido por elas e sem sofrer dano delas caso apresentem espinhos, acúleos ou perigo similar.\n" +
				"\tAlém disso, você tem vantagem em testes de resistência contra plantas criadas ou manipuladas magicamente para impedir movimento, como as criaturas pela magia constrição.\n\n", 8));
		super.habilidadesAdd(new Habilidade("Mimetismo", "\tA partir do 10° nível, você pode gastar 1 minuto criando uma camuflagem para si mesmo. Você deve ter acesso a lama fresca, terra, plantas, fuligem e outros materiais naturalmente comuns para criar sua camuflagem.\n" +
				"\tQuando você estiver camuflado dessa forma, você pode tentar se esconder ao se pressionar contra uma superfície sólida, como uma árvore ou muro, que seja, pelo menos, tão alto quanto você. Você recebe +10 de bônus em testes de Destreza (Furtividade) enquanto você permanecer ali parado e sem realizar ações. Quando você se mover ou realizar uma ação ou reação, você deve se camuflar novamente para ganhar esse benefício.\n\n", 10));
		super.habilidadesAdd(new Habilidade("Desaparecer", "\tComeçando no 14° nível, você pode usar a ação de Esconder, com uma ação bônus, no seu turno. Além disso, você não pode ser rastreado por meios não-mágicos, a não ser que você decida deixar um rastro.\n\n", 14));
		super.habilidadesAdd(new Habilidade("Sentidos selvagens", "\tNo 18° nível, você ganha sentidos preternaturais que o ajudam a lutar contra criaturas que você não pode ver. Quando você atacar uma criatura que você não possa ver, sua incapacidade em vê-la não impõem desvantagem nas suas jogadas de ataque contra ela.\n" +
				"\tVocê também está ciente da localização de qualquer criatura invisível a até 9 metros de você, considerando que a criatura não esteja se escondendo de você e você não esteja cego ou surdo.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Matador de inimigos", "\tNo 20° nível, você se torna um caçador incomparável de inimigos. Uma vez em cada um dos seus turnos, você pode adicionar seu modificador de Sabedoria na jogada de ataque ou jogada de dano de um ataque que você faça contra um dos seus inimigos favoritos. Você pode escolher usar essa característica antes ou depois da rolagem, mas antes de qualquer efeito da jogada ser aplicado.\n\n", 20));
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
