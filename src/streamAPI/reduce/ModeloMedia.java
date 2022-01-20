package streamAPI.reduce;

public class ModeloMedia {
//Exercicio Reduce#IV
	
	private double total;
	private int quantidade;
	
	//exemplo 1
	public void adicionar(double valor) {
		total+=valor;
		quantidade++;	
	}
	
	//exemplo 2 preparar para encadear a chamada adicionando varias notas.
	public ModeloMedia adicionar2(double valor) {
		total+=valor;
		quantidade++;
		return this;
	}
	
	
	public double getValor() {
		return total/quantidade;
	}
	
	public static ModeloMedia combinarValores(ModeloMedia media1, ModeloMedia media2) {
		ModeloMedia mediaCombinada = new ModeloMedia();
		mediaCombinada.total = media1.total + media2.total;
		mediaCombinada.quantidade = media1.quantidade+media2.quantidade;
		return mediaCombinada;
	}
	
	
}
