package com.xx.test;

public class Test4 {  
    String name="DELL";
    int age;
    public Test4 (){ 
        this.age=21;
        this.name="ALLE";
   }     
    public Test4(String name,int age){
        this();
        this.name="Mick";
    }     
  private void print(){
         System.out.println("��������="+this.name);
         System.out.println("���յ�����="+this.age);
    }
    public static void main(String[] args) {
    	Test4 tt=new Test4("",0); //��㴫��ȥ�Ĳ���
       tt.print();
    }
}