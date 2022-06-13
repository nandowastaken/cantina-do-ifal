package database;
import java.sql.*;

public class VendeDao {
	private Connection connection;
	
	public VendeDao() {
		connection = ConnectionFactory.getConnection();
	}
	
	public void adicionaVende(Vende vende) {
		String sql = "insert into vende " + "(email, codigo_venda)" + (" values (?, ?)");
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(0, vende.getEmail());
			stmt.setInt(1, vende.getCodigoVenda());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
