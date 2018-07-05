package com.xx.test5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler{
   private Object proxied;  
    
 public DynamicProxyHandler( Object proxied ){
	  this.proxied = proxied;  
 }  
 @Override   
 public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable{  
  //��ת������Ŀ�����֮ǰ������ִ��һЩ���ܴ���
	 System.out.println("��������.");
  //ת������Ŀ�����ķ���
  return method.invoke( proxied, args); 
   
  //��ת������Ŀ�����֮�󣬿���ִ��һЩ���ܴ���
 }
}