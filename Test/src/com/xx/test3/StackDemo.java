package com.xx.test3;

import java.util.Date;
import java.util.Stack;

public class StackDemo {

	   
    public static void main(String[] args) {
 Stack stack=new Stack();
 stack.push("0");
 stack.push(new Integer(1));
 stack.push(2.0);
 stack.push(new Date());
 
 System.out.println("stack.size()==>"+stack.size());
 System.out.println(stack);
 
 System.out.println("stack.pop()==>"+stack.pop());
 System.out.println("stack.size()==>"+stack.size());
 System.out.println("stack.peek()==>"+stack.peek());//peek()方法 查看栈顶对象而不移除它
    }

}