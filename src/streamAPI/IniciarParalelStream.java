package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IniciarParalelStream {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<String> println = System.out::println;
		
		
		List<String> lista = Arrays.asList("item1", "item2", "item3","item4", "item5", "item6");
		
		Stream stLista = lista.parallelStream();
		
		stLista.forEach(println);
	}
}
