package Aman.InheritencePractice;

public class Inhertancemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcutionChild1 cc1 = new CalcutionChild1();
		cc1.addition(20, 10);
		cc1.substraction(20, 10);
		cc1.multiplication(10, 5);
		cc1.Division(50, 10);
		cc1.Modulus();
		cc1.Funck();
		System.out.println("-----------");
		CalculationParent1 i=new CalcutionChild1();
		i.addition(20, 10);

	}

}
