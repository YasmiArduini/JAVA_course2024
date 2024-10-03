package cursoJava2024;

import java.util.Scanner;

public class NumeroDivisivel {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite seu valor aqui:");
		
		int valor = scanner.nextInt();
		
		if (valor % 3 == 0 && valor % 5 == 0) {
		System.out.println("Seu valor é divisível por 3 e 5");
		
		
	}	else  {
		System.out.println("Seu valor não é divisível por 3 e nem por cinco.");
		
		
		
		
	}

	}
}
