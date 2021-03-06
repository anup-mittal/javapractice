/**
 * 
 */
package Aman.simple;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import Aman.medium.Palindrome;
/**
 * @author hp
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Case: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			EnhancedForLoop efl = new EnhancedForLoop();
			efl.showList();
			efl.shownames();
			break;
		case 2:
			MyInteger i = new MyInteger(10);
			if(i.equals(10))
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
            break;
		case 3:
			Integer j=new Integer(1234);
			byte b = j.byteValue();
			System.out.println(b);
			int x;
			x=j.compareTo(15);
			System.out.println(x);
			Character ch = 'x';

			ch=Character.toUpperCase(ch);
			
			if(Character.isUpperCase(ch))
			{
				System.out.println("letter is upper case");
			}
			else
			{
				System.out.println("letter is not upper case");
			}
			String s="Hello";
			s=s.concat(" World");
			System.out.println(s);

			Integer a=10;
			Integer bb=20;
			Integer c = a + bb;
			System.out.printf("Sum of %d and %d is %d", a,bb,c);
			System.out.println();
			System.out.print("Sum of " + a + " and " + bb + " is " + c);

			break;
		case 4:
			MultiPipe mp = new MultiPipe();
			mp.showExample();
			MPClass1 mpc1 = new MPClass1();
			MPClass2 aman = mpc1.callSecond();
			aman.showOutput();
			mpc1.callSecond().showOutput();
			break;
		case 5:
			Integer[] myArray = {1,5,3,2,4};
			Integer[] myArray2 = {1,2,3,4,5};
			Arrays.sort(myArray);
			for(Integer myVar : myArray)
			{
				System.out.println(myVar);
			}
			if(myArray.equals(myArray2))
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal");
			}
			break;
		case 6:
			School school = new School();
			
			System.out.print("School Name: ");
			school.setSchoolName(sc.next());
			for(int ii =0; ii<school.courses.length; ii++)
			{
				school.courses[ii] = new Course();
				System.out.print("Course Name: ");
				school.courses[ii].setCourseName(sc.next());

				for(int jj=0; jj<school.courses[ii].students.length;jj++)
				{
					school.courses[ii].students[jj] = new Student();
					System.out.print("Student Name: ");
					school.courses[ii].students[jj].setName(sc.next());
					System.out.print("Student Marks: ");
					school.courses[ii].students[jj].setMarks(sc.nextInt());
				}
			}

			System.out.println("School: " + school.getSchoolName());
			for(Course crs : school.courses)
			{
				System.out.println("Course Name: " + crs.getCourseName());
				for(Student std : crs.students)
				{
					System.out.println("Student Name: " + std.getName());
					System.out.println("Student Marks: " + std.getMarks());
				}
			}
			

			break;
		case 7:
			Date d = new Date();
			System.out.println(d);
			Date d2 = new Date(3600);
			System.out.println(d2);
			System.out.println("Hello from Git");
			break;
		case 8:	
		    VariableScope vs=new VariableScope();
		    vs.setX(100);
		    vs.y=200;
		    vs.func1();
		    VariableScope vs2 = new VariableScope();
		    vs2.setX(500);
		    vs2.func1();
		    VariableScope.y=1000;
		    vs2.func1();
		    break;
		case 9:
			RegexMatches rm = new RegexMatches();
			String ptr="^[+]{0,1}[1-9]{0,3} [1-9]{3}[0-9]{3}[0-9]{4}$";
			String data="+91 8527880902";
			rm.execute(data, ptr);
			break;
		case 10:
			CopyFile cf = new CopyFile();
			cf.execute();
			System.out.println("File Copy Completed.");
			break;
		case 11:
			Division dv = new Division();

			try {
				System.out.println("Before divide");
				dv.divide(10, 0);
				System.out.println("After divide");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception block executed");
				System.out.println(e);
				throw e;
			}
			finally
			{
				System.out.println("I am getting executed always");
			}
			System.out.println("After try catch finally block");
			
			break;
		case 12:
			Minfunction mn = new Minfunction();
			mn.minfunction(55,60);
			break;
		}
	}
}
