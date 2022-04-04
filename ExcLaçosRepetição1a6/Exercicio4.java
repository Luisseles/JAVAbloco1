/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

package ExcLaçosRepetição1a6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  idade , sexo , opcao ;
		int  contPC = 0 , contMN = 0 , contHA = 0 ;
		int  contOC = 0 , contN40 = 0 , contC18 = 0 ;
		int  contInt = 0 ;
		
		Scanner  leia = new  Scanner ( System . in );
		
		System.out.println( "Digite sua idade: " );
		idade = leia . nextInt ();
		
		System.out.println( "Digite seu sexo de acordo com as opções abaixo: " );
		System.out.printf( "(1 - Feminino | 2 - Masculino | 3 - Outro) - " );
		sexo = leia . nextInt ();
		
		System.out.println( "Que tipo de pessoa você é? Escolha dentre as opções abaixo:" );
		System.out.println( "(1 - Calma | 2 - Nervosa | 3 - Agressiva) - " );
		opcao = leia . nextInt ();
		
		if ( opcao == 1 ) {
			contPC ++;
		}
		if ( sexo == 1 && opcao == 2 ) {
			contMN ++;
		}
		if ( sexo == 2 && opcao == 3 ) {
			contHA ++;
		}
		if ( sexo == 3 && opcao == 1 ) {
			contOC ++;
		}
		if ( idade > 40 && opcao == 2 ) {
			contN40 ++;
		}
		if ( idade < 18 && opcao == 1 ) {
			contC18 ++;
		}
		contInt ++;
		
		while ( contInt < 150 && idade >= 1 && sexo >= 1 && sexo <= 3 && opcao >= 1 && opcao <= 3 ) {
			
			System.out.println( "PRÓXIMO INTREVISTADO!" );
			System.out.println( "Digite sua idade: " );
			idade = leia . nextInt ();
			
			System.out.println( "Digite seu sexo de acordo com a opção abaixo: " );
			System.out.println( "(1 - Feminino | 2 - Masculino | 3 - Outro) - " );
			sexo = leia . nextInt ();
			
			System.out.println( "Que tipo de pessoa você é? Escolha dentre a opção abaixo:" );
			System.out.println( "(1 - Calma | 2 - Nervosa | 3 - Agressiva) - " );
			opcao = leia . nextInt ();
			
			if ( opcao == 1 ) {
				contPC ++;
			}
			if ( sexo == 1 && opcao == 2 ) {
				contMN ++;
			}
			if ( sexo == 2 && opcao == 3 ) {
				contHA ++;
			}
			if ( sexo == 3 && opcao == 1 ) {
				contOC ++;
			}
			if ( idade > 40 && opcao == 2 ) {
				contN40 ++;
			}
			if ( idade < 18 && opcao == 1 ) {
				contC18 ++;
			}
			contInt ++;
		}
		System.out.printf( "O número de pessoas calmas é: " + contPC );
		System.out.printf( "O número de mulheres nervosas é: " + contMN );
		System.out.printf( "O número de homens agressivos: " + contHA );
		System.out.printf( "O número de outros calmos: " + contOC );
		System.out.printf( "O numero de pessoas nervosas com mais de 40 anos: " + contN40 );
		System.out.printf( "O número de pessoas calmas com menos de 18 anos: " + contC18 );
	}

}

		

	


