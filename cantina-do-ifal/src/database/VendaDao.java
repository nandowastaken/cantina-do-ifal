package database;
import java.sql.*;

public class VendaDao {
	private Connection connection;
	
	public VendaDao() {
		connection = ConnectionFactory.getConnection();
	}
	
	public void adicionaVenda(Venda venda) {
		String sql = "insert into Venda " + "(codigo_venda, data_venda, desconto, total_venda, forma_pagamento)" +
				" values (?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(0, venda.getCodigoVenda());
			stmt.setDate(1, venda.getDataVenda());
			stmt.setDouble(2, venda.getDesconto());
			stmt.setDouble(3, venda.getTotalVenda());
			stmt.setString(4, venda.getFormaPagamento());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
