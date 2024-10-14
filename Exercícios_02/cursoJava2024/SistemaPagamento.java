package cursoJava2024;

import java.util.ArrayList;

public class SistemaPagamento {

	public static void main(String[] args) {

		ArrayList<Pagamento> pagamentos = new ArrayList<>();

		Pagamento cartaoCredito = new CartaoCredito();
		Pagamento boleto = new Boleto();
		Pagamento paypal = new PayPal();
		Pagamento pix = new Pix();

		pagamentos.add(cartaoCredito);
		pagamentos.add(boleto);
		pagamentos.add(paypal);
		pagamentos.add(pix);

		// Simulando pagamentos
		cartaoCredito.pagar(100.00);
		boleto.pagar(200.00);
		paypal.pagar(150.00);
		pix.pagar(50.00);

		// Processando boleto manualmente
		if (boleto instanceof Boleto) {
			((Boleto) boleto).processarBoleto();
		}

		// Exibindo status de todos os pagamentos
		for (Pagamento pagamento : pagamentos) {
			System.out.println("Status: " + pagamento.obterStatus());
		}
	}

}
