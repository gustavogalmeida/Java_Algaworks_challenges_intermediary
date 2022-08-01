package com.gprojects.java;

public class Iphone implements Seguravel{
	
	private int numeroModelo;
	private String nomeCompletoModelo;
	private int memoria;

	public Iphone(int numeroModelo, String especificacao, int memoria) {
		this.numeroModelo = numeroModelo;
		this.nomeCompletoModelo = especificacao;
		this.memoria = memoria;
	}

	public String obterDescricao(){
		return "Iphone " + this.nomeCompletoModelo + " " + this.memoria + "Gb";
	}
	
	public double calcularValorApolice() {
		double multiplicador;
		
		multiplicador = numeroModelo/100.0;
		
		if (memoria >= 128) {
			multiplicador += 0.01;
		}
		
		double valorApolice = (3000*multiplicador);
		
		return valorApolice;
	}
}
