package com.xx.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo
{
   public static void main(String [] args)
   {
	   EmployeeSerializable e = null;
      try
      {
        /* FileInputStream fileIn = new FileInputStream("C:\\Users\\infodba\\Desktop\\eclipseemployee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);*/
    	  ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\infodba\\Desktop\\eclipseemployee.ser"))); 
         e = (EmployeeSerializable) in.readObject();
         in.close();
         //fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
    }
}