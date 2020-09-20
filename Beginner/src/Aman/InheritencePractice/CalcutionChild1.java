package Aman.InheritencePractice;

public class CalcutionChild1 extends CalculationParent1 {
	public void substraction(int x,int y){
		int z=x-y;
		System.out.println("substractio is "+z);
	}
	@Override
	public void Modulus() {
		super.Modulus();
		// TODO Auto-generated method stub
		System.out.println("modulus from child class.");
		
	}

}
