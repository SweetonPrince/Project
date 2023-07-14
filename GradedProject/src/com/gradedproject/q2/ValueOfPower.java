package com.gradedproject.q2;

public class ValueOfPower {
	public static int powerMethod(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * powerMethod(x,n-1);
		}

	}

	public static void main(String[] args) {
		// Enter the base number
		int x = 2;
		// Enter the power
		int n = 10;
		int answer = powerMethod(x, n);
		System.out.println("X power N is: " + answer);
	}

}