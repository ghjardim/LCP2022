package exercicio01;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 20: ");
        int limite = scan.nextInt();
        scan.close();
        
        if(limite <= 20 && limite >= 1){
            for (int i=0; i<limite; i++) {
                for (int j=0; j<=i; j++){
                    System.out.print("★");
                }
                System.out.println();
            }
        } else {
            System.out.println("Número deve ser de 1 a 20");
        }
	}
}
