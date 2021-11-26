package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		/*
		 * String s = "Surya"; String s1 = "";
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Name");
		String s = sc.nextLine();
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			s1 = s.charAt(i) + s1;

		}
		System.out.println(s1);
	}

}
