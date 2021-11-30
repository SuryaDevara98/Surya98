package com.technoelevate.storeapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreMain {

	public static void main(String[] args) {

		ArrayList<SuryaStore> arr = new ArrayList<SuryaStore>();

		Scanner sc = new Scanner(System.in);
		System.out.println("choose the number to get into it");

		System.out.println("choose 1 for add the items");

		System.out.println("choose 2 to view items");

		System.out.println("choose 3 for remove the items");

		System.out.println("choose 4 for search the items");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			SuryaStore.add();
			SuryaStore.menu();

		case 2:
			SuryaStore.view();
			SuryaStore.menu();
		case 3:
			SuryaStore.removeItem();
			SuryaStore.menu();
		case 4:
			SuryaStore.replaceMyItems();
			SuryaStore.menu();
		}

	}
}
