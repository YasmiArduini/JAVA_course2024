package cursoJava2024;

public class Cap8_Lab1 {

	public static int maiorNumero(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			throw new IllegalArgumentException("O array não pode estar vazio");
		}

		int maior = numeros[0];

		for (int numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
		}
		return maior;
	}

	public static void main(String[] args) {
		
		int [] array = {3, 5, 7, 2, 8};
		int maior = maiorNumero(array);
		System.out.println("O maior número é: " + maior);

	}

}
