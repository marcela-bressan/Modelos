package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IniciarStreamCollections {
	public static void main(String[] args) {
		Consumer <String> println = System.out::println;
		Consumer <String> print = System.out::print;
		
		List<String> lista = Arrays.asList("item1", "item2", "item3","item4", "item5", "item6");
		
		Stream stLista = lista.stream();
		
		stLista.forEach(println);
	
	}
}
