package com.ernestina.cursojava.aula13;

import java.util.Scanner;

public class TotalSalarioMes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o preço da hora trabalhada?");
		double precoHora = scan.nextDouble();
		
		System.out.println("Quantas horas voce trabalhou?");
		double horaTrabalhada = scan.nextDouble();
		
		double salarioBruto = precoHora * horaTrabalhada;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto R$: " +salarioBruto);
		System.out.println("INSS R$: " +inss);
		System.out.println("Sindicato R$: " +sindicato);
		System.out.println("Imposto de Renda R$: " +ir);
		System.out.println("Total de Desconto R$: " +totalDescontos);
		System.out.println("Salário Liquido R$: " +salarioLiquido);

	}

}
