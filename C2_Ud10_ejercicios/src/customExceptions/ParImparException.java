package customExceptions;

public class ParImparException extends Exception{

	
	public ParImparException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		try {
			int number = Integer.parseInt(super.getMessage());
			if(number%2==0) {
				return "El numero es par";
			}else {
				return "El numero es impar";
			}
		}catch(Exception e) {
			return "Has de escribir un número";
		}
	}
	
}
