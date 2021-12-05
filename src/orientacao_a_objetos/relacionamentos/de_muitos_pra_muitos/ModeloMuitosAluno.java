package orientacao_a_objetos.relacionamentos.de_muitos_pra_muitos;

import java.util.ArrayList;
import java.util.List;

public class ModeloMuitosAluno {
	String nome;
	List<ModeloMuitosCurso> cursos = new ArrayList<>();
	
	
	ModeloMuitosAluno(String nome){
		this.nome =  nome;

	}
	
	void adicionarCurso(ModeloMuitosCurso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	
	}
	
	

	void verCursosDesteAluno() {
		
		System.out.println("\nCursos do aluno "+this.nome+":");
		for(ModeloMuitosCurso curso: this.cursos) {
			System.out.println("| Curso: "+curso.nome+" | ");
		}
	}
	
}
