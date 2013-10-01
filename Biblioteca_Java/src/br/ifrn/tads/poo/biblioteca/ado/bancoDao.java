package br.ifrn.tads.poo.biblioteca.ado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class bancoDao {
	private static Connection con;
	
	public static Connection criarConexao(){

		try {
			if (con == null || con.isClosed()){

				Class.forName("com.mysql.jdbc.Driver");

				String url = "jdbc:mysql://127.0.0.1:3306/suzy";
				String login = "root";
				String senha = "123456";

				con = DriverManager.getConnection(url,login,senha);		


			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}	
		return con;

	}
	public static Statement getStatement(){
		try {
			
			return  criarConexao().createStatement();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close() throws SQLException {
		if (con != null)
			con.close();
		
	}
}
