package com.xx.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestFanShe {
/*//��ȡ���췽��	
 public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
	 EmployeeSerializable employee = new EmployeeSerializable(); 
	 Class class1 = employee.getClass();
	 System.out.println(class1.getName());
	 Class class2 = EmployeeSerializable.class;
	 System.out.println(class2==class1);
	 Class clazz = Class.forName("com.xx.test2.EmployeeSerializable");
	 System.out.println(clazz.getName());
	  System.out.println("**********************���й��й��췽��*********************************");  
      Constructor[] conArray = clazz.getConstructors();  
      for(Constructor c : conArray){  
          System.out.println(c);  
      }  
        
        
      System.out.println("************���еĹ��췽��(������˽�С��ܱ�����Ĭ�ϡ�����)***************");  
      conArray = clazz.getDeclaredConstructors();  
      for(Constructor c : conArray){  
          System.out.println(c);  
      }  
        
      System.out.println("*****************��ȡ���С��޲εĹ��췽��*******************************");  
      Constructor con = clazz.getConstructor(null);  
      //1>����Ϊ���޲εĹ��췽������������һ��null,��дҲ���ԣ�������Ҫ����һ�����������ͣ��м�������  
      //2>�����ص�����������޲ι��캯���������  
    
      System.out.println("con = " + con);  
      //���ù��췽��  
      Object obj = con.newInstance();  
  //  System.out.println("obj = " + obj);  
  //  Student stu = (Student)obj;  

  }  
 
 */
	
	 public static void main(String[] args) throws Exception {  
         //1.��ȡClass����  
         Class stuClass = Class.forName("com.xx.test2.EmployeeSerializable");  
         //2.��ȡ�ֶ�  
         System.out.println("************��ȡ���й��е��ֶ�********************");  
         Field[] fieldArray = stuClass.getFields();  
         for(Field f : fieldArray){  
             System.out.println(f);  
         }  
         System.out.println("************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)********************");  
         fieldArray = stuClass.getDeclaredFields();  
         for(Field f : fieldArray){  
             System.out.println(f);  
         }  
         System.out.println("*************��ȡ�����ֶ�**������***********************************");  
         Field f = stuClass.getField("name");  
         System.out.println(f);  
         //��ȡһ������  
         Object obj = stuClass.getConstructor().newInstance();//����Student����--��Student stu = new Student();  
         //Ϊ�ֶ�����ֵ  
         f.set(obj, "���»�");//ΪStudent�����е�name���Ը�ֵ--��stu.name = "���»�"  
         //��֤  
         EmployeeSerializable stu = (EmployeeSerializable)obj;  
         System.out.println("��֤������" + stu.name);   
           
     } 
}
