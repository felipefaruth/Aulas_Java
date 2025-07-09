package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main (String []args ) {
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de empregados: ");
		int n = sc.nextInt();
		System.out.println();
		for (int i=1; i<=n; i++) {
			System.out.println("Empregado #" + i + " : " );
			System.out.print("Terceirizado? [s/n]: ");
				char t = sc.next().charAt(0);
			System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
			System.out.print("Hora: ");
				int h = sc.nextInt();
			System.out.print("Valor por hora ");
				double vph = sc.nextDouble();
			if(t == 's') {
				System.out.print("Valor adicional: ");
				double va = sc.nextDouble();
				Empregado emp = new Terceirizado(nome, h, vph, va);
				list.add(emp);
			}else {
				Empregado emp = new Empregado(nome, h, vph);
				list.add(emp);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for(Empregado c : list) {
			System.out.println(c.getNome() + " - R$" + String.format("%,.2f",c.pagamento()));
		}
		
		sc.close();
	}
	
}
