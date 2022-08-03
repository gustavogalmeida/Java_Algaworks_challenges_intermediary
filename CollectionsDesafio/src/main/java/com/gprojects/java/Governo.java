package com.gprojects.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {
	
	Map<String, List<Politico>> partidosPoliticos;
	
	public Governo(){
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		politicos.add(politico);
		
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}
	
	public BigDecimal calcularGastosComSalario (String partidoPolitico) {
		
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal salarios = new BigDecimal(0);
		for (Politico p : politicos) {
			salarios = salarios.add(p.getCargo().getSalario());
		}
		return salarios;
	}
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal salarios = new BigDecimal(0);
		
		for (Politico p : politicos) {
			if (p.getCargo().equals(cargo)) {
				salarios = salarios.add(p.getCargo().getSalario());
			}
		}
		
		return salarios;
	}
	
}
