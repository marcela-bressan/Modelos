package lambdas.interfaces.funcionais.java;

import java.util.function.Function;

public class IniciarFunction {
	public static void main(String[] args) {
		//Recebe um tipo e retorna outro
		//Fucntion <S> -> T
		
		Function<Integer,String> parOuImpar = numero -> numero % 2 == 0 ? "Par": "Impar";
		System.out.println(parOuImpar.apply(33));
		System.out.println(parOuImpar.apply(32));
		
		
		Function <String, String> oResultadoE = valor -> "O resultado é: "+valor;
		
		Function <String,String> empolgado = valor -> valor +"!!!";
		
		Function <String,String> duvida = valor -> valor +"???";
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
		
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(32);
		
		System.out.println(resultadoFinal2);
		
	}
}
