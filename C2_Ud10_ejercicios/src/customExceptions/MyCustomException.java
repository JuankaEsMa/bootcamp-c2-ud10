package customExceptions;

public class MyCustomException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	public MyCustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyCustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
