package com.techelevate.basicjavaprogram;

import java.util.Scanner;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your array size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("enter array ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (large > arr[i]) { // on keeping < and > we will get larger an dsmaller array no.s
				large = arr[i];
			}
		}
		System.out.println("the largest array is : " + large);
	}

}
