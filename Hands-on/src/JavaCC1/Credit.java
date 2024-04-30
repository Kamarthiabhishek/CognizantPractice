package JavaCC1;

public class Credit extends Payment {
	
	private int creditCardNo, creditCardAmount;
	private String cardType;
	
	public String getCardType() {
		return cardType;
	}
	public int getCreditCardAmount() {
		return creditCardAmount;
	}
	public int getCreditCardNo() {
		return creditCardNo;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public void setCreditCardAmount(int creditCardAmount) {
		this.creditCardAmount = creditCardAmount;
	}
	public void setCreditCardNo(int creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	
	@Override
	public boolean payAmount() {
		// TODO Auto-generated method stub
		Payment p = new Payment();
		int due = p.getDueAmount();
		
		if(cardType.equals("silver")) {
			if(10000 > (due + due*0.02)) {
				return true;
			}
		}else if(cardType.equals("gold")) {
				if(50000 > (due + due*0.05)) {
					return true;
				}
		}else if(cardType.equals("platinum")) {
					if(100000 > (due + due*0.1)) {
						return true;
					}
				}
		return false;
	}
}
