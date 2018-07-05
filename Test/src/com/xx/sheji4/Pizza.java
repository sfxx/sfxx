package com.xx.sheji4;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	abstract void prepare();
	void bake(){
		System.out.println("Pizza is baking");
	}
	void cut(){
		System.out.println("Pizza is cutting");
	}
	void box(){
		System.out.println("Pizza is boxing");
	}
	void setName(String name){
		this.name =  name;
	}
	String getName(){
		return name;
	}
	public String toString(){
		return null;
	}

}
