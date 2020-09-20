package Aman.ExceptionPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
	public void userinput() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		s = in.readLine();
		System.out.println(s);
	}
}
