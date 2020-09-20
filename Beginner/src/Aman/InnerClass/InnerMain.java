package Aman.InnerClass;

public class InnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 O1=new Outer1();
		Outer1.Inner1 I1=O1.new Inner1();
		System.out.println(I1.getx());
		Outer2 O2=new Outer2();
		O2.function1();
		Outer3 o3=new Outer3();
		o3.myFunction();
		Outer4 o4=new Outer4();
		o4.DisplayMessage2();
		//Outer5.Inner5 i5=new Outer5.Inner5();
		//i5.MyMethod();
		Outer5.Inner5.MyMethod();

	}
	

}
