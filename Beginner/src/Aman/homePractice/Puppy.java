package Aman.homePractice;

public class Puppy {
	int puppyAge;
	public Puppy(String name ){
		System.out.println("Name of the puppy is "+name);
		
	}
	public int getPuppyAge() {
		System.out.println("puppy's age is :"+puppyAge);
		return puppyAge;
	}
	public void setPuppyAge(int Age) {
		this.puppyAge = Age;
	}

}
