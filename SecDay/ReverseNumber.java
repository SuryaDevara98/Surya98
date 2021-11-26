package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int i = sc.nextInt();
		int rev = 0;

		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
		}
		System.out.println(rev);

	}

}
