package exercicio05;

public class Biblioteca {
	public static void main(String[] args) {
		LivroPago pago = new LivroPago();
		pago.setTitulo("Understanding the Linux Kernel");
		pago.setPreco(371.84);
		
		LivroGratuito gratis = new LivroGratuito();
		gratis.setTitulo("The Debian Administrator's Handbook");
		
		System.out.println(
				pago.getTitulo() + "\t\t" + pago.getPreco() + "\n"
				+ gratis.getTitulo());
	}
}
