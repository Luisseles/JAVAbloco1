package OrientaçãoObjetos;

public class MoldPaciente {
	String nome;
	double altura, peso;
	int anos;
	boolean alta;
	
	void status() {
		System.out.println("Nome do paciente: " +this.nome);
		System.out.println("Altura: "+ "peso: "+ this.peso);
		System.out.println(""+this.anos + " anos de idade");
		System.out.println("Vai ter alta? " +this.alta);
	}
	
	void caminhar() {
		if (this.alta = true);
		System.out.println("Caminhar...");
		
	
	}
		
	void melhorar() {
		this.alta = true;
	}
	
	void piorar() {
		this.alta = false;
	}

}
