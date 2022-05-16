package exercicio04;

public abstract class Animal {
	protected String nome, som;
	protected int idade;
	public abstract String acao();
	
	public String getNome() {
		return this.nome;
	}
	public String getSom() {
		return this.som;
	}
	public int getIdade() {
		return this.idade;
	}
}
