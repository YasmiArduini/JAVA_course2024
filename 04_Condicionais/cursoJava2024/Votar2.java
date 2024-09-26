package cursoJava2024;

import java.util.Scanner;

class Votar2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask for the user's age

		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();

		if (idade < 16) {
			System.out.println("Sinto muito, você ainda não pode votar.");

		} else if (idade <= 16 && idade < 18 || idade > 65) {
			System.out.println("Ops... Seu voto é facultativo. Mas vote, ainda é um direito seu!");

		} else {
			System.out.println("Você tem que votar! Evite multas.");

		}
	}
}
