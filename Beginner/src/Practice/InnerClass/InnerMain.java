package Practice.InnerClass;

public class InnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 o = new Outer1();
		Outer1.Inner1 oi = o.new Inner1();
		System.out.println(oi.getX());
		
		Outer2 o2 = new Outer2();
		o2.outer2();
		
		Outer3 o3 = new Outer3();
		o3.myFunc();
		
		Outer4 o4 = new Outer4();
		o4.displayMessage2();
		
//		Outer5.Inner5 i5 = new Outer5.Inner5();
//		i5.myMethod();
		
		Outer5.Inner5.myMethod();
	}

}
