package exercicio05;

public class LivroGratuito extends Livro {
	
	@Override
	public String getTitulo() {
		return this.titulo;
	};
	
	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	};
}
