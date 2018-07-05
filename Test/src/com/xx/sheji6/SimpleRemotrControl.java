package com.xx.sheji6;

public class SimpleRemotrControl {
	Command slot;
	public SimpleRemotrControl(){
		
	}
	
	public void setCommand(Command command){
		slot = command;
	}
	
	public void buttomWasPressed(){
		slot.execute();
	}

	
}
