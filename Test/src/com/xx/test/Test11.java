package com.xx.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11 {
/*
	public static void main(String[] args) throws FileNotFoundException{
		String file = "D:\\test.txt";
		File file1 = new File(file);
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		//String data = null;
		//try {
		//	while((data = br.readLine())!=null)
		//	{
		//	System.out.println(data); 
		//	}
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		FileInputStream out = new FileInputStream(file);
		System.out.println(out);
		InputStreamReader isr = new InputStreamReader(out);  
        int ch = 0;  
        try {
			while ((ch = isr.read()) != -1) {  
			    System.out.print((char) ch);  
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    }*/

	
	public static void main(String[] args) throws IOException{
	    long startTime = System.currentTimeMillis(); //��ȡ��ʼ��ȡ�ļ�ʱ��ʱ��
	    String file = "D:\\test.txt";
		File file1 = new File(file); //��ȡ�ļ�
	    FileInputStream out = new FileInputStream(file1);//��������ͨ��
		InputStreamReader isr = new InputStreamReader(out);  
	    int content = 0 ; //��Ŷ�ȡ��������
	    while((content = isr.read())!= -1){
	        System.out.print((char) content);
	    }
	    out.close(); //�ر���Դ
	    long endTime = System.currentTimeMillis();
	    System.out.println("��ȡ�ļ���ʱ��Ϊ��"+(endTime-startTime));
	}

/*	public static void main(String[] args) throws IOException{
	    long startTime = System.currentTimeMillis();  //��ȡ��ʼʱ��ʱ��
	    String file = "D:\\test.txt";
		File file1 = new File(file); //��ȡ�ļ�
	    FileInputStream fileInputStream = new FileInputStream(file1); //��������ͨ��
	    int length = 0 ;
	    byte[] buf = new byte[1024];  //�����������飬��������Ĵ�Сһ�㶼��1024����������������Խ��Ч��Խ��
	    while((length = fileInputStream.read(buf))!=-1){
	        System.out.print(new String(buf,0 ,length));
	    }
	    fileInputStream.close(); //�ر���Դ
	    long endTime = System.currentTimeMillis();
	    System.out.println("��ȡ��ʱ���ǣ�"+(endTime - startTime));

	}*/
	
}
