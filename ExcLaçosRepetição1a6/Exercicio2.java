//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

package ExcLa�osRepeti��o1a6;

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
		System.out.println( "A quantidade de n�meros pares inseridos �: " + contPar );
		System.out.println( "A quantidade de n�meros impares inseridos �: " + contImpar );
	}

}
	


