package com.gprojects.java;

public abstract class Conta {
	
	protected String descricao;
	protected double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public abstract void detalhesConta();
	
	Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public void cancelar(){
		if (!this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("Nao foi possivel cancelar conta!");
		} else {
			System.out.println("Conta cancelada!");
			situacaoConta = SituacaoConta.CANCELADA;
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

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
}
