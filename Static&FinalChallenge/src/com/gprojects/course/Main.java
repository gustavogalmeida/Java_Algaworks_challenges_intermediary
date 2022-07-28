package com.gprojects.course;

public class Main {
	public static void main(String[] args) {
		int numeroFibonacci = MathUtil.calcularFibonacci(8);
		System.out.println("Numero de Fibonacci da posicao 8: " + numeroFibonacci);
		
		double areaCirculo = MathUtil.areaCircle(104.8);
		System.out.println("Area do circulo: " + areaCirculo);
	}
}
