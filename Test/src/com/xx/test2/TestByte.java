package com.xx.test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestByte {

	public static void main(String[] args){
		String a ="sadad";
		String b ="FFF SD @!$#%&*^*((><?:";
		String c ="sda安第斯山";
		String d ="电风扇发";
System.out.println(isContainChinese(a));
System.out.println(isContainChinese(b));
System.out.println(isContainChinese(c));
System.out.println(isContainChinese(d));

		
		
	}
	
	
	
	public static boolean isContainChinese(String str) {
		 Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
		 Matcher m = p.matcher(str);
		 if (m.find()) {
		  return true;
		 }
		 return false;
		}
}
