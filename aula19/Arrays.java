package com.ernestina.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturaSemanal = new double[7];
		
		temperaturaSemanal[0] = 29.1;
		temperaturaSemanal[1] = 32.7;
		temperaturaSemanal[2] = 31.3;
		temperaturaSemanal[3] = 33.2;
		temperaturaSemanal[4] = 29.5;
		temperaturaSemanal[5] = 28.1;
		temperaturaSemanal[6] = 30.4;
		
		/*System.out.println("A temp. do dia 01 é: " +temperaturaSemanal[0]);
		System.out.println("O tam. do array é: " +temperaturaSemanal.length);*/
		
		for(int i = 0; i < temperaturaSemanal.length; i++) {
			System.out.println("A temp. do dia " +(i+1)+ " é : " +temperaturaSemanal[i]);
		}
		
		// ou
		
		for(double temp : temperaturaSemanal) {
			System.out.println(temp);
		}
		
		

	}

}
