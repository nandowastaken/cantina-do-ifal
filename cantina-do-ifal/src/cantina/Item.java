package cantina;

class Item {
	private String nome;
	private String desc;
	private double preco_compra;
	private double preco_venda;
	private int quantidade_comprada;
	private int quantidade_vendida;
	
	Item(String nome, String desc, double preco_compra, double preco_venda, 
			int quantidade_comprada, int quantidade_vendida) throws ValorInvalidoException 
	{
		if (preco_venda < preco_compra) {
			throw new ValorInvalidoException("Preço de venda menor que o de compra.");
		}
		
		if (preco_venda < 0 || preco_compra < 0) {
			throw new ValorInvalidoException("Preço de venda ou compra menores do que zero.");
		}
		
		if (quantidade_comprada < 0 || quantidade_vendida < 0) {
			throw new ValorInvalidoException("Quantidade de compra ou venda menores do que zero.");
		}
		
		this.nome = nome; 
		this.desc = desc;
		this.preco_compra = preco_compra;
		this.preco_venda = preco_venda;
		this.quantidade_comprada = quantidade_comprada;
		this.quantidade_vendida = quantidade_vendida;
	}
	
}
