package Aman.InheritencePractice;

public class CalculationParent1 extends CalculationA {
	public void addition(int x,int y){
		int z=x+y;
		System.out.println("addition of two number "+z);
	}

	@Override
	public void multiplication(int x, int y) {
		// TODO Auto-generated method stub
		int z=x*y;
		System.out.println("multiple of two number "+z);
		
	}

	@Override
	public void Modulus() {
		super.Modulus();
		// TODO Auto-generated method stub
		System.out.println("modulus from parent.");
		
	}

	@Override
	public void Funck() {
		// TODO Auto-generated method stub
		System.out.println("hello from funck");
	}
	

}
