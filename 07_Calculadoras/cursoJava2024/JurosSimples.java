package cursoJava2024;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o capital: ");
		double capital = scanner.nextDouble();
		System.out.println("Digite a taxa de juros (%) : ");
		double taxa = scanner.nextDouble();
		System.out.println("Informe o tempo (em anos) ");
		int tempo = scanner.nextInt();

		
		double juros = (capital * taxa * tempo) / 100;
		System.out.println("Resultado: " + juros);

		
		double valor = capital + juros;
		System.out.println("O valor total investido + juros é: " + valor);

		scanner.close();

	}

} 


