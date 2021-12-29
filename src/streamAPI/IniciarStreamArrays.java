package streamAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IniciarStreamArrays {
		public static void main(String[] args) {
			Consumer <String> println = System.out::println;
			Consumer <Integer> printlnInteiros = System.out::println;
			
			String[] lista = {"item1", "item2", "item3","item4", "item5", "item6"};
			
			Stream.of(lista).forEach(println);
			
			Arrays.stream(lista).forEach(println);
			
			Arrays.stream(lista,0,3).forEach(println);;
			
			
		}
}
