package com.challenge.seriestest;

import com.challenge.packagechallenge.Series;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Series s = new Series();
			for(int i = 0; i<= 10; i++) {
			System.out.println("The sum of all numbers from 0 to " +i+" is: "+s.nSum(i));
			}
			for(int i = 0; i<= 10; i++) {
				System.out.println("The factorial of " +i+" is: "+s.factorial(i));
				}
			for(int i = 0; i<= 10; i++) {
				System.out.println("The " +i+"th is: "+s.fibonacci(i));
				}
		}

	}


