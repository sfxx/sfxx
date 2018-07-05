package com.xx.sheji7;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
	ArrayList menuItem;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList menuItem){
		this.menuItem = menuItem;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position>=menuItem.size()||menuItem.get(position)== null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}
