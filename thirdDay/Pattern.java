package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your pattern size");
		int k = sc.nextInt();
		for (int i = 0; i <= k; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println(" ");
		}

	}

}
