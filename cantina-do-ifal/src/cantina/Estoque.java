package cantina;
import cantina.Estoque;
import cantina.Item;
import cantina.ValorInvalidoException;
import cantina.ListaVaziaException;

import database.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Estoque {
	private List<Item> itens = new ArrayList<>();
	
	public void cadastrarItem(String nome, String desc, double preco_compra, 
			double preco_venda, int quantidade_comprada) throws ValorInvalidoException 
	{	
		
		if (preco_compra <= 0 || preco_venda <= 0 || quantidade_comprada < 0) {
			throw new ValorInvalidoException("Valor inválido.");
		}
		
		Produto produto = new Produto();
		produto.setDescricao(desc);
		produto.setEstoqueMin(20);
		produto.setPrecoCompra(preco_compra);
		produto.setPrecoVenda(preco_venda);
		produto.setQuantComprada(quantidade_comprada);
		
		// Adiciona produto ao banco de dados
		ProdutoDao produto_dao = new ProdutoDao();
		produto_dao.adicionaProduto(produto);
	}
	
	public void venderItem(String nome, int q_vendida) throws ValorInvalidoException {
		
		if (this.itens.size() == 0) {
			throw new ValorInvalidoException("Não tem nenhum item no estoque.");
		}
		
		// Procura o item na lista para vender
		for (int i = 0; i < this.itens.size(); i++) {
			Item item = this.itens.get(i);
			if (nome.equals(item.toString())) {
				if (item.getQuantidade() < q_vendida) {
					throw new ValorInvalidoException("Venda maior do que quantidade disponível no estoque.");
				}
				
				item.venderItem(q_vendida);
			} else if (i == this.itens.size() - 1) {
				throw new ValorInvalidoException("Item não existe no estoque.");
			}
		}
				
		
	}


	public void acrescentarItem(String nome, int quantidade) throws ValorInvalidoException {
		if (quantidade < 0) {
			throw new ValorInvalidoException("Quantidade menor do que zero.");
		}
		
		if (this.itens.size() == 0) {
			throw new ValorInvalidoException("Não tem nenhum item no estoque.");
		}
		
		// Procura item na lista para acrescentar
		for (int i = 0; i < this.itens.size(); i++) {
			Item item = this.itens.get(i);
			if (nome.equals(item.toString())) {
				item.acrescentarItem(quantidade);
			} else if (i == this.itens.size() - 1 ) {
				throw new ValorInvalidoException("Item não existe no estoque.");
			}
		 
		} 
		
		
		
	}
	
	public void resumoItens(int criterio) throws ListaVaziaException {
		
		if (this.itens.size() == 0) {
			throw new ListaVaziaException("Não tem nenhum item no estoque.");
		}
		
		// Define o critério da lista
		for (int i = 0; i < this.itens.size(); i++) {
			this.itens.get(i).setCriterio(criterio);
		}
		
		Collections.sort(this.itens);
		
		// Faz o resumo com base no critério 
		if (criterio == 1) {
			for (int i = 0; i < itens.size(); i++) {
				Item item = itens.get(i);
				System.out.println(item.getNome() + " " + item.getQuantidade());
			}
		} else if (criterio == 2) {
			for (int i = 0; i < itens.size(); i++) {
				Item item = itens.get(i);
				System.out.println(item.getNome() + " " + item.getDesc());
			}
		}


	}
	
	public void lucroOuPrejuizo() throws ListaVaziaException {
		
		if (this.itens.size() == 0) {
			throw new ListaVaziaException("Não tem nenhum item no estoque.");
		}
		
		for (int i = 0; i < itens.size(); i++) {
			Item item = itens.get(i);
			double total_comprado = item.getPrecoCompra() * item.getQuantidadeComprada();
			double total_vendido = item.getPrecoVenda() * item.getQuantidadeVendida();
			double lucro = total_vendido - total_comprado;
			
			if (lucro > 0) {
				System.out.println("O lucro foi de " + lucro);
			} else {
				System.out.println("O prejuízo foi de " + lucro);
			}
		}
	}
	
	public void itensQntdBaixa() throws ListaVaziaException {
		
		if (this.itens.size() == 0) {
			throw new ListaVaziaException("Não tem nenhum item no estoque.");
		}
		
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
