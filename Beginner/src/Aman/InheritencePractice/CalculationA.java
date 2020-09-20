package Aman.InheritencePractice;

public abstract class CalculationA implements CalculationI {
	public abstract void multiplication(int x,int y);
		public void Division(int x,int y){
			int z=x/y;
			System.out.println("division of two number "+z);
		}
		public void Modulus() {
			// TODO Auto-generated method stub
			System.out.println("modulus from abstract class.");
			
		}

}
