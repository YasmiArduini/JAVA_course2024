package cursoJava2024;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int horario;
		do {
			
		
		System.out.println("Que horas são agora?");
        horario = scanner.nextInt();
		switch (horario) {

		case 5, 6, 7, 8, 9, 10, 11:
			System.out.println("Bom dia!");
			break;

		case 12, 13, 14, 16, 17:
			System.out.println("Boa tarde!");
			break;

		case 18, 19, 20, 21, 22, 23:
			System.out.println("Boa noite.");
			break;

		case 00, 01, 02, 03, 04:
			System.out.println("Problemas para dormir? Espero que fique bem.");
			break;

		default:
			System.out.println("Horário invalido. Coloque um horário valido.");
			
		   }
			
		} while (horario < 0 || horario > 23);
			
			scanner.close();

	}
}