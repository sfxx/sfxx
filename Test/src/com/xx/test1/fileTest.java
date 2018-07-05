package com.xx.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.zip.ZipFile;
import com.agile.zip.CnZipInputStream;
import com.agile.zip.CnZipOutputStream;
import com.agile.zip.ZipEntry;

public class fileTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//File file = new File("C:\\Users\\infodba\\Desktop\\xx");
		ZipFile zip = new ZipFile("C:\\Users\\infodba\\Desktop\\C3D_1SK1805000806_FJ_A.vmb");
		zip.close();
		// 建立与目标文件的输入连接
		CnZipInputStream in = new CnZipInputStream(new FileInputStream("C:\\Users\\infodba\\Desktop\\C3D_1SK1805000806_FJ_A.vmb"), null);
		 File parent = new File("C:\\Users\\infodba\\Desktop\\xx");
         if (!parent.exists() && !parent.mkdirs()){
             throw new Exception("创建解压目录 \"" + parent.getAbsolutePath() + "\" 失败");
         }
		while(in.getNextEntry() != null){
			 String name = in.getNextEntry().getName();
             File child = new File(parent, name);
             FileOutputStream output = new  FileOutputStream(child);
             byte[] buffer = new byte[10240];
             int bytesRead = 0;
             while ((bytesRead = in.read(buffer)) > 0){
                 output.write(buffer, 0, bytesRead);
             }
             output.flush();
             output.close();
			ZipEntry file = in.getNextEntry();
			System.out.println("file"+file);
		}
	
	
		/*if(!file.exists()){
			file.mkdir();
		}*/
	}

	private static void getDirectory(File file){
		  File flist[] = file.listFiles();
		  if (flist == null || flist.length == 0) {
		      return;
		  }
		  for (File f : flist) {
		      if (f.isDirectory()) {
		          //这里将列出所有的文件夹
		          System.out.println("Dir==>" + f.getName()); 
		          getDirectory(f);
		      } else {
		         //这里将列出所有的文件
		          System.out.println("file==>" + f.getAbsolutePath());
		      }
		  }
		}
	// 非递归遍历
	 private void GetDirectorySize(File file) {
	      LinkedList list = new LinkedList(); //保存待遍历文件夹的列表
	      GetOneDir(file, list); //调用遍历文件夹根目录文件的方法
	  
	      File tmp;
	      while (!list.isEmpty()) {
	          tmp = (File) list.removeFirst();
	          //这个地方的判断有点多余，但是为了保险还是给个判断了，正常情况列表中是只有文件夹的
	          //但是不排除特殊情况，例如：本身是文件夹的目标在压入堆栈之后变成了文件
	          if (tmp.isDirectory()) {
	              GetOneDir(tmp, list);
	          } else {
	              System.out.println("file==>" + tmp.getAbsolutePath());
	          }
	     }
	}
	 
	 
	// 遍历指定文件夹根目录下的文件
	 private void GetOneDir(File file , LinkedList list){
	      //每个文件夹遍历都会调用该方法
	      System.out.println("Dir==>" + file.getAbsolutePath());   
	      File[] files = file.listFiles();
	      int sumdir = 1;
	      if (files == null || files.length == 0) {
	           return ;
	      }

	      for (File f : files) {
	          if (f.isDirectory()) {
	              list.add(f);
	          } else {
	               //这里列出当前文件夹根目录下的所有文件
	               System.out.println("file==>" + f.getAbsolutePath());
	          }
	     }
	 }
}
