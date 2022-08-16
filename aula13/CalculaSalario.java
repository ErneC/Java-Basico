package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o preço da hora trabalhada?");
		double precoHora = scan.nextDouble();
		
		System.out.println("Quantas horas voce trabalhou?");
		double horaTrabalhada = scan.nextDouble();
		
		double calcularSalario = precoHora * horaTrabalhada;
		
		System.out.println("Seu salário é: " +calcularSalario+ " reais.");
		
		

	}

}
