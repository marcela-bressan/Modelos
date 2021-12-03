package lambdas.interfaces;

public class Iniciar {
	public static void main(String[] args) {
		
		
		ModeloI calcular = (x,y) -> x+y;	//'+'
		System.out.println("SOMA: "+calcular.executar(5, 2));
		
		calcular = (x,y) -> x-y;//'-'
		System.out.println("SUBTRAÇÃO: "+calcular.executar(5, 2));
		
		calcular = (x,y) -> x*y;//*
		System.out.println("MULTIPLICAÇÃO: "+calcular.executar(5, 2));
		
		calcular = (x,y) -> x/y;// '/' 
		System.out.println("DIVISÃO: "+calcular.executar(5, 2));
		
		
		
		ModeloII concatenar = (a , b) -> {
			String frase = a+", o meu nome é "+b+"!!!"; 
			return frase; 
		};
		
		System.out.println(concatenar.executar("\nBom dia", "Marcela"));
	}
}
