package cantina;

class Item {
	private String nome;
	private String desc;
	private double preco_compra;
	private double preco_venda;
	private int quantidade_comprada;
	private int quantidade_vendida;
	
	Item(String nome, String desc, double preco_compra, double preco_venda, 
			int quantidade_comprada, int quantidade_vendida) 
	{
		this.nome = nome; 
		this.desc = desc;
		this.preco_compra = preco_compra;
		this.preco_venda = preco_venda;
		this.quantidade_comprada = quantidade_comprada;
		this.quantidade_vendida = quantidade_vendida;
	}
	
	
	
	public void setQuantidade(int quantidade_comprada) {
		this.quantidade_comprada = quantidade_comprada;
	}
	
}
