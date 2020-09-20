package Aman.ExceptionPractice;

public class Practice4 {
	public void throwMyException() throws MyCustumException{
		MyCustumException mc=new MyCustumException();
		throw mc;
	}

}
