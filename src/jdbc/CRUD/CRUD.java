package jdbc.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class CRUD {
	
	/*Declarações*/
	Connection conexao = FabricaDeConexao.getConexao();
	int id;
	String nome;
	
	/*Getters and Setters*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*Métodos Construtores*/
	//Default
	public CRUD(){
		
	}
	//Principal
	public CRUD(String nome) {
		setNome(nome);
	}
	
	//Secundário
		public CRUD(int id, String nome) {
			setId(id);
			setNome(nome);
		}

	/*Métodos de Acesso à Manipulação (Model)*/	
	
	public String criarBancoCasoNaoExista() throws SQLException { 
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS base_de_teste_jdbc");
		String resultado = "BANCO DE DADOS: [OK] ";
		return resultado;
	}


	public String criarTabelaCasoNaoExista() throws SQLException { 
		String SQL = "CREATE TABLE IF NOT EXISTS registros ("
				+ "	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,"
				+ " nome VARCHAR(255) NOT NULL)";
		Statement stmt = conexao.createStatement();
		stmt.execute(SQL);
		return "TABELA: [OK] ";
		
	}
	
	//Inserir um Registro na Tabela
	public void InserirUmRegistro(String nome) throws SQLException {
		
		System.out.println("\nINCLUINDO NOVO REGISTRO PARA NOME: "+nome);
		String SQL="INSERT INTO registros (nome) VALUES(?)";
		PreparedStatement pstmt = conexao.prepareStatement(SQL);
		pstmt.setString(1, nome);
		pstmt.execute();
		consultarTodosOsRegistros();
		
	}

	//Incluir método Iserir Muitos Registros na Tabela
	
	public void consultarTodosOsRegistros() throws SQLException {
			System.out.println("\n***TABELA REGISTROS***");
			String SQL = "SELECT * FROM registros";
			PreparedStatement pstmt = conexao.prepareStatement(SQL);
			ResultSet resultado = pstmt.executeQuery();
			
			List<CRUD> result = new ArrayList<>();
			
			while (resultado.next()){
				 int id = resultado.getInt("id");
				 String nome_ = resultado.getString("nome");
				 result.add(new CRUD(id,nome_));
			 };
			 
			 for(CRUD registro: result) {
				 System.out.println("| ID:"+registro.getId()+" | Nome: "+registro.getNome()+" | "); 
			 }
			
		};
	
	//Consultar um Registro
	public void consultarRegistrosQueContenham(String nome) throws SQLException {
		
		String SQL = "SELECT * FROM registros WHERE nome like ?";
		PreparedStatement pstmt = conexao.prepareStatement(SQL);
		pstmt.setString(1, "%"+nome+"%");
		ResultSet resultado = pstmt.executeQuery();
		
		List<CRUD> result = new ArrayList<>();
		
		while (resultado.next()){
			 int id = resultado.getInt("id");
			 String nome_ = resultado.getString("nome");
			 result.add(new CRUD(id,nome_));
		 };
		 
		 System.out.println("\nRESULTADO DA CONSULTA POR NOME '"+nome+"':");
		 
		 for(CRUD registro: result) {
			 System.out.println("| ID:"+registro.getId()+" | Nome: "+registro.getNome()+" | "); 
		 }
		
	};
	
	//Consultar Registros pelo ID
	public void consultarRegistroPeloId(int id) throws SQLException {
		
		String SQL = "SELECT * FROM registros WHERE id=?";
		PreparedStatement pstmt = conexao.prepareStatement(SQL);
		pstmt.setInt(1, id);
		ResultSet resultado = pstmt.executeQuery();
		
		List<CRUD> result = new ArrayList<>();
		
		while (resultado.next()){
			 int id_ = resultado.getInt("id");
			 String nome_ = resultado.getString("nome");
			 result.add(new CRUD(id_,nome_));
		 };
		 
		 System.out.println("\n RESULTADO DA CONSULTA ID "+id+":");
		 
		 for(CRUD registro: result) {
			 System.out.println("| ID:"+registro.getId()+" | Nome: "+registro.getNome()+" | "); 
		 }
		
	};
	
	//Alterar o registro somente pelo ID
	public void alterarRegistro(int id, String nomeAlterado) throws SQLException {
		
		 String SQL = "UPDATE registros SET nome=? WHERE id=? ";
		 PreparedStatement pstmt = conexao.prepareStatement(SQL);
		 pstmt.setString(1, nomeAlterado);
		 pstmt.setInt(2, id);
		 pstmt.executeUpdate();
		 System.out.println("\n O REGISTRO ID: "+id+" FOI ALTERADO DE 'Pdro' Para 'Pedro'!");
		 consultarRegistroPeloId(id);
	}
	

	public void ExcluirRegistro(int id) throws SQLException {
		 consultarTodosOsRegistros(); 
		 String SQL = "DELETE FROM registros WHERE id=?";
		 PreparedStatement pstmt = conexao.prepareStatement(SQL);
		 pstmt.setInt(1, id);
		 pstmt.execute();
		 
		 System.out.println("\n O REGISTRO ID: "+id+" FOI EXCLUIDO!");
		 consultarTodosOsRegistros(); 
	}

	//Excluir todos os Registros
		public String ExcluirTodosOsRegistros() throws SQLException {
		
			String SQL="TRUNCATE TABLE registros";
			Statement stmt = conexao.createStatement();
			stmt.execute(SQL);
			consultarTodosOsRegistros();
			return "\nTODOS OS REGISTROS FORAM EXCLUIDOS!";
		}

	
	//Deletar a tabela
	public String DeletarTabela() throws SQLException {
		
		String SQl = "DROP TABLE registros";
		Statement stmt = conexao.createStatement();
		stmt.execute(SQl);
		return "\nA TABELA FOI DELETADA!"; 	
	}
	
	//Fechando Conexão
	public String fecharConexao() {
		try {
			this.conexao.close();
			return "PROGRAMA FINALIZADO!";
		} catch (SQLException e) {
			this.conexao = null;
			return "PROGRAMA FINALIZADO!";
		}
	}
	
	
}
