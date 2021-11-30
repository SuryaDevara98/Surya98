package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int s = sc.nextInt();
		if (s % 2 == 0) {
			System.out.println("given number : " + s + "is a even");

		} else {
			System.out.println("the given no. is Odd");
		}

	}

}
