package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int s = sc.nextInt();

		long fact = 1;
		for (int i = 1; i <= s; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}

}
