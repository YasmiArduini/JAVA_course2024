package cursoJava2024;

public class Votar {
	public static void main(String[] args) {
		//Conhecendo a condicional IF:
		
		int idade = 16;
		
		//verificando o nome exato:
		
		if( idade > 16) {
			System.out.println("Entre 16 e 18 pode votar. E você pode votar");
			
			
		} else if ( idade < 16) {
				System.out.println("Você não pode votar");
		
		} else if ( idade ==  16 ) {
			System.out.println("Você pode votar se quiser.");
			
	}

}

}