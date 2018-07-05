package com.xx.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream {
	 public static void main(String[] args){
	        /**
	         * 1.先将文件中的内容读入到输入流中
	         * 2.将输入流中的数据通过输出流写入到目标文件中
	         * 3.关闭输入流和输出流
	         */
	        try {
	            long begin=System.currentTimeMillis();
	            //从输入流中读取数据
	            FileInputStream fis=new FileInputStream("C:\\Users\\infodba\\Desktop\\FOSDemo.txt");
	            //向输出流中写入数据
	            FileOutputStream fos=new FileOutputStream("C:\\Users\\infodba\\Desktop\\FOSDemo\\FISAndFOSDest.txt");
	            //先定义一个字节缓冲区，减少I/O次数，提高读写效率
	            byte[] buffer=new byte[10240];
	            int size=0;
	            while((size=fis.read(buffer))!=-1){
	                fos.write(buffer, 0, size);
	            }
	            fis.close();
	            fos.close();
	            long end=System.currentTimeMillis();
	            System.out.println("使用文件输入流和文件输出流实现文件的复制完毕！耗时："+(end-begin)+"毫秒");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        //解决JNI问题(Java Native Interface)
	        System.exit(0);
	    }
}
