package com.xx.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test6
{
  public static void main(String[] args) throws Exception {
         String sytj = "A305&(!AM02)";
         //str = str.replaceAll("or", "||");
         //str = str.replaceAll("and", "&&");
         //sytj = sytj.replaceAll("&", "&&");
		// sytj = sytj.replaceAll("\\|", "\\||");
         
		/* sytj = sytj.replace("&!", "!");
         sytj = sytj.replace("!", "@!");
		 String[] values1= sytj.split("@");
		 String strnew1 ="";
		 for(int j=0;j<values1.length;j++){
			 if(values1[j].contains("!")){
				 if(values1[j].substring(1, 2).equals("(")){
					 int a111=values1[j].indexOf(")");
					 values1[j]=values1[j].substring(a111+1);
	               }else{
	            	   values1[j]=values1[j].substring(5);
	               }
			 }
			
			 strnew1 = strnew1+values1[j];
		 }
		sytj = strnew1;*/
		sytj = sytj.replaceAll("&", "&&");
		 sytj = sytj.replaceAll("\\|", "\\||");
		 List list1= new ArrayList();
		 int a11 = sytj.indexOf("!");
		 while (a11 != -1) {
	            list1.add(a11);
	             a11 = sytj.indexOf("!", a11 + 1);
	        }
         for(int j=0;j<list1.size();j++){
        	 int a1=(Integer) list1.get(j);
        	 if(a1>1){
        	 String aa =sytj.substring(a1-1,a1);
             boolean a111 = isNumeric(aa);
             if(a111||aa.equals(")")){
            	 Test6 t6 = new Test6();
            	 sytj = t6.insertStringInParticularPosition(sytj,"&&",a1); 
             } 
             }
           }
		 /*str1 = str1.replaceAll("=>", ")&&!(");
		 Test6 t6 = new Test6();
		 str1 = t6.insertStringInParticularPosition(str1,"(",0);
		 int length=str1.length();
		 str1 = t6.insertStringInParticularPosition(str1,")",length);
		 String str= sytj.replaceAll("[^0-9a-zA-Z]","");
		 String[] arr = new String[str.length() / 4];
		 int index = 0;
		 for(int i1=0; i1<arr.length;i1++){
			    if(index+4 > str.length()){
			    	arr[i1] = str.substring(index);
			    }else{
			    	arr[i1] = str.substring(index,(index = index+4));
			    }
			}
		   ScriptEngineManager manager = new ScriptEngineManager();
		    ScriptEngine engine = manager.getEngineByName("js");
			if (arr != null && arr.length > 0){
			for(int j=0;j<arr.length;j++){
			if(arr[j]!= null && arr.length > 0){
			boolean a = false;
			 engine.put(arr[j],a);
			}
			}
			}
		    try {
		         System.out.println(str1);
		    	Object result = engine.eval(str1);
		         System.out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);
		    	if((Boolean) result){return;}
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
	 }*/
		/* List list= new ArrayList();
		 int a = sytj.indexOf("!");
		 while (a != -1) {
	            list.add(a);
	             a = sytj.indexOf("!", a + 1);
	        }
         System.out.println(list);
         System.out.println(sytj);
         for(int i=0;i<list.size();i++){
        	 int a1=(Integer) list.get(i);
        	 String aa =sytj.substring(a1-1,a1);
             System.out.println(aa);
             boolean a11 = isNumeric(aa);
             System.out.println(a11);
             if(a11){
            	 Test6 t6 = new Test6();
            	 sytj = t6.insertStringInParticularPosition(sytj,"&&",a1); 
            	 
             }
              

         }*/
        
		// System.out.println("weizhi:"+sytj.substring(sytj.indexOf("&&("), sytj.indexOf("&&(")+4).substring(3,4));
		//	if(sytj.substring(sytj.indexOf("&&("), sytj.indexOf("&&(")+4).substring(3,4).equals("!")){
		//		sytj = sytj.replaceAll("!", "!");
		//	}else{
		//		sytj = sytj.replaceAll("!", "&&!");
		//	}
	    //System.out.println(sytj.substring(0,2));
	    //if(sytj.substring(0,2).equals("&&")){
	    //	 sytj=sytj.substring(2);B
	    // }
         System.out.println(sytj);
         ScriptEngineManager manager = new ScriptEngineManager();
         ScriptEngine engine = manager.getEngineByName("js");
         engine.put("A305",true);
         engine.put("AM02",true);
         engine.put("AS07",false);
         engine.put("AS06",true);
         
         //engine.put("BK49",false);
       /*  engine.put("a",true);
         engine.put("b",true);
         engine.put("c",true);  
         engine.put("d",true);  
         engine.put("e",true); 
         engine.put("f",true);
         engine.put("g",false); 
         engine.put("h",true);*/
         Object result = engine.eval(sytj);
         if((Boolean) result){
        	 System.out.println("xx");
         }
         System.out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);
 
     }
  
  public static boolean isNumeric(String str){
	  Pattern pattern = Pattern.compile("[0-9a-zA-Z]");
	  Matcher isNum = pattern.matcher(str);
	  if( !isNum.matches() ){
	  return false;
	  }
	  return true; 
	  }
  
  public  String insertStringInParticularPosition(String src, String dec, int position){
	    StringBuffer stringBuffer = new StringBuffer(src);
	    return stringBuffer.insert(position, dec).toString();
	}
}