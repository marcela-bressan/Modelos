package jdbc.padrao_DAO_encapsulado;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
	Connection conexao = FabricaDeConexao.getConexao();
	
	public String criarBaseDeDados() throws SQLException {
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS base_de_teste_jdbc");
		return "BASE DE DADOS CRIADA OU JÁ EXISTENTE!";
	} 
	
	public void fecharConexao() {
		try {
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.conexao = null;
		}
	}
}
