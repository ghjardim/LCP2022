package exercicio04;

public class Passaro extends Animal {
	public Passaro(String nome, int idade) {
		super.nome = nome;
		super.idade = idade;
		super.som = "Piu";
	}

	@Override
	public String acao() {
		// TODO Auto-generated method stub
		return "Voar";
	}
}