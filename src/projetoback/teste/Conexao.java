package projetoback.teste;

import java.sql.Connection;
import java.sql.SQLException;

import projetoback.ConnectionFactory;

public class Conexao {

	public static void main(String[] args) throws SQLException {
		   Connection connection = new ConnectionFactory().getConnection();
	          connection.close();
	}

}