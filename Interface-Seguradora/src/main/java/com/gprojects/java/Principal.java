package com.gprojects.java;

public class Principal {
	public static void main(String[] args) {
		Carro carro = new Carro(8000, 2000);
		Imovel imovel = new Imovel(350000, 65);
		
		CorretoraSeguros c = new CorretoraSeguros();
		
		c.fazerPropostaSeguro(carro);
	}
}
