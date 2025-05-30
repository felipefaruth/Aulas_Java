import java.util.Scanner;

public class Vetores_negativo {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] vec = new int[n];
			
			
			for (int i=0; i<n; i++) {
				System.out.println("insira um numero: ");
				vec[i] = sc.nextInt();
			}
			
			int vecN[] = new int[n];
			for (int i=0; i<n; i++) {
				if (vec[i]<0) {
					vecN[i] = vec[i];
					System.out.println("Numeros negativos: " + vecN[i]);
				}
				
			}
			
			
			sc.close();

		}

	}


