package com.ernestina.cursojava.aula24;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " +capCombustivel*consumoCombustivel+ " km.");
	} // m�todo sem retorno - void. 
	
	double obterAutonomia() {
		
		System.out.println("M�todo  obterAutonomia tipo double abaixo... ");
		
		return capCombustivel*consumoCombustivel;
	}// m�tido com retorno do tipo doule.
}
