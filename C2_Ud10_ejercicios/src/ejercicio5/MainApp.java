package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		int longitud = 0;
		boolean parametroCorrecto = false;
		while(!parametroCorrecto) {
			parametroCorrecto = true;
			try {
				System.out.println("Escriba cuantas contraseñas quieres crear");
				cantidad = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("La cantidad ha de ser un número");
				parametroCorrecto = false;
			}
		}
		parametroCorrecto = false;
		while(!parametroCorrecto) {
			parametroCorrecto = true;
			try {
				longitud = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("La longitud ha de ser un número");
				parametroCorrecto = false;
			}
		}
		
		Password[] contraseñas = new Password[cantidad];
		boolean[] contraIsStrong = new boolean[cantidad];
		
		for (int i = 0; i < contraseñas.length; i++) {
			contraseñas[i] = new Password(longitud);
			contraIsStrong[i] = contraseñas[i].esFuerte();
			System.out.println(contraseñas[i].getContraseña() + " " + contraIsStrong[i]);
		}
	}

}
