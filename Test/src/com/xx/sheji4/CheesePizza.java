package com.xx.sheji4;

public class CheesePizza extends Pizza{
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
		this.pizzaIngredientFactory= pizzaIngredientFactory;
	}
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.creatSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}

}
