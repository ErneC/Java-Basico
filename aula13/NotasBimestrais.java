package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class NotasBimestrais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua média é: " +media);
		
		

	}
}