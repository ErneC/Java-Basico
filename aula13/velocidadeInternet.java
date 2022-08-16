package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class velocidadeInternet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tam do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet: ");
		double velocidadeInternet = scan.nextDouble();
		
		double tempo = tamArquivo / velocidadeInternet;
		
		System.out.println("Tempo de Download: " +tempo+ " minutos.");
		
		

	}

}
