package Aman.homePractice;

public class Employee {
	public String name;
	private double salary;
	public Employee (String empName){
		name = empName;
	}
	public void setSalary(double empsal){
		salary=empsal;
	}
	public void printEmp(){
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}
	

}
