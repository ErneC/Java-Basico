package com.ernestina.cursojava.aula24;

public class TesteContaCorrente {

	public static void main(String[] args) {
	
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.numero = "123456";
		conta1.agencia = "01";
		conta1.especial = true;
		conta1.limiteEspecial = 500;
		conta1.saldo = 10;
		
		System.out.println("Saldo da conta " +conta1.numero+ " R$ " +conta1.saldo);

	}

}
