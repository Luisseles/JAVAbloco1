package Orienta��oObjetos;

public class MoldFuncionario {
	String nome;
	double salario;
	int anos;
	boolean promocao;
	
	void status() {
		
		System.out.println("Nome do funcion�rio: " +this.nome);
		System.out.println("Sal�rio atual = " +this.salario);
		System.out.println("Quantos anos de experi�ncia? "+this.anos + " anos de"
				+ " experi�ncia.");
		System.out.println("O funcion�rio ser� promovido: " +this.promocao);
	
	}
	void dedicado() {
		if(this.promocao == true);
	}
	void relaxado () {
		if(this.promocao == false);
	}
}

