package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class Plalindrone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String s = sc.next();
		String s1 = "";

		for (int i = 0; i < s.length() - 1; i++) {
			s1 = s1 + s.charAt(i);
		}
		if (s.equals(s1)) {
			System.out.println("given string is pallindrome");
		} else {
			System.out.println("given STring is not apallindrome ");
		}
	}

}
