package Orienta��oObjetos;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		MoldFuncionario Func = new MoldFuncionario();
		Scanner ler = new Scanner(System.in);
		
		Func.nome = "Jo�o";
		Func.salario = 1.5;
		Func.anos = 4;
		Func.promocao = true;
		
		Func.status();
		if(Func.promocao == true){
			System.out.println("Parab�ns pelo seu desempenho, como gratifica��o"
					+ " voc� ser� promovido!!");
		} else {
			System.out.println("Voc� presica se dedicar mais para ser promovido.");
		}

	}

}
