package com.xx.test3;

import java.io.File;
import java.io.IOException;


public class TestFile {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\infodba\\Desktop\\xx.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		copyFile("C:\\Users\\infodba\\Desktop","C:\\Users\\infodba\\Desktop\\fepc");
	}
	
	private static void copyFile(String sour, String dest) {
		//获取进程
		Runtime run = Runtime.getRuntime();
		Process p = null;
		//得到目标文件名
		String  filename = "xx.txt";
		String inputname = sour+"\\"+filename;
		String command = "cmd /c copy  "+inputname+"  "+dest;
		System.out.println(command);
		//执行doc命令
		try {
			p = run.exec(command);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
