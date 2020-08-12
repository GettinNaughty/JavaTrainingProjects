package com.challenge.packagechallenge;

public class Series {
	
	public int nSum(int n) {
		int sum =0;
		for(int i =1; i<= n; i++) {
			sum = sum +i;
		}
		return sum;
	}
	public int factorial(int n) {
		int factorial = 1;
		for(int i = 2; i<=n; i++) {
			factorial = i * factorial;
		}
		return factorial;
	}
	public int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return (fibonacci(n-1) + fibonacci(n-2));
		}
	}
}
