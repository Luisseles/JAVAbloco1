// Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.

package ExcLaçosRepetição1a6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
int  num = 1000 , resto ;
		
		for ( num = 1000 ; num < 2000 ; num ++) {
			resto = num % 11 ;
			
			if ( resto == 5 ) {
				System.out.println( num + "" );
			}
		}

	}

}
		   
            
		
		
       
        	
        
        	
       
	


