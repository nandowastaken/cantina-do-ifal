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
	
	public void cadastrarItem(String desc, double preco_compra, 
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
	
	public void venderItem(int id, int q_vendida) throws ValorInvalidoException {

		if (q_vendida < 0) {
			throw new ValorInvalidoException("Não tem como vender valores negativos.");
		}
		// Procura o item na lista para vender
		Update update = new Update();
		update.venderItem(q_vendida, id);
				
		
	}


	public void acrescentarItem(int id, int quantidade) throws ValorInvalidoException {
		if (quantidade < 0) {
			throw new ValorInvalidoException("Quantidade menor do que zero.");
		}
		
		// Atualiza a quantidade
		Update update = new Update();
		update.adicionaQntProduto(quantidade, id);

		
		
		
		
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
