package cursoJava2024;

import java.util.Arrays;
import java.util.List;

public class MostraosPares {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);

		System.out.println("Esses são os números pares:");
		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
