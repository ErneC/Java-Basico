package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class DobroArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre como o tam do lado do quadrado: ");
		double ladoQuadrado = scan.nextDouble();
		
		double area = Math.pow(ladoQuadrado, 2);
		double dobroArea = area * 2;
		
		System.out.println("A area do quadrado é: " +area);
		System.out.println("O dobro da area do quadrado é: " +dobroArea);
		
		

	}

}
