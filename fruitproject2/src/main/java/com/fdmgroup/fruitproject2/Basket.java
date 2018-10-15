package com.fdmgroup.fruitproject2;

import java.util.ArrayList;

public class Basket {

	ArrayList<Fruit> fruitList = new ArrayList<Fruit>();

	public ArrayList<Fruit> getFruitsInBasket() {
		return fruitList;
	}

	public void addFruit(Fruit fruit) {
		fruitList.add(fruit);
	}

	public void removeFruit(Fruit fruit) {
		fruitList.remove(fruit);
	}

}
