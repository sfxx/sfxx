package com.xx.sheji7;

import java.util.ArrayList;

public class DinnerMenu {
	static final int MAx_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	public DinnerMenu(){
		menuItems = new MenuItem[MAx_ITEMS];
		addItem("Vegetraian BLT","(Fakin')Bacon with lettuce & tomato on whole wheat",true,2.99);
		addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		if(numberOfItems>=MAx_ITEMS){
			System.out.println("Sorry, menu is full! can't add item to menu.");
		}else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems+1;
		}
	}
	
	public MenuItem[] getMenuItems(){
		return menuItems;
	}
	
	public Iterator createIterator(){
		return new DinnerMenuIterator(menuItems);
	}
}
