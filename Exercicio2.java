package br.com.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int diasTotais = 0, dias = 0, meses = 0, anos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos dias de vida você tem? ");
		diasTotais = leia.nextInt();
		
		anos = diasTotais / 365;
		meses = (diasTotais % 365) / 30;
		dias = (diasTotais % 365) % 330;
		
		System.out.println(anos + "anos, " + meses + "meses, " + dias + "dias");
				
		leia.close();
		

	}

}
