package modelos.classes;

import modelos.Dados;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.caminhos.Caminho;

public class Barbaro extends Classe {
	private Caminho<Barbaro> caminho;

	@Override
	public String toString() {
		return "Bárbaro";
	}
	
	@Override
	protected void setTabela() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setEquipamentoInicial(Personagem personagem) {
		//Relacionar com as proficiencias da classe
	}

	@Override
	protected void setPvInicial(Personagem personagem) {
		personagem.setPv(12 + personagem.getModificadorConstituicao());
		if(personagem.getNivel() > 1) {
			for(int i = 2; i <= personagem.getNivel(); i++) {
				adicionaPvPorNivel(personagem);
			}
		}
	}

	@Override
	public void adicionaPvPorNivel(Personagem personagem) {
		personagem.setPv(personagem.getPv() + Dados.rolaD12() + personagem.getModificadorConstituicao());	
	}

	@Override
	protected void setHabilidades() {
		super.habilidadesAdd(new Habilidade("Fúria", "\tEm batalha, você luta com uma ferocidade primitiva. No seu turno, você pode entrar em fúria com uma ação bônus.\n" +
				"\tEnquanto estiver em fúria, você recebe os seguintes benefícios se você não estiver vestindo uma armadura pesada:\n" +
				"\t* Você tem vantagem em testes de Força e testes de resistência de Força\n" +
				"\t* Quando você desferir um ataque com arma corpo-a-corpo usando Força, você recebe um bônus nas jogadas de dano que aumenta à medida que você adquire níveis de bárbaro, como mostrado na coluna Dano de Fúria na tabela O Bárbaro.\n" +
				"\t* Você possui resistência contra dano de concussão, cortante e perfurante.\n" +
				"\tSe você for capaz de conjurar magias, você não poderá conjurá-las ou se concentrar nelas enquanto estiver em fúria.\n" +
				"\tSua fúria dura por 1 minuto. Ela termina prematuramente se você cair inconsciente ou se seu turno acabar e você não tiver atacado nenhuma criatura hostil desde seu último turno ou tiver sofrido dano nesse período. Você também pode terminar sua fúria no seu turno com uma ação bônus.\n" +
				"\tQuando você tiver usado a quantidade de fúrias mostrada para o seu nível de bárbaro na coluna Fúrias da tabela O Bárbaro, você precisará terminar um descanso longo antes de poder entrar em fúria novamente.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Defesa sem armadura", "\tQuando você não estiver vestindo qualquer armadura, sua Classe de Armadura será 10 + seu modificador de Destreza + seu modificador de Constituição. Você pode usar um escudo e continuar a receber esse benefício.\n\n", 1));
		super.habilidadesAdd(new Habilidade("Ataque descuidado", "\tA partir do 2° nível, você pode desistir de toda preocupação com sua defesa para atacar com um desespero feroz. Quando você fizer o seu primeiro ataque no turno, você pode decidir atacar descuidadamente. Fazer isso lhe concede vantagem nas jogadas de ataque com armas corpo-a-corpo usando Força durante seu turno, porém, as jogadas de ataques feitas contra você possuem vantagem até o início do seu próximo turno.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Sentido de perigo", "\tNo 2° nível, você adquire um sentido sobrenatural de quando as coisas próximas não estão como deveriam, concedendo a você uma chance maior quando estiver evitando perigos.\n" +
				"\tVocê possui vantagem em testes de resistência de Destreza contra efeitos que você possa ver, como armadilhas e magias. Para receber esse benefício você não pode estar cego, surdo ou incapacitado.\n\n", 2));
		super.habilidadesAdd(new Habilidade("Caminho primitivo", "\tNo 3° nível, você escolhe um caminho que molda a natureza da sua fúria. Escolha o Caminho do Furioso ou o Caminho do Guerreiro Totêmico, ambos detalhados no final da descrição de classe. Sua escolha lhe concederá características no 3° nível e novamente no 6°, 10° e 14° níveis.\n\n", 3));
		super.habilidadesAdd(new Habilidade("Incremento no valor de habilidade", "\tQuando você atinge o 4° nível e novamente no 8°, 12°, 16° e 19° nível, você pode aumentar um valor de habilidade, à sua escolha, em 2 ou você pode aumentar dois valores de habilidade, à sua escolha em 1. Como padrão, você não pode elevar um valor de habilidade acima de 20 com essa característica.\n\n", 4));
		super.habilidadesAdd(new Habilidade("Ataque extra", "\tA partir do 5° nível, você pode atacar duas vezes, ao invés de uma, sempre que você realizar a ação de Ataque no seu turno.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Movimento rápido", "\tComeçando no 5° nível, seu deslocamento aumenta em 3 metros enquanto você não estiver vestindo uma armadura pesada.\n\n", 5));
		super.habilidadesAdd(new Habilidade("Instinto Selvagem", "\tNo 7° nível, seu instinto está tão apurado que você recebe vantagem nas jogadas de iniciativa.\n" +
				"\tAlém disso, se você estiver surpreso no começo de um combate e não estiver incapacitado, você pode agir normalmente no seu primeiro turno, mas apenas se você entrar em fúria antes de realizar qualquer outra coisa neste turno.\n\n", 7));
		super.habilidadesAdd(new Habilidade("Crítico brutal", "\tA partir do 9° nível, você pode rolar um dado de dano de arma adicional quando estiver determinando o dano extra de um acerto crítico com uma arma corpo-a-corpo.\n" +
				"\tIsso aumenta para dois dados adicionais no 13° nível e três dados adicionais no 17° nível.\n\n", 9));
		super.habilidadesAdd(new Habilidade("Fúria implacavel", "\tA partir do 11° nível, sua fúria pode manter você lutando independente da gravidade dos seus ferimentos. Se você cair para 0 pontos de vida enquanto estiver em fúria e não morrer, você pode realizar um teste de resistência de Constituição CD 10. Se você for bem sucedido, você volta para 1 ponto de vida ao invés disso.\n" +
				"\tCada vez que você utilizar essa característica após a primeira, a CD aumenta em 5. Assim que você terminar um descanso curto ou longo a CD volta para 10.\n\n", 11));
		super.habilidadesAdd(new Habilidade("Fúria persistente", "\tA partir do 15° nível, sua fúria é tão brutal que ela só termina prematuramente se você cair inconsciente ou se você decidir terminá-la.\n\n", 15));
		super.habilidadesAdd(new Habilidade("Força indomável", "\tA partir do 18° nível, se o total de um teste de Força seu for menor que o seu valor de Força, você pode usar esse valor no lugar do resultado.\n\n", 18));
		super.habilidadesAdd(new Habilidade("Campeão primitivo", "\tNo 20° nível, você incorpora os poderes da natureza. Seus valores de Força e Constituição aumentam em 4. Seu máximo para esses valores agora é 24.\n\n", 20));
	}
	
	@Override
	protected void setRiquezaInicial(Personagem personagem) {
		Integer riqueza = (Dados.rolaD4() + Dados.rolaD4()) * 10;
		personagem.setRiqueza("po: " + riqueza.toString());
	}

	public Caminho<Barbaro> getCaminho() {
		return caminho;
	}

	public void setCaminho(Caminho<Barbaro> caminho) {
		this.caminho = caminho;
	}

	@Override
	public String getCaminhoDescricao() {
		return caminho.getDescricao();
	}
}
