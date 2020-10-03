package Practice.Inheritance;

public class CalculationParent1 extends CalculationA {
	public void addition(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("Sum is : " + z);
	}

	@Override
	public void multiplication(int x, int y) {
		// TODO Auto-generated method stub
		int z=x*y;
		System.out.println("Multiplication is : " + z);
	}

	@Override
	public void modulus() {
		super.modulus();
		// TODO Auto-generated method stub
		System.out.println("Modulus from Parent...!");
	}

	@Override
	public void func() {
		super.func();
		// TODO Auto-generated method stub
		System.out.println("Hello from Parent...!");
		
	}

}
