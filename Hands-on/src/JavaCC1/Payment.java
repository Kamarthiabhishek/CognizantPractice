package JavaCC1;

public class Payment {
	private int dueAmount;
	
	
	public int getDueAmount() {
		return dueAmount;
	}
	
	public void setDueAmount(int dueAmount) {
		this.dueAmount = dueAmount;
	}
	
	public boolean payAmount() {
		if(dueAmount == 0) {
			return true;
		}else {
			return false;
		}
	}
}
