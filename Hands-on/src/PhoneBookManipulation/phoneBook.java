package PhoneBookManipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class phoneBook {
	private List<Contact> phoneBook = new ArrayList<Contact>();
	
	public List<Contact> getPhoneBook() {
		return phoneBook;
	}
	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
	}
	
	public List<Contact> viewAllContacts(){
		return phoneBook;
	}
	
	public Contact viewContactGivenPhone(long phoneNumber) {
		for(Contact c : phoneBook) {
			if(c.getPhoneNumber() == phoneNumber) {
				return c;
			}
		}
		return null;
	}
	
	public boolean removeContact(long phoneNumber) {
		for(Iterator<Contact> iterator = phoneBook.iterator();
				iterator.hasNext();) {
			Contact c = iterator.next();
			if(c.getPhoneNumber() == phoneNumber) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
}
