package ejercicio3;

import customExceptions.ParImparException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numAleatorio = String.valueOf((int)(Math.random()*999));
		System.out.println("Numero aleatorio generado: " + numAleatorio);
		try {
			ParImparException exception = new ParImparException(numAleatorio);
			throw exception;
		}catch(ParImparException e){
			System.out.println(e.getMessage());
		}
	}

}
