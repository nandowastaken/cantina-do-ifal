package database;

import java.sql.*;

public class ItemVendaDao {
	private Connection connection;
	
	public ItemVendaDao() {
		connection = ConnectionFactory.getConnection();
	}
	
	public void adicionaItemVenda(itemVenda item_venda) {
		String sql = "insert into ItemVenda " + "(id_itemVenda, codigo_produto, codigo_venda, quantidade, preco)" +
				" values (?, ?, ?, ?, ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(0, item_venda.getIdItemVenda());
			stmt.setInt(1, item_venda.getCodigoProduto());
			stmt.setInt(2, item_venda.getCodigoVenda());
			stmt.setInt(3, item_venda.getQuantidade());
			stmt.setDouble(4, item_venda.getPreco());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
