package com.xx.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;



public class Test5 {
	public static List<String> list1 = new ArrayList<String>();
	 public static void main(String[] args) {  
	 list1.add("1");
	 list1.add("2");
	 list1.add("3");
	 list1.add("4");
	 list1.add("5");
	 list1.add("6");
	 for(String tmp:list1)
         System.out.print(tmp);  

	 System.out.println();
	 String[] tzs = new String[list1.size()];
	 for(int i=0;i<tzs.length;i++){
			tzs[i] = (String)list1.get(i);
			System.out.println(tzs[i]);
		}
	 String sytj="111@222@333@444";
	 String[] values = sytj.split("@");
	 String sytj1="111&222&333&444";
	 String[] values1 = sytj.split("&");
     boolean q = Arrays.asList(values).contains("111");
	 System.out.println(q);
	 System.out.println(Arrays.toString(values));
	 System.out.println(Arrays.toString(values1));
	 
	 String str = "dianjia2,wang,dianjia";
	 String str1 = "dianjia2,dianjia";
	   HashSet<String> h1 = new HashSet<String>();
	   HashSet<String> h2 = new HashSet<String>();
	   for(int i1=0;i1<str.split(",").length;i1++){
	    h1.add(str.split(",")[i1]);
	   }
	   for(int i2=0;i2<str1.split(",").length;i2++){
	    h2.add(str1.split(",")[i2]);
	   }
	   h1.removeAll(h2);
	   System.out.println(h1);
	   
	     boolean a = true;
		 boolean b = false;
		 boolean c = true;
		 boolean d = false;
		 boolean e = true;
		 boolean f = false;
		 boolean g = true;
		 boolean h = false;
		 boolean test= (a==true&&(c&&d&&g==false));
		 System.out.println(test);
	   
		 String str11="A002&A201&A305&A402&(AX10|AX12|AX14|AX15|AX16)";
		 String str13="A002&A201&(A305&(A402&(AX10|AX12|AX14|AX15|AX16)))";
		 String str12="A002";
		 String sytj11="(A002&A201&A305&A402)&(AX10|AX12|AX14|AX15|AX16)";
		str13 = str13.replaceAll("\\)", "");
		 System.out.println(str13);
		/*  str11 = str11.replaceAll("\\)", "");
		 str11 = str11.replaceAll("&", "@");	
		 str11 = str11.replaceAll("!", "@");
		 str11 = str11.replaceAll("\\|", "@");*/
		 Boolean b11 = sytj11.substring(sytj11.indexOf("("), sytj11.indexOf(")"))
			.contains("|");
		 Boolean b12 = str12.contains("");
		 System.out.println(b11);
		 System.out.println(b12);
		String[] values2 = str12.split("@");
		 System.out.println(Arrays.toString(values2));
		 Boolean a2 = str11.contains("(");
		 System.out.println("a2:"+a2);
		// str11 = str11.replaceAll("\\(", "");
		 //str11 = str11.replaceAll("\\)", "");
		 str11 = str11.replaceAll("&", "|");
		 System.out.println("str11:"+str11);
		 boolean a1 = str11.contains("|");
		 System.out.println("a1:"+a1);
		 String jieguo = str11.substring(0,str11.indexOf("|"));
		 System.out.println("jieguo:"+jieguo);
		 int index=str11.indexOf("|");
		 System.out.println("index:"+index);
		 String jieguo1 = str11.substring(str11.indexOf("|")+1,str11.indexOf("|",index+1));
		 System.out.println("jieguo1:"+jieguo1);
			String[] values3 = str11.split("\\|");
         System.out.println(Arrays.toString(values3));
         String s1 = "A002&A201&A305&A402&AP00&(AX10|AX12|AX14|AX15|AX16)";
         s1 = s1.replaceAll("&", "&&");
         s1 = s1.replaceAll("\\|", "\\||");
		 String s2=s1;
	     s2 = s2.replaceAll("&&", "@");
		 s2 = s2.replaceAll("\\||", "@");
         s2 = s2.replaceAll("&", "@");
         s2 = s2.replaceAll("\\|", "@");
         s2 = s2.replaceAll("!", "@");
         s2 = s2.replaceAll("\\(", "");
         s2 = s2.replaceAll("\\)", "");
		   String[] values4 = s2.split("\\@");
			for(int j=0;j<values4.length;j++){
		System.out.println(values4[j]);
		 
			}
			String s3="!a";
			 s3 =s3.replaceAll("!", "&&(!");
			 System.out.println(s3);
	   String str131="";
	   String str14="adsa";
	   int a1212 = str14.indexOf(str131);
	   System.out.println(a1212);
	   
	  String str1314="a&b&(!(c&d&g))";
	  //int index1 =str1314.indexOf("!"); 
	  //System.out.println("index1:"+index1);
	  //String str1313 = str1314.substring(str1314.indexOf("!"),str1314.indexOf(")")+1);
	 // str1314 =str1314.replaceAll(str1313, " ");
    // System.out.println("str1313:"+str1313);
	  //System.out.println("str1314:"+str1314);	
		 str1314 = str1314.replace("&!", "!");
	 str1314 = str1314.replace("!", "@!");
	 String[] values5= str1314.split("@");
	 for(int q1=0;q1<values5.length;q1++){
		 System.out.println("xxxx:"+values5[q1]);
	 }
	 String strnew ="";
	 for(int i1=0;i1<values5.length;i1++){
		 if(values5[i1].contains("!")){
			 System.out.println("values5[i1].substring(1, 2):"+values5[i1].substring(1, 2));
			 if(values5[i1].substring(1, 2).equals("(")){
				 int a111=values5[i1].indexOf(")");
				 System.out.println("a111:"+a111);
				 values5[i1]=values5[i1].substring(a111+1);
				 System.out.println("values5[i1]:"+values5[i1]);
               }else{
            	   values5[i1]=values5[i1].substring(2);
            	   System.out.println("values5[i1]:"+values5[i1]);
               }
		 }
		
		 strnew = strnew+values5[i1];
	 }
	 System.out.println("strnew:"+strnew);
	 
	
	 
	String str11111="@123";
	String[] val = str11111.split("@");
	for(int q11=0;q11<val.length;q11++){
		if(val[q11].length()==0){
			
		}
	
		System.out.println(val[q11]);
	}
	
	String sqwe="!(FL01&BN00)&BM00";
	sqwe = sqwe.replaceAll("&", "@");
	sqwe = sqwe.replaceAll("\\|", "@");
	sqwe = sqwe.replaceAll("!", "@");
	sqwe = sqwe.replaceAll("\\(", "");
	sqwe = sqwe.replaceAll("\\)", "");
	String[] valww = sqwe.split("@");
	System.out.println(valww.length);
	for(int qw=0;qw<valww.length;qw++){
		System.out.println(valww[qw]);
	}
	String sqwee="";
	String[] valwww = sqwee.split("@");
	System.out.println("length:"+valwww.length);
	for(int qw=0;qw<valwww.length;qw++){
		System.out.println(valwww[qw]);
	}
	
	
	String str1111 ="A305&A402&AD01&BN01&BM01|A305&A402&FL01&BN01&BM01|A305&A402&FL01&BN00&BM00";
	str1111 = str1111.replace("&!", "!");
	str1111 = str1111.replace("!", "@!");
 String[] values9= str1111.split("@");
 String strnew11 ="";
 for(int i1=0;i1<values9.length;i1++){
	 if(values9[i1].contains("!")){
		 if(values9[i1].substring(1, 2).equals("(")){
			 int a111=values9[i1].indexOf(")");
			 values9[i1]=values9[i1].substring(a111+1);
           }else{
        	   values9[i1]=values9[i1].substring(5);
           }
	 }
	 
	 strnew11 = strnew11+values9[i1];
 }
 str1111 = strnew11;
 System.out.println("str1111:"+str1111);
	str1111 = str1111.replaceAll("[^0-9a-zA-Z]","");
	System.out.println(str1111);
	String[] arr1 = new String[str1111.length() / 4];
	int index1111 = 0;
	for(int i=0; i<arr1.length;i++){
	    if(index1111+4 > str1111.length()){
	    	arr1[i] = str1111.substring(index1111);
	    }else{
	    	arr1[i] = str1111.substring(index1111,(index1111 = index1111+4));
	    }
	}
	System.out.println(java.util.Arrays.toString(arr1));
	
	
	
	String str111 = "123648945819399529s";
	String[] arr = new String[str111.length() / 3];
	int index111 = 0;
	for(int i=0; i<arr.length;i++){
	    if(index111+3 > str111.length()){
	        arr[i] = str111.substring(index111);
	    }else{
	        arr[i] = str111.substring(index111,(index111 = index111+3));
	    }
	}
	System.out.println(java.util.Arrays.toString(arr));
	
	 String st11 ="!(FL01&BN00)&BM00";
	 st11 = st11.replaceAll("!", "&&!");
	 System.out.println(st11);
		if(st11.substring(0, 2).equals("&&")){
			st11=st11.substring(2);
		}
		System.out.println(st11);

		
		
		
		String str2531="abc";
		 Test6 t6 = new Test6();
		 t6.insertStringInParticularPosition(str2531,"aa",1);
		System.out.println(str2531);
		
		
		
		Object a123 =true;
		Object b242 =true;
		if((Boolean) a123){if((Boolean) b242){System.out.println("aaa");}
		
		}
		str1="abcde";
		  Test6 t61 = new Test6();
		 str1 = t61.insertStringInParticularPosition(str1,"(",0);
		 int length=str1.length();
		 str1 = t61.insertStringInParticularPosition(str1,")",length);
		 System.out.println(str1);

		 
		 boolean a11 =true;
		 a11= !a11;
		 System.out.println("a"+a11);
		String sss="sytjAD00&&D001&&CR03&&CV00&&FL01&&(!CT00)";
		boolean aaad = sss.contains("CT00");
		 System.out.println("aaad"+aaad);
		 ArrayList list123 =new ArrayList();
		 list123.add("1");
		 list123.add("2");
		 ArrayList list1234 =new ArrayList();
		 list1234.add("1");
		 list1234.add("2");
		 list1234.add("3");
		 list1234.add("4");
boolean adasfd = list1234.containsAll(list123);
System.out.println("adasfd"+adasfd);


ArrayList aobject = new ArrayList();
aobject.add("AP00");
aobject.add("!H103");
aobject.add("AM02");
String dsfwe = aobject.toString();
System.out.println("dsfwe"+dsfwe);
boolean resu = dsfwe.contains("!"+"AM02");
System.out.println("resu"+resu);
}
	 
}
