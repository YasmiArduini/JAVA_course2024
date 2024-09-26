package cursoJava2024;

public class IfConciso {

	public static void main(String[] args) {
		
		//Declarando vaeiável
		
		int numero = 9;
		
		//Uso do if normal
		
		/*if (numero >= 10) {
			
			System.out.println("Vai maior/igual a 10.");
			
		} else {
		
			System.out.println("Valor Menor que 10");
			
	}*/
	
	//Uso do if ternario
		
       String resultado = (numero >= 10) ? "Maior que 10" : "Menor que 10";
    	   System.out.println("O número " +numero+ " é " +resultado);
		
	
	
	
	
	
	}
}
