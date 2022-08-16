package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class NumeroInformado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = scan.nextInt();
		System.out.println("O número informado foi: " +num);
		

	}

}
