package Phonemanipulation;

import java.util.*;
public class PhoneBook {
	
	List<Contact> phoneBook = new ArrayList<>();
	
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
		
		for(Contact c : phoneBook) {
			if(c.getPhoneNumber() == phoneNumber) {
				phoneBook.remove(c);
				return true;
			}
		}
		return false;
	}
}
