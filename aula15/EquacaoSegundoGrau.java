package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a: ");
		int a = scan.nextInt();
		
		if(a == 0) {
			System.out.println("Nao é uma equaçao de segundo grau.");
		} else {
				
			System.out.println("Entre com o valor de b: ");
			int b = scan.nextInt();
			
			System.out.println("Entre com o valor de c: ");
			int c = scan.nextInt();
			
			double delta = (b * b) - (4 * a * c);
			
			if(delta<0) {
				System.out.println("Delta negativo. Nao tem raizes. ");
			}else {
				
				System.out.println("Valor de delta: " +delta);
				
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);
				
			}
		}
		
		
	
		
		

	}

}
