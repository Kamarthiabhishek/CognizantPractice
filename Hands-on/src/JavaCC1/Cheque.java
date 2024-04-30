package JavaCC1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Cheque extends Payment{
	private String chequeNo;
	private int chequeAmount;
	private Date dateofIssue;
	
	public int getChequeAmount() {
		return chequeAmount;
	}
	public String getChequeNo() {
		return chequeNo;
	}
	public Date getDateofIssue() {
		return dateofIssue;
	}
	
	
	public void setChequeAmount(int chequeAmount) {
		this.chequeAmount = chequeAmount;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public void setDateofIssue(Date dateofIssue) {
		this.dateofIssue = dateofIssue;
	}

	@Override
	public boolean payAmount() {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		LocalDate issueDate = LocalDate.of(2020, 1, 1);
		Payment p = new Payment();
		int due = p.getDueAmount();
		if(currentDate.isBefore(issueDate.plusMonths(6))) {
			if(chequeAmount >= due) {
				return true;
			}
		}
		return false;	
	}
}
