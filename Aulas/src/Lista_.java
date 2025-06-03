import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Lista_ {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		
		list.add("Mandela");
		list.add("Jonas");
		list.add("Kaike");
		list.add("Silvia");	
		list.add("Monique");
		list.add(0, "Joana");
		list.add("Wagner");
		list.add("Alana");
		list.add("Abner");
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		list.remove(0);
		
		System.out.println("------------");
		for (String x : list) {
			System.out.println(x);
		}
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("------------");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		System.out.println(resultado);
		
		System.out.println("-----------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(nome);
	}

}
