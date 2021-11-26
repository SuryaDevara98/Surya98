package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("enter the array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("after reversing");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);
		}
	}

}
