package cursoJava2024;

public class Motos extends Veiculo {
	private boolean temBagageiro;

	public Motos(String marca, String modelo, int ano, boolean temBagageiro) {
		super(marca, modelo, ano);
		this.temBagageiro = temBagageiro;

	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Tem bagageiro: " + (temBagageiro ? "sim" : "não"));
	}

}
