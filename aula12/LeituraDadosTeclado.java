package com.ernestina.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("A sua idade é: " + idade);
		
		System.out.println("Digite seu primeiro nome, idade e altura: ");
		String nome = scan.next();
		int idade2 = scan.nextInt();
		float altura = scan.nextFloat();
		
		
		System.out.println("Seu nome:" +nome);
		System.out.println("Sua idade:" +idade2);
		System.out.println("Sua altura:" +altura);
		
	

	}

}
