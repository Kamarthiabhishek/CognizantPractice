package PhoneBookManipulation;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		phoneBook p = new phoneBook();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Menu");
			System.out.println("1. Add Contact");
			System.out.println("2. Display all Contacts");
			System.out.println("3. Search contact by phone");
			System.out.println("4. Remove contact");
			System.out.println("5. Exit");

			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("First Name:");
				String fname = sc.next();

				System.out.println("Last Name:");
				String lname = sc.next();

				System.out.println("Phone number:");
				long phone = sc.nextLong();

				System.out.println("Email:");
				String email = sc.next();

				Contact c = new Contact(fname, lname, email, phone);
				p.addContact(c);
				break;
			}
			case 2:{
				System.out.println("The contacts in the List are:");
				List<Contact> allcontacts = p.viewAllContacts();
				for(Contact c : allcontacts) {
					System.out.println("First name:"+c.getFirstName());
					System.out.println("Last name:"+c.getLastName());
					System.out.println("Phine number :"+c.getPhoneNumber());
					System.out.println("Email:"+c.getEmailId());
				}
				break;
			}
			
			case 3:{
				System.out.println("Enter the phone number to be searched:");
				long phno = sc.nextLong();
				Contact c = p.viewContactGivenPhone(phno);
				if(c != null) {
					System.out.println("The contact is ");
					System.out.println("First name : "+c.getFirstName());
					System.out.println("Last name : "+c.getLastName());
					System.out.println("Phone number: "+c.getPhoneNumber());
					System.out.println("Email : "+c.getEmailId());
				}else {
					System.out.println("Contact not found for the given phone number");
				}
				break;
				
			}
			
			case 4:{
				System.out.println("Enter the phone number : ");
				long phno = sc.nextLong();
				boolean removed = p.removeContact(phno);
				if(removed) {
					System.out.println("Contact removed successfully");
				}else {
					System.out.println("Contact not found for the given phone number");
				}
				break;
			}
			
			case 5:{
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}while(choice < 5);		
	}
}
