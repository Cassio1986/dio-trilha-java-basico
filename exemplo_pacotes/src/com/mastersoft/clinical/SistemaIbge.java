package com.mastersoft.clinical;

public class SistemaIbge {
public static void main(String[] args) {
	for(EstadoBrasileiro uf: EstadoBrasileiro.values()) {
		System.out.println(uf.getSigla() + " - " + uf.getNomeMaiusculo());		
	}
	EstadoBrasileiro uf = EstadoBrasileiro.SAO_PAULO;
	
	System.out.println(uf.getSigla());
	System.out.println(uf.getNomeMaiusculo());
	System.out.println(uf.getIbge());
	System.out.println(uf.getNome());
	
}
}
