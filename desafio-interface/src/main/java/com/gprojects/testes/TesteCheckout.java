package com.gprojects.testes;

import com.gprojects.caixa.Checkout;
import com.gprojects.caixa.Compra;
import com.gprojects.impressao.Impressora;
import com.gprojects.impressao.impressoras.Bematech;
import com.gprojects.pagamento.Cartao;
import com.gprojects.pagamento.Operadora;
import com.gprojects.pagamento.operadoras.Cielo;

public class TesteCheckout {
	public static void main(String[] args) {
		
		Operadora operadora = new Cielo();
		Impressora impressora = new Bematech();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("GUSTAVO ALMEIDA");
		cartao.setNumeroCartao("1111 2222 3333 4444");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Gustavo Cliente");
		compra.setProduto("Coca Cola 2,5L");
		compra.setValorTotal(7.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
}
