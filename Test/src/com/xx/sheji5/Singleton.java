package com.xx.sheji5;

public class Singleton {
	private static Singleton singleton;
	private Singleton(){
		
	}
	/*public  static Singleton getInatance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}*/
	public static synchronized Singleton getInatance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}//ͬ��,���ܲ�

}
//Ӧ�ó������Ǵ�����ʹ�õ���ʵ�������ߴ������и�������
/*public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return singleton;
	}

}*/

//˫�ؼ�����,ֻ�е�һ��ͬ������Ӱ������
/*public class Singleton {
	private volatile static Singleton singleton;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized(Singleton.class){
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}*/
