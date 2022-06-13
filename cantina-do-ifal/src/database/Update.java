package database;
import java.sql.*;

public class Update {
    private Connection connection;

    public Update() {
        connection = ConnectionFactory.getConnection();
    }

    public void adicionaQntProduto(int quantidade, int id) {
        try {
            String sql = "update produto set quantidade_comprada = quantidade_comprada + ? where codigo_produto = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, quantidade);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            

    }


    public void venderItem(int quantidade, int id) {
        try {
            String sql = "update produto set quantidade_comprada = quantidade_comprada - ? where codigo_produto = ?";
            String update_qnt_venda = "update produto set quantidade_vendida = quantidade_vendida + ? where codigo_produto = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            PreparedStatement stmt2 = connection.prepareStatement(update_qnt_venda);
            stmt.setInt(1, quantidade);
            stmt.setInt(2, id);

            stmt2.setInt(1, quantidade);
            stmt2.setInt(2, id);

            stmt.executeUpdate();
            stmt2.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            

    }
}
