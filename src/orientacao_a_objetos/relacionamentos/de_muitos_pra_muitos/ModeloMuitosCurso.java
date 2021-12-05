package orientacao_a_objetos.relacionamentos.de_muitos_pra_muitos;

import java.util.ArrayList;
import java.util.List;

public class ModeloMuitosCurso {
	String nome;
	List<ModeloMuitosAluno> alunos = new ArrayList<>();
	
	ModeloMuitosCurso(String nome){
		this.nome = nome;
	}
	
	void adicionarAlunos(ModeloMuitosAluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	
	void verAlunosDesteCurso() {
		
		System.out.println("\nAlunos do curso de "+nome+":");
		for(ModeloMuitosAluno aluno: this.alunos) {
			System.out.println("| Nome: "+aluno.nome+" | ");
		}
	}
}
