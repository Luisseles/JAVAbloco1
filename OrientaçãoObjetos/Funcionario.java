package OrientaçãoObjetos;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		MoldFuncionario Func = new MoldFuncionario();
		Scanner ler = new Scanner(System.in);
		
		Func.nome = "João";
		Func.salario = 1.5;
		Func.anos = 4;
		Func.promocao = true;
		
		Func.status();
		if(Func.promocao == true){
			System.out.println("Parabéns pelo seu desempenho, como gratificação"
					+ " você será promovido!!");
		} else {
			System.out.println("Você presica se dedicar mais para ser promovido.");
		}

	}

}
