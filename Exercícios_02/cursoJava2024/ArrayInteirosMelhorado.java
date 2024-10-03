package cursoJava2024;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInteirosMelhorado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] numeros = new int[5];

        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Valor inválido! Digite um número inteiro.");
                scanner.next(); // Limpa o valor inválido
            }
            numeros[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }

        
        Arrays.sort(numeros);

        
        System.out.println("Valores do array de inteiros (após multiplicar por 2 e ordenar):");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        
        try {
            
            System.out.println("Tentando acessar um índice inválido...");
            System.out.println(numeros[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Tentativa de acessar um índice inválido do array!");
        }

        scanner.close();
    }
}
