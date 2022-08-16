package com.ernestina.cursojava.aula20;

public class MatrizAlunosNotas {

	public static void main(String[] args) {
		
		double[] [] notasAlunos = new double [3][4];
		
		notasAlunos[0][0] = 9.8;
		notasAlunos[0][1] = 8.0;
		notasAlunos[0][2] = 9.4;
		notasAlunos[0][3] = 9.1;
		
		notasAlunos[1][0] = 8.7;
		notasAlunos[1][1] = 6.9;
		notasAlunos[1][2] = 8.8;
		notasAlunos[1][3] = 8.2;
		
		notasAlunos[2][0] = 9.7;
		notasAlunos[2][1] = 9.9;
		notasAlunos[2][2] = 9.8;
		notasAlunos[2][3] = 10.0;
		
		//imprimindo  matriz na tela
		
		for(int i = 0; i < notasAlunos.length; i++) {
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("Calculando a média de cada aluno.");
		
		double soma;
		for(int i = 0; i < notasAlunos.length; i++) {
			
			soma = 0;
			
			for(int j = 0; j < notasAlunos[i].length; j++) {
				soma = soma + notasAlunos[i][j];
			}
			
			System.out.println(" A média do aluno " +i+ " é " + (soma/4));
	}
}
}