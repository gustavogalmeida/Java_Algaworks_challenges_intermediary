package com.gprojects.java;

public class ContaReceber extends Conta {
	
	@Override
	public void detalhesConta() {
		System.out.println("Tipo: CR Conta a receber."
				+ "\nCliente: " + this.cliente.getNome()
				+ "\nValor: " + this.valor 
				+ "\nDescricao: " + this.descricao
				+ "\nData de vencimento: " + this.dataVencimento);
	}
	
	Cliente cliente;

	ContaReceber(){
		
	}
	
	ContaReceber(Cliente cliente, String descricao, double valor, String data){
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = data;
	}
	
	public void receber() throws OperacaoContaException{
		if (!this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			throw new OperacaoContaException("Conta não está pendente para ser recebida!");
		} else {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println("Conta Recebida");
		}
	}
	
	public void cancelar() throws OperacaoContaException {
			if (this.valor>50000d) {
				System.out.println("Nao foi possivel cancelar conta! Valor maior que 50mil");
			} else {
				super.cancelar();
			}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
