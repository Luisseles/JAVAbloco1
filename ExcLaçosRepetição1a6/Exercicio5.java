/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/


package ExcLaçosRepetição1a6;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int  num , soma = 0 ;
		
		Scanner  leia = new  Scanner ( System . in );
		
		do {
			System.out.printf( "Digite um numero: " );
			num = leia . nextInt ();
			soma += num ;
		} while ( num != 0 );
		System.out.printf( "A soma dos números digitados é: " + soma );
	}
}

	


