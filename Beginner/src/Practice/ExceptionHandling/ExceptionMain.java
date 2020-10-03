package Practice.ExceptionHandling;

import java.io.IOException;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice1 p = new Practice1();
		p.setX(10);
		System.out.println(p.getX());
		
		try
		{
			System.out.println(p.p2.getY());
		}
		catch(NullPointerException np)
		{
			System.out.println(np.getMessage());
		}
		finally
		{
			System.out.println("Exception Catched...!");
		}
		
		int[] a = {10,20,30,40,50};
		int i;
		for(i=0;i<10;i++)
		{
			try
			{
				System.out.println(a[i]);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(ae);
			}
			catch(Exception e)
			{
				System.out.println("CATCH...!");
				System.out.println(e);
			}
		}
		
		Practice3 p3 = new Practice3();
		try 
		{
			p3.display();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		Practice4 p4 = new Practice4();
		try 
		{
			p4.throwMyException();
		}
		catch(MyCustomException e)
		{
			System.out.println(e.displayMessage());
		}
	}
}
