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
	}//同步,性能差

}
//应用程序总是创建并使用单件实例，或者创建运行负担不重
/*public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return singleton;
	}

}*/

//双重检查加锁,只有第一次同步，不影响性能
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
