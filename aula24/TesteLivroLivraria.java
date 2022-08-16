package com.ernestina.cursojava.aula24;

public class TesteLivroLivraria {

	public static void main(String[] args) {
		
		LivroLivraria livro1 = new LivroLivraria();
		
		livro1.nome = "As Cronicas de Nárnia";
		livro1.autor = "C.S.Lewis";
		livro1.qntPaginas = 700;
		livro1.anoLancamento = 1890;
		livro1.isbn = "ERN-2003";
		livro1.preco = 63.39;
		
		System.out.println("Nome do autor: " +livro1.preco);

	}

}
