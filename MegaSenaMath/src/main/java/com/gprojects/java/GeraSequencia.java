package com.gprojects.java;

public class GeraSequencia {
	public String gerar() {
		
		int proximo;
		int[] intSequencia = new int[6];
		String strSequencia = "";
		int i = 0;
		
		do {
			
			boolean repetido=false;
			proximo = (int) (Math.random() * 60 + 1);
			
			for (int j = 0; j < 6; j++) {
				if (proximo == (intSequencia[j])) {
					repetido = true;
				}
			}
			
			if (!repetido) {
				intSequencia[i] = proximo;
				i++;
			}
			
		} while (i < 6);
		
		
		
		for (int j = 0; j < 6; j++) {
			strSequencia += intSequencia[j];
			if (j == 5) {
				strSequencia += ".";
			} else {
				strSequencia += ", ";
			}
		}
		
		return strSequencia;
	}
}
