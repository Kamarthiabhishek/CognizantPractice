package ValidateName;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtility {
	public static Validate validateEmployeeName() {
		Validate v = (input) ->{
			String regex = "^[a-zA-Z ]{5,20}$";
			Pattern p = Pattern.compile(regex);
			
			Matcher m = p.matcher(input);
			
			return m.matches();
		};
		return v;
	}
	
	public static Validate validateProductName() {
		Validate v = (input) ->{
			String regex = "^[a-zA-Z]\\d{5}$";
			Pattern p = Pattern.compile(regex);
			
			Matcher m = p.matcher(input);
			
			return m.matches();
		};
		return v;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Name:");
		String EmpName = sc.nextLine();
		
		System.out.println("Enter the Product Name:");
		String prodName = sc.nextLine();
		
		Validate c = validateEmployeeName();
		boolean ValidateName = c.validateName(EmpName);
		
		if(ValidateName) {
			System.out.println("Employee name is valid");
		}else {
			System.out.println("Employee name is invalid");
		}
		
		Validate prodValid = validateProductName();
		boolean ValidProd = prodValid.validateName(prodName);
		
		if(ValidProd) {
			System.out.println("Product name is valid");
		}else {
			System.out.println("Product name is invalid");
		}
	}
}
