package cursoJava2024;

public class Boleto implements Pagamento {

	private boolean processado = false;
	
	@Override
	public void pagar (double valor ) {
		
		System.out.println("Boleto gerado de valor de: " + valor + " Aguardando pagamento...");
		processado = false;
	}
	
	public void processarBoleto() {
		processado = true;
		
		System.out.println("Boleto processado!");
	}

	@Override
	public String obterStatus() {
		return processado ? "PAGO" : "PENDENTE";
	}
	
}
