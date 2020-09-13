package Bank.account;

public class Bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkingaccount C=new Checkingaccount(101);
		System.out.println("deposite $500...");
		C.deposite(500.00);
		try{
			System.out.println("withdraw $100..");
			C.withdraw(100);
			System.out.println("withdraw $600...");
			C.withdraw(600);
		}
		catch(InsufficientFundsException e){
			System.out.println("sorry,but you are short by $"+e.getAmount());
			e.printStackTrace();	
		}
	}

}
