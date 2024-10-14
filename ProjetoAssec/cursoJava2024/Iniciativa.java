package cursoJava2024;

import java.util.Scanner;

public class Iniciativa {
	private String nome;

	public void lerNome() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual seu nome?: ");
		this.nome = scanner.nextLine();

	}

	public void Mostranome() {

		System.out.println(nome);

	}

	public static void main(String[] args) {

		Iniciativa obj = new Iniciativa();
		obj.lerNome();
		obj.Mostranome();

	}

}