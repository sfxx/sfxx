package com.xx.test1;

import java.util.Arrays;

public class TestReplace {
public static void main(String[] args){
	String str="213adsad�Դ󻧵�cndjkscnkjsd 1233 ���ӻ�����";
	String[] value = str.split("[^\u4e00-\u9fa5]");
	System.out.println(Arrays.toString(value));
	str = str.replaceAll("[\u4e00-\u9fa5]", "XXXXX");
	System.out.println("str"+str);
}
}
