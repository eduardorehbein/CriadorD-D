package modelos.classes;

import classesAuxiliares.Magica;
import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Mago extends Classe implements Magica{
	private Caminho<Mago> caminho;
	
	@Override
	public String toString() {
		return "Mago";
	}
	
	@Override
	public void inicializa(Personagem personagem) {
		super.inicializa(personagem);
		addMagiasAoBau(personagem);
	}
	
	@Override
	protected void setTabela() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEquipamentoInicial(Personagem personagem) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void setPvInicial(Personagem personagem) {
		personagem.setPv(6 + personagem.getModificadorConstituicao());
		if(personagem.getNivel() > 1) {
			for(int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD6() + personagem.getModificadorConstituicao());
	}

	@Override
	protected void setHabilidades() {
		super.habilidadesAdd(new Habilidade("Conjuração", "\tComo um estudante da magia arcana, você possui um livro de magias (ou grimório) que revela os primeiros vislumbres de seu verdadeiro poder. Consulte o capítulo 10 para as regras gerais sobre conjuração de magias e o capítulo 11 para conferir a lista de magias de mago.\n" + 
				"\tTruques: A partir do 1º nível, você conhece três truques à sua escolha da lista de magias de mago. Você aprende truques adicionais conforme avança de nível, como mostra a coluna Truques Conhecidos na tabela O Mago.\n" +
				"\tGrimório: No 1º nível, você possui um grimório contendo seis magias de mago de 1º nível, à sua escolha. Um grimório não contém truques.\n" +
				"\tO Seu Grimório: As magias que você pode adicionar em seu grimório, à medida que sobe de nível, refletem suas próprias pesquisas arcanas, conduzidas à sua maneira, bem como as suas descobertas sobre a natureza do multiverso. Você pode encontrar outras magias durante suas aventuras, como um feitiço escrito em um pergaminho que estava no baú de um mago maligno, por exemplo, ou em um tomo empoeirado de uma biblioteca antiga.\n" + 
				"\tCopiar uma Magia para o Grimório. Quando você encontrar uma magia de mago de 1° nível ou superior, você pode adicioná-la em seu grimório, desde que seja de um nível que você possua espaços de magia, além de dispor de tempo para decifrá-la e copiá-la. A magia copiada deve ser de um nível de magia que o mago possa preparar. Copiar uma magia para seu grimório envolve reproduzir suas formas básicas e então precisa decifrar a notação singular utilizada pelo mago que a escreveu. Você deve praticar a magia até entender os sons e gestos exigidos, para então transcrevê-la em seu grimório com sua própria notação. Para cada nível da magia a ser copiada, gasta-se 2 horas e 50 po. O custo representa os componentes materiais que você gasta para experimentar a magia até dominá-la, bem como as finas tintas utilizadas para escrevê-la. Uma vez gasto o tempo e o dinheiro, você pode preparar a magia copiada como as suas outras magias.\n" +
				"\tSubstituir o Grimório. Você pode copiar uma magia de seu grimório em outro livro – por exemplo, se você quiser fazer uma cópia reserva de seu grimório. O processo é igual ao de copiar uma nova magia em seu grimório, só que mais rápido e fácil, pois o mago entende suas próprias notações e sabe como conjurar a magia. Você precisa gastar somente 1 hora e 10 po para cada nível de magia copiada. Se perder o seu grimório, você pode usar o mesmo procedimento para transcrever suas magias preparadas em um novo grimório. Preencher o restante do grimório exigirá que você encontre novas magias, como normalmente se faz. Por essa razão, muitos magos mantêm seus grimórios reservas em lugares seguros.\n" +
				"\tA Aparência do Grimório. Seu grimório é uma compilação de magias, com sua própria decoração e anotações de rodapé. Pode ser um livro de couro simples e funcional, recebido como presente de seu mestre, ou um tomo finamente encadernado com bordas douradas que você encontrou em uma antiga biblioteca, ou mesmo um conjunto de folhas soltas amontoadas após você perder seu grimório anterior em um acidente.\n" +
				"\tPreparando e Conjurando Magias: A tabela O Mago mostra quantos espaços de magia você possui para conjurar suas magias de 1º nível e superiores. Para conjurar uma dessas magias, você precisa usar um espaço do nível da magia ou superior. Você recupera todos os espaços gastos quando termina um descanso longo. Você prepara uma lista de magias de mago que estarão disponíveis para serem conjuradas. Para tanto, você escolhe um número de magias de mago de seu grimório igual ao seu modificador de Inteligência + seu nível de mago (mínimo de uma magia). A magia precisa ser do mesmo nível que o espaço disponível para conjurá-la. Por exemplo, se você é um mago de 3º nível, você possui 4 espaços de magia de 1º nível e 2 espaços de magia de 2º nível. Com Inteligência 16, sua lista de magias preparadas pode incluir seis magias de 1º e 2º nível de seu grimório, em qualquer combinação. Se você preparar a magia de 1º nível mísseis mágicos, você poderá conjurá-la utilizando um espaço de 1º ou 2º nível de magia. Conjurar a magia não a remove de sua lista de magias preparadas. Você pode mudar sua lista de magias preparadas quando terminar um descanso longo. Preparar uma nova lista de magias de mago requer que você gaste um tempo estudando seu grimório e memorizando as palavras e gestos, para efetivamente conjurar a magia: ao menos 1 minuto por nível de magia para cada magia que você quiser preparar em sua lista.\n" +
				"\tHabilidade de Conjuração: Inteligência é a sua habilidade para você conjurar suas magias de mago, pois os magos aprendem novas magias através de estudo e memorização. Você usa sua Inteligência sempre que alguma magia se referir a sua habilidade de conjurar magias. Além disso, você usa o seu modificador de Inteligência para definir a CD dos testes de resistência para as magias de mago que você conjura e quando você realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + bônus de proficiência + seu modificador de Inteligência\n" +
				"\tModificador de ataque de magia = seu bônus de proficiência + seu modificador de Inteligência\n" +
				"\tConjuração de Ritual: Você pode conjurar qualquer magia de mago como um ritual se ela possuir o descritor ritual, desde que a possua em seu grimório. Você não precisa ter essa magia preparada.\n" +
				"\tFoco de Conjuração: Você pode usar um foco arcano (encontrado no capítulo 5) como foco de conjuração das suas magias de mago.\n" +
				"\tAprendendo Magias de 1º Nível ou Superior: A cada nível de mago adquirido, você pode adicionar duas magias de mago à sua escolha em seu grimório. Cada uma dessas magias deve ser de um nível que você possua espaços de magia, conforme mostra a tabela O Mago. Em suas aventuras, você pode encontrar outras magias e adicioná-las em seu grimório (consulte a caixa de texto \"O Seu Grimório\").\n\n", 1));
		super.habilidadesAdd(new Habilidade("Recuperação arcana", "\tVocê aprendeu como recuperar um pouco de sua energia mágica estudando seu grimório. Uma vez por dia, quando você terminar um descanso curto, você pode escolher espaços de magia gastos para recuperá-los. Os espaços gastos a serem recuperados podem ser de qualquer combinação de níveis de magia, desde que sejam iguais ou inferiores a metade de seu nível de mago (arredondado para cima) e nenhum deles seja de 6º ou superior.\n" +
				"\tPor exemplo, se você é um mago de 4º nível, você pode recuperar até 2 espaços de magia gastos. Você pode recuperar o espaço de uma magia de 2º nível ou os espaços de duas magias de 1º nível.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Tradição arcana", "\tQuando alcança o 2º nível, você pode escolher uma Tradição Arcana, moldando sua prática de magia em uma das oito escolas: Abjuração, Adivinhação, Conjuração, Encantamento, Evocação, Ilusão, Necromancia e Transmutação, todas detalhadas no fim da descrição da classe.\n" +
				"\tSua escolha confere características no 2º nível e de novo no 6º, 10º e 14º nível.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha, em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Dominar magia", "\tNo 18º nível, você alcança tamanha maestria em determinadas magias que pode conjurá-las à vontade. Você escolhe uma magia de mago de 1º nível e uma magia de mago de 2º nível de seu grimório. Você as conjura em seu nível mínimo, sem gastar espaços de magia quando as tiver preparadas. Caso queira, você pode conjurá-las com um espaço de nível superior, porém gastará espaços de magia, como normalmente se faz.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Assinatura mágica", "\tQuando alcançar o 20º nível, você adquire domínio completo de duas poderosas magias e pode conjurá-las sem muito esforço. Escolha duas magias de mago de 3º nível em seu grimório como sua assinatura mágica. Você sempre tem essas magias preparadas e elas não contam como magias preparadas em sua lista, além de você poder conjurar cada uma das magias escolhidas, uma vez ao dia, como magias de 3º nível, sem gastar nenhum espaço. Quando o fizer, você não poderá fazê-lo de novo antes de terminar um descanso curto ou longo.\n" +
				"\tSe você quiser conjurar essas magias com espaços de níveis superiores, a magia gastará espaços de magia, como normalmente se faz.\n\n", 20));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		// TODO Auto-generated method stub
		
	}

	public Caminho<Mago> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Mago> caminho) {
		this.caminho = caminho;
	}
	
	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
