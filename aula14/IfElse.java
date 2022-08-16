package com.ernestina.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("Maior de idade.");
		} else {
			System.out.println("Menor de idade.");
		}
		
		System.out.println("Entre com o valor do produto: ");
		double valorProduto = scan.nextDouble();
		
		if(valorProduto <= 10) {
			System.out.println("Bem baratinho, pode comprar. ");
		} else if (valorProduto > 10 && valorProduto <=15 ){
			System.out.println("Dá um desconto, please?");
		}else if (valorProduto > 15 && valorProduto < 17 ) {
			System.out.println("Vamos pesquisar mais.");
		} else {
			System.out.println("Muito caro.");
		}
	}

}
