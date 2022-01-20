package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceV {
	public static void main(String[] args) {
		
		ModeloAluno a1 = new ModeloAluno("Ana",7.1);
		ModeloAluno a2 = new ModeloAluno("Luna",6.1);
		ModeloAluno a3 = new ModeloAluno("Gui",8.1);
		ModeloAluno a4 = new ModeloAluno("Gabi",10.0);
		
		List <ModeloAluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<ModeloAluno> aprovado = a -> a.nota >= 7;
		Function <ModeloAluno, Double> apenasNota = a -> a.nota;
		BiFunction<ModeloMedia, Double, ModeloMedia> 
		calcularMedia = (media, nota) -> media.adicionar2(nota);
		
		BinaryOperator<ModeloMedia> combinarMedia = (m1, m2) -> ModeloMedia.combinarValores(m1, m2);
	
		ModeloMedia media = alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(new ModeloMedia(), calcularMedia, combinarMedia);
		
		System.out.println("A média da turma é "+media.getValor());
	}
}
