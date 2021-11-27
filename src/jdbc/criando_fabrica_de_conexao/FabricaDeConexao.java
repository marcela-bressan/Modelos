package jdbc.criando_fabrica_de_conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	
	public static Connection getConexao(){

		try {
			String url = "jdbc:mysql://localhost:3306?VerifyServerCertificate=false&useSSL=true";
			String usuario = "[informar usuario aqui]";
			String senha = "[informar senha aqui]";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
