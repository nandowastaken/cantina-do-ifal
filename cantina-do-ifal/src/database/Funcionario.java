package database;

public class Funcionario {
	private String email;
	private String nome;
	private String senha;
	
	// getters
	public String getEmail() {
		return this.email;	
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	// setters
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
