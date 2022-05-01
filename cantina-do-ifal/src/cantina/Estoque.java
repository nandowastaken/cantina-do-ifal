package cantina;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private List<Item> itens = new ArrayList<>();
	
	public void cadastrarItem(String nome, String desc, double preco_compra, 
			double preco_venda, int quantidade_comprada, int quantidade_vendida) throws ValorInvalidoException 
	{
		this.itens.add(new Item(nome, desc, preco_compra, preco_venda, quantidade_comprada, quantidade_vendida));
	}
	
	public void venderItem(int index, int q_vendida) throws ValorInvalidoException {
		Item item = this.itens.get(index);
		if (item.getQuantidade() < q_vendida) {
			throw new ValorInvalidoException("Venda maior do que quantidade disponível no estoque.");
		}
		
		item.setQuantidade(item.getQuantidade() - q_vendida);
		item.setQuantidadeVendida(item.getQuantidadeVendida() + q_vendida);		
		
	}


	public void acresentarItem(int index, int quantidade){
		Item item = this.itens.get(index);
		item.setQuantidadeComprada(item.getQuantidadeComprada() + quantidade);
		
	}
	
	public void resumoItens(int criterio) {
		if (criterio == 1) {
			
		} else if (criterio == 2) {
			
		}
	}
	
	public void lucroOuPrejuizo() {
		for (int i = 0; i < itens.size(); i++) {
			Item item = itens.get(i);
			double total_comprado = item.getPrecoCompra() * item.getQuantidadeComprada();
			double total_vendido = item.getPrecoVenda() * item.getQuantidadeVendida();
			
		}
	}
	
	public void itensQntdBaixa() {
		for (int i = 0; i < itens.size(); i++) {
			Item item = itens.get(i);
			if (item.getQuantidade() < 50) {
				System.out.println(item.getNome() + " " + item.getQuantidade());
			}
			
		}
	}
	
	public String toString() {
		return "Estoque da Cantina";
	}
	
}
