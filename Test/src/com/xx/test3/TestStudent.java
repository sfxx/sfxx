package com.xx.test3;

import java.util.HashMap;

public class TestStudent {

	public static void main(String[] args){
		Student student = new Student("Jack", 12);
		System.out.println(student.hashCode());
		
		HashMap<Student, Integer> hashMap = new HashMap<Student, Integer>();
        hashMap.put(student, 1);
         
        System.out.println(hashMap.get(new Student("Jack", 12)));
        
        int a = 33554432;//10000000000000000000000000 
        int b = 33570816;//10000000000100000000000000
        System.out.println(Integer.toBinaryString(a));//10000000000000000000000000
        System.out.println(Integer.toBinaryString(b));//10000000000100000000000000
        System.out.println(a >>> 16);//512 
        System.out.println(b >>> 16);//512 
        int c = Integer.valueOf("1000010001110001000001111000000",2);//2-10  1111000000
        int d = Integer.valueOf("0111011100111000101000010100000",2);//2-10  1000100000
        System.out.println(Integer.valueOf("1111",2)&c);//0 
        System.out.println(Integer.valueOf("1111",2)&d);//0 
        System.out.println(c >>> 16);//16952 
        System.out.println(d >>> 16);//15260
        System.out.println(Integer.valueOf("1111",2)&c>>>16);//8 
        System.out.println(Integer.valueOf("1111",2)&d>>>16);//12 
        System.out.println(Integer.valueOf("1111",2)&Integer.valueOf("101010100101001001000",2));//8 
	}
}
