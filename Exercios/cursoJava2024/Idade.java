package cursoJava2024;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Me informe sua idade, por favor:");
		int idade = scanner.nextInt();
		
		if ( idade >= 18) {
		System.out.println("Você é maior de idade.");
		
	} else {
		System.out.println("Você é menor de idade.");
		
	}
	
	}
}