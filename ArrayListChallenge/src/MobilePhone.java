import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

	public ArrayList<Contacts> getContacts() {
		return contacts;
	}
	
	public void addContact(Contacts contactToAdd) {
		
			contacts.add(contactToAdd);
	}
	public void printContactsList() {
		System.out.println("You have "+contacts.size() +" contacts in your phone");
		for(int i=0; i<contacts.size(); i++) {
			System.out.println((i+1)+ "Name: "+ contacts.get(i).getName()+ "\n Phone number: "+contacts.get(i).getPhoneNumber());
		}
	}
	
	public void updateContact(Contacts currentContact, Contacts updatedContact) {
		int position = findContact(currentContact);
			updateContact(position,updatedContact);
		}

	private void updateContact(int position, Contacts contact) {
		contacts.set(position, contact);
	}
	public void removeContact(Contacts contactToRemove) {
		int position = findContact(contactToRemove);
		removeContact(position);
	}
	private void removeContact(int position) {
		contacts.remove(position);
	}
	private int findContact(Contacts contactToFind) {
		return contacts.indexOf(contactToFind);
	}
	public boolean onFile(Contacts contactToCheck) {
		int position = findContact(contactToCheck);
		if(position>=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public Contacts onFile(String contactInformation) {
		for(int i = 0; i<contacts.size(); i++) {
			Contacts contact = contacts.get(i);
			if(contact.getName().equals(contactInformation)) {
				return contact;
			}
		}
		return null;
	}
}
