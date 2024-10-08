package cursoJava2024;

import java.util.Scanner;

public class CrudeArray {
	// Arrays para armazenar nomes e idades:
	static String[] nomes = new String[10];
	static int[] idades = new int[10];
	static int contador = 0;

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int opcao;
			
			do {
				System.out.println("\n--- MENU ---");
				System.out.println("1. Adicionar Usuário");
				System.out.println("2. Exibir Usuarios");
				System.out.println("3. Atualizar Usuário");
				System.out.println("4. Deletar Usuário");
				System.out.println("5. sair");
				System.out.println("Escolha uma opção: ");
				opcao = scanner.nextInt();
				
				switch(opcao) {
				case 1:
					adicionarUsuarios(scanner); 
						break;
				case 2:
					exibirUsuarios();
					break;
				case 3:
					atualizarUsuarios(scanner);
					break;
				case 4:
					deletarUsuarios(scanner);
					break;
				case 5:
					System.out.println("Saindo do Sistema...!");
					break;
				default:
					System.out.println("Opção inválida!");
					}
				} 
			 while (opcao != 5);
				scanner.close();
			}

	// Criar todos os métodos:
	static void adicionarUsuarios(Scanner sc) {
		if (contador < 10) {
			System.out.print("Digite o nome: ");
			nomes[contador] = sc.nextLine();
			System.out.print("Digite a idade: ");
			idades[contador] = sc.nextInt();
			sc.nextLine();
			contador++;
			System.out.println("Usuário adicionado com sucesso!");
		} else {
			System.out.println("Limite de usuários atingido!");
		}
	}

	static void exibirUsuarios() {
		if (contador == 0) {
			System.out.println("Nenhum usuário cadastrado.");
		} else {
			for (int i = 0; i < contador; i++) {
				System.out.println((i + 1) + ". Nome: " + nomes[i] + ", Idade: " + idades[i]);
			}
		}
	}

	static void atualizarUsuarios(Scanner sc) {
		exibirUsuarios();
		System.out.print("Digite o número do usuário que deseja atualizar: ");
		int index = sc.nextInt() - 1;
		sc.nextLine();

		if (index >= 0 && index < contador) {
			System.out.print("Novo nome: ");
			nomes[index] = sc.nextLine();
			System.out.print("Nova idade: ");
			idades[index] = sc.nextInt();
			sc.nextLine();
			System.out.println("Usuário atualizado com sucesso!");
		} else {
			System.out.println("Usuário não encontrado!");
		}
	}

	static void deletarUsuarios(Scanner sc) {
		exibirUsuarios();
		System.out.print("Digite o número do usuário que deseja deletar: ");
		int index = sc.nextInt() - 1;
		sc.nextLine();

		if (index >= 0 && index < contador) {
			for (int i = index; i < contador - 1; i++) {
				nomes[i] = nomes[i + 1];
				idades[i] = idades[i + 1];
			}
			nomes[contador - 1] = null;
			idades[contador - 1] = 0;
			contador--;
			System.out.println("Usuário deletado com sucesso!");
		} else {
			System.out.println("Usuário não encontrado!");
		}
	}
}