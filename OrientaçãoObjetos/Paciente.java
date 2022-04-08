package OrientaçãoObjetos;

import java.util.Scanner;

public class Paciente {

	public static void main(String[] args) {
		MoldPaciente P = new MoldPaciente();
		Scanner ler = new Scanner(System.in);
		
		P.nome = "Carlos";
		P.altura = 1.80;
		P.peso = 60.5;
		P.anos = 26;
		P.alta = true;
		
		P.status();
		if(P.alta == true);{
			System.out.println("Caminhar...");
			
		
		}
			
		
	}

	}

