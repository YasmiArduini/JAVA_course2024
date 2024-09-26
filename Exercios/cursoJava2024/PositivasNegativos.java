package cursoJava2024;

import java.util.Scanner;

public class PositivasNegativos {

	public static void main(String[] args) {

		
Scanner scanner = new Scanner (System.in);
		
		// Ask user's for a value
		
		System.out.println("Digite um valor:");
		int valor = scanner.nextInt();
		
		//Create the validations:
		
		if ( valor < 0) {
			System.out.println("Seu valor é negativo.");
			
		} else if (valor > 0) {
			System.out.println("Seu valor é positivo.");
			
		} else {
			System.out.println("Teu valor é zero");
			
	}

}
}