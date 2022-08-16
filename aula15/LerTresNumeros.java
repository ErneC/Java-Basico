package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class LerTresNumeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o 1 número:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o 2 número:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o 3 número:");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Maior num1: " +num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("Maior num2: " +num2);
		}else {
			System.out.println("Maior num3: " +num3);
		}
		
		

	}

}
