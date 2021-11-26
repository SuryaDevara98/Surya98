package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class swapping {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value: ");
		int s = sc.nextInt();
		System.out.println("enter the other number: ");
		int s1 = sc.nextInt();
		s = s + s1;
		s1 = s - s1;
		s = s - s1;
		System.out.println(s);
		System.out.println(s1);
	}

}

/*
 * using 3rd variable s=s1; s1=t; =s1
 */
