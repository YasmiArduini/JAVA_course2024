package cursoJava2024;

//Exercio para remover duplicatas

// Apaga valore srepetidos em uma lista s de inteiros

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatas {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(3, 7, 9, 3, 5, 9, 7, 5);
		
		numeros.stream().distinct().forEach(System.out::println);
		
	}
}
