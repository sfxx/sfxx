package com.xx.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class testUrl {
 public static void main(String[] args) throws IOException{
	 URL url =new URL("http://www.baidu.com"); 
	 InputStream is = url.openStream();//ͨ��openStream������ȡ��Դ���ֽ������� 
	 InputStreamReader isr =new InputStreamReader(is,"UTF-8");//���ֽ�������ת��Ϊ�ַ�������,�����ָ�����룬���Ŀ��ܻ�������� 
	 BufferedReader br =new BufferedReader(isr);//Ϊ�ַ���������ӻ��壬��߶�ȡЧ�� 
	 String data = br.readLine();//��ȡ���� 
	 while(data!=null){ 
	 System.out.println(data);//������� 
	 data = br.readLine(); 
	 } 
	 br.close(); 
	 isr.close(); 
	 is.close(); 
 }
}

