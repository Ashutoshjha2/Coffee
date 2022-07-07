package com.machine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeTypes implements ICoffee{
	private int coffeeId;
	private String coffeeName;
	private double coffeePrice;
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public double getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(double coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	public CoffeeTypes(int coffeeId, String coffeeName, double coffeePrice) {
		super();
		this.coffeeId = coffeeId;
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}
	public CoffeeTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CoffeeTypes [coffeeId=" + coffeeId + ", coffeeName=" + coffeeName + ", coffeePrice=" + coffeePrice
				+ "]";
	}
	@Override
	public List<CoffeeTypes> showCoffee() {
       
		List<CoffeeTypes> coffee = new ArrayList<CoffeeTypes>();
		coffee.add(new CoffeeTypes(101, "Black Coffee", 50.0));
		coffee.add(new CoffeeTypes(102, "Red Coffee"  , 100.0));
		coffee.add(new CoffeeTypes(103, "Green Coffee", 300.0));
		coffee.add(new CoffeeTypes(104, "Brown Coffee", 200.0));

		return coffee;
	}
	

	
	 
	 
}
