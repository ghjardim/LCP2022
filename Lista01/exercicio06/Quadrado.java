package exercicio06;

public class Quadrado implements Geometria {
	double lado;
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double defineArea() {
		return (this.lado)*(this.lado);
	}
	
	@Override
	public double definePerimetro() {
		return (this.lado) * 4;
	}
	
	
}
