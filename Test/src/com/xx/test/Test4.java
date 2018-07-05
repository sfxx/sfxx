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
         System.out.println("最终名字="+this.name);
         System.out.println("最终的年龄="+this.age);
    }
    public static void main(String[] args) {
    	Test4 tt=new Test4("",0); //随便传进去的参数
       tt.print();
    }
}