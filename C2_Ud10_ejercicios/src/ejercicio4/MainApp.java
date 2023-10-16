package ejercicio4;

import java.util.Scanner;

public class MainApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);
		System.out.println("Resultado: " + calculadora.hacerOperacion());
	}

}
