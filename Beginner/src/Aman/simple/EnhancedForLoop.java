package Aman.simple;

public class EnhancedForLoop {
	public int [] numbers = { 10, 20, 30, 40, 50};
	public String[] names = {"janes","toms","raj","ritik"};
	public void showList()
	{
		for(int x : this.numbers)
		{
			System.out.println(x);
		}
	}
	public void shownames()
	{
		for(String x : this.names)
		{
			System.out.println(x); // comment
		}
		
	}
	
}
