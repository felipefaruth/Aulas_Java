package soma_vetore;

import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vec = new int[n];
		
		for (int i=0; i<n; i++) {
			vec[i] = sc.nextInt();
		}
		
		System.out.print("Valores: ");
		for (int i=0; i<n; i++) {
	    	System.out.print(vec[i] + " ");
	    }
		
		double soma = 0;
		double med = soma/n;
		
		for (int i=0; i<n; i++) {
			soma += vec[i];
		}
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + med);
		
		sc.close();
		
	}

}
