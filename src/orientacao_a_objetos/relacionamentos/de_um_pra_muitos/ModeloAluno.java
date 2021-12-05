package orientacao_a_objetos.relacionamentos.de_um_pra_muitos;

public class ModeloAluno {
	String nome;
	ModeloUmaEscola escola;
	
	
	ModeloAluno(String nome, ModeloUmaEscola escola){
		this.escola = escola;
		this.nome = nome;
		
	}
	
}
