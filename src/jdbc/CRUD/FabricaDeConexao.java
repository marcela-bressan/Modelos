package jdbc.CRUD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaDeConexao {
	
	public static Connection getConexao(){
		try {
	
			Properties propriedades = getProperties();		
			String url = propriedades.getProperty("banco.url");
			String usuario = propriedades.getProperty("banco.usuario");
			String senha = propriedades.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	private static Properties getProperties() throws IOException {
		 Properties propriedades = new Properties();
		 String path = "/conexao.properties"; 
		 propriedades.load(FabricaDeConexao.class.getResourceAsStream(path));
		 return propriedades;
	}
}
