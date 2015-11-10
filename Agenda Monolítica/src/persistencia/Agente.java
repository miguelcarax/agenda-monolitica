package persistencia;

import java.sql.*;

public class Agente {
	private String url = "jdbc:mysql://localhost:3306/";
	private String dbName = "contactos";
	private String driver = "com.mysql.jdbc.Driver";
	private String userName = "root";
	private String password = "admin";
	private Statement statement;
	private Connection connector;
	private static Agente agenteDB;
	
	private Agente() throws Exception{
		Class.forName(driver).newInstance();
		connector = DriverManager.getConnection(url+dbName,userName,password);
		statement = connector.createStatement();
	}
	public static Agente getAgente() throws Exception{
		if (agenteDB == null)
			agenteDB = new Agente();
		return agenteDB;
	}
	
	public void desconectar() throws Exception{
		connector.close();
	}
	
	// C.R.U.D
	public void delete(String sentence) throws Exception{
		statement.executeUpdate(sentence);
	}
	
	public void update(String sentence) throws Exception{
		statement.executeUpdate(sentence);
	}
	
	public ResultSet read(String sentence) throws Exception{
		ResultSet result = statement.executeQuery("SELECT * FROM contactos");
		return result;
	}
	
	public void create(String sentence) throws Exception{
		statement.executeUpdate(sentence);
	}
	
}

