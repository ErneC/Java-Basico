package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int segundoNumero = scan.nextInt();
		
		int somaNumeros = primeiroNumero + segundoNumero;
		
		System.out.println("A soma dos numeros �: " +somaNumeros);
		
		
		

	}

}
