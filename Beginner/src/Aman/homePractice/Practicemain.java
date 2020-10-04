package Aman.homePractice;
import java.util.Scanner;

public class Practicemain {

	public static void main(String[] args) {
		int h=5,b=20,area;
		int i = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter case no: ");
		i=sc.nextInt();
		switch(i)
		{
		// TODO Auto-generated method stub
		case 1:
		 System.out.println("height of the triangle: "+h);
		 System.out.println("base of the triangle: "+b);
		 area=(h*b)/2;
		 System.out.println("area of triangle: "+area);
		 break;
		case 2:
			Puppy p=new Puppy("tommy");
			p.setPuppyAge(5);
			p.getPuppyAge();
			break;
		case 3:
			Employee e=new Employee("aman");
			e.setSalary(10000);
			e.printEmp();
		case 4:
			String palindrome = "dot saw I was tod";
			int len = palindrome.length();
			System.out.println("String length is :"+len);
			break;
	    }
    }


}
