package com.xx.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static List<String> list1 = new ArrayList<String>();
	 public static void main(String[] args) {  
	 list1.add("1");
	 list1.add("2");
	 list1.add("3");
	 list1.add("4");
	 list1.add("5");
	 list1.add("6");
	 //for(String tmp:list1)
     //   System.out.print(tmp);  
for(int i=0;i<list1.size();i++){
	if(list1.get(i).equals("3")){
		List<String> list2 = new ArrayList<String>();
		list2.add(list1.get(i));
		System.out.println(list2);
	}
	if(list1.get(i).equals("5")){
		List<String> list2 = new ArrayList<String>();
		list2.add(list1.get(i));
		System.out.println(list2);
	}
}
	 System.out.println();
	 }
}
