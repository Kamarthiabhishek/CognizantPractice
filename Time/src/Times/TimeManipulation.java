package Times;

import java.time.LocalDate;

public class TimeManipulation {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = currentDate.plusMonths(6);
		
		System.out.println(currentDate);
		System.out.println(futureDate);
	}
}
