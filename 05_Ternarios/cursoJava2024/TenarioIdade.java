package cursoJava2024;

import java.util.Scanner;

public class TenarioIdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua idade:");
		
		int idade = scanner.nextInt();
		
		String resultado = (idade >= 18) ? "maior de idade" : "menor de idade";
 	   System.out.println("Você é " +resultado);
		
		

	}

}
