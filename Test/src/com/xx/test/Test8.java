package com.xx.test;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
public class Test8 {
        public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
                hm.put("����", 3);
                hm.put("����", 7);
                hm.put("����", 9);
                hm.put("����", 5);
                hm.put("����", 7);
                hm.put("����", 3);
                hm.put("��һ", 3);
                System.out.println(hm);

                ArrayList<Integer> list1 = new ArrayList<Integer>();        //���ڴ洢map�����в��ظ���ֵ
                ArrayList<String> list2 = new ArrayList<String>();        //���ڴ洢map������ʣ��ļ�
                
                Set<Entry<String, Integer>> entrySet = hm.entrySet();
                Iterator<Entry<String, Integer>> it = entrySet.iterator();
                while(it.hasNext()){
                        Entry<String, Integer> en = it.next();
                        //�ж�list�������Ƿ����map������ֵ
                        if(!list1.contains(en.getValue())){
                                list1.add(en.getValue());
                                list2.add(en.getKey());
                        }else{
                                it.remove();
                        }
                }
                System.out.println(hm);
                System.out.println(list1);
                System.out.println(list2);

               
                
                
                ArrayList list11 = new ArrayList();
                String a="44";
                
                list11.add("1");
                list11.add("2");
                list11.add("3");
                list11.add("!44");
                System.out.println("list11"+list11);
                boolean a11 = list11.toString().substring(list11.toString().indexOf("!"), list11.toString().indexOf(a.substring(0, 1))).contains(",");
                System.out.println("a11"+a11);
				 List list22= new ArrayList();
                int a111 = list11.toString().indexOf("!");
				 while (a111 != -1) {
					 list22.add(a111);
					 a111 = list11.toString().indexOf("!", a111 + 1);
			        }
				 for(int j=0;j<list22.size();j++){
					 System.out.println("list22"+list22.get(j));
		            boolean a12 = list11.toString().substring((Integer) list22.get(j), list11.toString().indexOf(a.substring(0, 1))).contains(",");
					 System.out.println("a12"+a12);

				 }

        }
}