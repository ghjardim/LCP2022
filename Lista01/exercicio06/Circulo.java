package exercicio06;

public class Circulo implements Geometria {
	double r;
	
	public Circulo(double r) {
		this.r = r;
	}
	
	@Override
	public double defineArea() {
		return Math.PI * Math.pow(this.r, 2);
	}

	@Override
	public double definePerimetro() {
		return 2 * Math.PI * this.r;
	}

}
