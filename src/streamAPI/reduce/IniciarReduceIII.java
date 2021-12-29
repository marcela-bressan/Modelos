package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class IniciarReduceIII {
	public static void main(String[] args) {
		ModeloAluno a1 = new ModeloAluno("Ana",7.1);
		ModeloAluno a2 = new ModeloAluno("Luna",6.1);
		ModeloAluno a3 = new ModeloAluno("Gui",8.1);
		ModeloAluno a4 = new ModeloAluno("Gabi",10);
		
		
		List<ModeloAluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<ModeloAluno> aprovado = n -> n.nota>=7;
		Function<ModeloAluno, Double> nota= n -> n.nota;
		BinaryOperator<Double> somatorio =  (n,s) -> n+s;
		
		//filter map reduce
		
		
		alunos.parallelStream().filter(aprovado).map(nota).reduce(somatorio).ifPresent(System.out::println);
		
		
	}
}
