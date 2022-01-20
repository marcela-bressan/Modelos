package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class IniciarReduceI {
	public static void main(String[] args) {
		
		List<Double> notas = Arrays.asList(5.5,8.9,3.8,7.8,5.5,6.7,7.8,8.9,9.7);
		
		Double soma = notas.stream().reduce((m,n) -> m+n).get();
		Double media = soma/notas.size();
		
		Double soma2 = notas.stream().reduce(5.0, (m,n) -> m+n);
		Double media2 = soma2/notas.size();
		
		System.out.printf("Média: %.1f",media);
		System.out.printf("\nMédia 2: %.1f",media2);
		
		
	}
}
