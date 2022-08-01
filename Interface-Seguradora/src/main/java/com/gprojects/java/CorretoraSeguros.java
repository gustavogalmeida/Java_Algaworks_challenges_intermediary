package com.gprojects.java;

public class CorretoraSeguros {
	public void fazerPropostaSeguro(Seguravel seguravel) {
		System.out.println("***********Proposta***********");
		System.out.println();
		System.out.println(seguravel.obterDescricao());
		System.out.println("Valor do apolice: R$ " + seguravel.calcularValorApolice());
	}
}
