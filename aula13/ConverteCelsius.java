package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class ConverteCelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o Grau em Celsius: ");
		double grauCelsius  = scan.nextDouble();
		
		double grauFahrenheit = ( grauCelsius * 1.8) + 32;
		
		System.out.println(" Fahrenheit : " +grauFahrenheit);
		

	}

}
