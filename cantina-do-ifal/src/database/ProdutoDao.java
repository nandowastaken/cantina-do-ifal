package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao {
	private Connection connection;
	
	public ProdutoDao() {
		connection = ConnectionFactory.getConnection();
	}
	
	public void adicionaProduto(Produto produto) {
		String sql = "insert into produto " + "(descricao, preco_compra, preco_venda, "
				+ "estoque_minimo, quantidade_comprada)" + (" values (?, ?, ?, ?, ?)");
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getDescricao());
			stmt.setDouble(2, produto.getPrecoCompra());
			stmt.setDouble(3, produto.getPrecoVenda());
			stmt.setInt(4, produto.getEstoqueMin());
			stmt.setInt(5, produto.getQuantidadeComprada());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
