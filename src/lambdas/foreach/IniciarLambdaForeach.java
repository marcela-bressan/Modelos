package lambdas.foreach;

import java.util.Arrays;
import java.util.List;

public class IniciarLambdaForeach {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("item1","item2","item3", "item4","item5");
		
		lista.forEach(item -> System.out.println(item));
		
		lista.forEach(item -> System.out.println(concatenar(item)));
		
		
	}
	
	static String concatenar(String item) {
		return item+"!!!";
	}
}
