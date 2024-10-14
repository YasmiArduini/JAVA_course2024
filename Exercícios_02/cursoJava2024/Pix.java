package cursoJava2024;

public class Pix implements Pagamento {
	private boolean pago = false;
	
	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento de: " + valor + " realizado via Pix.");
		pago = true;
	}

	@Override
	public String obterStatus() {
		return pago ? "PAGO" : "PENDENTE";

	}
}
