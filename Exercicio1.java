package br.com.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int dia, mes, ano;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem? ");
        ano = leia.nextInt();
        
        System.out.println("Quantos meses você tem? ");
        mes = leia.nextInt();
        
        System.out.println("Quantos dias você tem? ");
       dia = leia.nextInt();
       
       System.out.print("Seu total de dias é: " + (ano * 365) + (mes * 30) + dia);
       
       leia.close();
        
	}

}
