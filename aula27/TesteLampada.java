package com.ernestina.cursojava.aula27;


public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		lampada.mostrarEstado(); //li
		lampada.desligar();
		lampada.mostrarEstado(); //des
		lampada.mudarEstado();
		lampada.mostrarEstado(); //li
		
	}

}
