package orientacao_a_objetos.relacionamentos.de_muitos_pra_muitos;

public class IniciarMatriculas {
	public static void main(String[] args) {
		ModeloMuitosCurso curso1 = new ModeloMuitosCurso("Java");
		ModeloMuitosCurso curso2 = new ModeloMuitosCurso("SpringBoot");
		ModeloMuitosCurso curso3 = new ModeloMuitosCurso("JavaScript");
		ModeloMuitosCurso curso4 = new ModeloMuitosCurso("SQL");
		
		
		ModeloMuitosAluno aluno1 = new ModeloMuitosAluno("Paulo");
		ModeloMuitosAluno aluno2 = new ModeloMuitosAluno("Patrícia");
		ModeloMuitosAluno aluno3 = new ModeloMuitosAluno("Maria");
		ModeloMuitosAluno aluno4 = new ModeloMuitosAluno("Fernanda");
		ModeloMuitosAluno aluno5 = new ModeloMuitosAluno("Pedro");
		ModeloMuitosAluno aluno6 = new ModeloMuitosAluno("José");
		ModeloMuitosAluno aluno7 = new ModeloMuitosAluno("Felipe");
		ModeloMuitosAluno aluno8 = new ModeloMuitosAluno("Fernando");
		
		
		aluno1.adicionarCurso(curso4);
		aluno1.adicionarCurso(curso2);
		
		aluno2.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso4);
		aluno2.adicionarCurso(curso1);
		
		aluno3.adicionarCurso(curso1);
		
		aluno4.adicionarCurso(curso2);
		aluno4.adicionarCurso(curso3);
		
		aluno5.adicionarCurso(curso1);
		aluno5.adicionarCurso(curso2);
		aluno5.adicionarCurso(curso3);
		aluno5.adicionarCurso(curso4);
		
		aluno6.adicionarCurso(curso1);
		aluno6.adicionarCurso(curso2);
		aluno6.adicionarCurso(curso3);
		
		aluno7.adicionarCurso(curso2);
		aluno7.adicionarCurso(curso1);
		
		aluno8.adicionarCurso(curso4);
		
		
		curso1.verAlunosDesteCurso();
		curso2.verAlunosDesteCurso();
		curso3.verAlunosDesteCurso();
		curso4.verAlunosDesteCurso();
		
		
		aluno1.verCursosDesteAluno();
		aluno2.verCursosDesteAluno();
		aluno3.verCursosDesteAluno();
		aluno4.verCursosDesteAluno();
		aluno5.verCursosDesteAluno();
		aluno6.verCursosDesteAluno();
		aluno7.verCursosDesteAluno();
		aluno8.verCursosDesteAluno();
		
		
		
		
	}
}
