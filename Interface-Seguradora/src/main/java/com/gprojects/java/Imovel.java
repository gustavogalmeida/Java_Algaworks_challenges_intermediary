package com.gprojects.java;

public class Imovel implements Seguravel{
	
	private double valorMercado;
	private int areaConstruida;
	
	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	public String obterDescricao() {
		return "Imovel com area construida de " + this.areaConstruida + "m2 e valor de mercado R$ " + this.valorMercado;
	}
	
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * this.valorMercado;
		valorApolice += (this.areaConstruida * 0.05); 
		
		return valorApolice;
	}
}
