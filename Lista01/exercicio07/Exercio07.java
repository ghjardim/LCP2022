package exercicio07;

import java.util.Scanner;

public class Exercio07 {
	static int calcula(int a) {
		return a;
	}
	static int calcula(int a, int b) {
		return (int) (a + Math.pow(b, 2));
	}
	static int calcula(int a, int b, int c) {
		return (int) (a + Math.pow(b, 2) + Math.pow(c, 3));
	}
	static int calcula(int a, int b, int c, int d) {
		return (int) (a + Math.pow(b, 2) + Math.pow(c, 3) + Math.pow(d, 4));
	}
	
	public static void main(String[] arg) {
		int grau = 0, res = 0;
		int[] valores = new int[4];
		Scanner scan = new Scanner(System.in);
	     
		 System.out.print("Grau: ");
	     grau = scan.nextInt();
	     if (grau > 0 && grau <=4) {
	    	 for(int i = 0; i < grau; i++) {
	    		 System.out.print("Valor de grau " + i + ": ");
	    		 valores[i] = scan.nextInt();
	    	 }
	    	 scan.close();
	    	 
	    	 for(int i = 0; i < grau; i++) {
	    		 System.out.print(valores[i] + "^" + i);
	    		 if (i != grau-1) {
	    			 System.out.print(" + ");
	    		 } else {
	    			System.out.println(); 
	    		 }
	    	 }
	    	 
	    	 switch(grau) {
		    	 case 1:
		    		 res = calcula(valores[0]);
		    		 break;
		    	 case 2:
		    		 res = calcula(valores[0], valores[1]);
		    		 break;
		    	 case 3:
		    		 res = calcula(valores[0], valores[1], valores[2]);
		    		 break;
		    	 case 4:
		    		 res = calcula(valores[0], valores[1], valores[2],
		    				 valores[3]);
		    		 break;
		    	default:
		    		System.out.println("Algum erro ocorreu ao calcular res");
	    	 }
	    	 System.out.println(res);
	     } else {
	    	 scan.close();
	    	 System.out.println("Por favor, insira um grau de 1 a 4.");
	     }
	}
}
