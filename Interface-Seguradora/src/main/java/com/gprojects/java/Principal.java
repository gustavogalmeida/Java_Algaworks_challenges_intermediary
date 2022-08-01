package com.gprojects.java;

public class Principal {
	public static void main(String[] args) {
		Carro carro = new Carro(8000, 2000);
		Imovel imovel = new Imovel(350000, 65);
		Iphone iphone = new Iphone(10, "XR", 128);
		
		CorretoraSeguros c = new CorretoraSeguros();
		
		c.fazerPropostaSeguro(carro);
		System.out.println();
		
		c.fazerPropostaSeguro(iphone);
	}
}
