package OrientaçãoObjetos;

import java.util.Scanner;

public class Patinete {

	public static void main(String[] args) {
		MoldPatinete Pat = new MoldPatinete();
		Scanner ler = new Scanner(System.in);
		
		Pat.cor = "vermelha";
		Pat.valor = 1.1;
		Pat.rodas = 2;
		Pat.travado =true;
		Pat.andar();
		Pat.status();
			
				
		}

	}


