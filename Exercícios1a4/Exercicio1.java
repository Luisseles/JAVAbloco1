package Exerc�cios1a4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.printf("Digite o primeiro numero: ");
		n1=leia.nextInt();
		
		System.out.printf("Digite o segundo numero: ");
		n2=leia.nextInt();
		
		System.out.printf("Digite o terceiro numero: ");
		n3=leia.nextInt();
		
		if (n1> n2 && n1 > n3) {
			System.out.printf("O maior numero �: "+n1);
		}
		else if (n2> n1 && n2 > n3) {
			System.out.printf("O maior numero �: "+n2);
	}
		else {
			System.out.printf("O maior numero �: "+n3);}
	
			
		}
	
	
}

	




