package com.fdmgroup.fruitproject2;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Basket basket = new Basket();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Fruits:");
		System.out.println("Apple");
		System.out.println("Banana");
		System.out.println("Orange");
		System.out.println("Pear");
		System.out.println("Lemon");

		System.out.println("Please type the name of the fruit you wish to add to the basket: ");

		String input = scanner.nextLine().toLowerCase();
		System.out.println(input);

	}

}
