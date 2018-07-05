package com.xx.sheji6;

public class RemoteControlWithUndo {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	public RemoteControlWithUndo(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	} 
	
	public void OnButtonWasPusded(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
    public void OffButtonWasPusded(int slot){
    	offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
    
    public void undoButtonWasPusded(){
    	undoCommand.undo();
    }
    
    public String toString(){
    	return null;
    }

}
