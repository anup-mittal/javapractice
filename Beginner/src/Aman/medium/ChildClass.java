package Aman.medium;

public class ChildClass extends ParentClass {
    int y;
	ChildClass(int y) {
		super(y+1);
		// TODO Auto-generated constructor stub
		this.y=y;
	}
	public void displayY()
	{
		System.out.println(this.y);
	}
	public void displayX()
	{
		System.out.println(this.x);
	}

	
}
