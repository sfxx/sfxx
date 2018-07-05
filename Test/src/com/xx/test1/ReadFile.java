package com.xx.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
  public static void main(String[] args){
	  String[] fileNames = getFileNames("\\172.24.221.27\\$d\\VINÊýÍ³¼Æ");
	 /* String encode = "utf-8";
	  for(String fileName : fileNames){
	   try {
	    readFile(fileName, encode);
	   } catch (IOException e) {
	   }
	  }*/
	  System.out.println("fileNames"+fileNames);
	 }
  
  
  public static String[] getFileNames(String path){
	  File dirFile = new File(path);
	  if(dirFile.isDirectory()){
	   File[] files = dirFile.listFiles();
	   String[] fileNames = new String[files.length];
	   for(int i=0;i<files.length;i++){
	    fileNames[i] = files[i].getAbsolutePath();
	   }
	   return fileNames;
	  }else{
	   return null;
	  }
	 }
  public static void readFile(String sourceFilePath, String encode) throws IOException{
	  File file = new File(sourceFilePath);
	  BufferedReader br = new   BufferedReader(new InputStreamReader(new FileInputStream(file), encode));
	  StringBuilder strBuilder = new StringBuilder();
	  String sLine = null;   
	  while((sLine = br.readLine()) != null){
	   strBuilder.append(sLine);
	   strBuilder.append("\r\n");
	  }
	  br.close();
	 }
}
