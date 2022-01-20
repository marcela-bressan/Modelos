package streamAPI.reduce;

public class IniciarReduceIV {
	public static void main(String[] args) {
		
		//exemplo 1
		ModeloMedia m1 = new ModeloMedia();	
		m1.adicionar(8.3);
		m1.adicionar(6.7);
		System.out.println("Exemplo 1: "+m1.getValor());
		
		//exemplo 2, encadeando.
		ModeloMedia m2 = new ModeloMedia().adicionar2(5.3).adicionar2(6.0 );
		System.out.println("Exemplo 2: "+m2.getValor());
		
		//exemplo 3, combinando media
		ModeloMedia mediaCombinada = new ModeloMedia();
		
		mediaCombinada = mediaCombinada.combinarValores(m1,m2);
		System.out.println("Media Combinada: "+mediaCombinada.getValor());
		
		//Usando  um método static
		System.out.println("Media Combinada: "+ModeloMedia.combinarValores(m1, m2).getValor());
		
		
		
	}
}
