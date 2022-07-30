package com.gprojects.impressao.impressoras;

import com.gprojects.impressao.Impressora;
import com.gprojects.impressao.Imprimivel;

public class Bematech implements Impressora {

	public void imprimir(Imprimivel imprimivel) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------------");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("- - - - - - - - - / / - - - - - - - - - - - - -");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("===============================================");
		System.out.println("...................Bematech....................");
		System.out.println("===============================================");
	}

}
