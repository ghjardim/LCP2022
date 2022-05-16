package exercicio06;

public class TestaGeometria {
	public static void main(String[] args) {
		Circulo circle = new Circulo(3);
		Quadrado square = new Quadrado(3);
		Retangulo rectangle = new Retangulo(3, 4);
		Triangulo triangle = new Triangulo(3, 4, 5);
		
		System.out.println("Objeto \t Perimetro \t Área");
		System.out.println("Círculo \t " + circle.definePerimetro() + " \t " + circle.defineArea());
		System.out.println("Triângulo \t " + triangle.definePerimetro() + " \t " + triangle.defineArea());
		System.out.println("Quadrado \t " + square.definePerimetro() + " \t " + square.defineArea());
		System.out.println("Retângulo \t " + rectangle.definePerimetro() + " \t " + rectangle.defineArea());
	}
}
