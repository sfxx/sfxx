package com.xx.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Test {
	
public static void main(String[] args) throws IOException{
	File file = new File("C:\\Users\\infodba\\Desktop\\Զ�̷�����.txt");
/*	FileInputStream in =new FileInputStream(file);
	int tempbyte;  
    while ((tempbyte = in.read())!=-1) {  
        System.out.println(tempbyte);  
    }  */
	InputStreamReader inputStreamReader= new InputStreamReader(new FileInputStream(file));
	 int tempchar;  
     while ((tempchar = inputStreamReader.read()) != -1) {  
         // ����windows�£�\r\n�������ַ���һ��ʱ����ʾһ�����С�  
         // ������������ַ��ֿ���ʾʱ���ỻ�����С�  
         // ��ˣ����ε�\r����������\n�����򣬽������ܶ���С�  
         if (((char) tempchar) != '\r') {  
             System.out.print((char) tempchar);  
         }  
     }  
     inputStreamReader.close();  
}
}
