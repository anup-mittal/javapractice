package Aman.medium;

public class MediumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=5;
		switch(choice){
		case 1:
			System.out.println("Hello");
			ChildClass c = new ChildClass(10);
			c.displayY();
			c.displayX();
			c.display();
			break;
		case 2:
			SchoolStudent S=new SchoolStudent();
			S.attendence();
			S.homework();
			S.test();
			break;
		case 3:
			iStudent C=new CollegeStudent();
			C.attendence();
			C.test();
			C.homework();
			break;
		case 4:
			int a=20;int b=10;
			Mycalculation cal = new Mycalculation();
			cal.addition(a,b);
			cal.subtraction(a,b);
			cal.multiplication(a,b);
			break;
		case 5:
			Animal a1=new Animal();
			Animal a2 = new Dog();
			a1.move();
			a2.move();
			break;
		}
		

	}

}
