package cursoJava2024;

import java.util.Scanner;

public class Vogais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println("Número de vogais: " + contador);
	}

}
