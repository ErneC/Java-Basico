package com.ernestina.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		//for crescente
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Valor de i: " +i);
		}
		
		//for decrescente
		for(int i = 5; i >= 0 ; i--) {
			System.out.println("Valor de i: " +i);
		}
		
		//for com +1 variável
		for(int i = 0, j = 10 ; i < j ; i++, j--) {
			System.out.println("Valor de i: " +i+ " e valor de j: "+j);
		}
		
		//for com partes ausentes
		int count = 0;
		for( ; count < 12; ) {
			System.out.println(count);
			count+=2;
		}

	}

}
