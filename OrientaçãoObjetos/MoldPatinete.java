package Orienta��oObjetos;

public class MoldPatinete {
	String cor;
	double valor;
	int rodas;
	boolean travado;
	
	
	void status() {
		System.out.println("Patinete de cor "+this.cor);
		System.out.println("Este patinete custa: "+this.valor + "$ Reais");
		System.out.println("Este modelo possui "+this.rodas + " rodas.");
		System.out.println("O patinete est� travado: " +this.travado);
		
	}
	
	
	void andar() {
		if(this.travado == true);{
			System.out.println("Erro! Imposs�vel andar, o patinete esta travado!");
		}
		
			
		
	}
	
	
		
	
	void travar() {
		if(this.travado = true);
	}
	
	void destravar() {
		if(this.travado = false);
	}
	
	

	
	
	
}

