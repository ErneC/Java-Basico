package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class PerguntasInvestiga {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a v�tima? ");
		String resp1 = scan.next();
		
		System.out.println("Esteve no local do crime? ");
		String resp2 = scan.next();
		
		System.out.println("Mora perto da v�tima? ");
		String resp3 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima? ");
		String resp4 = scan.next();
		
		int count = 0;
		
		if(resp1.equalsIgnoreCase("S")) {
			count++;
		}
		
		if(resp2.equalsIgnoreCase("S")) {
			count++;
		}
		
		if(resp3.equalsIgnoreCase("S")) {
			count++;
		}
		
		if(resp4.equalsIgnoreCase("S")) {
			count++;
		}
		
		if(count == 2) {
			System.out.println("Suspeito. ");
		}else if(count == 3 || count == 4) {
			System.out.println("C�mplice. ");
		}else if(count == 5) {
			System.out.println("Assasino. ");
		} else {
			System.out.println("Inocente. ");
		}
		
		

	}

}
