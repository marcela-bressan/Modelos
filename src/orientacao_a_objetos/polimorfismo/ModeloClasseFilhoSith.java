package orientacao_a_objetos.polimorfismo;

public class ModeloClasseFilhoSith extends ModeloClassePaiJogador implements PoderDaForca{

	protected ModeloClasseFilhoSith(String nome) {
		super(nome, 300, 20);

	}

	@Override
	public void usarOPoderDaForca(ModeloClassePaiJogador jogador) {
		
		for (int i =1; i<=10; i++) {
			this.atacarOponente(jogador);
		}
		
	}
	
	

}
