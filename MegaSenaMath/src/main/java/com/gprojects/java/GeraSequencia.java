package com.gprojects.java;

public class GeraSequencia {
	public String gerar(int qtdMarcar, int maximoCasas) {
		
		int proximo;
		int[] intSequencia = new int[qtdMarcar];
		
		
		int i = 0;
		do {
			
			boolean repetido=false;
			proximo = (int) (Math.random() * maximoCasas + 1);
			
			for (int j = 0; j < qtdMarcar; j++) {
				if (proximo == (intSequencia[j])) {
					repetido = true;
				}
			}
			
			if (!repetido) {
				intSequencia[i] = proximo;
				i++;
			}
			
		} while (i < qtdMarcar);
		
		
		String strSequencia = "";
		for (int j = 0; j < qtdMarcar; j++) {
			strSequencia += intSequencia[j];
			if (j == (intSequencia.length - 1)) {
				strSequencia += ".";
			} else {
				strSequencia += ", ";
			}
		}
		
		return strSequencia;
	}
}
