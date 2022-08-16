package com.ernestina.cursojava.aula24;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		
		lampada1.modelo = "A60";
		lampada1.tensao = "Bivolt";
		lampada1.garantiaMeses = 36;
		lampada1.potencia = 7;
		lampada1.cor = "Amarela";
		lampada1.tipoLuz = "Amarela";
		
		lampada1.tipos = new String[5];
		lampada1.tipos[0] = "Abajur";
		lampada1.tipos[1] = "Lampeao";
		

	}

}
