package cursoJava2024;

public class PayPal implements Pagamento {

	private boolean pago = false;

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento de: " + valor + " realizado via PayPal.");
		pago = true;
	}

	@Override
	public String obterStatus() {
		return pago ? "PAGO" : "PENDENTE";

	}
}