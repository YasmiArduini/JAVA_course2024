package cursoJava2024;

public class Main {

	public static void main(String[] args) {
		//Criação de uma conta bancaria de um saldo inicial de mil
		
		ContaBancaria conta = new ContaBancaria(5000.00);
		
		
		//Exibir o saldo inicial
		
		System.out.println("Saldo inicial: "+ conta.getSaldo());
	
	
		//	Realizando um depósito de $ 500,00
		conta.sacar(500);
		System.out.println("Saldo inicial: "+ conta.getSaldo());
		
	}

}