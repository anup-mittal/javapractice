/**
 * 
 */
package Aman.simple;

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
	public static void main(String[] args) {
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
			Integer c =a+bb;
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
			school s11=new school();
			s11.schoolname();
			course c1=new course();
			c1.courcename();
			student st=new student();
			st.studentname();
			break;
		case 7:
			Date d = new Date();
			System.out.println(d);
			Date d2 = new Date(3600);
			System.out.println(d2);
			System.out.println("Hello from Git");
			break;
		}
		
		
/*		VariableScope vs=new VariableScope();
		vs.setX(100);
		vs.y=200;
		vs.func1();
		VariableScope vs2 = new VariableScope();
		vs2.setX(500);
		vs2.func1();
		VariableScope.y=1000;
		vs2.func1();
*/
	}
}
