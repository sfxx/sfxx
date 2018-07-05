package com.xx.sheji1;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public abstract void display();
	public void peformFly(){
		flyBehavior.fly();
	}
	public void peformQuack(){
		quackBehavior.quack();
	}
	public void swim(){
		System.out.println("duck can swim");
	}
}
