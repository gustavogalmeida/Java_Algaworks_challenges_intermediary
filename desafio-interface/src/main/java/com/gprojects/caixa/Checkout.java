package com.gprojects.caixa;

import com.gprojects.impressao.Impressora;
import com.gprojects.pagamento.Cartao;
import com.gprojects.pagamento.Operadora;

public class Checkout {
	
	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(cartao, compra);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.out.println("Nao autorizado");
		}
	}
	
}
