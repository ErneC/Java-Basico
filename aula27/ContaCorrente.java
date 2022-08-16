package com.ernestina.cursojava.aula27;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar) {
		if(saldo >= quantiaASacar) {
			saldo = saldo - quantiaASacar;
			return true;
		}else if(especial) {
			double limite = limiteEspecial + saldo;
			if(limite >= quantiaASacar) {
				saldo = saldo - quantiaASacar;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo da conta." +saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
