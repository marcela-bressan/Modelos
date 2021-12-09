package orientacao_a_objetos.polimorfismo;

public abstract class ModeloClassePaiJogador {
	int resistencia;
	int forca;
	String nome;
	
	protected ModeloClassePaiJogador(String nome, int resistencia, int forca){
		this.nome = nome;
		this.resistencia = resistencia;
		this.forca = forca;	
	}
	
	
	public void atacarOponente(ModeloClassePaiJogador jogadorOponente) {
		jogadorOponente.resistencia -= this.forca; 
	}
	
	public String verTabela() {		
		
		if (this.resistencia <= 0) {
			return "| NOME: "+this.nome+" | RESISTÊNCIA: MORTE | FORÇA: 0 |";
		}
		return "| NOME: "+this.nome+" | RESISTÊNCIA: "+this.resistencia+" | FORÇA: "+this.forca+" |"; 
	}
		
	
}
