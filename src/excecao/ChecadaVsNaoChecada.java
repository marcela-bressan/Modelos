package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		geraErro1();
		geraErro2();
		System.out.println("fim :)");	
	}
	
	
	public static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal @01!");
	}
	
	public static void geraErro2() {
		throw new RuntimeException("Ocorreu um erro bem legal @03!");
	}
	
}
