package com.ernestina.cursojava.aula27;



public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		//System.out.println(van.marca);
		//System.out.println(van.modelo);
				
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia(); 
		//System.out.println("Autonomia do carro: " +autonomia);
		
		double qntdCombustivel10 = van.calcularCombustivel(10);//passou param./argumento.
		double qntdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Quantidade de combustivel : " +qntdCombustivel10);
		System.out.println("Quantidade de combustivel : " +qntdCombustivel15);
		
		

	}

}
