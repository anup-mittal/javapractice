package simple;

import java.util.Scanner;

public class student {
	public void studentname()
	{
		String s1;
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("name of student:");
		s1=sc.next();
		System.out.println("enter marks of student:");
		marks=sc.nextInt();
		System.out.println("Name: " + s1);
		System.out.println("Marks: " + marks);
		System.out.printf("Name: " + s1 + " - Marks: %d",marks );
		sc.close();
	}
	
	
	

}
