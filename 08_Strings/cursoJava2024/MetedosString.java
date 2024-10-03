package cursoJava2024;

public class MetedosString {

//	metodo 01: calcular a soma de 2 numeros:
	public int soma(int a, int b, int c) {
		return a + b + c;
	}

//	metodo 02: verificar se um numero é par
	public boolean ehPar(int numero, int c) {
		return numero % 2 == 0;
	}

	public int sc(int b) {
		return b / 10;
	}

//	metodo 03: inverter
	public String inversao(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}

	public static void main(String[] args) {
//		instanciando a clase:
		MetedosString utilidades=new MetedosString();
		
//		chamando os metodos:
		System.out.println("String invertida: "+utilidades.inversao ("Yasmi")); 
		
		System.out.println("A soma de  e  é: "+ utilidades.soma(57, 678, 324));
		
		System.out.println("O numero 58 é par?: "+ utilidades.ehPar(58, 21));
	   
		System.out.println("O fatorial de 19 é: "+ utilidades.fatorial(19));

}	
	
//		metodo 04: calcular o fatorial de um numero
		
		public int fatorial(int numero) {
			
		
			if ( numero == 0 || numero == 1) {
			
				return 1;
				
			} 
			
		return numero * fatorial(numero - 1 );
		

	}

}