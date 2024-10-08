package cursoJava2024;

public class Carros extends Veiculo {
	private int numeroDePortas;

	public Carros(String marca, String modelo, int ano, int numeroDePortas) {
		
	super(marca, modelo, ano);
	this.numeroDePortas = numeroDePortas;
	
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Numero de Portas: "+ numeroDePortas);

	}
}
