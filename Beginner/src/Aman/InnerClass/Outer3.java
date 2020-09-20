package Aman.InnerClass;
abstract class AnonimusInner{
	public abstract void myMethod();
}
public class Outer3 {
	public void myFunction(){
		AnonimusInner ai=new AnonimusInner() {
			
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("this is a example of anonimusinner class");
				
			}
		};
		ai.myMethod();
		AnonimusInner a=new AnonimusInner() {
			
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("this is different example of inner class");
				
			}
		};
		a.myMethod();
	}
	
	

}
