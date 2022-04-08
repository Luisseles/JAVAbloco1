package POOHerança;

public class Zoo {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preg = new Preguica();
		
		System.out.println("Alguns comportamentos característicos desses animais.");
		
		dog.brincar();
		dog.emitirSom();
		System.out.println("latindo...");
		
		horse.trotar();
		horse.emitirSom();
		System.out.println("Relinchando");
		
		preg.escalar();
		preg.emitirSom();
		System.out.println("Garras arranhando a árvore...");
		
		
	

	}

}
