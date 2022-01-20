package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class InciarStreamFilter {
	public static void main(String[] args) {
	
		List<Integer> lista = Arrays.asList(1,2,3,4);
		Consumer<Integer> println = System.out::println;
		Stream st_lista = lista.stream();
		
		st_lista.filter(i -> i.hashCode() >=1).forEach(println);
		
		st_lista.map(i -> i.equals(3));
		
		//st_lista.reduce(0, (x,y) -> x+y);
		
		
		
		
		
		
	}
}
