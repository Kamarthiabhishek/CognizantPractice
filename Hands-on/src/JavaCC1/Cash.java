package JavaCC1;

public class Cash extends Payment{
	private int cashAmount;
	
	
	public int getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}
	
	Payment p = new Payment();
	
	int due = p.getDueAmount();
	
	@Override
	public boolean payAmount() {
		// TODO Auto-generated method stub
		
		if(cashAmount > due) {
			return true;
		}
		return false;
	}
}
