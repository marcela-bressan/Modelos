package jdbc.criando_fabrica_de_conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestandoFabricaDeConexoes {
	public static void main(String[] args) throws SQLException {
		//Use a classe Connection e chame o método estático da classe Fabrica.
		Connection conexao = FabricaDeConexao.getConexao();
		
		//Model, comandos de manipulação do banco
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS base_de_teste_jdbc");
		System.out.println("Banco de Teste criado com suceso! ou Já existente!");
		
		//Fechando a conexão
		conexao.close();
	}
}
