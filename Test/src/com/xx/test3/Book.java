package com.xx.test3;

public class Book implements IReader{
	//DependencyInversion
	public String getContent(){
		return "很久很久以前有一个阿拉伯的故事……";
	}
}
