/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero)*/

package ExcLa�osRepeti��o1a6;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num , resto , soma = 0 , cont = 0 ;
		 double media ;
		
		Scanner  leia = new  Scanner ( System . in );
		
		do {
			System.out.printf( "Digite um numero: " );
			num = leia . nextInt ();
			
			resto = num % 3 ;
			
			if ( resto == 0 && num != 0 ) {
				soma += num ;
				cont ++;
			}
			media = soma / cont ;
		} while ( num != 0 );
		System.out.println( "FIM DO PROGRAMA..." );
		System.out.println( "A m�dia nos n�meros inseridos que s�o m�ltiplos de 3 �: "
		+ media);
	}
}
		

	


