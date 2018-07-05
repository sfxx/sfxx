package com.xx.test;

import java.util.Arrays;

public class Test12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String a ="[AB01,!AD02,HA03]";
          String[] values = a.split(",");
          System.out.println(Arrays.asList(values));
          for(int i=0;i<values.length;i++){
              System.out.println("old"+values[i]);
        	  values[i] = values[i].replace("[", "");
        	  values[i] = values[i].replace("]", "");
              System.out.println("new"+values[i]);
              if(values[i].contains("!")){
                  System.out.println("111111111"+values[i].substring(1,5));
              }
          }
          
	}

}
