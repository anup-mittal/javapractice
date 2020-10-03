package Practice.InnerClass;
interface Message
{
	public String greet();
}
public class Outer4 {
	public void displayMessage(Message m)
	{
		System.out.println(m.greet());
	}
	public void displayMessage2()
	{
		Outer4 o4 = new Outer4();
		o4.displayMessage(new Message() {
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hello...!";
			}
		});
	}
	

}
