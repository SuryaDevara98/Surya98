package com.technoelevate.storeapplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SuryaStore {

	static Scanner sc = new Scanner(System.in);

	static ArrayList list = new ArrayList();

	public static void add() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of items to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		System.out.println("items added to list successfully");
		System.out.println("------------------------------------------------------------------------------");

	}

	public static void view() {

		System.out.println(list);

		System.out.println("-----------------------------------------------------------------------------------");

	}

	public static void removeItem() {
		System.out.println("enter the value to delete from list");
		String st = sc.next();
		list.remove(st);
		System.out.println(list);
		System.out.println("-----------------------------------------------------------------------------------");

	}

	public static void replaceMyItems() {
		System.out.println("enter the  old value to be modified/replaced from the list");
		String so1 = sc.next();
		System.out.println("enter the new item");
		String sn1 = sc.next();

		if (so1 != sn1) {
			list.remove(so1);
			list.add(sn1);
		}
		System.out.println(list);

	}

	public static void search() {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the number to get into it");

		System.out.println("choose 1 for add the items");

		System.out.println("choose 2 to view items");

		System.out.println("choose 3 for remove the items");

		System.out.println("choose 4 for search the items");
		int choice = sc.nextInt();
	}

}
