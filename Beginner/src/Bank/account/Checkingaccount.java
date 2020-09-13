package Bank.account;

public class Checkingaccount {
	private double balance;
	private int number;
	public Checkingaccount(int number){
		this.number=number;
	}
	public void deposite(double amount){
		balance +=amount;
	}
	public void withdraw (double amount) throws InsufficientFundsException{
		if(amount<=balance)
		{
			balance-=amount;
		}
		else
		{
			double needs=amount-balance;
			throw new InsufficientFundsException(needs);
		}
	}
	public double balance(){
		return balance;
	}
	public int number(){
		return number;
	}

}
