package OrientaçãoObjetos;

import java.util.Scanner;

public class Celular {
	public static void main(String[]args) {
		MoldCelular Cel = new MoldCelular();
		Scanner ler = new Scanner(System.in);
		
		Cel.cor = "black";
		Cel.marca = "Apple";
		Cel.modelo = 2022;
		Cel.bloqueado = false;
		
		Cel.status();
		if(Cel.bloqueado == true) {
			System.out.println("Impossível fazer ligações, o aparelho está bloqueado!");
			Cel.bloqueado =ler.nextBoolean();
			
		}else
			System.out.println("Ligando...");
		
		
	}

}
