package com.xx.sheji4;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce creatSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
