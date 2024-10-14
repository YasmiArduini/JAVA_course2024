package cursoJava2024;

public class CartaoCredito implements Pagamento {

	private boolean pago = false;

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento de: " + valor + " realizado com Cartão de Crédito.");
		pago = true;

	}

	@Override

	public String obterStatus() {
		return pago ? "PAGO" : "PENDENTE";
	}

}
