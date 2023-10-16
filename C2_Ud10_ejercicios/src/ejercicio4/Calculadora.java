package ejercicio4;

import java.util.Scanner;

public class Calculadora {
	double num1;
	double num2;
	double resultado;
	Scanner sc = new Scanner(System.in);

	public Calculadora() {

	}

	public double hacerOperacion() throws ArithmeticException{
		System.out.println("Que operación deseas hacer?");
		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		System.out.println("5) Raiz cuadrada");
		System.out.println("6) Raiz cúbica");
		int opcion = sc.nextInt();
		switch(opcion){
		case 1:
			return sumar();
		case 2:
			return restar();
		case 3: 
			return multiplicar();
		case 4:
			return dividir();
		case 5:
			return raizCuadrada();
		case 6:
			return raizCubica();
		default:
			System.out.println("La operación indicada no existe");
			return 0;
		}
	}

	public double sumar() {
		pedirNumeros();
		return num1 + num2;
	}
	public double restar() {
		pedirNumeros();
		return num1 - num2;
	}
	public double multiplicar() {
		pedirNumeros();
		return num1 * num2;
	}
	public double dividir() throws ArithmeticException {
		try {
			pedirNumeros();
			resultado = num1/num2;
			System.out.println(resultado);
		}catch (ArithmeticException e) {
			System.out.println("Error dentro de la classe");
		}
		
		return resultado;
	}
	public double raizCuadrada() {
		pedirNumero();
		return Math.sqrt(num1);
	}
	public double raizCubica() {
		pedirNumero();
		return Math.cbrt(num1);
	}
	public void pedirNumeros() {
		System.out.println("Escriba el primer número: ");
		num1 = sc.nextDouble();
		System.out.println("Escriba el segundo número: ");
		num2 = sc.nextDouble();
	}
	private void pedirNumero() {
		System.out.println("Escriba el número");
		num1 = sc.nextDouble();
	}
}
