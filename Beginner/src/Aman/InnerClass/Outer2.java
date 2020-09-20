package Aman.InnerClass;

public class Outer2 {
	public void function1(){
		final int x=10;
		class Inner2{
			public void print(){
				System.out.println("hello from inner class" + x);
			}
		}
		Inner2 I2=new Inner2();
		I2.print();
	}

}
