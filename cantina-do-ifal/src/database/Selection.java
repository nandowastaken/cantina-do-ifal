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
	
	public List<String[]> SelectFuncionario() {
		
		List<String[]> dados_login = new ArrayList<>();
		try {
			String email;
			String senha;
			Statement stmt = connection.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("select email, senha from funcionario");
			while (rs.next()) {
				String[] dados = new String[2];
				email = rs.getString("email");
				senha = rs.getString("senha");
				dados[0] = email;
				dados[1] = senha;
				System.out.println(email + " " + senha);
				dados_login.add(dados);
			}
			
			return dados_login;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
