package com.xx.test1;

import java.util.Arrays;

public class TestReplace {
public static void main(String[] args){
	String str="213adsad吃大户地cndjkscnkjsd 1233 电视机开办";
	String[] value = str.split("[^\u4e00-\u9fa5]");
	System.out.println(Arrays.toString(value));
	str = str.replaceAll("[\u4e00-\u9fa5]", "XXXXX");
	System.out.println("str"+str);
}
}
