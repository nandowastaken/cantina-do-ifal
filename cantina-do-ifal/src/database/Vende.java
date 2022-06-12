package database;

public class Vende {
	private String email;
	private int codigo_venda;
	
	// getters
	public String getEmail() {
		return this.email;
	}
	
	public int getCodigoVenda() {
		return this.codigo_venda;
	}
	
	// setters
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCodigoVenda(int codigo_venda) {
		this.codigo_venda = codigo_venda;
	}
}
