package cursoJava2024;

import java.util.Scanner;

public class TaxaCLT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu sálario por favor: ");
        double salario = scanner.nextDouble();

        double taxa = calculateIncomeTaxa(salario);

        System.out.printf("Seu total recebido será de: ", taxa);
    }

    public static double calculateIncomeTaxa(double salary) {
        
        double[][] taxBrackets = {
            {1903.99, 0},
            {2826.65, 0.075},
            {3751.06, 0.15},
            {4664.68, 0.225},
            {5582.29, 0.275}
        };

        double taxableIncome = salary;
        double incomeTax = 0;

        for (double[] bracket : taxBrackets) {
            if (taxableIncome > bracket[0]) {
                incomeTax += (taxableIncome - bracket[0]) * bracket[1];
                taxableIncome = bracket[0];
            } else {
                incomeTax += taxableIncome * bracket[1];
                break;
            }
        }

        return incomeTax;
    }
}