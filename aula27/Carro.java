package com.ernestina.cursojava.aula27;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " +capCombustivel*consumoCombustivel+ " km.");
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo  obterAutonomia tipo double abaixo... ");
		
		return capCombustivel*consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qntdCombustivel = km /consumoCombustivel;
		return qntdCombustivel;
	}
}
