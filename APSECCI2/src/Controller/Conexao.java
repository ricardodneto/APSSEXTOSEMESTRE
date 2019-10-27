package Controller;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
	
	private Connection conexao;
	
	public Conexao(){
		
			
		String connectionUrl ="jdbc:sqlserver://localhost;databaseName=BancoAPS;integratedSecurity=true;";
							
		try {
			conexao = DriverManager.getConnection(connectionUrl);
			System.out.println("Conexao Feita");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public Connection getConexao(){
		return conexao;
	}
	
}