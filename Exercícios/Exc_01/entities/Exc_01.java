package entities;
import java.util.Scanner;

public class Exc_01 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Quantos funcionários serão registrados: ");
		
		Funcionarios func = new Funcionarios();
		func.setId(555);
		System.out.println(func.getId());
		
		/*for (int i=0; i<func.length; i++) {
			
			System.out.println("Digite o ID: ");
			func[i].setId(sc.nextInt());
			System.out.println("Digite o nome: ");
			func[i].setNome(sc.nextLine());
			System.out.println("Digite o Salário: ");
			func[i].setSal(sc.nextInt());
		}*/
		
		sc.close();
	}
}
