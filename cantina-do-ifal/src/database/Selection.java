package database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import cantina.Item;

public class Selection {
	private Connection connection;
	
	public Selection() {
		connection = ConnectionFactory.getConnection();
	}
	
	public String[] SelectFuncionario(String email, String senha) {
		
		String[] dados_login = new String[2];
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("select email, senha from funcionario where email = '" + email + "' AND senha = '" + senha + "'");
			

			while (rs.next()) {
				email = rs.getString("email");
				senha = rs.getString("senha");
				dados_login[0] = email;
				dados_login[1] = senha;
			}
			
			return dados_login;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	/*
	public void lucroOuPrejuizo() {
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("select email, senha from funcionario where email = '" + email + "' AND senha = '" + senha + "'");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	} */
	
}
