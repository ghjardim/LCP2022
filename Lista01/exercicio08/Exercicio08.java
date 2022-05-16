package exercicio08;

import java.util.Scanner;

public class Exercicio08 {
	static private int[] intToArray(int x, int lenght) {
		int[] res = new int[lenght];
		
		String tmp = Integer.toString(x);
		for (int i=0; i<lenght; i++) {
			res[i] = Character.getNumericValue(tmp.charAt(i));
		}
		
		return res;
	}
	
	static private int stringLen(int x) {
		return String.valueOf(x).length();
	}
	
	static private Boolean confere(int x) {
		int lenght = stringLen(x);
		int[] nums = intToArray(x, lenght);
		
		int sum = 0;
		for (int i=0; i<lenght; i++) {
			sum += Math.pow(nums[i], lenght);
		}
		
		return (sum == x);
	}
	
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		scan.close();
		
		if(confere(num)) {
			System.out.println("Válido");
		} else {
			System.out.println("Inválido");
		}
	}
}
