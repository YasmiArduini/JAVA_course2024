package cursoJava2024;

import java.util.ArrayList;
import java.util.List;

public class MAPDados {

	public static void main(String[] args) {

		List<Integer> numeros = List.of(14, 17, 22, 24, 78, 55);

		List<Integer> quadrados = calcularQuadrados(numeros);

		System.out.println("Números originais: " + numeros);
		System.out.println("Quadrados: " + quadrados);

	}

	public static List<Integer> calcularQuadrados(List<Integer> numeros) {
		List<Integer> quadrados = new ArrayList<>();
		
		for (Integer numero : numeros) {
			quadrados.add(numero * numero);
		}

		return quadrados;
		
	}

}
