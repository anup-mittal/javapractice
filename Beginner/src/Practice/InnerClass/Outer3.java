package Practice.InnerClass;
abstract class AnnonymousInner
{
	public abstract void myMethod();
}
public class Outer3 {
	public void myFunc()
	{
		AnnonymousInner ai = new AnnonymousInner() {
			
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("I am Annonymous...!");
			}
		};
		ai.myMethod();

		AnnonymousInner ai2 = new AnnonymousInner() {
			
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("I am Annonymous 2...!");
			}
		};
		ai2.myMethod();
	}

}
