package br.com.exercicios;

public class Exercicio6 {

	public static void main(String[] args) {
	
	double X1 = 4.0, X2 = 5.0, Y1 = 7.0, Y2 = 8.0;
	double P1 = (X2 - X1), P2 = (Y2 - Y1);
	double P3 = Math.pow(P1, 2.0), P4 = Math.pow(P2, 2.0);
	double P5 = Math.pow(P1, 2.0) + Math.pow(P2, 2.0);
	double D =  Math.sqrt(P5);
	
	System.out.println(D);
	
	

	}

}
