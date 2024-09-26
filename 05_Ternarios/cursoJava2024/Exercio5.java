 package cursoJava2024;

import java.util.Scanner;

public class Exercio5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Qual a base e a altura do seu retangulo?");
	int base = scanner.nextInt();
	int altura = scanner.nextInt();
	int multiplique = base * altura;
	System.out.println("a soma do seu retangulo é " +multiplique);
	
}
}