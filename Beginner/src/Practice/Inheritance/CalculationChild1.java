package Practice.Inheritance;

public class CalculationChild1 extends CalculationParent1{
	public void subtraction(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Subtraction is : " + z);
	}
	@Override
	public void modulus() {
		super.modulus();
		// TODO Auto-generated method stub
		System.out.println("Modulus from Child...!");
	}
	@Override
	public void func() {
		super.func();
		// TODO Auto-generated method stub
		System.out.println("Hello from Child...!");
		}
}