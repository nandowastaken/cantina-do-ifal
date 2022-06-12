package database;

public class itemVenda {
	private int id_itemVenda;
	private int codigo_produto;
	private int codigo_venda;
	private int quantidade;
	private double preco;
	
	// getters
	public int getIdItemVenda() {
		return this.id_itemVenda;
	}
	
	public int getCodigoProduto() {
		return this.codigo_produto;
	}
	
	public int getCodigoVenda() {
		return this.codigo_venda;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	// setters
	public void setIdItemVenda(int id_itemVenda) {
		this.id_itemVenda = id_itemVenda;
	}
	
	public void setCodigoProduto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	
	public void setCodigoVenda(int codigo_venda) {
		this.codigo_venda = codigo_venda;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
