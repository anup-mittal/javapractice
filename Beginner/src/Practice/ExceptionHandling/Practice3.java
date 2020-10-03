package Practice.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
	public void display() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		System.out.println(s);
	}

}
