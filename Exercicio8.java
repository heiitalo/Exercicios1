package br.com.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de Fábrica: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.println("O valor do carro é: " + custoConsumidor);
		
		leia.close();
		
		
	}

}
