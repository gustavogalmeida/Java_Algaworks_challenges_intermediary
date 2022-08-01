package com.gprojects.java;

public class Carro implements Seguravel{

	public double valorMercado;
	public int anoFabricacao;
	
	public Carro(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	public String obterDescricao() {
		return "Carro fabricado em " + this.anoFabricacao + " e com valor de mercado: " + this.valorMercado;
	}

	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.04;
		if (this.anoFabricacao < 2000) {
			valorApolice *= 0.90;
		}
		return valorApolice;
	}
	
}
