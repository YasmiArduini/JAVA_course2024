package cursoJava2024;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

     
        double taxaFixa = 10.0;  
        double precoPorKm = 2.0; 

        System.out.print("Informe os quilômetros rodados: ");
        double kmRodados = scanner.nextDouble();

        double valorTotal = taxaFixa + (precoPorKm * kmRodados);

        System.out.printf("O valor total a ser pago é: R$%.2f%n", valorTotal);

        scanner.close();
    }
}