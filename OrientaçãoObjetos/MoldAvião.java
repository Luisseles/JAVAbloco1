package Orienta��oObjetos;

public class MoldAvi�o {
	//ATRIBUTOS!
	String cor;
	double tamanho;
	int capacidade;
	boolean seguro;
	
	void status() {
		System.out.println("Uma aeronave " + this.cor);
		System.out.println("O largura da Aeronave �: "+this.tamanho);
		System.out.println("A capacidade m�xima da Aeronave � de: "+this.capacidade+ " tripulantes");
		System.out.println("Est� segura? " + this.seguro);
		
	}
	
	  
	
	//METODOS!
	public void voar()
	{
		if(seguro==true)
			System.out.println("Aeronave est� apta para voo!!");
		
		else
			System.out.println("ATEN��O, arenove precisa de manuten��o,"
					+ "n�o est� apta para voo!!");
	}
	public void seguro()
	{
		this.seguro=true;
		
	}
	
	public void atencao()
	{
		this.seguro=false;
	}
	

}
