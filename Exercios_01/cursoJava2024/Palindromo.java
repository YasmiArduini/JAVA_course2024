package cursoJava2024;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra:");

		String palavra = sc.nextLine();
		String invertida = new StringBuilder(palavra).reverse().toString();

		if (palavra.equalsIgnoreCase(invertida)) {

			System.out.println(palavra + " é um palíndromo");

		} else {
			System.out.println(palavra + " não é um palíndromo.");
		}

	}

}
