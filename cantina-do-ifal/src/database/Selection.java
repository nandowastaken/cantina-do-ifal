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
	
	public double lucroOuPrejuizo() {
		double lucro = 0;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("select preco_compra, preco_venda, quantidade_comprada, quantidade_vendida from produto");
			while (rs.next()) {
				double preco_compra = rs.getDouble("preco_compra");
				double preco_venda = rs.getDouble("preco_venda");
				int quantidade_comprada = rs.getInt("quantidade_comprada");
				int quantidade_vendida = rs.getInt("quantidade_vendida");
				double diferenca_qnt = quantidade_vendida - quantidade_comprada;
				double compra_total = preco_compra * quantidade_comprada;
				double venda_total = preco_venda * quantidade_vendida;
				lucro += venda_total - compra_total;
			}
			
			return lucro;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	} 

	public void resumoItens() {
		
	}
	
}
