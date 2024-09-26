package cursoJava2024;

import java.util.Random;

public class GeradordeNumeros {

	public static void main(String[] args) {
		
		Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(100) + 1;
            System.out.println("Número aleatório: " + num);
        
    


	}
   }
}