import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = getIntegers(5);
		for(int i =0; i <myIntArray.length; i++) {
			System.out.println("Element "+i+ ", typed value was "+ myIntArray[i]);
		}
		
	}
	public static int[] getIntegers(int number) {
		System.out.println("Enter "+ number+ " interger values. \r");
		int[] values = new int[number];
		for(int i =0; i <values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
}
