package cursoJava2024;

public class TrabalhandocomStrings {

	public static void main(String[] args) {
		String texto = "Bem-vindo ao curso de Java.";

		String texto2 = "Vamos aprender sobre STRING";

//      1. Comprimento da String

		String nome = "Yasmin Vitoria Santos Arduini";

		System.out.println("Comprimento da String: " + nome.length());

//      2. COncatenar String:

		String textoCompleto = texto + " " + texto2;

		System.out.println("Texto completo: " + textoCompleto);

//      String nome2 = "Yasmi";

//      String sobreNome = "Aduini";

//      System.out.println(nome2 + " "+ sobreNome);

//      3. Converter letras MAIÚSCULA e minúsculas

		System.out.println("MAIÚSCULA: " + texto.toUpperCase());

		System.out.println("minúsculas: " + texto.toLowerCase());

//      4. Substituir uma parte da String

		String novoTexto = texto.replace("Java", "Vitória");

		System.out.println(novoTexto);

//      5.Bscar por uma Substring

		int posicao = texto.indexOf("curso");
		System.out.println("Posição da palavra 'curso': " + posicao);

//      6.Verificar se uma String começa ou termina com uma subString

		System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));
		System.out.println("Termina com 'Java': " + texto.endsWith("Java."));

//      7. Dividir String:
		String[] palavras = textoCompleto.split(" ");
		System.out.println("Palavras no  texto completo: ");
		for (String palavra : palavras) {

			System.out.println(palavra);

//  			  8. remover espaços
			String textoComEspaços = "       ";

			String textoSemEspacos = textoComEspaços.trim();

	        System.out.println("Texto sem espaços: " + textoSemEspacos + " ");

		}

	}

}
