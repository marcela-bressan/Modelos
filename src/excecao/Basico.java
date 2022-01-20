package excecao;

public class Basico {
	public static void main(String[] args) {
		
		ModeloAluno a1 = null;
		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um Erro no momento de"
					+ " imprimrir o nome do aluno");
		}
		
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Ocorreu um erro: "+e.getMessage());
		}
		
		System.out.println("Fim :)");
		
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
			at excecao.Basico.main(Basico.java:5)
	
		 Exceção no thread "principal" java.lang.ArithmeticException: / por zero
			em excecao.Basico.main(Basico.java:5)
		 */
	}
	
	public static void imprimirNomeDoAluno(ModeloAluno aluno){
		System.out.println(aluno.nome);
	}
}
