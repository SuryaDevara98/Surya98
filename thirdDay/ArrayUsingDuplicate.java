package com.techelevate.basicjavaprogram;

public class ArrayUsingDuplicate {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 4;
		arr[3] = 7;
		arr[4] = 5;
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

}
