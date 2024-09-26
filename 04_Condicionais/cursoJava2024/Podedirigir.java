package cursoJava2024;

import java.util.Scanner;

public class Podedirigir {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		// Ask for the user's age
		
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		
		if (idade < 18) {
			System.out.println("Sinto muito, você ainda não pode tirar uma carteira de motorista");
			
		} else if (idade == 16) {
			System.out.println("Apenas se você for emancipado.");
			
		} else {
			System.out.println("Você pode tirar sua carteira de motorista.");
	}

}
  }
