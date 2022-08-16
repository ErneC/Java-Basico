package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class CalculaArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do circulo:" );
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A area do circulo é: " + area);
	}

}
