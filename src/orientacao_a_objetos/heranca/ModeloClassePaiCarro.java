package orientacao_a_objetos.heranca;

public class ModeloClassePaiCarro {
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 0;
	
	public ModeloClassePaiCarro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar(){
		if (velocidadeAtual>=0 && velocidadeAtual<180){
			velocidadeAtual += 5;
		}else if(velocidadeAtual>180) {
			velocidadeAtual = 180;
		}
	}
	
	public void frear() {
		if (velocidadeAtual<=0) {
			velocidadeAtual = 0;
		}else if (velocidadeAtual<180 ) {
			velocidadeAtual -= 5; 
		}
	}
	
	public String velocimetro() {
		return "| ATUAL: "+ this.velocidadeAtual+" km/h | MÁXIMA: "+this.VELOCIDADE_MAXIMA+" km/h |";
	}
}
