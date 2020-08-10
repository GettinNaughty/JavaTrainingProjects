import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone phone = new MobilePhone();
	private static Contacts contacts;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
		int choice = 0;
		while(!quit) {
			printInstructions();
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				phone.printContactsList();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				searchForContact();
				break;
			case 6:
				quit = true;
				break;
			}
		}
	}
	public static void printInstructions() {
		System.out.println("\n Press ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of contacts.");
		System.out.println("\t 2 - To add a contact to the list.");
		System.out.println("\t 3 - To modify a contact in the list.");
		System.out.println("\t 4 - To remove a contact from the list.");
		System.out.println("\t 5 - To search for a contact in the list.");
		System.out.println("\t 6 - To quit the application.");
	}
	public static void addContact() {
		System.out.println("Please enter the phone number: ");
		String phoneNumber = scanner.nextLine();
		System.out.println("Please enter the name: ");
		String name = scanner.nextLine();
		Contacts contactToAdd = new Contacts(name, phoneNumber);
		if(!phone.onFile(contactToAdd)) {
		phone.addContact(contactToAdd);
		}
		else {
			System.out.println("Contact already exists!");
		}
	}
	public static void updateContact() {
		System.out.print("Enter name: ");
		String contactInformation = scanner.nextLine();
		Contacts currentContact = phone.onFile(contactInformation);
		if(currentContact!=null) {
		System.out.println("Enter replacement name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter replacement number: ");
		String newPhoneNumber = scanner.nextLine();
		Contacts updatedContact = new Contacts(newName,newPhoneNumber);
		phone.updateContact(currentContact, updatedContact);
		}
		else {
			System.out.println("Contact not found!");
		}
		}
	public static void removeContact() {
		System.out.println("Enter name: ");
		
		String contactInformation = scanner.nextLine();
		Contacts contactToRemove = phone.onFile(contactInformation);
		phone.removeContact(contactToRemove);
	}
	public static void searchForContact() {
		System.out.println("Enter name: ");
		String contactInformation = scanner.nextLine();
		Contacts contactToSearch = phone.onFile(contactInformation);
		if(contactToSearch!=null) {
			System.out.println("Contact found!");
		}
		else {
			System.out.println("Contact not found!");
		}
	}
}


