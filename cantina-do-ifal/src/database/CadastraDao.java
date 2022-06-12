package database;
import java.sql.*;

public class CadastraDao {
	private Connection connection;
	
	public CadastraDao() {
		connection = ConnectionFactory.getConnection();
	}
	
	public void adicionaProduto(Cadastra cadastro) {
		String sql = "insert into cadastra " + "(email, codigo_produto)" + (" values (?, ?)");
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(0, cadastro.getEmail());
			stmt.setInt(1, cadastro.getCodigoProduto());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
