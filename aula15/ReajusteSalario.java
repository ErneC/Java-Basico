package com.ernestina.cursojava.aula15;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com seu sal�rio: ");
		double salario = scan.nextDouble();
		
		int percentual = 0;
		
		if(salario <= 280) {
			percentual = 20;
		} else if (salario > 280 && salario <= 700) {
			percentual = 15;
		} else if (salario > 700 && salario <= 1500) {
			percentual = 10;
		} else if (salario > 1500) {
			percentual = 5;
		}
		
		double aumento = (salario /100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("Sal�rio antes do ajuste R$: " +salario);
		System.out.println("Percentual de aumento aplicado: " +percentual);
		System.out.println("Valor do aumento R$: " +aumento);
		System.out.println("Novo sal�rio, ap�s o aumento R$: " +salarioAjustado);
		
	}

}
