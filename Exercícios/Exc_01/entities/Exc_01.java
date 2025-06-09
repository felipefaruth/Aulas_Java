package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc_01 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados: ");
		int n = sc.nextInt();
		while(n<=0) {
			System.out.println("É preciso no mínimo 1 (um) registro!");
			System.out.print("Quantos funcionários serão registrados: ");
			n = sc.nextInt();
		}
		
		
		for (int i=0; i<n; i++) {
			System.out.println("------------------------");
			System.out.println("Funcionario #" + (i+1));
			System.out.println("Digite o ID: ");
			int id = sc.nextInt();
			System.out.println("Digite o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite o Salário: ");
			double sal = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id, name, sal);
			
			list.add(func);
		}
		System.out.println();
		System.out.println("Digite o id para receber o aumento: ");
		int idsal = sc.nextInt();
		Integer pos = posicao(list, idsal);
		while (pos == null) {
				System.out.println("Esse id não existe!");
				System.out.println("Digite o id para receber o aumento: ");
				idsal = sc.nextInt();
				pos = posicao(list, idsal);
			}
		
		System.out.println("Qual a porcentagem do aumento: ");
		int pctg = sc.nextInt();
		list.get(pos).salRaise(pctg);
			
		System.out.println();
		System.out.println("Funcionários: ");
		System.out.println(list.toString());
		
		
		sc.close();
	}
	
	static Integer posicao(List<Funcionarios> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
