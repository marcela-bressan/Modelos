package jdbc.criando_banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriandoBancoDeDados {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306?VerifyServerCertificate=false&useSSL=true";
		String usuario = "[informar o usuário aqui]";
		String senha = "[informar a senha aqui]";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		String SQL = "CREATE DATABASE IF NOT EXISTS base_de_teste_JDBC ";
		Statement stmt = conexao.createStatement();
		stmt.execute(SQL);
		System.out.println("Banco criado com sucesso!");
				
		conexao.close();
	}
}
