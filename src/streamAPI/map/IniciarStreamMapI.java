package streamAPI.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
/*
 * transormar valores atraves de umas função
 * Não muda de tamanho  
 * */
public class IniciarStreamMapI {
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("item1","item2","item3","item4");
		lista.stream().map(i -> i.toUpperCase()).forEach(System.out::println);
		
		Consumer<? super Integer> print = System.out::println;
		Consumer<String> println = System.out::println;
		
		lista.stream().map(i -> i.toUpperCase()).forEach(println);
		
		UnaryOperator<String> maiuscula = i -> i.toUpperCase();
		UnaryOperator<String> minuscula = i -> i.toLowerCase();
		
		Stream<String> st = lista.stream();
		
		//composicao
		st.map(maiuscula).forEach(println);	
		st.map(minuscula).forEach(println);
		st.map(n -> n.length()).forEach(print);

	}
}
