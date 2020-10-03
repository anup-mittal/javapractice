package Practice.Inheritance;

public abstract class CalculationA implements CalculationI{
	public abstract void multiplication(int x, int y);
	public void divide(int x, int y)
	{
		int z=x/y;
		System.out.println("Division is : " + z);
	}
	public void modulus() {
		// TODO Auto-generated method stub
		System.out.println("Modulus from Abstract...!");
	}
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("Hello from Abstract...!");
		}
}