package Aman.InnerClass;
interface message{
	String greet();
}
public class Outer4 {
	public void DisplayMessage(message m){
		System.out.println(m.greet());
		
	}
	public void DisplayMessage2(){
		Outer4 o4=new Outer4();
		o4.DisplayMessage(new message() {
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				
				return "hello";
			}
		});
	}
	

}
