package com.xx.test3;

import java.util.ArrayList;
import java.util.HashMap;

public class TestSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "AR07&(G703|G704)&(AM03|AM16)!DH01";
      String str = "ŷV&(��ůһ�壬�ֶ��յ�|��ůһ�壬�綯�յ�)&(������(����/���ױ���/��³��)|����)!���Ӿ�";
      str = str.replaceAll("&", "#");
      System.out.println("str"+str);
      str = str.replaceAll("\\(", "#");
      System.out.println("str"+str);
      str = str.replaceAll("\\)", "#");
      System.out.println("str"+str);
      str = str.replaceAll("\\|", "#");
      System.out.println("str"+str);
      str = str.replaceAll("!", "#");
      System.out.println("str"+str);
      String[] values = str.split("#");
      ArrayList list = new ArrayList();
      for(int i=0;i<values.length;i++){
    	  if(values[i]!=null&&values[i].length()>0){
    		  list.add(values[i]);
    	  }
      }
     System.out.println(list);
 	
 	HashMap map = new HashMap();
      map.put("a", 1);
      map.put("b", 2);
      int a = (Integer) map.get("c")!=null?(Integer) map.get("c"):0;
      int b = (Integer) map.get("b")!=null?(Integer) map.get("b"):0;
      System.out.println("a="+a+"b="+b);

	}
}
