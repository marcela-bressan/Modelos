package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * BUILT OPERATOR
 * INTERMEDIARIA OPERATOR
 * TERMINAL OPERATOR
 * 
 * SEQUENCIA ORDENADA - STREAM
 * SEQUENCIA NÃO OREDENADA - PARAREL STREAM
 * */

public class IniciarStream {
	public static void main(String[] args) {
			
		System.out.println("Stream -->  .stream() |forEach | Method Reference");
		
		List<String> lista = Arrays.asList("item1","item2","item3","item4");
		Stream<String> stLista = lista.stream();		
		stLista.forEach(System.out::println);
	
		
	}
}
