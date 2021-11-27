package jdbc.CRUD;

import java.sql.SQLException;
import java.util.Scanner;

public class TestandoCrud {
	public static void main(String[] args) throws SQLException {
		//Teste corrido..
		
		CRUD registro = new CRUD();		
	
		System.out.println(registro.criarBancoCasoNaoExista());
		
		System.out.println(registro.criarTabelaCasoNaoExista());
		
		registro.InserirUmRegistro("Marta");
	
		//Incluindo muitos registros
		registro.InserirUmRegistro("Luciano");
		registro.InserirUmRegistro("Maria");
		registro.InserirUmRegistro("Rafael");
		registro.InserirUmRegistro("Giulia");
		registro.InserirUmRegistro("Pdro");
		registro.InserirUmRegistro("Mariana");
		
		registro.consultarRegistrosQueContenham("ia");
		
		registro.consultarTodosOsRegistros();
		
		registro.consultarRegistroPeloId(6);
		
		registro.alterarRegistro(6, "Pedro");

		registro.ExcluirRegistro(5);
		
		System.out.println(registro.ExcluirTodosOsRegistros());
		
		System.out.println(registro.DeletarTabela());
	
		registro.fecharConexao();
		
	}
}
