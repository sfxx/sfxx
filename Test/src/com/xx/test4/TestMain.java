package com.xx.test4;

public class TestMain {
	public static void main (String[] args){
		Human huamn = new Male();
		Human human1 = new Teacher(huamn);
		human1.display();
	}
}
