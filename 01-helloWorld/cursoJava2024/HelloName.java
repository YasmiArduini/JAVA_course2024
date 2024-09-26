package cursoJava2024;

import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Olá " +nome+ " prazer conhece-lo(a)");
		
	}

}
