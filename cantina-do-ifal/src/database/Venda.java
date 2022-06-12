package database;

import java.sql.*;

public class Venda {
	private int codigo_venda;
	private Date data_venda;
	private double desconto;
	private double total_venda;
	private String forma_pagamento;
	
	// getters
	public int getCodigoVenda() {
		return this.codigo_venda;
	}
	
	public Date getDataVenda() {
		return this.data_venda;
	}
	
	public double getDesconto() {
		return this.desconto;
	}
	
	public double getTotalVenda() {
		return this.total_venda;
	}
	
	public String getFormaPagamento() {
		return this.forma_pagamento;
	}
	
	//setters 
	public void setCodigoVenda(int codigo_venda) {
		this.codigo_venda = codigo_venda;
	}
	
	public void setDataVenda(Date data_venda) {
		this.data_venda = data_venda;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void setTotalVenda(double total_venda) {
		this.total_venda = total_venda;
	}
	
	public void setFormaPagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
}
