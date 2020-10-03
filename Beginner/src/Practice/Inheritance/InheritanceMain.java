package Practice.Inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationChild1 cc1 = new CalculationChild1();
		cc1.addition(10, 20);
		cc1.subtraction(20, 10);
		cc1.multiplication(10, 20);
		try
		{
			cc1.divide(10, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		cc1.modulus();
		
		cc1.func();
		System.out.println("--------------------------------------------------------------------");
	}

}
