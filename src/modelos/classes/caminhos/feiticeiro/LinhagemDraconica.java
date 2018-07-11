package modelos.classes.caminhos.feiticeiro;

import modelos.Habilidade;
import modelos.classes.Feiticeiro;
import modelos.classes.caminhos.Caminho;

public class LinhagemDraconica implements Caminho<Feiticeiro> {
	@Override
	public String toString() {
		return "Linhagem Drac�nica";
	}
	
	@Override
	public void setHabilidades(Feiticeiro classe) {
		classe.habilidadesAdd(new Habilidade("Ancestral drac�nico", "\tNo 1� n�vel, voc� escolhe um tipo de drag�o como seu ancestral. O tipo de dano associado a cada drag�o ser� usado por caracter�sticas que voc� ganhar� posteriormente.\n" +
				"\tDrag�o	-	Tipo de Dano\n" +
				"\tAzul		-	El�trico\n" +
				"\tBranco	-	Frio\n" +
				"\tBronze	-	El�trico\n" +
				"\tCobre	-	Acido\n" +
				"\tLat�o	-	Fogo\n" +
				"\tNegro	-	Acido\n" +
				"\tOuro		-	Fogo\n" +
				"\tPrata	-	Frio\n" +
				"\tVerde	-	Veneno\n" +
				"\tVermelho	-	Fogo\n" +
				"\tVoc� pode falar, ler e escrever em Drac�nico. Al�m disso, sempre que voc� fizer um teste de Carisma quando estiver interagindo com drag�es, seu b�nus de profici�ncia ser� dobrado se ele se aplicar a esse teste.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Resili�ncia drac�nica", "\tA medida que a magia flui pelo seu corpo, ela faz com que os tra�os f�sicos do seu ancestral drac�nico surjam. No 1� n�vel, seu m�ximo de pontos de vida aumenta em 1 e aumenta em mais 1 sempre que voc� ganhar um n�vel na classe.\n" +
				"\tAl�m disso, partes da sua pele s�o cobertas com min�sculas escamas lustrosas de drag�o. Quando voc� n�o estiver utilizando armadura, sua CA ser� igual a 13 + seu modificador de Destreza.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Afinidade elemental", "\tA partir do 6� n�vel, quando voc� conjurar uma magia que cause dano do tipo associado ao seu ancestral drac�nico, adicione seu modificador de Carisma ao dano. Ao mesmo tempo, voc� pode gastar 1 ponto de feiti�aria para ganhar resist�ncia a esse tipo de dano por 1 hora. O b�nus de dano se aplica a uma �nica rolagem de dano da magia, n�o � diversas rolagens.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Asas de drag�o", "\tNo 14� n�vel, voc� adquire a habilidade de brotar um par de asas de drag�o das suas costas, ganhando deslocamento de voo igual ao seu deslocamento atual. Voc� pode criar essas asas com uma a��o b�nus, no seu turno. Elas duram at� que voc� as dissipe, com uma a��o b�nus no seu turno.\n" +
				"\tVoc� n�o pode manifestar suas asas quando estiver vestindo uma armadura, a n�o ser que a armadura seja feita para acomod�-las, e roupas que n�o forem feitas para se acomodar �s suas asas devem ser destru�das quando voc� manifest�-las.\n\n", 14));
		classe.habilidadesAdd(new Habilidade("Presen�a drac�nica", "\tA partir do 18� n�vel, voc� pode canalizar a assustadora presen�a do seu ancestral drac�nico, fazendo com que aqueles que o rodeiam fiquem impressionados ou amedrontados. Com uma a��o, voc� pode gastar 5 pontos de feiti�aria para recorrer a esse poder e exalar uma aura de admira��o ou medo (� sua escolha) a uma dist�ncia de 18 metros. Por 1 minuto ou at� voc� perder sua concentra��o (como se voc� tivesse conjurado uma magia de concentra��o), cada criatura hostil que come�ar seu turno nessa aura, deve ser bem sucedido num teste de resist�ncia de Sabedoria ou ficar� enfeiti�ada (se voc� escolheu admira��o) ou amedrontada (se voc� escolheu medo) at� a aura terminar. Uma criatura que seja bem sucedida no teste de resist�ncia ficar� imune a sua aura por 24 horas.\n\n", 18));
	}

	@Override
	public String getDescricao() {
		return "\tSua magia inata vem de magia drac�nica que foi misturada ao seu sangue ou ao sangue dos seus ancestrais. Geralmente, os feiticeiros com essa origem tra�am sua descend�ncia de poderosos feiticeiros da antiguidade que fizeram uma barganha com um drag�o ou que tenham um drag�o como parente. Algumas dessas linhagens est�o bem definidas no mundo, mas a maioria � obscura. Qualquer feiticeiro pode ser o primeiro de uma nova linhagem, como resultado de um pacto ou de outra circunst�ncia excepcional.\n";
	}
}