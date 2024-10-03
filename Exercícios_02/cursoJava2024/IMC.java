package cursoJava2024;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu peso em kg: ");
		double weight = scanner.nextDouble();

		System.out.print("Digite sua altura em metros: ");
		double height = scanner.nextDouble();

		double imc = calculateIMC(weight, height);

		System.out.printf("Seu IMC é: ", imc);

		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso, por favor, coma direiro.");
		} else if (imc < 25) {
			System.out.println("Você está saudável");
		} else if (imc < 30) {
			System.out.println("Você está acima do peso, cuide-se melhor.");
		} else {
			System.out.println("Você está obeso, por favor tome cuidado com a sua saúde!");
		}
	}

	public static double calculateIMC(double weight, double height) {
		return weight / (height * height);
	}
}