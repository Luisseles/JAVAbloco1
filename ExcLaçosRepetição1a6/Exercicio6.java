/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero)*/

package ExcLaçosRepetição1a6;

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
		System.out.println( "A média nos números inseridos que são múltiplos de 3 é: "
		+ media);
	}
}
		

	


