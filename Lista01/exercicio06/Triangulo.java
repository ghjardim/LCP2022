package exercicio06;

public class Triangulo implements Geometria {
	double lado1, lado2, lado3;
	
	public Triangulo(double l1, double l2, double l3) {
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
	}

	@Override
	public double definePerimetro() {
		return this.lado1 + this.lado2 + this.lado3;
	}
	
	@Override
	public double defineArea() {
		double p = definePerimetro()/2;		
		return Math.sqrt( p*(p-this.lado1)*(p-this.lado2)*(p-this.lado3) );
	}
}
