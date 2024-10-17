package cursoJava2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarNomes_02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
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
	
	System.out.println("Você deseja ordenar os nomes em ordem crescente ou decrescente? (c/d)");
    String ordem = scanner.nextLine();
    
    if (ordem.equalsIgnoreCase("d")) {
        Collections.sort(nomes, Collections.reverseOrder());
    } else {
        Collections.sort(nomes);
    }
    
    System.out.println("Lista de nomes:");
    for (String nome : nomes) {
        System.out.println(nome);
    }
    
    scanner.close();
	
	}
}