package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VerificandoCondiçoes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();

		System.out.println("Digite os números ou digite 'finalizar' para terminar ou mostrar o resultado.");

		while (true) {
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("finalizar")) {
				break;
			}

			try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido ou 'sair' para finalizar.");
            }
        }


		boolean anyGreaterThan50 = numbers.stream().anyMatch(n -> n > 50);
		System.out.println("Algum número é maior que 50? " + anyGreaterThan50);

		boolean allPositive = numbers.stream().allMatch(n -> n > 0);
		System.out.println("Todos os números são positivos? " + allPositive);

		boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
		System.out.println("Nenhum número é negativo? " + noneNegative);

		scanner.close();

	}

}
