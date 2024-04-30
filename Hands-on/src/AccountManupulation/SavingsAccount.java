package AccountManupulation;

public class SavingsAccount extends Account{
	private double minimumBalance;
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public SavingsAccount(int accountNumber,Customer customerObj,double balance, double minimumBalance) {
		// TODO Auto-generated constructor stub
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}
	
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance > minimumBalance) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
