package com.gprojects.course;

public class MathUtil {
	
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}
	
	public static double areaCircle(double raio) {
		final double PI = 3.14;
		
		double area = (raio*raio)*PI;
		
		return area;
	}
}
