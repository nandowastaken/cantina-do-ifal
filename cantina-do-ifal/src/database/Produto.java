package database;
import java.sql.*;

public class Produto {
	private int codigo_produto;
	private String descricao;
	private double preco_compra;
	private double preco_venda;
	private int estoque_min;
	private int qnt_comprada;
	
	// getters
	public int getCodigoProduto() {
		return this.codigo_produto;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getPrecoCompra() {
		return this.preco_compra;
	}
	
	public double getPrecoVenda() {
		return this.preco_venda;
	}
	
	public int getEstoqueMin() {
		return this.estoque_min;
	}
	
	// Talvez seja necessário acrescentar quantidade vendida!
	public int getQuantidadeComprada() {
		return this.qnt_comprada;
	}
	
	// setters
	public void setCodigoProduto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPrecoCompra(double preco_compra) {
		this.preco_compra = preco_compra;
	}
	
	public void setPrecoVenda(double preco_venda) {
		this.preco_venda = preco_venda;
	}
	
	public void setEstoqueMin(int estoque_min) {
		this.estoque_min = estoque_min;
	}
	
	public void setQuantComprada(int qnt_comprada) {
		this.qnt_comprada = qnt_comprada;
	}
}
