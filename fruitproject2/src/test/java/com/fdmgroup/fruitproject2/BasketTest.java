package com.fdmgroup.fruitproject2;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {

	private Basket basket;
	private Fruit fruit1;
	private Fruit fruit2;
	
	//Arrange
		@Before
		public void setUp(){
			basket = new Basket(); //basket object
			fruit1 = new Fruit("Apple", 1.99);
			fruit2 = new Fruit("Orange", 2.99);
		}
	
	// Test 1 If we ask a basket for its contents before adding any Fruit objects, we should get an empty List of Fruits.	
	@Test
	public void test_GetFruitsInBasket_ReturnsEmptyFruitList_IfNoFruitsHaveBeenAdded(){
		
		//Act
		ArrayList<Fruit> fruitList = basket.getFruitsInBasket(); // Call getFruitsInBasket() method of your Basket object and store the returned Fruit list
				
		//Assert
		assertEquals(0,fruitList.size()); // The size of the Fruit list should be equal to zero
	}

	// Test 2 If we add a fruit to the Basket, then number of fruits in the basket should be equal to one
	@Test
	public void test_GetFruitsInBasket_ReturnsArrayOfLengthOne_AfterAddFruitMethodIsCalledWithOneFruit(){
		//Act
		basket.addFruit(fruit1);
		ArrayList<Fruit> fruitList = basket.getFruitsInBasket(); 
		//Assert
		assertEquals(1,fruitList.size()); // Call the getFruitsInBasket() method of Basket and check the returned list is of size 1
	}
	
	// Test 3 If we add two fruits to the Basket, then the number of fruits in the basket should be equal to 2
	@Test
	public void test_GetFruitsInBasket_ReturnsArrayOfLengthTwo_AfterAddFruitMethodIsCalledTwice(){
		//Act
		basket.addFruit(fruit1);
		basket.addFruit(fruit2);
		ArrayList<Fruit> fruitList = basket.getFruitsInBasket();
		//Assert
		assertEquals(2,fruitList.size());
	}
	
	// Test 4 If we add two fruits to the Basket and remove one fruit, then the number of fruit in the basket should be equal to 1
		@Test
		public void test_GetFruitsInBasket_ReturnsArrayOfLengthOne_AfterAddFruitMethodIsCalledTwiceAndSecondFruitIsRemoved(){
			//Act
			basket.addFruit(fruit1);
			basket.addFruit(fruit2);
			basket.removeFruit(fruit2);
			ArrayList<Fruit> fruitList = basket.getFruitsInBasket();
			//Assert
			assertEquals(1,fruitList.size());
		}
		
}
