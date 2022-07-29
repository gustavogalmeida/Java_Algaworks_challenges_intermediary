package com.gprojects.java;

public class ContaPagar extends Conta{

	Fornecedor fornecedor;
	
	ContaPagar(){
		
	}

	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String data){
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = data;
	}
	
	public void pagar() {
		if (!this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("Nao foi possivel pagar conta!");
		} else {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println("Conta paga!");
		}
		
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
