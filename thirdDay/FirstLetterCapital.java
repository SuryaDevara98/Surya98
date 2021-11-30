package com.techelevate.basicjavaprogram;

public class FirstLetterCapital {

	public static void main(String[] args) {

		String s = "surya";
		String d = s.substring(0, 1);
		String p = s.substring(1, s.length());

		String k = d.toUpperCase();
		// String k = d.toLowerCase();
		String l = k + p;
		System.out.println(l);

	}

}
