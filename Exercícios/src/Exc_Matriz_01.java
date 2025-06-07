import java.util.Scanner;

public class Exc_Matriz_01 {

	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(); 
		int c = sc.nextInt();
		int mat[][] = new int[l][c];
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(" ");

		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println(" ");
		System.out.print("Escolha um numero da matriz: ");
		int n = sc.nextInt();
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				if (mat[i][j] == n) {
					
					System.out.println("Posição: " + i + ", " + j);
					if (j>0) {
						System.out.println("A esquerda: " + mat[i][j-1]);
					}
					
					if (j<mat[i].length-1) {
						System.out.println("A direta: " + mat[i][j+1]);
					}
					
					if (i<mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
					
					if (i>0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					
				}
			}
		}
		
	sc.close();
	
	}
}

	