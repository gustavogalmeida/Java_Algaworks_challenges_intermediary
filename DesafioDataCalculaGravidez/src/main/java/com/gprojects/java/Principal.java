package com.gprojects.java;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ola sou seu Dr Computador!");
		System.out.print("Qual seu nome: ");
		
		String nome = scan.nextLine();
		System.out.print("Data da ultima menstruacao: ");
		String data = scan.nextLine();
		System.out.println();
		CalculadoraGravidez.calcular(data);
	}
}
