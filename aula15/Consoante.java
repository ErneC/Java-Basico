package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class Consoante {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra: ");
		String letra = scan.next();
		
		/*if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
				|| letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") 
				|| letra.equalsIgnoreCase("u")) {
			System.out.println("A letra � uma vogal");
		} else {
			System.out.println("A letra � uma consoante");
		}*/

		
		if(letra.length() > 1) {
			System.out.println("Entre com APENAS 1 LETRA.");
		}else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":System.out.println("A letra � uma vogal");break;
			default: System.out.println("A letra � uma consoante");
			}
		}
		

	}
}	
