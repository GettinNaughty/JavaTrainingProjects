import java.util.Arrays;
import java.util.Scanner;


public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void sortIntegers(int[] a) {

	    // [230, 23, 45, 34, 98]
	    for (int j = 1; j < a.length; j++) {

	        int key = a[j];
	        int i = j - 1;

	        while (i >= 0 && a[i] < key) {
	            a[i + 1] = a[i];
	            i--;
	        }
	        a[i + 1] = key;
	    }
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = getIntegers(5);
		sortIntegers(myArray);
		printArray(myArray);
	}
	public static void printArray(int[] myArray) {
		for(int i =0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
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
