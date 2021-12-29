package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;

public class IniciarReduceII {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(5,6,8,1,3,7,4,9,2);
		
		Integer reduzir1 = numeros.stream().reduce((m,n) -> m+n).get();
		
		System.out.println(reduzir1);
		
		List<Integer> numeros2 = Arrays.asList(2,3,7,1,7,7,4,8,2);
		
		Integer reduzir2 = numeros2.stream().reduce(reduzir1, (m,n) -> m+n);
		System.out.println(reduzir2);
		
		numeros2.stream().filter(m -> m>5).reduce((m,n) -> m+n).ifPresent(System.out::println);;
	}
}
