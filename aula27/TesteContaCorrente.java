package com.ernestina.cursojava.aula27;


public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.numero = "123456";
		conta1.agencia = "01";
		conta1.especial = true;
		conta1.limiteEspecial = 500;
		conta1.valorEspecialUsado = 0;
		conta1.saldo = 0;
		
		System.out.println("Saldo da conta " +conta1.numero+ " R$ " +conta1.saldo);
		
		boolean saqueEfetuado = conta1.realizarSaque(500);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta1.consultarSaldo();
		}else {
			System.out.println("Nao foi possível realizar o saque.Saldo insuficiente.");
		}
		
		saqueEfetuado = conta1.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais!");
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta1.consultarSaldo();
		}else {
			System.out.println("Nao foi possível realizar o saque.Saldo insuficiente.");
		}
		
		
		System.out.println("Deposito de 500 reais.");
		conta1.depositar(500);
		conta1.consultarSaldo();
		
		if(conta1.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial.");
		}else {
			System.out.println("Nao está usando cheque especial.");
		}
		
		conta1.realizarSaque(600);
		conta1.consultarSaldo();
		if(conta1.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial.");
		}else {
			System.out.println("Nao está usando cheque especial.");
		}

	}

}
