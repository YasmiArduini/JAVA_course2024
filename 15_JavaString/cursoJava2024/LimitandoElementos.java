package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitandoElementos {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12, 14, 16, 17, 18, 26);
		
		List<Integer> firstThree = numbers.stream().limit(3).collect(Collectors.toList());
		
		System.out.println("Três primeiros elementos: " + firstThree);
		
		List<Integer> skippedTwo = numbers.stream().skip(2).collect(Collectors.toList());
		
		System.out.println("Elementos pulados: " + skippedTwo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
