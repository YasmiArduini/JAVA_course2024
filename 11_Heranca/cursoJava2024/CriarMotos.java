package cursoJava2024;

public class CriarMotos {

	public static void main(String[] args) {

		Motos moto1 = new Motos("Harley-Davidson", "Harley-Davidson Fat Boy", 1990, false);
		Motos moto2 = new Motos("Yamaha", "Yamaha YZF-R1", 1998, false);
		Motos moto3 = new Motos("Honda", "Honda CB750", 1969, false);

		// Exibindo o motos

		System.out.println("Detalhes do Moto 1\n");
		moto1.exibirDetalhes();

		System.out.println("Detalhes do Moto 2\n");
		moto2.exibirDetalhes();

		System.out.println("Detalhes do Moto 3\n");
		moto3.exibirDetalhes();
	}
}