package com.gprojects.pagamento.operadoras;

import com.gprojects.pagamento.Autorizavel;
import com.gprojects.pagamento.Cartao;
import com.gprojects.pagamento.Operadora;

public class Cielo implements Operadora {

	public boolean autorizar(Cartao cartao, Autorizavel autorizavel) {
		// TODO Auto-generated method stub
		return cartao.getNumeroCartao().startsWith("1111") && autorizavel.getValorTotal() < 100;
	}

}
