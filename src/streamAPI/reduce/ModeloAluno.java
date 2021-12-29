package streamAPI.reduce;

public class ModeloAluno {
	String nome;
	double nota;
	boolean bomComportamento;
	
	ModeloAluno(String nome, double nota){
		this(nome, nota, true);
		
		
	}
	ModeloAluno(String nome, double nota, boolean bomComportamento){
		this.nome= nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

}
