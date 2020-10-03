package Practice.InnerClass;

public class Outer2 {
	public void outer2()
	{
		int x=10;
		class Inner2
		{
			public void inner2()
			{
				System.out.println("Inner Class 2...!" + x);
			}
		}
		Inner2 i2 = new Inner2();
		i2.inner2();
	}
}
