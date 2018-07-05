package com.xx.test4;

public class Teacher implements Human{
	public Human human;
	
	public Teacher(Human human){
		this.human = human;
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		String word = human.display()+" Teacher";
		System.out.println(word);
		return word;
	}

}
