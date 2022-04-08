package OrientaçãoObjetos;

public class MoldFuncionario {
	String nome;
	double salario;
	int anos;
	boolean promocao;
	
	void status() {
		
		System.out.println("Nome do funcionário: " +this.nome);
		System.out.println("Salário atual = " +this.salario);
		System.out.println("Quantos anos de experiência? "+this.anos + " anos de"
				+ " experiência.");
		System.out.println("O funcionário será promovido: " +this.promocao);
	
	}
	void dedicado() {
		if(this.promocao == true);
	}
	void relaxado () {
		if(this.promocao == false);
	}
}

