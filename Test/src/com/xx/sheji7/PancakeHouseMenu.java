package com.xx.sheji7;

import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList menuItems;
	public PancakeHouseMenu(){
		menuItems =  new ArrayList();
		addItem("K&B's Pancake Breakfast","pancake with scramled eggs and toast",true,2.99);
		addItem("Regular Pancake Breakfast","pancake with fried eggs and sausage",false,2.99);
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems(){
		return menuItems;
	}
}
