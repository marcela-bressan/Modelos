package streamAPI.takewhile;

import java.util.Arrays;
import java.util.List;

import streamAPI.reduce.ModeloAluno;

public class IniciarTakeWhile {
	public static void main(String[] args) {
		ModeloAluno a1 = new ModeloAluno("Ana",10.0);
		ModeloAluno a2 = new ModeloAluno("Luna",8.1);
		ModeloAluno a3 = new ModeloAluno("Gui",8.1);
		ModeloAluno a4 = new ModeloAluno("Gabi",1.0);
		ModeloAluno a5 = new ModeloAluno("Ana",7.1);
		ModeloAluno a6 = new ModeloAluno("Pedro",8.1);
		ModeloAluno a7 = new ModeloAluno("Gui",8.1);
		ModeloAluno a8 = new ModeloAluno("Maria",7.0);
		
		List <ModeloAluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		alunos.stream().distinct()
			.takeWhile(a -> a.nota >7.0)//apenas notas maiores que 7
			.forEach(System.out::println);
	}
}
