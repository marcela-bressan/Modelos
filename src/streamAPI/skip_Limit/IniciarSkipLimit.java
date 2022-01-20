package streamAPI.skip_Limit;

import java.util.Arrays;
import java.util.List;

import streamAPI.reduce.ModeloAluno;

public class IniciarSkipLimit {
	public static void main(String[] args) {
		ModeloAluno a1 = new ModeloAluno("Ana",7.1);
		ModeloAluno a2 = new ModeloAluno("Luna",8.1);
		ModeloAluno a3 = new ModeloAluno("Gui",8.1);
		ModeloAluno a4 = new ModeloAluno("Gabi",10.0);
		ModeloAluno a5 = new ModeloAluno("Ana",7.1);
		ModeloAluno a6 = new ModeloAluno("Pedro",8.1);
		ModeloAluno a7 = new ModeloAluno("Gui",8.1);
		ModeloAluno a8 = new ModeloAluno("Maria",10.0);
		
		List <ModeloAluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		alunos.stream()
			.skip(2) //pula os dois primeiros
			.limit(4) //mostra no máximo 4
			.forEach(System.out::println);
	}
}
