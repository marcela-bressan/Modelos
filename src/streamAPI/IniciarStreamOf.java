package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IniciarStreamOf {
	public static void main(String[] args) {
		
		System.out.println("Stream  OF");
		Consumer <String> println = System.out::println;
	
		Stream <String> lista = Stream.of("item1", "item2", "item3 \n");
		lista.forEach(println);

	}
}
