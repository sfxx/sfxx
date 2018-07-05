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
	    long startTime = System.currentTimeMillis(); //获取开始读取文件时的时间
	    String file = "D:\\test.txt";
		File file1 = new File(file); //获取文件
	    FileInputStream out = new FileInputStream(file1);//建立数据通道
		InputStreamReader isr = new InputStreamReader(out);  
	    int content = 0 ; //存放读取到的数据
	    while((content = isr.read())!= -1){
	        System.out.print((char) content);
	    }
	    out.close(); //关闭资源
	    long endTime = System.currentTimeMillis();
	    System.out.println("读取文件的时间为："+(endTime-startTime));
	}

/*	public static void main(String[] args) throws IOException{
	    long startTime = System.currentTimeMillis();  //读取开始时的时间
	    String file = "D:\\test.txt";
		File file1 = new File(file); //获取文件
	    FileInputStream fileInputStream = new FileInputStream(file1); //建立数据通道
	    int length = 0 ;
	    byte[] buf = new byte[1024];  //建立缓存数组，缓存数组的大小一般都是1024的整数倍，理论上越大效率越好
	    while((length = fileInputStream.read(buf))!=-1){
	        System.out.print(new String(buf,0 ,length));
	    }
	    fileInputStream.close(); //关闭资源
	    long endTime = System.currentTimeMillis();
	    System.out.println("读取的时间是："+(endTime - startTime));

	}*/
	
}
