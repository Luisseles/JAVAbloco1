package OrientaçãoObjetos;

public class MoldAvião {
	//ATRIBUTOS!
	String cor;
	double tamanho;
	int capacidade;
	boolean seguro;
	
	void status() {
		System.out.println("Uma aeronave " + this.cor);
		System.out.println("O largura da Aeronave é: "+this.tamanho);
		System.out.println("A capacidade máxima da Aeronave é de: "+this.capacidade+ " tripulantes");
		System.out.println("Está segura? " + this.seguro);
		
	}
	
	  
	
	//METODOS!
	public void voar()
	{
		if(seguro==true)
			System.out.println("Aeronave está apta para voo!!");
		
		else
			System.out.println("ATENÇÃO, arenove precisa de manutenção,"
					+ "não está apta para voo!!");
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
