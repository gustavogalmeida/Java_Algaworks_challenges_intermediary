package com.gprojects.java;

public class RelatorioContas {
	public void imprimir(Conta[] contas) {
		System.out.println("==============================================");
		System.out.println("===================Relatorio==================");
		System.out.println("==============================================");
		
		for (int i = 0; i < contas.length; i++) {
			contas[i].detalhesConta();
			System.out.println();
		}
	}
}
