package Exerc�cios1a4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2-Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.printf("Entre com o primeiro n�mero: ");
		n1=leia.nextInt();
		
		System.out.printf("Entre com o segundo n�mero: ");
		n2=leia.nextInt();
		
		System.out.printf("Entre com o terceiro n�mero: ");
		n3=leia.nextInt();

		if(n1<n2)
		{
			if(n2<n3)
			{
				System.out.println("A ordem crescente correta �: " + (n1) + " " + (n2) + " " + (n3));
			}
			else if(n1<n3) 
			{
				System.out.println("A ordem crescente correta �: "+(n1) + (n3) + (n2));
			} 
			else 
			{
				System.out.println("A ordem crescente correta �: "+(n3) + (n1) + (n2));
			}
		}
			else if(n2<n3) 
			{
				if(n1<n3) 
				{
					System.out.println("A ordem crescente correta �: "+(n2) + (n1) + (n3));
				}else 
				{
					System.out.println("A ordem crescente correta �: "+(n2) + (n3) + (n1));
				}
			} 
			else 
			{
				System.out.println("A ordem crescente correta �: "+(n3) + (n2) + (n1));
			}
	}
}

			
		
			
		
		
				
			
				
			
			
		
		
