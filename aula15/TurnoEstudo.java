package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class TurnoEstudo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o turno que voce estuda? (M-V-N)? ");
		String turno = scan.next();
		
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia! ");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa Tarde! ");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite! ");
		} else {
			System.out.println("Valor inválido! ");
		}

	}

}
