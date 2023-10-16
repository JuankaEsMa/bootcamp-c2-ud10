package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		Scanner sc = new Scanner(System.in);
		
		while(!game.getEndGame()) {
			try {
				System.out.println("Pregunta un número (1-500): ");
				int askNumber = sc.nextInt();
				boolean isCorrect = game.askNumber(askNumber);
				if(isCorrect) {
					System.out.println("¡¡Enhorabuena!!");
				}else {
					if(game.isItHigher(askNumber)) {
						System.out.println("El numero Aleatorio es mayor que el tuyo");
					}else {
						System.out.println("El numero Aleatorio es menor que el tuyo");
					}
				}
			}catch(InputMismatchException e) {
				System.out.println("Error: El tipo de entrada no es un numero o es demasiado grande");
				game.incrementAttempts();
				sc.nextLine();
			}
		}
		System.out.println("Lo has conseguido en " + game.getAttempts() + " intentos.");
	}

}
