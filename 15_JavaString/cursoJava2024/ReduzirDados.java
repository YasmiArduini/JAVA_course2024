package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduzirDados {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(16, 24, 76, 88, 95);
		
		int sum = numbers.stream().reduce(0, Integer::sum);
		
		System.out.println("Soma dos números: " + sum);
		
	}
	
}
