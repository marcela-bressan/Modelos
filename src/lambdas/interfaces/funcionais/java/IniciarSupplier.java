package lambdas.interfaces.funcionais.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class IniciarSupplier {
	public static void main(String[] args) {
		// Recebe nada  e retorna algum tipo
		//Supplier <> -> T
		
		Supplier< List<String>> umaLista = 
				() -> Arrays.asList("Ana","Bia","Lia","Gui");
				
		System.out.println(umaLista.get());
		
	}
}
