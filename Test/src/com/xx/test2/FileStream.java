package com.xx.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream {
	 public static void main(String[] args){
	        /**
	         * 1.�Ƚ��ļ��е����ݶ��뵽��������
	         * 2.���������е�����ͨ�������д�뵽Ŀ���ļ���
	         * 3.�ر��������������
	         */
	        try {
	            long begin=System.currentTimeMillis();
	            //���������ж�ȡ����
	            FileInputStream fis=new FileInputStream("C:\\Users\\infodba\\Desktop\\FOSDemo.txt");
	            //���������д������
	            FileOutputStream fos=new FileOutputStream("C:\\Users\\infodba\\Desktop\\FOSDemo\\FISAndFOSDest.txt");
	            //�ȶ���һ���ֽڻ�����������I/O��������߶�дЧ��
	            byte[] buffer=new byte[10240];
	            int size=0;
	            while((size=fis.read(buffer))!=-1){
	                fos.write(buffer, 0, size);
	            }
	            fis.close();
	            fos.close();
	            long end=System.currentTimeMillis();
	            System.out.println("ʹ���ļ����������ļ������ʵ���ļ��ĸ�����ϣ���ʱ��"+(end-begin)+"����");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        //���JNI����(Java Native Interface)
	        System.exit(0);
	    }
}
