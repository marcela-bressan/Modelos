package streamAPI.MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import streamAPI.reduce.ModeloAluno;

public class IniciarMinMax {
	
	public static void main(String[] args) {
		ModeloAluno a1 = new ModeloAluno("Ana",7.1);
		ModeloAluno a2 = new ModeloAluno("Luna",6.1);
		ModeloAluno a3 = new ModeloAluno("Gui",8.1);
		ModeloAluno a4 = new ModeloAluno("Gabi",10.0);
		
		List <ModeloAluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator<ModeloAluno> Nota = (aluno1,aluno2) -> {
				if(aluno1.nota>aluno2.nota) return 1;
				if(aluno1.nota<aluno2.nota) return -1;
				return 0;
		};
		
		
		System.out.println("Nota Máxima: "+alunos.stream().max(Nota).get());
		System.out.println("Nota Minima: "+alunos.stream().min(Nota).get());
		
	}
}
