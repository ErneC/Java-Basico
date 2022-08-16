package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o num1: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o num2: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre com o num3: ");
		double num3 = scan.nextDouble();
		
		if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
			
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
			
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
			
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
			
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			
		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}
	} 

}
