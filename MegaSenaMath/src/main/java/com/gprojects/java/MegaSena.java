package com.gprojects.java;

import java.util.Scanner;

public class MegaSena {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GeraSequencia geraSequencia = new GeraSequencia();
		
		System.out.println("Quantas jogos você precisa? ");
		int jogos = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Quantas casas tem seu jogo? ");
		int maximoCasas = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Quantos numeros deseja marcar no jogo? ");
		int qtdMarcar = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < jogos; i++) {
			System.out.print("Jogo " + (i+1) + ": " + geraSequencia.gerar(qtdMarcar, maximoCasas));
			System.out.println();
		}
	}
}
