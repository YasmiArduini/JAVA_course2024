package cursoJava2024;

public class SimplesArray {

	public static void main(String[] args) {

		int[] numeros = { 10, 20, 30, 40, 50 };

		System.out.println("Valores do array de inteiros:");
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Elemento na posição " + i + ": " + numeros[i]);

		}
	}
}