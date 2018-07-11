package modelos.classes.caminhos.clerigo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Clerigo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class DominioDoConhecimento implements Caminho<Clerigo>, Magica {
	@Override
	public String toString() {
		return "Dom�nio do Conhecimento";
	}
	
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("B�n��os do conhecimento", "\tNo 1� n�vel, voc� aprende dois idiomas, � sua escolha. Voc� tamb�m se torna proficiente em duas per�cias, � sua escolha, dentre as seguintes: Arcanismo, Hist�ria, Natureza ou Religi�o.\n" +
				"\tSeu b�nus de profici�ncia � dobrado em qualquer teste de habilidade que voc� fizer usando qualquer dessas per�cias.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: conhecimento das eras", "\tA partir do 2� n�vel, voc� pode usar seu Canalizar Divindade para beber da fonte divina do conhecimento. Com uma a��o, voc� escolhe uma per�cia ou ferramenta. Por 10 minutos, voc� ter� profici�ncia com a per�cia ou ferramenta escolhida.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: ler pensamentos", "\tNo 6� n�vel, voc� pode usar seu Canalizar Divindade para ler a mente de uma criatura. Voc� pode, ent�o, usar seu acesso a mente da criatura para comand�-la.\n" +
				"\tCom uma a��o, escolha uma criatura que voc� possa ver que esteja a at� 18 metros de voc�. Essa criatura deve realizar um teste de resist�ncia de Sabedoria, se for bem sucedida nesse teste, voc� n�o poder� usar essa caracter�stica contra ela novamente at� terminar um descanso longo.\n" +
				"\tSe a criatura falhar no teste, voc� pode ler seus pensamentos superficiais (aqueles mais atuais, que refletem suas emo��es e no que voc� est� pensando constantemente) quando estiver a at� 18 metros de voc�. Esse efeito dura por 1 minuto.\n" +
				"\tDurante esse tempo, voc� pode usar sua a��o para terminar esse efeito e conjurar a magia sugest�o na criatura sem gastar um espa�o de magia. O alvo falha automaticamente no teste de resist�ncia contra essa magia.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Conjura��o poderosa", "\tA partir do 8� n�vel, voc� adiciona seu modificador de Sabedoria no dano causado por qualquer truque de cl�rigo.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Vis�es do passado", "\tA partir do 17� n�vel, voc� pode convocar vis�es do passado relacionadas a um objeto que voc� esteja segurando ou sobre o ambiente ao seu redor. Voc� gasta pelo menos 1 minuto meditando e rezando, ent�o, recebe on�ricos vislumbres turvos dos eventos recentes. Voc� pode meditar dessa maneira por um n�mero de minutos igual ao seu valor de Sabedoria e deve manter a concentra��o durante esse tempo, como se voc� estivesse conjurando uma magia.\n" +
				"\tQuando voc� usa essa caracter�stica, voc� n�o pode us�-la novamente at� terminar um descanso curto ou longo.\n" +
				"\tLeitura de Objeto: Ao segurar um objeto enquanto medita, voc� pode ter vis�es do dono anterior do objeto. Depois de meditar por 1 minuto, voc� descobre como o antigo dono adquiriu e perdeu o objeto, assim como o evento recente mais significativo envolvendo o objeto e seu dono. Se o objeto foi portado por outra criatura num passado recente (dentro de um n�mero de dias igual ao seu valor de Sabedoria), voc� pode gastar 1 minuto adicional, por cada dono, para descobrir as mesmas informa��es sobre essa criatura.\n" +
				"\tLeitura Local: � medida que voc� medita, voc� tem vis�es dos eventos recentes nas suas vizinhan�as pr�ximas (uma sala, rua, t�nel, clareira, ou similar, de at� 15 metros c�bicos), voltando um n�mero de dias igual ao seu valor de Sabedoria. Para cada minuto que voc� meditar, voc� descobre sobre um evento significativo, a partir dos mais recentes. Eventos significativos, normalmente envolvem emo��es fortes, como batalhas e trai��es, casamentos e assassinatos, nascimentos e funerais. No entanto, tamb�m podem incluir eventos mais mundanos, que podem ser, no entanto, relevantes na sua situa��o atual.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}

	@Override
	public String getDescricao() {
		return "\tOs deuses do conhecimento � como Oghma, Boccob, Gilean, Aureon e Thoth � valorizam o estudo e compreens�o acima de tudo. Alguns ensinam que o conhecimento deve ser coletado e partilhado em bibliotecas e universidades ou promovem o conhecimento pr�tico do artesanato e da inven��o. Algumas divindades escondem conhecimentos e os mantem em segredo para si mesmos. E outros prometem a seus seguidores que eles ganhar�o poderes tremendos se desvendarem os segredos do multiverso. Os seguidores desses deuses estudam conhecimento exot�rico, coletam tomos antigos, escavam locais secretos da terra e aprendem tudo que podem. Alguns deuses do conhecimento que promovem a pr�tica de of�cios e cria��o incluem deuses da forja como Gond, Reorx, Onatar, Moradin, Hefesto e Goibhniu.\n";
	}
}
