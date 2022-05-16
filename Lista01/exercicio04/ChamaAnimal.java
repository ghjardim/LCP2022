package exercicio04;

public class ChamaAnimal {
	public static void main(String[] args) {
		Cachorro meuCachorro = new Cachorro("Pipoca", 7); 
		System.out.print(meuCachorro.getNome() + "\t"
				+ meuCachorro.getIdade() + "\t"
				+ meuCachorro.getSom() + "\t" 
				+ meuCachorro.acao());
		System.out.println();
		
		Gato meuGato = new Gato("Amora", 1); 
		System.out.print(meuGato.getNome() + "\t" 
				+ meuGato.getIdade() + "\t" 
				+ meuGato.getSom() + "\t" 
				+ meuGato.acao());
		System.out.println();
		
		Passaro meuPassaro = new Passaro("Tonico", 2); 
		System.out.print(meuPassaro.getNome() + "\t" 
				+ meuPassaro.getIdade() + "\t" 
				+ meuPassaro.getSom() + "\t" 
				+ meuPassaro.acao());
		System.out.println();
	}
}
