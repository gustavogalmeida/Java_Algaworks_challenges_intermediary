package com.gproject.course;

public class ContaPagar {
	
	private Fornecedor fornecedor;
	private String descricao;
	private double valor;
	private String dataVencimento;
	private SituacaoConta situacaoConta;
	
	ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String data){
		this(); //chama o construtor sem parametros
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = data;
	}
	
	public void pagar() {
		if(this.getSituacaoConta().equals(SituacaoConta.PENDENTE)) {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println("Conta paga!");
		} else {
			System.out.println("Nao foi possivel pagar! Conta esta paga ou cancelada!");
		}
	}
	
	public void cancelar() {
		if (this.getSituacaoConta().equals(SituacaoConta.PENDENTE)) {
			situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Conta cancelada!");
		} else {
			System.out.println("Nao foi possivel cancelar! Conta está cancelada ou paga.");
		}
	}
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
}
