package Orienta��oObjetos;

import java.util.Scanner;

public class Avi�o {
	
	public static void main(String[]args) {
		MoldAvi�o av1 = new MoldAvi�o();
		Scanner ler = new Scanner(System.in);
		
		av1.cor = "branca";
		av1.tamanho = 15.5;
		av1.capacidade = 100;
		av1.seguro = true;
		
		av1.status();
		if(av1.seguro==true) {
			System.out.println("Aeronave esta apta para voo!");
			av1.seguro=ler.nextBoolean();
			
			
		}
		else
			System.out.println("ATEN��O, arenove precisa de manuten��o,"
					+ "n�o est� apta para voo!");
		
		
		
		
		
	
	}
	
	

}
