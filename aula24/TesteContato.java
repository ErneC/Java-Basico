package com.ernestina.cursojava.aula24;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato cont = new Contato();//instanciar
		
		cont.nome = "Aline";
		cont.email = "aline@gmail.com";
		cont.endereco = "Rua Linda, n 45, Pampis";
		
		cont.telefones = new String[3];
		cont.telefones[0] = "75888888888";
		cont.telefones[1] = "75843888888";
		cont.telefones[2] = "75888658888";

	}

}
