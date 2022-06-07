package database;
import java.sql.*;

public class FuncionarioDao {
	private Connection connection;
	
	public FuncionarioDao() {
		this.connection = ConnectionFactory.getConnection();
	}
	
	public void adicionaFuncionario(Funcionario funcionario) {
		
		String sql = "insert into funcionario " + "(email, nome, senha)" + (" values (?, ?, ?)");
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(0, funcionario.getEmail());
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getSenha());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
