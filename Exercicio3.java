package br.com.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int segundosTotais, segundos, minutos, horas;
		
		Scanner leia = new Scanner(System.in);
		
				
		System.out.println("Qual o total de segundos de jornada? ");
		
		segundosTotais = leia.nextInt();
		
		horas = segundosTotais / 3600;
		minutos = (segundosTotais % 3600) / 60;
		segundos = (segundosTotais % 3600) % 60;
		
		System.out.println(horas + "horas " + minutos + "minutos " + segundos + "seguntos");
		
		leia.close();
		
				
		
	}

}
