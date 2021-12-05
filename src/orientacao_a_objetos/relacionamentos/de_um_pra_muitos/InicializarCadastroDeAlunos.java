package orientacao_a_objetos.relacionamentos.de_um_pra_muitos;

public class InicializarCadastroDeAlunos {
	public static void main(String[] args) {
		
		ModeloUmaEscola  escola = new ModeloUmaEscola("Escola Estrela Sol");

		escola.adicionarAluno(new ModeloAluno("Pedrinho", escola));
		escola.adicionarAluno(new ModeloAluno("Aline", escola));
		escola.adicionarAluno(new ModeloAluno("Marisa", escola));
		escola.adicionarAluno(new ModeloAluno("Ricardo", escola));
		escola.adicionarAluno(new ModeloAluno("Anderson", escola));
				
	
		escola.verLista();
		
		
		
	}
}
