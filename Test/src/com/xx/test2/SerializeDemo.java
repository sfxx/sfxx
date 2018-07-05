package com.xx.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo
{
   public static void main(String [] args)
   {
      EmployeeSerializable e = new EmployeeSerializable();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      try
      {
         /*FileOutputStream fileOut =
         new FileOutputStream("C:\\Users\\infodba\\Desktop\\eclipseemployee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);*/
         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\infodba\\Desktop\\eclipseemployee.ser"))); 
         out.writeObject(e);
         out.close();
         //fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
