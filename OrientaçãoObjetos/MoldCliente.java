package OrientaçãoObjetos;

public class MoldCliente {
	String nome;
	String consumidor;
	int tempo;
	boolean cliente;
	
	void status(){
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("É consumista dos nossos produtos? "+this.consumidor);
		System.out.println("" +this.nome + " é cliente da loja á mais de " +this.tempo + 
				 " anos");
		System.out.println("Podemos concluir que " +this.nome + "é cliente fidelizado(a)." +this.cliente);
		
	}
	void consumista(){
		if(this.cliente == true);
		 
	} 
		
	
	void comprou() {
		this.cliente = true;
	}
	void naocomprou() {
		this.cliente = false;
		
	}
		
	
	
		
	
	
	
	
		
	

		

}

