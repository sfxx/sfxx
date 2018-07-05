package com.xx.test2;


public class EmployeeSerializable implements java.io.Serializable{
   public String name;
   public String address;
   public transient int SSN;
   public int number;

   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}