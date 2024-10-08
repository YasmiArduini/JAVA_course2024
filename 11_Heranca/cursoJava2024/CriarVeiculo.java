package cursoJava2024;

public class CriarVeiculo {

	public static void main(String[] args) {

		Carros carro1 = new Carros("Nissan", "Nissan S13", 1991, 4);
		Carros carro2 = new Carros("Chevrolet", "Biscayne", 1968, 2);
		Carros carro3 = new Carros("Nissan", "Nissan 180sx", 2005, 4);

		// Exibindo o carro

		System.out.println("Detalhes do Carro 1\n");
		carro1.exibirDetalhes();

		System.out.println("Detalhes do Carro 2\n");
		carro2.exibirDetalhes();

		System.out.println("Detalhes do Carro 3\n");
		carro3.exibirDetalhes();

	}

}
