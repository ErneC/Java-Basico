package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class MasculinoFeminino {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra (F ou M):");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("M")) {
			System.out.println("Masculino.");
		}else if(letra.equalsIgnoreCase("F")) {
			System.out.println("Feminino.");
		} else {
			System.out.println("Sexo inválido.");
		}
		

	}

}
