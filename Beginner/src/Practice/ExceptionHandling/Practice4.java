package Practice.ExceptionHandling;

public class Practice4 {
	public void throwMyException() throws MyCustomException
	{
		MyCustomException me = new MyCustomException();
		throw me;
	}

}
