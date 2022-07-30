package com.gprojects.pagamento;

public interface Operadora {
	public boolean autorizar (Cartao cartao, Autorizavel autorizavel);
}
