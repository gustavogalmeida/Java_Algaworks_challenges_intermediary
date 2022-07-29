package com.gprojects.java;

public class Main {
	public static void main(String[] args) {
		RelatorioContas report = new RelatorioContas();
		
		Cliente cli1 = new Cliente("Gustavo G A A");
		Cliente cli2 = new Cliente("Otavio F");
		
		Fornecedor forn1 = new Fornecedor("Coca Cola");
		Fornecedor forn2 = new Fornecedor("Antartica");
		
		// Forma 1 de passar todas contas para lista
		ContaReceber cr1 = new ContaReceber(cli1, "Coca 600ml gustavo", 6, "28/07/2022");
		ContaReceber cr2 = new ContaReceber(cli2, "Coca Cola Cafe otavio", 3, "29/07/2022");
		ContaPagar cp1 = new ContaPagar(forn1, "Compra de 6 fardos coca", 450, "01/07/2022");
		ContaPagar cp2 = new ContaPagar(forn2, "Compra antartica 1 fardo", 80, "05/07/2022");
		Conta[] contas = new Conta[]{cr1, cr2, cp1, cp2}; // passando objetos
		report.imprimir(contas);
		
		// Forma 2 de passar todas contas pra lista
		Conta[] contasJulho = new Conta[4];		
		contasJulho[0] = new ContaReceber(cli1, "Coca 600ml gustavo", 6, "28/07/2022");
		contasJulho[1] = new ContaReceber(cli2, "Coca Cola Cafe otavio", 3, "29/07/2022");
		contasJulho[2] = new ContaPagar(forn1, "Compra de 6 fardos coca", 450, "01/07/2022");
		contasJulho[3] = new ContaPagar(forn2, "Compra antartica 1 fardo", 80, "05/07/2022");
		report.imprimir(contasJulho);
	}
}
