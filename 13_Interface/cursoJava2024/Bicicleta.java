package cursoJava2024;

public class Bicicleta implements Veiculo01 {

	public Bicicleta() {

	}

	@Override
	public void acelerar() {
		System.out.println("A bicicleta tá acelerando...");
	}

	@Override
	public void frear() {
		System.out.println("A bicicleta tá freiando...");

	}
}
