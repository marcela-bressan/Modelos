package lambdas.interfaces.funcionais.java;

import java.util.function.UnaryOperator;

public class IniciarUnaryOperator {
	public static void main(String[] args) {
		 //Recebe um tipo e retorna o mesmo tipo
		//UnaryOperator<t> -> T
		
		UnaryOperator <Integer> maisDois = n -> n + 2;
		
		UnaryOperator <Integer> vezesDois = n -> n * 2;
		
		UnaryOperator <Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
}
