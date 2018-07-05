package com.xx.test3;

import java.util.HashMap;
import java.util.Set;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("a", 1);
		Set set = map.keySet();
		if(set.contains("a")){
			int b = (Integer) map.get("a");
			System.out.println(b);
		}else{
			System.out.println("nothing");
		}
	}

}
