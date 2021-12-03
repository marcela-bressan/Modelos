package lambdas.interfaces.funcionais;


@FunctionalInterface
public interface ModeloII {
	String concatenar (String a, String b); //Apenas um método abstrato
	
	//tolera métodos Defautl
	default String testandoMetodoDefault() {
		return "O método default funciona! E chama "+concatenar("Olá, Mundo"," pelo default!");
	}
	
	//tolera métodos staticos
	static String testandoMetodoStatic() {
		return "O método static funciona! ";
	}
}
