package ejercicio5;

import java.util.Iterator;

public class Password {
	int LONG_DEFAULT = 8;

	private int longitud = LONG_DEFAULT;
	private String contraseña;
	
	public Password() {
		
	}

	public Password(int longitud) {
		this.longitud = longitud;
		generarContraseña();
	}
	
	private void generarContraseña() {
		String cadena = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz012345678901234567890123456789";
		for (int i = 0; i < longitud; i++) {
			int randomNumber = (int)(Math.random()*characters.length());
			cadena += characters.charAt(randomNumber);
		}
		contraseña = cadena;
	}

	public boolean esFuerte() {
		int contadorNumeros = 0;
		int contadorMayusculas = 0;
		int contadorMinusculas = 0;
		for (int i = 0; i < contraseña.length(); i++) {
			if(Character.isDigit(contraseña.charAt(i))) {
				contadorNumeros++;
			}else if(Character.isUpperCase(contraseña.charAt(i))) {
				contadorMayusculas++;
			}else if(Character.isLowerCase(contraseña.charAt(i))) {
				contadorMinusculas++;
			}
		}
		return contadorNumeros>5 && contadorMayusculas>2 && contadorMinusculas>1;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarContraseña();
	}
	
}
