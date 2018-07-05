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
  //在转调具体目标对象之前，可以执行一些功能处理
	 System.out.println("代理工作了.");
  //转调具体目标对象的方法
  return method.invoke( proxied, args); 
   
  //在转调具体目标对象之后，可以执行一些功能处理
 }
}