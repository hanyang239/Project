package com.fdmgroup.fruitproject2;

import java.util.ArrayList;

public class Checkout {

	public Double calculatePrice(Basket basket) {
		Double total = 0.0;
		Double price = 0.0;

		ArrayList<Fruit> fruitList = basket.getFruitsInBasket();

		for (Fruit fruit : fruitList) {
			price = fruit.getPrice();
			total += price;
		}

		return total;

	}
}