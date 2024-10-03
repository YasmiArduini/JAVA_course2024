package cursoJava2024;

import java.util.Scanner;

public class IAC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Cálculo do Índice de Adiposidade Corporal (IAC)");
        System.out.print("Digite a circunferência do quadril em centímetros: ");
        double quadril = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        
        double iac = (quadril / Math.pow(altura, 1.5)) - 18;

        
        System.out.printf("O Índice de Adiposidade Corporal (IAC) é: %.2f\n", iac);

        
        if (iac < 8) {
            System.out.println("Baixo percentual de gordura corporal.");
        } else if (iac < 21) {
            System.out.println("Percentual de gordura corporal dentro da faixa normal.");
        } else if (iac < 26) {
            System.out.println("Percentual de gordura corporal acima do normal.");
        } else {
            System.out.println("Percentual de gordura corporal muito elevado.");
        }

        scanner.close();
    }
}
