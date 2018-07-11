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
		return "Dom�nio da Luz";
	}
	@Override
	public void setHabilidades(Clerigo classe) {
		classe.habilidadesAdd(new Habilidade("Truque adicional", "\tQuando voc� escolhe esse dom�nio no 1� n�vel, voc� ganha o truque luz se voc� ainda n�o o conhecia.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Labareda protetora", "\tTamb�m a partir do 1� n�vel, voc� pode interpor luz divina entre voc� e uma criatura atacante. Quando voc� for atacado por uma criatura a at� 9 metros de voc� que voc� pode ver, voc� pode usar sua rea��o para impor desvantagem na jogada de ataque, causando labaredas de luz na frente do atacante antes dele atingir ou errar. Um atacante que n�o puder ser cegado � imune a essa caracter�stica.\n" +
				"\tVoc� pode usar essa caracter�stica um n�mero de vezes igual ao seu modificador de Sabedoria (m�nimo uma vez). Voc� recupera todos os usos gastos ap�s terminar um descanso longo.\n\n", 1));
		classe.habilidadesAdd(new Habilidade("Canalizar divindade: radia��o do amanhecer", "\tA partir do 2� n�vel, voc� pode usar seu Canalizar Divindade para criar uma explos�o de luz solar, banindo a escurid�o e causando dano radiante aos inimigos.\n" +
				"\tCom uma a��o, voc� ergue seu s�mbolo sagrado e qualquer escurid�o m�gica num raio de 9 metros de voc� � dissipada. Al�m disso, cada criatura hostil a at� 9 metros deve realizar um teste de resist�ncia de Constitui��o. Uma criatura sofre dano radiante igual a 2d10 + seu n�vel de cl�rigo se falhar no teste e metade desse dano caso seja bem sucedida. Uma criatura que tenha cobertura total contra voc� n�o � afetada.\n\n", 2));
		classe.habilidadesAdd(new Habilidade("Labareda aprimorada", "\tNo 6� n�vel, voc� tamb�m pode utilizar sua caracter�stica Labareda Protetora quando uma criatura que voc� possa ver a at� 9 metros atacar outra criatura diferente de voc�.\n\n", 6));
		classe.habilidadesAdd(new Habilidade("Conjura��o poderosa", "\tA partir do 8� n�vel, voc� adiciona seu modificador de Sabedoria no dano causado por qualquer truque de cl�rigo.\n\n", 8));
		classe.habilidadesAdd(new Habilidade("Coroa de luz", "\tA partir do 17� n�vel, voc� pode usar sua a��o para ativar uma aura de luz solar que dura por 1 minuto ou at� voc� dissip�-la usando outra a��o. Voc� emite luz plena num raio de 18 metros e penumbra a at� 9 metros al�m disso. Os seus inimigos na �rea de luz plena tem desvantagem nos testes de resist�ncia contra suas magias que causam dano de fogo ou dano radiante.\n\n", 17));
	}

	@Override
	public void addMagiasAoBau(Personagem personagem) {
		String[] nomes = {"Sono"};
		new AddPorNomeTemplate().add(nomes, personagem);
	}
	
	@Override
	public String getDescricao() {
		return "\tDeuses da luz � como Helm, Lathander, Pholtus, Branchala, a Chama Prateada, Belenus, Apolo e Re-Horakhty � promovem os ideias do renascimento e renova��o, verdade, vigil�ncia e beleza, muitas vezes usando o s�mbolo do sol. Alguns desses deuses s�o retratados como o pr�prio sol ou como um cocheiro que carrega o sol atrav�s do c�u. Outros s�o sentinelas incans�veis cujos olhos penetram cada sombra e veem atrav�s de cada engana��o. Alguns s�o divindades da beleza e arte que ensinam que a arte � o ve�culo para o aprimoramento da alma. Cl�rigos de um deus da luz s�o almas esclarecidas infundidas com radia��o e o poder divino da vis�o do discernimento, conhecidos por afastar as mentiras e incineras a escurid�o.\n";
	}
}
