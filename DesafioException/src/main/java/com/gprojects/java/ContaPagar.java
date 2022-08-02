package com.gprojects.java;

public class ContaPagar extends Conta{
	
	@Override
	public void detalhesConta() {
		System.out.println("Tipo: CP Conta a Pagar.\n"
				+ "Fornecedor: " + this.fornecedor.getNome()
				+ "\nValor: " + this.valor 
				+ "\nDescricao: " + this.descricao 
				+ "\nData de vencimento: " + this.dataVencimento);
	}

	Fornecedor fornecedor;
	
	ContaPagar(){
		
	}

	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String data){
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = data;
	}
	
	public void pagar() throws OperacaoContaException {
		if (!this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			throw new OperacaoContaException("Conta n�o est� pendente para ser paga!");
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
