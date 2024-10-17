package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenarNomes {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Yasmin");
		nomes.add("Lianor");
		nomes.add("Kaelith");
		nomes.add("Nerissa");
		nomes.add("Daryon");
		nomes.add("Evelor");
		nomes.add("Zinara");
		nomes.add("Valdrik");
		nomes.add("Thalindra");
		
		Collections.sort(nomes);
		
		System.out.println("Lista de nomes:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
	}

}
