package com.xx.sheji4;

public class NYPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item){
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		if(item.equals("cheese")){
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Cheese Pizza");
		}
		return pizza;
	}
}
