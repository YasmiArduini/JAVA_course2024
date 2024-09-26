package cursoJava2024;

import java.util.Scanner;

public class Exercio3 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Digite um número de sua preferencia:");
	
	int numero = scanner.nextInt();
	
		
		String resultado = (numero % 2 == 0) ? "par" : "impar";
		
		System.out.println("O número " +numero+ " é " +resultado);
		
	}

}
 