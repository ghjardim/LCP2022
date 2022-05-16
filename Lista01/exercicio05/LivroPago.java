package exercicio05;

public class LivroPago extends Livro {
	double preco = 0;
	
	@Override
	public String getTitulo() {
		return this.titulo;
	};
	
	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	};
}
