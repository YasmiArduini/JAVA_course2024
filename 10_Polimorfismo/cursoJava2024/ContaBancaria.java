package cursoJava2024;

public class ContaBancaria {
	// Atributo privado:
	private double saldo;

	// Construtor para inicializar o saldo:
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	// Metodo publico para sacar sua GRANA:
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado! ");
		} else {
			System.out.println("Saque inválido. Saldo insuficiente ou valor negativo!");
		}
	}

	// Método publico para consultar o saldo(getter):
	public double getSaldo() {
		return saldo;

	}

	// Realizando um depósito de $ 500,00

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$: " + valor + " realizado!");
		} else {
			System.out.println("Depósito inválido. O valor deve ser positivo!");
		}
	}

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(5000.00);

		conta.depositar(500);
		System.out.println("Saldo atual: R$ " + conta.getSaldo());

		conta.sacar(300);
		System.out.println("Saldo após saque: R$ " + conta.getSaldo());
	}

}
