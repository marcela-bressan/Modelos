package jdbc.CRUD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaDeConexao {
	
	public static Connection getConexao(){
		try {
			//Carregando usando o método de leitura
			Properties propriedades = getProperties();
			
			//passar o caminho indicando chave-valor
			String url = propriedades.getProperty("banco.url");
			String usuario = propriedades.getProperty("banco.usuario");
			String senha = propriedades.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	//Classe para realizar a leitura do arquivo conexao.properties
	private static Properties getProperties() throws IOException {
		 Properties propriedades = new Properties();
		 //Passando o caminho
		 String path = "/conexao.properties";
		 
		 //Carregando os propriedades chave-valor (stream) 
		 propriedades.load(FabricaDeConexao.class.getResourceAsStream(path));
		 
		 return propriedades;
	}
}
