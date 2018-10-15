package com.fdmgroup.fruitproject2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {

	Basket basket;
	Checkout checkout;
	Double price;
	Fruit fruit1;
	Fruit fruit2;
	
	
	@Before
	public void setUp(){
		//Arrange
		basket = new Basket(); //basket object
		checkout = new Checkout(); //checkout object
		//Act
		fruit1 = new Fruit("Apple", 1.99);
		fruit2 = new Fruit("Orange", 2.99);
}
	
	// Test 1 If the calculatePrice method of the checkout is passed an empty Basket, it should return a price, as a double of 0.0
	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		price = checkout.calculatePrice(basket); // Call the calculatePrice(basket) method of checkout and capture the returned double
		assertEquals(0.0,price,0.00); 
	}
	
	// Test 2 If the calculatePrice method of checkout is called with a basket with one fruit in, it should return the price of that one fruit
	@Test
	public void test_CalculatePrice_ReturnsPriceOfFruitInBasket_WhenPassedBasketWithOneFruit() {
		//Act
		basket.addFruit(fruit1);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(1.99,price,0.00);
	}
	
	// Test 3 If the calculatePrice method of checkout is called with a basket with two apples, it should return the sum of the prices.
	@Test
	public void test_CalculatePrice_ReturnsPriceOfFruitsInBasket_WhenPassedBasketWithTwoFruits() {
		//Act
		basket.addFruit(fruit1);
		basket.addFruit(fruit2);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(4.98,price,0.00); 
	}
	
	// Test 4 If the calculate price method of checkout is called with a basket three apples, it should return the sum of the prices.
	@Test
	public void test_CalculatePrice_ReturnsPriceOfFruitInBasket_WhenPassedBasketWithThreeFruits() {
		//Act
		basket.addFruit(fruit1);
		basket.addFruit(fruit1);
		basket.addFruit(fruit1);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(5.97,price,0.00);
	}
	
	// Test 5 If the calculate price method of checkout is called with a basket 5 apple and 1 apple is removed, it should return the sum of the prices.
	@Test
	public void test_CalculatePrice_ReturnsPriceOfFruitInBasket_WhenPassedBasketWithSevenFruits() {
		//Act
		basket.addFruit(fruit1);
		basket.addFruit(fruit1);
		basket.addFruit(fruit1);
		basket.addFruit(fruit1);
		basket.addFruit(fruit1);
		basket.removeFruit(fruit1);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(7.96,price,0.00);
	}

}