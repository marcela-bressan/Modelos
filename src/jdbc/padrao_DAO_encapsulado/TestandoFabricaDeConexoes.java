package jdbc.padrao_DAO_encapsulado;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestandoFabricaDeConexoes {
	public static void main(String[] args) throws SQLException {
		Model modelo = new Model();		
		System.out.println(modelo.criarBaseDeDados());
		modelo.fecharConexao();
	}
}
