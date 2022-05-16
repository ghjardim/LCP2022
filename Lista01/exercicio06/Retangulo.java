package exercicio06;

public class Retangulo implements Geometria {
	double lado1, lado2;
	
	public Retangulo(double l1, double l2) {
		this.lado1 = l1;
		this.lado2 = l2;
	}
	
	@Override
	public double defineArea() {
		return (this.lado1)*(this.lado2);
	}

	@Override
	public double definePerimetro() {
		return (this.lado1)*2 + (this.lado2)*2;
	}

}
