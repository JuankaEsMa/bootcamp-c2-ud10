package ejercicio2;

import customExceptions.MyCustomException;

public class MainApp {
	public static void main(String[] args) {
		try {
			System.out.println("Mensaje por pantalla");
			MyCustomException exception = new MyCustomException("Mensaje de la excepción");
			throw exception;
		}catch(MyCustomException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Programa finalizado");
		}
	}
	
}
