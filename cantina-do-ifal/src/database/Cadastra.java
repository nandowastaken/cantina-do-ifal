package database;

public class Cadastra {
	private String email;
	private int codigo_produto;
	
	// getters
	public String getEmail() {
		return this.email;
	}
	
	public int getCodigoProduto() {
		return this.codigo_produto;
	}
	
	// setters
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCodigoProduto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
}
