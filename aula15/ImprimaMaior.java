package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class ImprimaMaior {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O num1  ? o maior : " + num1);	
		} else {
			System.out.println("O num2 ? o maior : " + num2);
		}
		

	}

}
