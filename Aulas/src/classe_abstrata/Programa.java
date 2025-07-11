package classe_abstrata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de formas: ");
		int n = sc.nextInt();
		System.out.println();
		for (int i=1; i<=n; i++) {
			System.out.println("Forma #" + i +":");
			System.out.print("Retangulo ou circulo [r/c]?: ");
			char forma = sc.next().charAt(0);
			System.out.print("Cor [PRETO/AZUL/VERMELHO]: ");
			Cor cor = Cor.valueOf(sc.next());
			if(forma == 'r') {
				System.out.print("Largura: ");
				double larg = sc.nextDouble();
				System.out.print("Altura: ");
				double alt = sc.nextDouble();
				list.add(new Retangulo(cor, larg, alt));
			}else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			}
			System.out.println();
		}
		
		System.out.println("AREA DAS FORMAS: ");
		for (Forma f : list) {
			System.out.println(f.area());
		}
		
		sc.close();		
	}

}
