package exercicio04;

public class Cachorro extends Animal {
	public Cachorro(String nome, int idade) {
		super.nome = nome;
		super.idade = idade;
		super.som = "Au au";
	}

	@Override
	public String acao() {
		// TODO Auto-generated method stub
		return "Correr";
	}
}
