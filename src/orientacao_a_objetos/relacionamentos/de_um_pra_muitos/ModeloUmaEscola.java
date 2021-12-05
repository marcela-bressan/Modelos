package orientacao_a_objetos.relacionamentos.de_um_pra_muitos;

import java.util.ArrayList;
import java.util.List;

public class ModeloUmaEscola {
	String nome;
	List<ModeloAluno> alunos = new ArrayList<>();
	
	ModeloUmaEscola(String nome){
		this.nome = nome;
	}
	
	public void adicionarAluno(ModeloAluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void verLista() {
		
	for (ModeloAluno aluno:alunos) {
		System.out.println("| Aluno: "+aluno.nome+"| Escola: "+aluno.escola.nome+" |");
	}
	
	
	
	}
	
}
