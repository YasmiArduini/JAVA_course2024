 package cursoJava2024;

import java.util.Scanner;

public class Exercio4 {

	public static void main(String[] args) {

   Scanner scanner = new Scanner (System.in);
   
   System.out.println("Digite o primeiro número:");
   int numero1 = scanner.nextInt();
   
   System.out.println("Digite o segundo número:");
   int numero2 = scanner.nextInt();
   
   int maior = ( numero1 > numero2 ) ? numero1 : numero2;
   System.out.println("O maior número é: " + maior);
   
   scanner.close();

}
}