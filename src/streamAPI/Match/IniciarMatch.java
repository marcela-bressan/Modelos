package streamAPI.Match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import streamAPI.reduce.ModeloAluno;

public class IniciarMatch {
	public static void main(String[] args) {
		ModeloAluno a1 = new ModeloAluno("Ana",7.1);
		ModeloAluno a2 = new ModeloAluno("Luna",8.1);
		ModeloAluno a3 = new ModeloAluno("Gui",8.1);
		ModeloAluno a4 = new ModeloAluno("Gabi",10.0);
		
		List <ModeloAluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<ModeloAluno> aprovado = a -> a.nota >= 7;
		Predicate<ModeloAluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
		
	}
}
