package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class ConverteGrau {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o Grau em Fahrenheit: ");
		double grauFahrenheit = scan.nextDouble();
		
		double grauCelsius = (5 * (grauFahrenheit - 32)/9);
		
		System.out.println("Grau em Celsius: " +grauCelsius+ " C. ");
		
		

	}

}
