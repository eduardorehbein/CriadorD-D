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
	protected void setTabela() {}

	@Override
	public void setEquipamentoInicial(Personagem personagem) {}

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
		//TODO: Extrair strings para um XML
		super.habilidadesAdd(new Habilidade("Conjura��o", "\tComo um estudante da magia arcana, voc� possui um livro de magias (ou grim�rio) que revela os primeiros vislumbres de seu verdadeiro poder. Consulte o cap�tulo 10 para as regras gerais sobre conjura��o de magias e o cap�tulo 11 para conferir a lista de magias de mago.\n" + 
				"\tTruques: A partir do 1� n�vel, voc� conhece tr�s truques � sua escolha da lista de magias de mago. Voc� aprende truques adicionais conforme avan�a de n�vel, como mostra a coluna Truques Conhecidos na tabela O Mago.\n" +
				"\tGrim�rio: No 1� n�vel, voc� possui um grim�rio contendo seis magias de mago de 1� n�vel, � sua escolha. Um grim�rio n�o cont�m truques.\n" +
				"\tO Seu Grim�rio: As magias que voc� pode adicionar em seu grim�rio, � medida que sobe de n�vel, refletem suas pr�prias pesquisas arcanas, conduzidas � sua maneira, bem como as suas descobertas sobre a natureza do multiverso. Voc� pode encontrar outras magias durante suas aventuras, como um feiti�o escrito em um pergaminho que estava no ba� de um mago maligno, por exemplo, ou em um tomo empoeirado de uma biblioteca antiga.\n" + 
				"\tCopiar uma Magia para o Grim�rio. Quando voc� encontrar uma magia de mago de 1� n�vel ou superior, voc� pode adicion�-la em seu grim�rio, desde que seja de um n�vel que voc� possua espa�os de magia, al�m de dispor de tempo para decifr�-la e copi�-la. A magia copiada deve ser de um n�vel de magia que o mago possa preparar. Copiar uma magia para seu grim�rio envolve reproduzir suas formas b�sicas e ent�o precisa decifrar a nota��o singular utilizada pelo mago que a escreveu. Voc� deve praticar a magia at� entender os sons e gestos exigidos, para ent�o transcrev�-la em seu grim�rio com sua pr�pria nota��o. Para cada n�vel da magia a ser copiada, gasta-se 2 horas e 50 po. O custo representa os componentes materiais que voc� gasta para experimentar a magia at� domin�-la, bem como as finas tintas utilizadas para escrev�-la. Uma vez gasto o tempo e o dinheiro, voc� pode preparar a magia copiada como as suas outras magias.\n" +
				"\tSubstituir o Grim�rio. Voc� pode copiar uma magia de seu grim�rio em outro livro � por exemplo, se voc� quiser fazer uma c�pia reserva de seu grim�rio. O processo � igual ao de copiar uma nova magia em seu grim�rio, s� que mais r�pido e f�cil, pois o mago entende suas pr�prias nota��es e sabe como conjurar a magia. Voc� precisa gastar somente 1 hora e 10 po para cada n�vel de magia copiada. Se perder o seu grim�rio, voc� pode usar o mesmo procedimento para transcrever suas magias preparadas em um novo grim�rio. Preencher o restante do grim�rio exigir� que voc� encontre novas magias, como normalmente se faz. Por essa raz�o, muitos magos mant�m seus grim�rios reservas em lugares seguros.\n" +
				"\tA Apar�ncia do Grim�rio. Seu grim�rio � uma compila��o de magias, com sua pr�pria decora��o e anota��es de rodap�. Pode ser um livro de couro simples e funcional, recebido como presente de seu mestre, ou um tomo finamente encadernado com bordas douradas que voc� encontrou em uma antiga biblioteca, ou mesmo um conjunto de folhas soltas amontoadas ap�s voc� perder seu grim�rio anterior em um acidente.\n" +
				"\tPreparando e Conjurando Magias: A tabela O Mago mostra quantos espa�os de magia voc� possui para conjurar suas magias de 1� n�vel e superiores. Para conjurar uma dessas magias, voc� precisa usar um espa�o do n�vel da magia ou superior. Voc� recupera todos os espa�os gastos quando termina um descanso longo. Voc� prepara uma lista de magias de mago que estar�o dispon�veis para serem conjuradas. Para tanto, voc� escolhe um n�mero de magias de mago de seu grim�rio igual ao seu modificador de Intelig�ncia + seu n�vel de mago (m�nimo de uma magia). A magia precisa ser do mesmo n�vel que o espa�o dispon�vel para conjur�-la. Por exemplo, se voc� � um mago de 3� n�vel, voc� possui 4 espa�os de magia de 1� n�vel e 2 espa�os de magia de 2� n�vel. Com Intelig�ncia 16, sua lista de magias preparadas pode incluir seis magias de 1� e 2� n�vel de seu grim�rio, em qualquer combina��o. Se voc� preparar a magia de 1� n�vel m�sseis m�gicos, voc� poder� conjur�-la utilizando um espa�o de 1� ou 2� n�vel de magia. Conjurar a magia n�o a remove de sua lista de magias preparadas. Voc� pode mudar sua lista de magias preparadas quando terminar um descanso longo. Preparar uma nova lista de magias de mago requer que voc� gaste um tempo estudando seu grim�rio e memorizando as palavras e gestos, para efetivamente conjurar a magia: ao menos 1 minuto por n�vel de magia para cada magia que voc� quiser preparar em sua lista.\n" +
				"\tHabilidade de Conjura��o: Intelig�ncia � a sua habilidade para voc� conjurar suas magias de mago, pois os magos aprendem novas magias atrav�s de estudo e memoriza��o. Voc� usa sua Intelig�ncia sempre que alguma magia se referir a sua habilidade de conjurar magias. Al�m disso, voc� usa o seu modificador de Intelig�ncia para definir a CD dos testes de resist�ncia para as magias de mago que voc� conjura e quando voc� realiza uma jogada de ataque com uma magia.\n" +
				"\tCD para suas magias = 8 + b�nus de profici�ncia + seu modificador de Intelig�ncia\n" +
				"\tModificador de ataque de magia = seu b�nus de profici�ncia + seu modificador de Intelig�ncia\n" +
				"\tConjura��o de Ritual: Voc� pode conjurar qualquer magia de mago como um ritual se ela possuir o descritor ritual, desde que a possua em seu grim�rio. Voc� n�o precisa ter essa magia preparada.\n" +
				"\tFoco de Conjura��o: Voc� pode usar um foco arcano (encontrado no cap�tulo 5) como foco de conjura��o das suas magias de mago.\n" +
				"\tAprendendo Magias de 1� N�vel ou Superior: A cada n�vel de mago adquirido, voc� pode adicionar duas magias de mago � sua escolha em seu grim�rio. Cada uma dessas magias deve ser de um n�vel que voc� possua espa�os de magia, conforme mostra a tabela O Mago. Em suas aventuras, voc� pode encontrar outras magias e adicion�-las em seu grim�rio (consulte a caixa de texto \"O Seu Grim�rio\").\n\n", 1));
		super.habilidadesAdd(new Habilidade("Recupera��o arcana", "\tVoc� aprendeu como recuperar um pouco de sua energia m�gica estudando seu grim�rio. Uma vez por dia, quando voc� terminar um descanso curto, voc� pode escolher espa�os de magia gastos para recuper�-los. Os espa�os gastos a serem recuperados podem ser de qualquer combina��o de n�veis de magia, desde que sejam iguais ou inferiores a metade de seu n�vel de mago (arredondado para cima) e nenhum deles seja de 6� ou superior.\n" +
				"\tPor exemplo, se voc� � um mago de 4� n�vel, voc� pode recuperar at� 2 espa�os de magia gastos. Voc� pode recuperar o espa�o de uma magia de 2� n�vel ou os espa�os de duas magias de 1� n�vel.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Tradi��o arcana", "\tQuando alcan�a o 2� n�vel, voc� pode escolher uma Tradi��o Arcana, moldando sua pr�tica de magia em uma das oito escolas: Abjura��o, Adivinha��o, Conjura��o, Encantamento, Evoca��o, Ilus�o, Necromancia e Transmuta��o, todas detalhadas no fim da descri��o da classe.\n" +
				"\tSua escolha confere caracter�sticas no 2� n�vel e de novo no 6�, 10� e 14� n�vel.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16� e 19� n�vel, voc� pode aumentar um valor de habilidade, � sua escolha, em 2 ou voc� pode aumentar dois valores de habilidade, � sua escolha, em 1. Como padr�o, voc� n�o pode elevar um valor de habilidade acima de 20 com essa caracter�stica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Dominar magia", "\tNo 18� n�vel, voc� alcan�a tamanha maestria em determinadas magias que pode conjur�-las � vontade. Voc� escolhe uma magia de mago de 1� n�vel e uma magia de mago de 2� n�vel de seu grim�rio. Voc� as conjura em seu n�vel m�nimo, sem gastar espa�os de magia quando as tiver preparadas. Caso queira, voc� pode conjur�-las com um espa�o de n�vel superior, por�m gastar� espa�os de magia, como normalmente se faz.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Assinatura m�gica", "\tQuando alcan�ar o 20� n�vel, voc� adquire dom�nio completo de duas poderosas magias e pode conjur�-las sem muito esfor�o. Escolha duas magias de mago de 3� n�vel em seu grim�rio como sua assinatura m�gica. Voc� sempre tem essas magias preparadas e elas n�o contam como magias preparadas em sua lista, al�m de voc� poder conjurar cada uma das magias escolhidas, uma vez ao dia, como magias de 3� n�vel, sem gastar nenhum espa�o. Quando o fizer, voc� n�o poder� faz�-lo de novo antes de terminar um descanso curto ou longo.\n" +
				"\tSe voc� quiser conjurar essas magias com espa�os de n�veis superiores, a magia gastar� espa�os de magia, como normalmente se faz.\n\n", 20));
	}

	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {}

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
