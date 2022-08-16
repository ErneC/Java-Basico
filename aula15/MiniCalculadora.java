package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o um numero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com outro numero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre com a operaçao (+ - * /): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+" : resultado = num1 + num2; break;
		case "-" : resultado = num1 - num2; break;
		case "*" : resultado = num1 * num2; break;
		case "/" : resultado = num1 / num2; break;
		default : 
			System.out.println("Operaçao inválida."); 
			valida = false; 
		
		}
		
		if(valida) {
			
			System.out.println("Resultado = " +resultado);
			
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			}else {
				System.out.println("Resultado negativo.");
			}
			
			if(resultado % 2 == 0) {
				System.out.println("Numero par.");
			}else {
				System.out.println("Numero impar.");
			}
		}
		
		
		
		

	}

}










