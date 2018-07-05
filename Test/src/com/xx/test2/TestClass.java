package com.xx.test2;

import java.math.BigDecimal;

public class TestClass {
 public static void main(String[] args){
	 int i1 = 3;  
     double d1 = 4.9;  
     System.out.println(i1);  
     System.out.println(d1);  
     System.out.println(i1*d1);  
     Integer c = new Integer(3);
     BigDecimal b1 = new BigDecimal(c);;  
     BigDecimal b2 = new BigDecimal(Double.toString(4.9));  
     System.out.println(b1);  
     System.out.println(b2);  
     System.out.println(b1.multiply(b2));  
 }
}
