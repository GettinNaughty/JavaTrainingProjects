package com.challenge.scope;

import java.util.Scanner;

public class X {
	
	private int x;
	public void TimesTable() {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter an interger: ");
		this.x = x.nextInt();
		x.nextLine();
		innerTimesTable();
	}
	
	
	private void innerTimesTable() {
		for(int x = 1; x<=12; x++) {
			System.out.println(this.x+" times "+ x+" is "+x*this.x);
		}
	}
	
}
