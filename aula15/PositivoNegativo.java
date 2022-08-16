package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("Positivo.");
		} else {
			System.out.println("Negativo.");
		}
		
	}

}
