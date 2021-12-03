package lambdas.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForeachMethodReference {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("item1","item2","item3", "item4","item5");
		
		lista.forEach(System.out::println);
		
		System.out.println(ForeachMethodReference.concatenar("\nEste é um teste para acrescentar "
				+ "exclamação no fim da frase"));
		
		System.out.println("\nTratando item por item");
		lista.forEach(ForeachMethodReference::concatenarItem);
	}
	

	static void concatenarItem (String item) {
		System.out.println(item.concat("!!!"));
	}
	
	
	static String concatenar(String frase) {
		return frase+"!!!";
	}
}
