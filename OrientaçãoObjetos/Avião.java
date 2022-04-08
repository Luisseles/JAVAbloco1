package OrientaçãoObjetos;

import java.util.Scanner;

public class Avião {
	
	public static void main(String[]args) {
		MoldAvião av1 = new MoldAvião();
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
			System.out.println("ATENÇÃO, arenove precisa de manutenção,"
					+ "não está apta para voo!");
		
		
		
		
		
	
	}
	
	

}
