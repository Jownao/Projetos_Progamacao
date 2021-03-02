package main.modelRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	//atributos para conexao com o banco de dados postgresSQL
	
	String url = "jdbc:postgresql://localhost:5432/DeliveryBanco";
	String username = "postgres";
	String password = "admin";
	String driver = "org.postgresql.Driver";
	
	//ações dentro do banco de dados
	Connection conexao;
	Statement statment;
	ResultSet rs;
	
	protected Connection abreConexao() {
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url, username, password);
			return conexao;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	protected Boolean fecharConexao() {
		try {
			conexao.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public Boolean verificandoConexao() {
		if (conexao != null) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
