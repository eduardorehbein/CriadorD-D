package modelos.classes.caminhos.clerigo;

import classesAuxiliares.Magica;
import modelos.Habilidade;
import modelos.Personagem;
import modelos.classes.Clerigo;
import modelos.classes.caminhos.Caminho;
import templates.AddPorNomeTemplate;

public class DominioDaLuz implements Caminho<Clerigo>, Magica {
	@Override
	public String toString() {
		return "Domínio da Luz";
	}
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Truque adicional", "\tQuando você escolhe esse domínio no 1° nível, você ganha o truque luz se você ainda não o conhecia.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Labareda protetora", "\tTambém a partir do 1° nível, você pode interpor luz divina entre você e uma criatura atacante. Quando você for atacado por uma criatura a até 9 metros de você que você pode ver, você pode usar sua reação para impor desvantagem na jogada de ataque, causando labaredas de luz na frente do atacante antes dele atingir ou errar. Um atacante que não puder ser cegado é imune a essa característica.\n" +
				"\tVocê pode usar essa característica um número de vezes igual ao seu modificador de Sabedoria (mínimo uma vez). Você recupera todos os usos gastos após terminar um descanso longo.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: radiação do amanhecer", "\tA partir do 2° nível, você pode usar seu Canalizar Divindade para criar uma explosão de luz solar, banindo a escuridão e causando dano radiante aos inimigos.\n" +
				"\tCom uma ação, você ergue seu símbolo sagrado e qualquer escuridão mágica num raio de 9 metros de você é dissipada. Além disso, cada criatura hostil a até 9 metros deve realizar um teste de resistência de Constituição. Uma criatura sofre dano radiante igual a 2d10 + seu nível de clérigo se falhar no teste e metade desse dano caso seja bem sucedida. Uma criatura que tenha cobertura total contra você não é afetada.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Labareda aprimorada", "\tNo 6° nível, você também pode utilizar sua característica Labareda Protetora quando uma criatura que você possa ver a até 9 metros atacar outra criatura diferente de você.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Conjuração poderosa", "\tA partir do 8° nível, você adiciona seu modificador de Sabedoria no dano causado por qualquer truque de clérigo.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Coroa de luz", "\tA partir do 17° nível, você pode usar sua ação para ativar uma aura de luz solar que dura por 1 minuto ou até você dissipá-la usando outra ação. Você emite luz plena num raio de 18 metros e penumbra a até 9 metros além disso. Os seus inimigos na área de luz plena tem desvantagem nos testes de resistência contra suas magias que causam dano de fogo ou dano radiante.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}
	
	@Override
	public String getDescricao() {
		return "\tDeuses da luz – como Helm, Lathander, Pholtus, Branchala, a Chama Prateada, Belenus, Apolo e Re-Horakhty – promovem os ideias do renascimento e renovação, verdade, vigilância e beleza, muitas vezes usando o símbolo do sol. Alguns desses deuses são retratados como o próprio sol ou como um cocheiro que carrega o sol através do céu. Outros são sentinelas incansáveis cujos olhos penetram cada sombra e veem através de cada enganação. Alguns são divindades da beleza e arte que ensinam que a arte é o veículo para o aprimoramento da alma. Clérigos de um deus da luz são almas esclarecidas infundidas com radiação e o poder divino da visão do discernimento, conhecidos por afastar as mentiras e incineras a escuridão.\n";
	}
}
