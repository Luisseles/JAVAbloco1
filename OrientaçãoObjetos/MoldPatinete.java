package OrientaçãoObjetos;

public class MoldPatinete {
	String cor;
	double valor;
	int rodas;
	boolean travado;
	
	
	void status() {
		System.out.println("Patinete de cor "+this.cor);
		System.out.println("Este patinete custa: "+this.valor + "$ Reais");
		System.out.println("Este modelo possui "+this.rodas + " rodas.");
		System.out.println("O patinete está travado: " +this.travado);
		
	}
	
	
	void andar() {
		if(this.travado == true);{
			System.out.println("Erro! Impossível andar, o patinete esta travado!");
		}
		
			
		
	}
	
	
		
	
	void travar() {
		if(this.travado = true);
	}
	
	void destravar() {
		if(this.travado = false);
	}
	
	

	
	
	
}

