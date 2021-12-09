package orientacao_a_objetos.polimorfismo;

public class ModeloClasseFilhoJedi extends ModeloClassePaiJogador implements PoderDaForca, PoderDeRevigoracao{

	protected ModeloClasseFilhoJedi(String nome) {
		super(nome, 300, 20);
	}

	@Override
	public void usarOPoderDaForca(ModeloClassePaiJogador jogadorOponente) {	
		for(int i = 1; i<=10 ; i++) {
			this.atacarOponente(jogadorOponente);
		}
	}

	@Override
	public void revigorar() {
		this.resistencia = 300;
	}

}
