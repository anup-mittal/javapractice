package Aman.simple;

public class VariableScope {
	private int x;
	public static int y;
	public void func1()
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
		int z=5;
		System.out.println("z="+z);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
