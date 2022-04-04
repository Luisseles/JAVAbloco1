//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares.

package ExcLaçosRepetição1a6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int  num , resto , contPar = 0 , contImpar = 0 ;
		
		Scanner  leia = new  Scanner ( System . in );
		
		for ( int  n = 1 ; n <= 10 ; n ++) {
			System.out.printf( "Digite um numero: " );
			num = leia . nextInt ();
			resto = num % 2 ;
					
			if ( resto == 0 ) {
				contPar ++;
			}
			else {
				contImpar ++;
			}
		}
		System.out.println( "A quantidade de números pares inseridos é: " + contPar );
		System.out.println( "A quantidade de números impares inseridos é: " + contImpar );
	}

}
	


