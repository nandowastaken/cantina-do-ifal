package cantina;

public class Estoque {
	private Item[] itens = new Item[10];
	private int index = 0;
	
	public void cadastrarItem(String nome, String desc, double preco_compra, 
			double preco_venda, int quantidade_comprada, int quantidade_vendida) throws ValorInvalidoException 
	{
		this.itens[index] = new Item(nome, desc, preco_compra, preco_venda, quantidade_comprada, quantidade_vendida);
		index++;
	}
	
	public void venderItem(int index, int q_vendida) throws ValorInvalidoException {
		if (this.itens[index].getQuantidade() < q_vendida) {
			throw new ValorInvalidoException("Venda maior do que quantidade disnponível no estoque.");
		}
		
		this.itens[index].setQuantidade(this.itens[index].getQuantidade() - q_vendida);
		this.itens[index].setQuantidadeVendida(this.itens[index].getQuantidadeVendida() + q_vendida);		
		
	}


	public void acresentarItem(int index, int quantidade){
		this.itens[index].setQuantidadeComprada(this.itens[index].getQuantidadeComprada() + quantidade);
		
	}
	
	
	
}
