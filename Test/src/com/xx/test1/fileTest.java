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
		// ������Ŀ���ļ�����������
		CnZipInputStream in = new CnZipInputStream(new FileInputStream("C:\\Users\\infodba\\Desktop\\C3D_1SK1805000806_FJ_A.vmb"), null);
		 File parent = new File("C:\\Users\\infodba\\Desktop\\xx");
         if (!parent.exists() && !parent.mkdirs()){
             throw new Exception("������ѹĿ¼ \"" + parent.getAbsolutePath() + "\" ʧ��");
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
		          //���ｫ�г����е��ļ���
		          System.out.println("Dir==>" + f.getName()); 
		          getDirectory(f);
		      } else {
		         //���ｫ�г����е��ļ�
		          System.out.println("file==>" + f.getAbsolutePath());
		      }
		  }
		}
	// �ǵݹ����
	 private void GetDirectorySize(File file) {
	      LinkedList list = new LinkedList(); //����������ļ��е��б�
	      GetOneDir(file, list); //���ñ����ļ��и�Ŀ¼�ļ��ķ���
	  
	      File tmp;
	      while (!list.isEmpty()) {
	          tmp = (File) list.removeFirst();
	          //����ط����ж��е���࣬����Ϊ�˱��ջ��Ǹ����ж��ˣ���������б�����ֻ���ļ��е�
	          //���ǲ��ų�������������磺�������ļ��е�Ŀ����ѹ���ջ֮�������ļ�
	          if (tmp.isDirectory()) {
	              GetOneDir(tmp, list);
	          } else {
	              System.out.println("file==>" + tmp.getAbsolutePath());
	          }
	     }
	}
	 
	 
	// ����ָ���ļ��и�Ŀ¼�µ��ļ�
	 private void GetOneDir(File file , LinkedList list){
	      //ÿ���ļ��б���������ø÷���
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
	               //�����г���ǰ�ļ��и�Ŀ¼�µ������ļ�
	               System.out.println("file==>" + f.getAbsolutePath());
	          }
	     }
	 }
}
