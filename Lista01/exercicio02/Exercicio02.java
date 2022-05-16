/* Escreva um programa que irá receber do usuãrio 3 números e irá 
 * calcular e exibir em métodos separados: a soma deles, o produto dos
 * três números, a média deles, os números ordenados (usando if/else).
 */

package exercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {
	static int soma(int a, int b, int c){
        return (a + b + c);
    }
    static int produto(int a, int b, int c){
        return (a * b * c);
    }
    static int media(int a, int b, int c){
        return soma(a,b,c)/3;
    }
    static int[] ordenados(int a, int b, int c){
        int[] intOrdenado = new int[3];
        if (a>b){
            if(c>a){
                intOrdenado[2] = c;
                intOrdenado[1] = a;
                intOrdenado[0] = b;
            } else {
                intOrdenado[2] = a;
                intOrdenado[1] = b;
                intOrdenado[0] = c;
            }
        } else {
            if(c>b){
                intOrdenado[2] = c;
                intOrdenado[1] = b;
                intOrdenado[0] = a;
            } else {
                intOrdenado[2] = b;
                intOrdenado[1] = a;
                intOrdenado[0] = c;
            }
        }
        return intOrdenado;
    }
    
    static void myPrint(int res) {
    	System.out.println(res);
    }
    static void myPrint(int[] res) {
    	System.out.println(Arrays.toString(res));
    }
    
	public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		System.out.print("Soma: ");
		myPrint(soma(a, b, c));
		
		System.out.print("Multiplicação: ");
		myPrint(produto(a, b, c));
		
		System.out.print("Média: ");
		myPrint(media(a, b, c));
		
		System.out.print("Ordenados: ");
		myPrint(ordenados(a, b, c));
	}
}
