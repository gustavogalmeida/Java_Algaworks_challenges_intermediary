package com.gprojects.java;

/**
 * Classe Politico com atributos e seus metodos acessores.
 * nome: String
 * cargo: Cargo 
 * @author Gustavo Almeida
 *
 */
public class Politico {
	private String nome;
	private Cargo cargo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
