package com.gprojects.caixa;

import com.gprojects.impressao.Imprimivel;
import com.gprojects.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel{

	private double valorTotal;
	public String produto;
	public String nomeCliente;

	public double getValorTotal() {
		// TODO Auto-generated method stub
		return this.valorTotal;
	}

	public String getCabecalhoPagina() {
		// TODO Auto-generated method stub
		return this.getNomeCliente();
	}

	public String getCorpoPagina() {
		// TODO Auto-generated method stub
		return this.getProduto() + " = " + this.getValorTotal();
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
