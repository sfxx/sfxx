package com.xx.test6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMain {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		Student stu = new Student();
		stu.setAge("20");
		stu.setName("ÕÅÈý");
		stu.setCode("123456");
		stu.setSex("ÄÐ");
		System.out.println(stu.getSex());
		ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream("D:\\stu.txt"));
		os.writeObject(stu);
		os.flush();
		os.close();
		stu.setSex("Å®");
		ObjectInputStream is = new ObjectInputStream( new FileInputStream("D:\\stu.txt"));
		stu = (Student) is.readObject();
		System.out.println(stu.getAge()+stu.getCode()+stu.getName()+stu.getSex());
	}
}
