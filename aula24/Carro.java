package com.ernestina.cursojava.aula24;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " +capCombustivel*consumoCombustivel+ " km.");
	} // método sem retorno - void. 
	
	double obterAutonomia() {
		
		System.out.println("Método  obterAutonomia tipo double abaixo... ");
		
		return capCombustivel*consumoCombustivel;
	}// métido com retorno do tipo doule.
}
