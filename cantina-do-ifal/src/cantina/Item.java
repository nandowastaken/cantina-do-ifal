package cantina;
import cantina.ValorInvalidoException;
import cantina.ListaVaziaException;

public class Item implements Comparable<Item>{
	private String nome;
	private String desc;
	private double preco_compra;
	private double preco_venda;
	private int quantidade_comprada;
	private int quantidade_vendida;
	private int quantidade;
	private int criterio;
	
	Item(String nome, String desc, double preco_compra, double preco_venda, 
			int quantidade_comprada) throws ValorInvalidoException 
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
		
		if (quantidade_vendida > quantidade_comprada) {
			throw new ValorInvalidoException("Quantidade vendida maior que quantidade comprada.");
		}
		
		this.nome = nome; 
		this.desc = desc;
		this.preco_compra = preco_compra;
		this.preco_venda = preco_venda;
		this.quantidade_comprada = quantidade_comprada;
		this.quantidade = quantidade_comprada;
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	public String getDesc() {
		return this.desc;
	}
	public double getPrecoCompra() {
		return this.preco_compra;
	}
	public double getPrecoVenda() {
		return this.preco_venda;
	}
	public int getQuantidadeComprada() {
		return this.quantidade_comprada;
	}
	public int getQuantidadeVendida() {
		return this.quantidade_vendida;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public int getCriterio() {
		return this.criterio;
	}

	//Setters
	public void setNome(String n) {
		this.nome = n;
	}
	public void setDesc(String d) {
		this.desc = d;
	}
	public void setPrecoCompra(double p) {
		this.preco_compra = p;
	}
	public void setPrecoVenda(double p) {
		this.preco_venda = p;
	}
	public void setQuantidadeComprada(int q) {
		this.quantidade_comprada = q;
	}
	public void setQuantidadeVendida( int q) {
		this.quantidade_vendida = q;
	}
	public void setQuantidade(int q) {
		this.quantidade = q;
	}
	public void setCriterio(int q) {
		this.criterio = q;
	}
	
	public void acrescentarItem(int quantidade) {
		this.quantidade += quantidade;
		this.quantidade_comprada += quantidade;
	}
	
	public void venderItem(int quantidade) {
		this.quantidade -= quantidade;
		this.quantidade_vendida += quantidade;
	}
	
	public String toString() {
		return this.nome;
	}

	public int compareTo(Item outroItem){
		
		// Organiza com base no critério;
		if (this.getCriterio() == 1){
			if (this.quantidade < outroItem.getQuantidade()) {
				return -1;
			}
			
			if (this.quantidade > outroItem.getQuantidade()) {
				return 1;
			}
			
			return 0;
		}else if (this.getCriterio() == 2) {
			if (this.desc.compareToIgnoreCase(outroItem.getDesc()) < 0) {
				return -1;
			}
			
			if (this.desc.compareToIgnoreCase(outroItem.getDesc()) > 0) {
				return 1;
			}
			
			return 0;
		}
		
		return 0;
	}
}
