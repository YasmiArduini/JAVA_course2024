package cursoJava2024;

public class Carro02 implements Veiculo01 {

//	Construtor sem parametros

	public Carro02() {

	}

	@Override
	public void acelerar() {
		System.out.println("O carro tá acelerando...");
	}

	@Override
	public void frear() {
		System.out.println("O carro tá freiando...");

	}

}
