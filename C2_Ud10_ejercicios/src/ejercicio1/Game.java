package ejercicio1;

public class Game {
	private int numAleatorio;
	private int attempts = 0;
	private final int MAX_VALUE = 500;
	private final int MIN_VALUE = 1;
	private boolean endGame = false;


	public Game() {
		numAleatorio = (int)(Math.random()*MAX_VALUE-MIN_VALUE)+MIN_VALUE;
	}
	public Game(int min, int max) {
		numAleatorio = (int)(Math.random()*max-min)+min;
	}

	public boolean askNumber(int numberAsked) {
		attempts++;
		if(numberAsked == numAleatorio) {
			endGame = true;
			return true;
		}
		return false;
	}
	public boolean isItHigher(int numberAsked) {
		if(numAleatorio > numberAsked) {
			return true;
		}else{
			return false;
		}
	}
	public void incrementAttempts() {
		attempts++;
	}
	public int getAttempts() {
		return attempts;
	}
	public boolean getEndGame() {
		return endGame;
	}
}
