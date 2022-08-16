package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um ano. Ex.: 2015...");
		int ano = scan.nextInt();
		
		if(ano % 400 == 0 ||  ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("Ano Bissexto.");
		}else {
			System.out.println("Ano nao é Bissexto.");
		}

	}

}
