package streamAPI;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class IniciarGenerate {
	public static void main(String[] args) {
		Consumer<String> println = System.out::println;
		Consumer<Integer> printlnInt = System.out::println;
		
		Stream.generate(() -> "a").forEach(println);
		Stream.iterate(0,n -> n+2).forEach(printlnInt);;
	}
}
