package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectandoComJDBC {
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306";
		String usuario = "[informar usuario aqui]";
		String senha = "[informar senha aqui]";
		
		//atribuindo informações de acesso do banco à var conexao para validação.
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		//Se estiver tudo ok...
		System.out.println("Conexão realizada com sucesso!");	
		
		//Fechando a conexão
		conexao.close();
	}
}
