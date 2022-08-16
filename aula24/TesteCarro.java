package com.ernestina.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro(); // Criei uma variavel chamada van e instanciei o objeto.
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		
		van.exibirAutonomia(); //como chamamos o método no main.
		double autonomia = van.obterAutonomia(); // metodo com retorno double. return.
		System.out.println("Autonomia do carro: " +autonomia);
		
		Carro fusca = new Carro();
		
		fusca.marca = "VolksWagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println(fusca.numPassageiros);
		
		


	}

}
