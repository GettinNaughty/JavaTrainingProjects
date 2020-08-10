import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		System.out.println("Your name is: "+name);
		
		System.out.println("Enter you year of birth:");
		boolean hasNextInt = scanner.hasNextInt();
		
		
		
		if(hasNextInt)
		{
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine();
			int age = 2020 - yearOfBirth;
			System.out.println("You are "+age + " years old");
		}
		
		scanner.close();
		
	
	}

}
