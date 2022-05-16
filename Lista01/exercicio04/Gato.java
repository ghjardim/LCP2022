package exercicio04;

public class Gato extends Animal {
	public Gato(String nome, int idade) {
		super.nome = nome;
		super.idade = idade;
		super.som = "Miau";
	}

	@Override
	public String acao() {
		// TODO Auto-generated method stub
		return "Correr, pular";
	}
}