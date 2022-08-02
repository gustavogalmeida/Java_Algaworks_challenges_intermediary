package com.gprojects.java;

import java.util.Scanner;

public class MegaSena {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GeraSequencia geraSequencia = new GeraSequencia();
		
		System.out.println("Quantas jogos você precisa? ");
		int j = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < j; i++) {
			System.out.println(geraSequencia.gerar());
		}
	}
}
