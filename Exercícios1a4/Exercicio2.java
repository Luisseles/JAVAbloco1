package Exercícios1a4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2-Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.printf("Entre com o primeiro número: ");
		n1=leia.nextInt();
		
		System.out.printf("Entre com o segundo número: ");
		n2=leia.nextInt();
		
		System.out.printf("Entre com o terceiro número: ");
		n3=leia.nextInt();

		if(n1<n2)
		{
			if(n2<n3)
			{
				System.out.println("A ordem crescente correta é: " + (n1) + " " + (n2) + " " + (n3));
			}
			else if(n1<n3) 
			{
				System.out.println("A ordem crescente correta é: "+(n1) + (n3) + (n2));
			} 
			else 
			{
				System.out.println("A ordem crescente correta é: "+(n3) + (n1) + (n2));
			}
		}
			else if(n2<n3) 
			{
				if(n1<n3) 
				{
					System.out.println("A ordem crescente correta é: "+(n2) + (n1) + (n3));
				}else 
				{
					System.out.println("A ordem crescente correta é: "+(n2) + (n3) + (n1));
				}
			} 
			else 
			{
				System.out.println("A ordem crescente correta é: "+(n3) + (n2) + (n1));
			}
	}
}

			
		
			
		
		
				
			
				
			
			
		
		
