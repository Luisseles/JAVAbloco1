package Exercícios1a4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1-Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.printf("Digite o primeiro numero: ");
		n1=leia.nextInt();
		
		System.out.printf("Digite o segundo numero: ");
		n2=leia.nextInt();
		
		System.out.printf("Digite o terceiro numero: ");
		n3=leia.nextInt();
		
		if (n1> n2 && n1 > n3) {
			System.out.printf("O maior numero é: "+n1);
		}
		else if (n2> n1 && n2 > n3) {
			System.out.printf("O maior numero é: "+n2);
	}
		else {
			System.out.printf("O maior numero é: "+n3);}
	
			
		}
	
	
}

	




