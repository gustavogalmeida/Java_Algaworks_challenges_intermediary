package com.gproject.course;

public class ContaReceber extends Conta {
	
	Cliente cliente;

	ContaReceber(){
		
	}
	
	ContaReceber(Cliente cliente, String descricao, double valor, String data){
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = data;
	}
	
	public void receber() {
		if (!this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("Nao foi possivel receber conta!");
		} else {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println("Conta Recebida");
		}
	}
	
	public void cancelar() {
		if (this.situacaoConta.equals(SituacaoConta.PENDENTE)){
			if (this.valor>50000d) {
				System.out.println("Nao foi possivel cancelar conta! Valor maior que 50mil");
			} else {
				situacaoConta = SituacaoConta.CANCELADA;
				System.out.println("Conta inferior a 50mil e cancelada!");
			}
		} else {
			System.out.println("Nao foi possivel cancelar conta!");
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
