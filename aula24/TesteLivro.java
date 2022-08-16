package com.ernestina.cursojava.aula24;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.nome = "As Cronicas de Nárnia";
		livro1.autor = "C.S.Lewis";
		livro1.qntPaginas = 700;
		livro1.anoLancamento = 1890;
		livro1.isbn = "ERN-2003";
		
		System.out.println("Nome do autor: " +livro1.autor);
		

	}

}
