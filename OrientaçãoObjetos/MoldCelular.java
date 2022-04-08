package OrientaçãoObjetos;

public class MoldCelular {
	String cor;
	String marca;
	int modelo;
	boolean bloqueado;
	
	void status(){
		System.out.println("Um aparelho celular " +this.cor);
		System.out.println("O aparelho celular foi fabricado pela " +this.marca);
		System.out.println("A versão desse aparelho é a 10, modelo " +this.modelo);
		System.out.println("O aparelho celular está bloqueado? "+this.bloqueado);
	}
	void ligar() {
		if(this.bloqueado == true) {
			
		}
	}
	void bloquear() {
		this.bloqueado = true;
	}
	void desbloquear() {
		this.bloqueado = false;
	}

}
