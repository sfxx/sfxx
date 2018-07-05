package com.xx.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestFanShe {
/*//获取构造方法	
 public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
	 EmployeeSerializable employee = new EmployeeSerializable(); 
	 Class class1 = employee.getClass();
	 System.out.println(class1.getName());
	 Class class2 = EmployeeSerializable.class;
	 System.out.println(class2==class1);
	 Class clazz = Class.forName("com.xx.test2.EmployeeSerializable");
	 System.out.println(clazz.getName());
	  System.out.println("**********************所有公有构造方法*********************************");  
      Constructor[] conArray = clazz.getConstructors();  
      for(Constructor c : conArray){  
          System.out.println(c);  
      }  
        
        
      System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");  
      conArray = clazz.getDeclaredConstructors();  
      for(Constructor c : conArray){  
          System.out.println(c);  
      }  
        
      System.out.println("*****************获取公有、无参的构造方法*******************************");  
      Constructor con = clazz.getConstructor(null);  
      //1>、因为是无参的构造方法所以类型是一个null,不写也可以：这里需要的是一个参数的类型，切记是类型  
      //2>、返回的是描述这个无参构造函数的类对象。  
    
      System.out.println("con = " + con);  
      //调用构造方法  
      Object obj = con.newInstance();  
  //  System.out.println("obj = " + obj);  
  //  Student stu = (Student)obj;  

  }  
 
 */
	
	 public static void main(String[] args) throws Exception {  
         //1.获取Class对象  
         Class stuClass = Class.forName("com.xx.test2.EmployeeSerializable");  
         //2.获取字段  
         System.out.println("************获取所有公有的字段********************");  
         Field[] fieldArray = stuClass.getFields();  
         for(Field f : fieldArray){  
             System.out.println(f);  
         }  
         System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");  
         fieldArray = stuClass.getDeclaredFields();  
         for(Field f : fieldArray){  
             System.out.println(f);  
         }  
         System.out.println("*************获取公有字段**并调用***********************************");  
         Field f = stuClass.getField("name");  
         System.out.println(f);  
         //获取一个对象  
         Object obj = stuClass.getConstructor().newInstance();//产生Student对象--》Student stu = new Student();  
         //为字段设置值  
         f.set(obj, "刘德华");//为Student对象中的name属性赋值--》stu.name = "刘德华"  
         //验证  
         EmployeeSerializable stu = (EmployeeSerializable)obj;  
         System.out.println("验证姓名：" + stu.name);   
           
     } 
}
