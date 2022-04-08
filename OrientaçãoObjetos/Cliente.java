package OrientaçãoObjetos;

import java.util.Scanner;

public class Cliente {
	public static void main(String[]args) {
		MoldCliente C1 = new MoldCliente();
		Scanner ler = new Scanner(System.in);
		
		C1.nome = "Vanessa";
		C1.consumidor = "Sim";
		C1.tempo = 5;
		C1.cliente = false;
		
		C1.status();
		if(C1.cliente == true) {
			System.out.println("Obrigado por escolher nossos produtos, qualidade é o nosso lema!");
		}else
			System.out.println("Torne-se nosso(a) cliente e desfrute de todos os nossos"
					+ " benefícios...");
	}

}
