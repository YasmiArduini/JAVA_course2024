package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupandosDados {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Luna", "Sofia", "Isadora", "Clara", "Aurora", "Valentina");
		
		Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));

		
		System.out.println("Agrupamento de nomes: " + groupedByLength);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
