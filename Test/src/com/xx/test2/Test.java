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
	File file = new File("C:\\Users\\infodba\\Desktop\\远程服务器.txt");
/*	FileInputStream in =new FileInputStream(file);
	int tempbyte;  
    while ((tempbyte = in.read())!=-1) {  
        System.out.println(tempbyte);  
    }  */
	InputStreamReader inputStreamReader= new InputStreamReader(new FileInputStream(file));
	 int tempchar;  
     while ((tempchar = inputStreamReader.read()) != -1) {  
         // 对于windows下，\r\n这两个字符在一起时，表示一个换行。  
         // 但如果这两个字符分开显示时，会换两次行。  
         // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。  
         if (((char) tempchar) != '\r') {  
             System.out.print((char) tempchar);  
         }  
     }  
     inputStreamReader.close();  
}
}
